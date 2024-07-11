package testing_Basics;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class JavaClass {
     public static void main(String[] args) {
    	 //validate if add place api is working as expected
    	 
    	 //rest assured working on three methods 1.given 2.when 3.Then
    	 //given-all input details like queryparam ,header,body, 
    	 //when- Submit the api in this method we simply define the method like (post,get,put,delete) and send the rest of resources as shown below
    	 //then - validate the response: here we check the response of the api after hitting the api
    	 
    	 
    	 
    	 
    	 //set first the base url
    	 RestAssured.baseURI="https://rahulshettyacademy.com";
    	 given().log().all().queryParam("key","qaclick123")
    	 .header("Content-type","application/json")
    	 .body("{\r\n"
    	 		+ "  \"location\": {\r\n"
    	 		+ "    \"lat\": -38.383494,\r\n"
    	 		+ "    \"lng\": 33.427362\r\n"
    	 		+ "  },\r\n"
    	 		+ "  \"accuracy\": 50,\r\n"
    	 		+ "  \"name\": \"Frontline house\",\r\n"
    	 		+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
    	 		+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
    	 		+ "  \"types\": [\r\n"
    	 		+ "    \"shoe park\",\r\n"
    	 		+ "    \"shop\"\r\n"
    	 		+ "  ],\r\n"
    	 		+ "  \"website\": \"http://google.com\",\r\n"
    	 		+ "  \"language\": \"French-IN\"\r\n"
    	 		+ "}\r\n"
    	 		+ "").when().post("maps/api/place/add/json")
    	     .then().log().all().assertThat().statusCode(200);
    	 
    	 
     }
}
