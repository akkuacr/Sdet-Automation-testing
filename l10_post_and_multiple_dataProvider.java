package files;
 

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 
 
//parametrizing the api  with multiple datasets


public class DynamicJson {

	@Test(dataProvider="BooksData")
	public void addBook(String isbn,String aisle) {
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().header("Content-Type","application/json")
		.body(payload.Addbook(isbn,aisle)).
		when()
		.post("/Library/Addbook.php")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath js=ReusableMethods.rawToJson(response);
		String id=js.get("ID");

	    System.out.println(id);
	    System.out.println("Delete book start");
	    //delete book
	    
	    String response2= given().header("Content-Type","application/json").body(payload.Deletebook(id)).
	    when()
	    .post("/Library/DeleteBook.php")
	    .then().assertThat().log().all().statusCode(200).extract().response().asString();
	    
	    System.out.println("Delete book response "+response2);
	}
	
	
	
	
    @DataProvider(name="BooksData")
    public Object[][] getData() {
    	//array= collection of elements
    	//multidimensional arrays= collection of arrays
    	//each array will hold data for one test 
    	//so multiple arrays means multiple books data
    	return new Object[][]{{"ojwtfy","9363"} ,{"akash","7878"},{"tyshdj","8478"}};
    	
    	
    	
    }
		

}
