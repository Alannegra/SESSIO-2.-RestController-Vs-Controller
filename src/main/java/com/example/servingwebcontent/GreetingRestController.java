package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/response/postbody
//Se necesita PostMan
    @RestController
    @RequestMapping("/response")
    public class GreetingRestController {

        @PostMapping("/postbody")
        public String postBody(@RequestBody String fullName) {
            return "Hello " + fullName;
        }
    }

   // @PostMapping("/greeting")
    //public String post()