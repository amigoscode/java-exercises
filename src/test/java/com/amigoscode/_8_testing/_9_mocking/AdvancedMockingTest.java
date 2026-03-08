package com.amigoscode._8_testing._9_mocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Exercise: Advanced Mockito Techniques
 *
 * Practice advanced mocking features: chained returns, custom answers,
 * spies, void method handling, and more.
 */
@DisplayName("Advanced Mocking Tests")
@ExtendWith(MockitoExtension.class)
class AdvancedMockingTest {

    @Mock
    private PaymentService paymentService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    // TODO: 1 - Chain return values with thenReturn(first, second, ...).
    //  Stub paymentService.charge to return true on first call, false on second call:
    //  when(paymentService.charge(anyString(), anyDouble()))
    //      .thenReturn(true, false);
    //  Place the first order -> should succeed (status "COMPLETED").
    //  Place the second order -> should throw RuntimeException (payment fails).
    @Test
    @DisplayName("Chained return values")
    void testChainedReturns() {
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true, false);
        Order order1 = new Order("ORD-1", "CUST-1", 50.0);
        assertEquals("COMPLETED", orderService.placeOrder(order1).getStatus());
        Order order2 = new Order("ORD-2", "CUST-2", 75.0);
        assertThrows(RuntimeException.class, () -> orderService.placeOrder(order2));
    }

    // TODO: 2 - Use thenAnswer() for custom logic based on arguments.
    //  Stub paymentService.charge with thenAnswer:
    //  when(paymentService.charge(anyString(), anyDouble()))
    //      .thenAnswer(invocation -> {
    //          double amount = invocation.getArgument(1);
    //          return amount <= 500.0; // approve only amounts <= 500
    //      });
    //  Test with amount 100 -> should succeed.
    //  Test with amount 1000 -> should throw RuntimeException.
    @Test
    @DisplayName("thenAnswer with custom logic")
    void testThenAnswer() {
        when(paymentService.charge(anyString(), anyDouble()))
            .thenAnswer(invocation -> {
                double amount = invocation.getArgument(1);
                return amount <= 500.0;
            });
        Order order1 = new Order("ORD-1", "CUST-1", 100.0);
        assertEquals("COMPLETED", orderService.placeOrder(order1).getStatus());
        Order order2 = new Order("ORD-2", "CUST-2", 1000.0);
        assertThrows(RuntimeException.class, () -> orderService.placeOrder(order2));
    }

    // TODO: 3 - Use InOrder to verify the exact sequence of method calls.
    //  Stub paymentService.charge to return true.
    //  Place an order.
    //  Create InOrder: InOrder inOrder = inOrder(paymentService, orderRepository);
    //  Verify the sequence:
    //  inOrder.verify(paymentService).charge(anyString(), anyDouble());
    //  inOrder.verify(orderRepository).save(any(Order.class));
    //  inOrder.verifyNoMoreInteractions();
    @Test
    @DisplayName("InOrder verification")
    void testInOrder() {
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        Order order = new Order("ORD-1", "CUST-1", 99.99);
        orderService.placeOrder(order);
        InOrder inOrder = inOrder(paymentService, orderRepository);
        inOrder.verify(paymentService).charge(anyString(), anyDouble());
        inOrder.verify(orderRepository).save(any(Order.class));
        inOrder.verifyNoMoreInteractions();
    }

    // TODO: 4 - Use doNothing().when() for void methods.
    //  doNothing() is the default for void methods on mocks, but it's explicit:
    //  doNothing().when(orderRepository).save(any(Order.class));
    //  Stub paymentService.charge to return true.
    //  Place an order and verify save was called.
    //  Note: doNothing() is useful when you want to be explicit or override previous stubbing.
    @Test
    @DisplayName("doNothing for void methods")
    void testDoNothing() {
        doNothing().when(orderRepository).save(any(Order.class));
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        Order order = new Order("ORD-1", "CUST-1", 99.99);
        orderService.placeOrder(order);
        verify(orderRepository).save(any(Order.class));
    }

    // TODO: 5 - Use doThrow().when() for void methods that should throw.
    //  Make orderRepository.save throw an exception:
    //  doThrow(new RuntimeException("Database error"))
    //      .when(orderRepository).save(any(Order.class));
    //  Stub paymentService.charge to return true.
    //  Assert that placing an order throws RuntimeException with message "Database error".
    @Test
    @DisplayName("doThrow for void methods")
    void testDoThrow() {
        doThrow(new RuntimeException("Database error")).when(orderRepository).save(any(Order.class));
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        Order order = new Order("ORD-1", "CUST-1", 99.99);
        RuntimeException exception = assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));
        assertEquals("Database error", exception.getMessage());
    }

    // TODO: 6 - Use spy() for partial mocking.
    //  Create a real Order and spy on it:
    //  Order realOrder = new Order("ORD-1", "CUST-1", 99.99);
    //  Order spyOrder = spy(realOrder);
    //  Verify that spyOrder.getAmount() returns 99.99 (real method call).
    //  Override one method: when(spyOrder.getStatus()).thenReturn("OVERRIDDEN");
    //  Assert spyOrder.getStatus() now returns "OVERRIDDEN".
    //  Assert spyOrder.getAmount() still returns 99.99 (not overridden).
    @Test
    @DisplayName("spy for partial mocking")
    void testSpy() {
        // Spy on a real ArrayList (spies work best on non-final classes)
        List<String> realList = new java.util.ArrayList<>();
        List<String> spyList = spy(realList);

        // Real method calls still work
        spyList.add("item1");
        assertEquals(1, spyList.size());

        // Override one method: when size() is called, return 100
        when(spyList.size()).thenReturn(100);
        assertEquals(100, spyList.size());

        // But the real data is still there
        assertEquals("item1", spyList.get(0));
    }

    // TODO: 7 - Use timeout() for verifying calls with a time limit.
    //  Stub paymentService.charge to return true.
    //  Place an order.
    //  Verify with timeout: verify(paymentService, timeout(1000)).charge(anyString(), anyDouble());
    //  This is useful for async operations - it waits up to the timeout for the call.
    //  Note: In this synchronous case it will pass immediately.
    @Test
    @DisplayName("timeout verification")
    void testTimeout() {
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        Order order = new Order("ORD-1", "CUST-1", 99.99);
        orderService.placeOrder(order);
        verify(paymentService, timeout(1000)).charge(anyString(), anyDouble());
    }

}
