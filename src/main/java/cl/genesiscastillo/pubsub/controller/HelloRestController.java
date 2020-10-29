package cl.genesiscastillo.pubsub.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class HelloRestController {

	static final Logger LOGGER = Logger.getLogger(HelloRestController.class.getName());

	@RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "text/plain")
	public String hello() {
		return "Hello from Spring Boot and Camel. We are at: HOLE";
	}
}
