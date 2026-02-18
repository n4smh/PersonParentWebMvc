package in.n4smh.microservices.person.parent_webmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Profile("!prod")
public class CrosConfig implements WebMvcConfigurer {

	private String SWAGGER_CENTRAL_SERVER_URI = "person.swagger-central-uri";

	private Environment env;

	CrosConfig(Environment env) {
		this.env = env;
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins(env.getProperty(SWAGGER_CENTRAL_SERVER_URI))
		.allowedHeaders(CorsConfiguration.ALL)
		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
		.allowCredentials(true);
	}

}
