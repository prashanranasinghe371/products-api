package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


        @GetMapping("/hello")
        public String hello (){
            return"Hello from spring Boots";
        }
        @GetMapping("/goodbye")
        public String goodbye(){
            return "Goodbye Spring boot";
        }

        @GetMapping("/status")
        public String status(){
            return "API is running - Tutorial 1 - Date: " + java.time.LocalDate.now().toString();
        }


}
