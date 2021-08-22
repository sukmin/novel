package com.ilovebambi.novel.web;

import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerHealthCheckController {

	@GetMapping(value = {"/l7check", "/monitor/l7check"})
	public ResponseEntity<String> l7check() {
		return ResponseEntity
			.ok()
			.cacheControl(CacheControl.noStore())
			.body("OK");
	}

}
