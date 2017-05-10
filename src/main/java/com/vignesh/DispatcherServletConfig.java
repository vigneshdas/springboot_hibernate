package com.vignesh;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class DispatcherServletConfig  {
	
	@Bean
	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
	    ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
	    registration.addUrlMappings("*.do");
	    return registration;
	}
}