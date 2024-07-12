package testing_Basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;

public class JavaClass {
     public static void main(String[] args) {
    	 //validate if add place api is working as expected
    	 
    	 //rest assured working on three methods 1.given 2.when 3.Then
    	 //given-all input details like queryparam ,header,body, 
    	 //when- Submit the api in this method we simply define the method like (post,get,put,delete) and send the rest of resources as shown below
    	 //then - validate the response: here we check the response of the api after hitting the api
    	 
    	 
    	 
    	 
    	 //set first the base url
    	 RestAssured.baseURI="https://rahulshettyacademy.com";
    	 String response=given().queryParam("key","qaclick123")
    	 .header("Content-type","application/json")
    	 .body(payload.AddPlace()).when().post("maps/api/place/add/json")
    	     .then().assertThat().statusCode(200).body("scope",equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
    	    // we can put assertions on body key values
    	    //header checking is used to validate that response is coming from the right server
    	     
    	   //here we are putting assertions
    	 
    	   //Add place->Update Place with new address ->Get Place to vaildate if new address is updated in response 
    	 
    	 //parsing the whole json response body using JsonPath class
    	 
    	 System.out.println(response);
    	 
    	 //JsonPath class used to convert string  into json and helpful for parsing the json
    	 JsonPath js= new JsonPath(response);
    	 
    	 String placeId=js.getString("place_id");
    	 System.out.println(placeId);
    	 
     }
}
