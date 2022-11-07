package ua.edu.ucu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerControler {
    @GetMapping
    public List<Flower> getFlowers(){
        return Arrays.asList(new Flower("green", 50, 333), new Flower("black", 50, 333), new Flower("Blue", 50, 333));
    }

}
