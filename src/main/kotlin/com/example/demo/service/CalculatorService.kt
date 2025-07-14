package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class CalculatorService {
    fun add(a: Double, b: Double): Double = a + b
    fun subtract(a: Double, b: Double): Double = a - b
}
