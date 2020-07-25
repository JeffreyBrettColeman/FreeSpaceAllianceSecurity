package org.fsa.svc.controller;

import java.util.HashSet;

import javax.servlet.http.HttpServletRequest;

import org.fsa.svc.model.LoginRequest;
import org.fsa.svc.model.LoginResponse;
import org.fsa.svc.model.ResponseStatus;
import org.fsa.svc.model.jpa.Terminal;
import org.fsa.svc.repository.FSAModuleRepository;
import org.fsa.svc.repository.FloorRepository;
import org.fsa.svc.repository.TerminalRepository;
import org.fsa.svc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@RestController
public class UserTerminalController {

	@Value("${nounce}")
	private String nounce;
	
	@Autowired
	private FloorRepository floorRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private FSAModuleRepository fsaModuleRepository;
	
	@Autowired
	private TerminalRepository terminalRepository;

	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(HttpServletRequest request, @RequestBody LoginRequest login) {
		log.info("Calling /login from {}", request.getRemoteAddr());
		return new ResponseEntity<LoginResponse>(LoginResponse.builder().build(), HttpStatus.OK);
	}

	@GetMapping("/init")
	public ResponseEntity<LoginResponse> init(HttpServletRequest request) {
		log.info("Calling /init from {}", request.getRemoteAddr());
		HashSet<Terminal> terminalsLinked = new HashSet<Terminal>();

		terminalsLinked.add(Terminal.builder().name("Welcome Terminal").build());

		return new ResponseEntity<LoginResponse>(
				LoginResponse.builder().responseStatus(ResponseStatus.builder().message("Success").responseCode(0)

						.build()).terminalsLinked(terminalsLinked).build(),
				HttpStatus.OK);
	}

	@GetMapping("/adminStart")
	public ResponseEntity<String> adminStart(HttpServletRequest request) {
		log.info("Calling /adminStart from {}", request.getRemoteAddr());
		if (request.getRemoteAddr().equals("127.0.0.1")) {

			return new ResponseEntity<String>("Success", HttpStatus.OK);
		} else {

			return new ResponseEntity<String>("Nice Try", HttpStatus.UNAUTHORIZED);
		}
	}
}
