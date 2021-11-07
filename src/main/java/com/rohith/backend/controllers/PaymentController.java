package com.rohith.backend.controllers;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.rohith.backend.models.PaymentRequest;
import com.rohith.backend.models.PaymentResponse;
import net.bytebuddy.utility.RandomString;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    final int SHORT_ID_LENGTH = 8;
    String CURRENCY = "INR";

    @PostMapping("/payment")
    public PaymentResponse makePayment(@RequestBody PaymentRequest paymentRequest) throws RazorpayException {
        RazorpayClient razorpayClient = new RazorpayClient("rzp_test_7KrJrtVx3LzHjV", "6GO1DLmxj9N6gON0uFz7QC41");

        double amount = paymentRequest.getAmount();

        JSONObject options = new JSONObject();
        options.put("amount", amount * 100);
        options.put("currency", CURRENCY);
        options.put("receipt", RandomString.make(SHORT_ID_LENGTH));
        Order order = razorpayClient.Orders.create(options);
        System.out.println(order);
        return new PaymentResponse(order.get("id"), order.get("amount"), order.get("currency"), order.get("receipt"));
    }
}
