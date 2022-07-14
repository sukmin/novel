package com.ilovebambi.novel.controller

import org.springframework.http.CacheControl
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class L7CheckController {

    @GetMapping(value = ["/l7check", "/monitor/l7check"])
    fun l7check(): ResponseEntity<String> {
        return ResponseEntity
            .ok()
            .contentType(MediaType.APPLICATION_JSON)
            .cacheControl(CacheControl.noStore())
            .body("""{"message":"OK"}""")
    }

}