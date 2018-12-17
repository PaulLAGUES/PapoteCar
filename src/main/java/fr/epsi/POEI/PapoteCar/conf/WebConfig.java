package fr.epsi.POEI.PapoteCar.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureGlobal( AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("prout").password("{noop}caca").roles("USER", "USER_API", "ADMIN")
			.and()
			.withUser("api").password("{noop}api").roles("USER_API");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.cors().and()
		.authorizeRequests()
			.antMatchers("/**").hasAnyRole("ADMIN", "USER").and()
			.httpBasic()
			.and()
			.csrf().disable();
	}
	
		
}
