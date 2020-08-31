package com.principal.proyecto_escuela.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {


    @RequestMapping(value = "/inicio", method = RequestMethod.GET)
    public String index() {
        System.out.println("inciiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        return "index";
    }


}
