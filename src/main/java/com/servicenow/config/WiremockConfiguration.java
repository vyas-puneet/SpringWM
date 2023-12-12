package com.servicenow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;

@Configuration
public class WiremockConfiguration {

	@Bean
	public void wireMockServer() {
		int port = 8088;
		WireMockServer wireMockServer = new WireMockServer(port); 
		wireMockServer.start();
		WireMock.configureFor("localhost", port);
		wireMockServer.stubFor(WireMock.get(WireMock.urlEqualTo("/hello"))
				.willReturn(WireMock.aResponse().withBody("Welcome to Indore")));
	}

}
