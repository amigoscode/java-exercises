package com.amigoscode._8_testing._9_mocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Exercise: Mockito Argument Matchers
 *
 * Practice using Mockito's argument matchers for flexible stubbing and verification.
 * Matchers let you specify patterns for arguments rather than exact values.
 */
@DisplayName("Mockito Argument Matchers Tests")
@ExtendWith(MockitoExtension.class)
class MatchersTest {

    @Mock
    private PaymentService paymentService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    // TODO: 1 - Use any() matcher with when().thenReturn().
    //  Stub paymentService.charge to return true for ANY String and ANY double:
    //  when(paymentService.charge(any(), anyDouble())).thenReturn(true);
    //  Place an order and assert it completes successfully.


    // TODO: 2 - Use anyString() matcher.
    //  Stub paymentService.charge to return true when called with
    //  anyString() for customer ID and eq(99.99) for amount.
    //  Place an order with amount 99.99 and verify it works.
    //  Place another order with a different customer ID but same amount and verify.


    // TODO: 3 - Use eq() for exact match combined with other matchers.
    //  Stub paymentService.charge to return true for eq("VIP-CUSTOMER") and anyDouble().
    //  Create an order with customerId "VIP-CUSTOMER" and place it.
    //  Assert the order status is "COMPLETED".
    //  Important: When using any matcher in a call, ALL arguments must use matchers.


    // TODO: 4 - Use argThat() with a custom matcher.
    //  Stub paymentService.charge to return true when the amount is greater than 0:
    //  when(paymentService.charge(anyString(), argThat(amount -> amount > 0)))
    //      .thenReturn(true);
    //  Place an order with a positive amount and verify success.


    // TODO: 5 - Combine matchers in verify().
    //  Place an order, then verify the interactions using matchers:
    //  verify(paymentService).charge(eq("CUST-1"), argThat(amount -> amount > 50));
    //  verify(orderRepository).save(argThat(order ->
    //      order.getStatus().equals("COMPLETED")));


    // TODO: 6 - Use argument matchers with when() for different return values.
    //  Stub charge to return true for amounts <= 1000 and false for amounts > 1000:
    //  when(paymentService.charge(anyString(), doubleThat(a -> a <= 1000)))
    //      .thenReturn(true);
    //  when(paymentService.charge(anyString(), doubleThat(a -> a > 1000)))
    //      .thenReturn(false);
    //  Test placing an order with amount 500 (should succeed).
    //  Test placing an order with amount 1500 (should throw RuntimeException).

}
