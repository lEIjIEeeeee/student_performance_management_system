package com.system.manage.modular.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@AllArgsConstructor
@RestController
@RequestMapping("/studentModule")
public class StudentController {

    @GetMapping("/startTest")
    public void startTest() {
        System.out.println("启动成功");
    }
}
