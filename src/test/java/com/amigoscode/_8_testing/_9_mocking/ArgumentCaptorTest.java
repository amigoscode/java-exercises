package com.amigoscode._8_testing._9_mocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Exercise: Mockito ArgumentCaptor
 *
 * Practice capturing arguments passed to mocked methods so you can inspect
 * them in detail. This is useful when the argument is constructed inside the
 * method under test.
 */
@DisplayName("Argument Captor Tests")
@ExtendWith(MockitoExtension.class)
class ArgumentCaptorTest {

    @Mock
    private PaymentService paymentService;

    @Mock
    private OrderRepository orderRepository;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    // TODO: 1 - Create an ArgumentCaptor<Order> and capture the argument passed to save().
    //  Create a captor: ArgumentCaptor<Order> orderCaptor = ArgumentCaptor.forClass(Order.class);
    //  Stub paymentService.charge to return true.
    //  Place an order.
    //  Capture: verify(orderRepository).save(orderCaptor.capture());
    //  Get the captured value: Order savedOrder = orderCaptor.getValue();
    // TODO: 2 - Assert that the captured Order has the correct fields.
    //  Using the captured order from TODO 1:
    //  assertEquals("COMPLETED", savedOrder.getStatus());
    //  assertEquals("CUST-1", savedOrder.getCustomerId());
    //  assertEquals(99.99, savedOrder.getAmount());
    @Test
    @DisplayName("Capture and verify saved order")
    void testCaptureOrder() {
        ArgumentCaptor<Order> orderCaptor = ArgumentCaptor.forClass(Order.class);
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        Order order = new Order("ORD-1", "CUST-1", 99.99);
        orderService.placeOrder(order);
        verify(orderRepository).save(orderCaptor.capture());
        Order savedOrder = orderCaptor.getValue();
        assertEquals("COMPLETED", savedOrder.getStatus());
        assertEquals("CUST-1", savedOrder.getCustomerId());
        assertEquals(99.99, savedOrder.getAmount());
    }

    // TODO: 3 - Capture multiple invocations.
    //  Stub paymentService.charge to return true.
    //  Place 3 different orders (with different IDs and amounts).
    //  Capture all: verify(orderRepository, times(3)).save(orderCaptor.capture());
    //  Get all values: List<Order> savedOrders = orderCaptor.getAllValues();
    //  Assert that savedOrders has size 3.
    //  Assert each order has status "COMPLETED".
    @Test
    @DisplayName("Capture multiple invocations")
    void testCaptureMultiple() {
        ArgumentCaptor<Order> orderCaptor = ArgumentCaptor.forClass(Order.class);
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        orderService.placeOrder(new Order("ORD-1", "CUST-1", 10.0));
        orderService.placeOrder(new Order("ORD-2", "CUST-2", 20.0));
        orderService.placeOrder(new Order("ORD-3", "CUST-3", 30.0));
        verify(orderRepository, times(3)).save(orderCaptor.capture());
        List<Order> savedOrders = orderCaptor.getAllValues();
        assertEquals(3, savedOrders.size());
        savedOrders.forEach(o -> assertEquals("COMPLETED", o.getStatus()));
    }

    // TODO: 4 - Use @Captor annotation instead of manually creating the captor.
    //  Declare a field: @Captor ArgumentCaptor<Order> annotatedCaptor;
    //  Write a test that places an order and captures the saved order using annotatedCaptor.
    //  Verify the captured order's fields.
    //  Note: @Captor is cleaner than calling ArgumentCaptor.forClass() in each test.
    @Captor
    ArgumentCaptor<Order> annotatedCaptor;

    @Test
    @DisplayName("Using @Captor annotation")
    void testAnnotatedCaptor() {
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        Order order = new Order("ORD-1", "CUST-1", 55.0);
        orderService.placeOrder(order);
        verify(orderRepository).save(annotatedCaptor.capture());
        Order captured = annotatedCaptor.getValue();
        assertEquals("COMPLETED", captured.getStatus());
        assertEquals("CUST-1", captured.getCustomerId());
        assertEquals(55.0, captured.getAmount());
    }

    // TODO: 5 - Capture arguments passed to EmailService.
    //  Create a NotificationService with the mocked EmailService.
    //  Create an order and call notificationService.notifyOrderPlaced(order).
    //  Capture all 3 arguments passed to emailService.send():
    //  ArgumentCaptor<String> toCaptor = ArgumentCaptor.forClass(String.class);
    //  ArgumentCaptor<String> subjectCaptor = ArgumentCaptor.forClass(String.class);
    //  ArgumentCaptor<String> bodyCaptor = ArgumentCaptor.forClass(String.class);
    //  verify(emailService).send(toCaptor.capture(), subjectCaptor.capture(), bodyCaptor.capture());
    //  Assert the captured subject contains "Order Confirmation".
    @Test
    @DisplayName("Capture email service arguments")
    void testCaptureEmailArgs() {
        NotificationService notificationService = new NotificationService(emailService);
        Order order = new Order("ORD-1", "CUST-1", 99.99);
        notificationService.notifyOrderPlaced(order);
        ArgumentCaptor<String> toCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> subjectCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> bodyCaptor = ArgumentCaptor.forClass(String.class);
        verify(emailService).send(toCaptor.capture(), subjectCaptor.capture(), bodyCaptor.capture());
        assertTrue(subjectCaptor.getValue().contains("Order Confirmation"));
    }

    // TODO: 6 - Combine captor with verify to check interaction details.
    //  Stub paymentService.charge to return true.
    //  Place an order.
    //  Use ArgumentCaptor<String> to capture the customerId passed to charge().
    //  Use ArgumentCaptor<Double> to capture the amount passed to charge().
    //  ArgumentCaptor<String> customerCaptor = ArgumentCaptor.forClass(String.class);
    //  ArgumentCaptor<Double> amountCaptor = ArgumentCaptor.forClass(Double.class);
    //  verify(paymentService).charge(customerCaptor.capture(), amountCaptor.capture());
    //  Assert customerCaptor.getValue() equals the order's customer ID.
    //  Assert amountCaptor.getValue() equals the order's amount.
    @Test
    @DisplayName("Capture charge arguments")
    void testCaptureChargeArgs() {
        when(paymentService.charge(anyString(), anyDouble())).thenReturn(true);
        Order order = new Order("ORD-1", "CUST-1", 99.99);
        orderService.placeOrder(order);
        ArgumentCaptor<String> customerCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Double> amountCaptor = ArgumentCaptor.forClass(Double.class);
        verify(paymentService).charge(customerCaptor.capture(), amountCaptor.capture());
        assertEquals("CUST-1", customerCaptor.getValue());
        assertEquals(99.99, amountCaptor.getValue());
    }

}
