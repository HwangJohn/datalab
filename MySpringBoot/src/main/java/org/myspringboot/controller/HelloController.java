package org.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *      org.myspringboot.controller
 *        |_ HelloController.java
 * </pre>
 * <p/>
 * <pre>
 *
 * </pre>
 *
 * @Company :
 * @Author : 황중원
 * @Date : 2016. 3. 9.
 * @Version : 1.0
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
