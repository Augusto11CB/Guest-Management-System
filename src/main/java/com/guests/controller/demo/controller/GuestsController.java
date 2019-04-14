package com.guests.controller.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestsController {

    @GetMapping("/guests")
    public String toList() {
        return "ListOfGuests";
    }

}


