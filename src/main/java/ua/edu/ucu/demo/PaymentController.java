package ua.edu.ucu.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.demo.payments.PayPalPaymentStretegy;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @GetMapping
    public String payment(){
        PayPalPaymentStretegy paymentStretegy = new PayPalPaymentStretegy();
        paymentStretegy.pay(10200);
        return "The payment is confirmed";
    }

}
