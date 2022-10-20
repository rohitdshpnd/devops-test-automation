package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
	@Value("${local.server.port}")
	int port;

	@Test
	void contextLoads() {
		try {

			URL url = new URL("http://localhost:"+port+"/home");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();
			System.out.println("**********************************************************************");
			System.out.println("GET Response Code :: " + responseCode);
			System.out.println("**********************************************************************");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
