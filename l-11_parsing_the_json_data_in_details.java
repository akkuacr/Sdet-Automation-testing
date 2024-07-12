package testing_Basics;

import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
    public static void main(String[] args) {
        JsonPath js = new JsonPath(payload.CoursePrice());
        
     //   1. Print No of courses returned by API
           int count = js.getInt("courses.size()");
           //size is only applicable in arrays
           System.out.println(count);
           
        
        
        
        
     //   2.Print Purchase Amount
          int pr= js.getInt("dashboard.purchaseAmount");
          System.out.println(pr);
          
        
        
        
        
        
     //   3. Print Title of the first course
         String title= js.getString("courses[0].title");
         
         System.out.println(title);
        
        
        
     //   4. Print All course titles and their respective Prices

        
        for(int i=0;i<count;i++)
        {
        	String x=js.getString("courses["+i+"].title");
        	//System.out.println(x);
        	int y=js.getInt("courses["+i+"].price");
        	System.out.println(x+" "+y);
        }
        
        
     //   5. Print no of copies sold by RPA Course

        for(int i=0;i<count;i++)
        {
        	String courseTitles=js.get("courses["+i+"].title");
        	if(courseTitles.equalsIgnoreCase("RPA"))
        	{
        		int copies= js.get("courses["+i+"].copies");
        		System.out.print(copies);
        		break;
        		
        	}
        	
        }
        
        
        
        
        
     //   6. Verify if Sum of all Course prices matches with Purchase Amount
        
           int c=0;
           for(int i=0;i<count;i++)
           {
        	  int price=js.getInt("courses["+i+"].price");
              int copies=js.getInt("courses["+i+"].copies");
              int amount=price*copies;
              System.out.println(amount);
              c+=amount;
           }
           
           Assert.assertEquals(c, pr);
        
    }
}
