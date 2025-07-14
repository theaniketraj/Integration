package com.example.demo.controller

import com.example.demo.service.CalculatorService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/calc")
class CalculatorController(private val calculatorService: CalculatorService) {

    @GetMapping("/add")
    fun add(@RequestParam a: Double, @RequestParam b: Double) =
            ResponseEntity.ok(calculatorService.add(a, b))

    @GetMapping("/subtract")
    fun subtract(@RequestParam a: Double, @RequestParam b: Double) =
            ResponseEntity.ok(calculatorService.subtract(a, b))
}
