package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		try {

			URL url = new URL("http://localhost:8081/home");
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
