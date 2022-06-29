package tw.niq.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootEdmDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEdmDiscoveryApplication.class, args);
	}

}
