package com.javarevolutions.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javarevolutions.model.modeldata;

@RestController
@RequestMapping(path = "/rest/dataJR")
public class RestData {
	@GetMapping(path = "/Obtendatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody modeldata getData(@RequestParam(name = "msg") String message ) {
		modeldata response = new modeldata();
		response.setCode(200);
		response.setStatus(true);
		response.setMensaje("Mensaje Recibido: " + message);
		return response;
	}

}
