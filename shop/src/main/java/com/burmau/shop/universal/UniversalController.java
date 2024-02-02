package com.burmau.shop.universal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/universal")
@CrossOrigin(origins = "http://localhost:3000/")
public class UniversalController {
    // this should be an aggregate controller for all the different types of products in the database
    // this controller should be able to handle all the different types of requests

}
