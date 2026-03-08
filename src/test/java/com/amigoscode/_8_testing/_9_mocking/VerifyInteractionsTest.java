package com.amigoscode._8_testing._9_mocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Exercise: Verifying Mock Interactions
 *
 * Practice advanced verification techniques: verifying call counts,
 * checking no unexpected interactions, and verifying call order.
 */
@DisplayName("Verify Interactions Tests")
@ExtendWith(MockitoExtension.class)
class VerifyInteractionsTest {

    @Mock
    private PaymentService paymentService;

    @Mock
    private OrderRepository orderRepository;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    // TODO: 1 - Use verifyNoInteractions() to assert no calls were made.
    //  Create a test where you do NOT call any methods on orderService.
    //  Then verify: verifyNoInteractions(paymentService);
    //  And: verifyNoInteractions(orderRepository);


    // TODO: 2 - Use verifyNoMoreInteractions() after verifying known calls.
    //  Stub paymentService.charge to return true.
    //  Place an order.
    //  Verify paymentService.charge was called.
    //  Verify orderRepository.save was called.
    //  Then call verifyNoMoreInteractions(paymentService, orderRepository)
    //  to ensure no other methods were called.


    // TODO: 3 - Use times(n) to verify method was called exactly n times.
    //  Stub paymentService.charge to return true.
    //  Place 3 different orders.
    //  Verify: verify(paymentService, times(3)).charge(anyString(), anyDouble());
    //  Verify: verify(orderRepository, times(3)).save(any(Order.class));


    // TODO: 4 - Use never() to verify a method was NOT called.
    //  Stub paymentService.charge to return false (payment fails).
    //  Try to place an order (it should throw RuntimeException).
    //  Verify: verify(orderRepository, never()).save(any(Order.class));
    //  The order should NOT be saved when payment fails.


    // TODO: 5 - Use atLeast() and atMost() for flexible verification.
    //  Stub paymentService.charge to return true.
    //  Place 3 orders.
    //  Verify: verify(paymentService, atLeast(2)).charge(anyString(), anyDouble());
    //  Verify: verify(paymentService, atMost(5)).charge(anyString(), anyDouble());


    // TODO: 6 - Verify order of calls using InOrder.
    //  Stub paymentService.charge to return true.
    //  Place an order.
    //  Create an InOrder verifier: InOrder inOrder = inOrder(paymentService, orderRepository);
    //  Verify charge was called BEFORE save:
    //  inOrder.verify(paymentService).charge(anyString(), anyDouble());
    //  inOrder.verify(orderRepository).save(any(Order.class));


    // TODO: 7 - Test that an exception is thrown when payment fails.
    //  Stub paymentService.charge to return false.
    //  Create an order and try to place it.
    //  Use assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));
    //  Verify the exception message contains "Payment failed".
    //  Verify that orderRepository.save was never called.

}
