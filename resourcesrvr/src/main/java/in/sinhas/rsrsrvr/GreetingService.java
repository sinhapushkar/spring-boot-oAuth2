package in.sinhas.rsrsrvr;

import java.util.Map;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	@PreAuthorize ("hasAuthority('SCOPE_user.read')")
	public Map<String, String> greet (){
		var jwt = (Jwt)SecurityContextHolder.getContext()
				.getAuthentication()
				.getPrincipal();
		
		return Map.of("message", "hello, "+jwt.getSubject());
	}
}
