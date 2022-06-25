package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstTest {
	
	@Test
	public void test1(){
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Status Code:"+resp.getStatusCode());
		System.out.println("Response Time:"+resp.getTime());
		System.out.println("Status Line:"+resp.getStatusLine());
		
		assertEquals(resp.getStatusCode(), 200);
		
		
	}
	

}
