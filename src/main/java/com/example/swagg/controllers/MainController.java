package com.example.swagg.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("Методы (эндпоинты) для работы с главной страницей")
public class MainController {

    @GetMapping("/")
    public String getIndex() {
        return "Главная";
    }
}
