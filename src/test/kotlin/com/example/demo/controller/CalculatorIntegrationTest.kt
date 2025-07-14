package com.example.demo.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.*

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorIntegrationTest(@Autowired private val mockMvc: MockMvc) {

    @Test
    fun `GET add endpoint returns correct sum`() {
        mockMvc
                .get("/calc/add") {
                    param("a", "2")
                    param("b", "3")
                }
                .andExpect {
                    status { isOk() }
                    content { string("5.0") }
                }
    }

    @Test
    fun `GET subtract endpoint returns correct difference`() {
        mockMvc
                .get("/calc/subtract") {
                    param("a", "7")
                    param("b", "4")
                }
                .andExpect {
                    status { isOk() }
                    content { string("3.0") }
                }
    }
}
