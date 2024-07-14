package com.ithaka.ufabc.agentcam;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class AgentCam {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(AgentCam.class, args);
	}
}