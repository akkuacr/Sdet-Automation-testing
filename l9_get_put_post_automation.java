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
    	 System.out.println("post the address method");
    	 RestAssured.baseURI="https://rahulshettyacademy.com";
    	 String response=
    	 given().queryParam("key","qaclick123").header("Content-type","application/json").body(payload.AddPlace())
    	 .when().post("maps/api/place/add/json")
    	 .then().assertThat().statusCode(200).body("scope",equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
    	    // we can put assertions on body key values
    	    //header checking is used to validate that response is coming from the right server
    	     
    	   //here we are putting assertions
    	 
    	   //Add place->Update Place with new address ->Get Place to vaildate if new address is updated in response 
    	 
    	 //parsing the whole json response body using JsonPath class
    	 
    	// System.out.println(response);
    	 
    	 //JsonPath class used to convert json into string and helpful for parsing the json
    	 JsonPath js= new JsonPath(response);
    	 
    	 String placeId=js.getString("place_id");
    	// System.out.println(placeId);
    	 
    	 System.out.println("Update place started");
    	 String newAddress="70 Summer walk, USA";
    	 //update place
    	 given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
    	 .body("{\r\n"
    	 		+ "\"place_id\":\""+placeId+"\",\r\n"
    	 		+ "\"address\":\""+newAddress+"\",\r\n"
    	 		+ "\"key\":\"qaclick123\"\r\n"
    	 		+ "}\r\n"
    	 		+ "").when().put("maps/api/place/update/json")
    	         .then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
    	 
    	 
//    	  JsonPath js2=new JsonPath(res1);
//    	 String msg=js.getString("msg");
//    	 System.out.println("the Response from Put is "+msg);
//    	 
    	 
    	 System.out.println("Get the address method");
    	 //get method
    	 String response3=given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeId)
    	 .when().get("maps/api/place/get/json")
    	 .then().assertThat().log().all().statusCode(200).body("address",equalTo(newAddress)).extract().response().asString();
    	 
    	 System.out.println(response3);
    	 JsonPath js2=new JsonPath(response3);
    	 String lat1=js2.getString("location.latitude");
    	 System.out.println(lat1);
    	 String Addr=js2.getString("address");
    	 System.out.println(Addr.equals(newAddress));
    	 
    	 //cucumber junit,jtesting are the frameworks for assertions provided by java
    	 
    	 
    	 
     }
     
}
