package files;
 

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
 
import org.testng.annotations.Test;

 
 


public class DynamicJson {

	@Test
	public void addBook() {
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().header("Content-Type","application/json")
		.body(payload.Addbook()).
		when()
		.post("/Library/Addbook.php")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath js=ReusableMethods.rawToJson(response);
		String id=js.get("ID");

	    System.out.println(id);

	}
	
	
	
	
	
	

}
