/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Nov 1, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Instrument;
import dmacc.beans.Musician;

@Configuration
public class BeanConfiguration {

	@Bean
	public Musician musician() {
		Musician bean = new Musician();
		return bean;
	}
	
	@Bean
	public Instrument instrument() {
		Instrument bean = new Instrument();
		return bean;
	}
}
