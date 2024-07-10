package day2;
import java.util.Scanner; 

public class Variables {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//	int a=10;
//		System.out.println(a);
//	    int a1,b,c;
//	    a=100;
//	    b=19;
//	    c=199;
//	    System.out.println(a+" "+b+" "+c);
//	    int arr[]=new int[100];
//	    arr[0]=1;
//	    System.out.println(arr[0]);
	 
     
		
		//Numeric data types
		
		int a=100,b=200;
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+a);
		System.out.println(b+a);
		
		byte by=125;
		System.out.println(by);
		System.out.println("Enter username");
		String userName = sc.nextLine();
		System.out.println("Username is :"+userName);
		 
		short sh=13535;
		System.out.println(sh);
		
		long l=123456787587435L;
        System.out.println(l);
        
        //Decimal numbers - float,double
        
        float item_price=15.5F;
        
        System.out.println(item_price);
        
        double db1=1234.12332432;
        System.out.println(db1);
        
        // char ch='ABC' invlaid
        //String ch='ABS' //invalid
        // String ch='A'//invalid
        
        //String ch="A" //valid
        
//        always remember double quotation is always treated as string 
        
          boolean b1=false;
          System.out.println(b1);
          
          
          //String example
          String b2="Tutrue";
          System.out.println(b2);
          String s="Akash Chand is a goof boy";
          System.out.println(s);
          
          
        
        


		
		
		
		
		
	}

}
