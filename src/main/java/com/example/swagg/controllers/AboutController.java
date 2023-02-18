package com.example.swagg.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
@Api("Методы (эндпоинты) для работы с информацией о нас")
public class AboutController {
    @GetMapping("/")
    public String getAbout() {
        return "О нас";
    }
}
