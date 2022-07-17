package com.ilovebambi.novel.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController {

    @GetMapping(value = ["/products"])
    fun getProducts(): ProductResponse {

        val products = listOf(
            Product(price = 18000, name = "해리포터와 도담빌딩의 죄수"),
            Product("지옥같은 개발에서 살아남는 법", 45000),
            Product("수능에 나오는 파업", 15000),
            Product("만병통치약 퇴사", 20000),
        )

        return ProductResponse(products)
    }

}

data class ProductResponse(val products: List<Product>)
data class Product(val name: String, val price: Long, val category: String = "책", val deliveryFee: Long = 2500)