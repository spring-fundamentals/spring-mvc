package ch.mare.springmvc.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {


    @PostConstruct
    public void onInit() {
        System.out.println("postconstructed");
    }
}
