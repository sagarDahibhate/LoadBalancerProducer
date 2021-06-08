package com.inn.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerRestController {

	@GetMapping("/getmsg")
	public ResponseEntity<String> getMsg() {
		return ResponseEntity.ok(" hello these message is from the producer microservices");
	}
}
