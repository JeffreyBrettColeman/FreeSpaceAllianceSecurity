package org.fsa.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories 
public class FreeSpaceAllianceSecurityApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(FreeSpaceAllianceSecurityApplication.class, args);
		
	}
	
	

}
