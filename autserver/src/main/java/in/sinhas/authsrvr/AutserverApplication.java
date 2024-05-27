package in.sinhas.authsrvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class AutserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutserverApplication.class, args);
	}

	@Bean
	InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		
		var one = User.withDefaultPasswordEncoder().roles("admin","user").password("ad").username("one").build();
		var two = User.withDefaultPasswordEncoder().roles("user").password("pwd").username("two").build();
		return new InMemoryUserDetailsManager(one,two);
		
	}
	
}
