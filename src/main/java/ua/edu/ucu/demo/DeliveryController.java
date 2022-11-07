package ua.edu.ucu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.demo.delivery.DHLDeliverStrategy;

import java.util.Arrays;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @GetMapping
    public String delivery(){
        DHLDeliverStrategy dhlDeliverStrategy = new DHLDeliverStrategy();
        dhlDeliverStrategy.deliver(Arrays.asList(new Item(), new Item()));
        return "The delivery is confirmed";
    }
}
