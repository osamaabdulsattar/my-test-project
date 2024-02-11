package com.example.mytestproject;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class AppointmentCategoriesRestController {

    public AppointmentCategoriesRestController() {
    }

    @GetMapping("/appointment-categories")
    public void getAppointmentCategories(@PathVariable long doctorId) {

    }

}
