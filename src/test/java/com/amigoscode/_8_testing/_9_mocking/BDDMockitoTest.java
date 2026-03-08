package com.amigoscode._8_testing._9_mocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

/**
 * Exercise: BDD-Style Mocking with BDDMockito
 *
 * Practice using BDDMockito for Behavior-Driven Development style tests.
 * BDDMockito provides given/when/then methods that read more naturally
 * than when/thenReturn/verify.
 *
 * Traditional:  when(mock.method()).thenReturn(value)  /  verify(mock).method()
 * BDD style:    given(mock.method()).willReturn(value)  /  then(mock).should().method()
 */
@DisplayName("BDD Mockito Tests")
@ExtendWith(MockitoExtension.class)
class BDDMockitoTest {

    @Mock
    private PaymentService paymentService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    // TODO: 1 - Use given().willReturn() instead of when().thenReturn().
    //  // Given
    //  Order order = new Order("ORD-1", "CUST-1", 99.99);
    //  given(paymentService.charge("CUST-1", 99.99)).willReturn(true);
    //
    //  // When
    //  Order result = orderService.placeOrder(order);
    //
    //  // Then
    //  assertEquals("COMPLETED", result.getStatus());


    // TODO: 2 - Use then().should() instead of verify().
    //  After placing an order (from TODO 1), verify interactions using BDD style:
    //  then(paymentService).should().charge("CUST-1", 99.99);
    //  then(orderRepository).should().save(order);


    // TODO: 3 - Use willThrow() for exception stubbing.
    //  // Given
    //  Order order = new Order("ORD-2", "CUST-2", 50.0);
    //  given(paymentService.charge(anyString(), anyDouble()))
    //      .willThrow(new RuntimeException("Payment gateway down"));
    //
    //  // When & Then
    //  assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));


    // TODO: 4 - Write a complete BDD-style test with clear given/when/then sections.
    //  // Given - set up test data and stubs
    //  Order order = new Order("ORD-3", "CUST-3", 75.0);
    //  given(paymentService.charge("CUST-3", 75.0)).willReturn(true);
    //
    //  // When - execute the action
    //  Order result = orderService.placeOrder(order);
    //
    //  // Then - verify the results and interactions
    //  assertEquals("COMPLETED", result.getStatus());
    //  then(paymentService).should().charge("CUST-3", 75.0);
    //  then(orderRepository).should().save(order);
    //  then(paymentService).shouldHaveNoMoreInteractions();


    // TODO: 5 - Use given() with any() matchers.
    //  given(paymentService.charge(anyString(), anyDouble())).willReturn(true);
    //  Place two different orders.
    //  Use then(paymentService).should(times(2)).charge(anyString(), anyDouble());
    //  to verify charge was called twice.


    // TODO: 6 - Compare BDD vs traditional style (write the same test both ways).
    //  Write a test using traditional Mockito (when/thenReturn/verify).
    //  Then write the SAME test using BDD Mockito (given/willReturn/then...should).
    //  Both should test placing a successful order.
    //  This helps you see the difference in readability.

}
