package day2;
import java.util.Arrays;
import java.util.Scanner; 

public class Variables {
	public static void main(String[] args) {
       String s="Welcome";
       
       //this all methods are for string only 
    //   String s1= new String("welcome");
       
       System.out.println(s);
       //length()- return the length of a string (number of characters)
       System.out.println(s.length());
       
       //concat() - joining two strings 
       
       String s1="welcome";
       String s2="to java";
       String s3 = "Automation";
       
       System.out.println(s1+s2);
       System.out.println(s1.concat(s2));
       System.out.println(s1+s2+s3);
       System.out.println(s1.concat(s2.concat(s3)));
       System.out.println(s1.concat(s2+s3));
       System.out.println("welcome".concat("java"));
       
       //trim() -remove spaces right and left side
       
       
       String s4="  Welcome  ";
       System.out.println("Before trimming:"+s4.length());
       
       
       System.out.println("After trim:"+s4.trim().length());
       
       //charAt()- returns a character from a strinf based on index
       //index starts from 0
       s="welcome";
       
       System.out.println(s.charAt(3));
       String s5="we";
       
       //contains()
       //checks string is a part of main string or not
       System.out.println(s.contains("come"));
       
       //equals(),equalsIgnoreCase()-compare strings
       s1="welcome";
       s2="Welcome";
       System.out.println(s1==s2);//true
       System.out.println(s1.equals(s2));//true
       System.out.println(s1.equals("Welcome"));
       System.out.println(s1.equalsIgnoreCase(s2));
       
       //replace()-replace single/multiple(sequence) of characters in  a string
       s = "welcome to selenium java selenium python selenium c#";
       s.replace('e', 'X');
       System.out.println(s.replace('e', 'X'));
       System.out.println(s.replace("selenium","playwright"));
       
       
       //substring() - it will extract substring  from the string
       //starting index-0
       //ending index +1 likhna pdega 
       s="selenium";
       System.out.println(s.substring(1,5));
       System.out.println(s.substring(0,3));
       
       
       //toUpperCase(),toLowerCase()
       s="Welcome";
       System.out.println(s.toUpperCase());
       System.out.println(s.toLowerCase());
       
       //split() - split the string into multiple parts based on delimeter
       
       s="abc@gmail.com";
       String a[]=  s.split("@");
       System.out.println(a[0]);
       System.out.println(a[1]);
       System.out.println(Arrays.toString(a));
       
       
       //ex1
       
       String amount = "$15,20,25";
       amount.replace("$", "");
       System.out.println(amount.replace("$", "").replace(",", ""));
       
       //ex2
       s="abc, 123@xyz";
       String arr1[]=s.split(",");
       System.out.println(Arrays.toString(arr1));
       
       String arr2[]= arr1[1].split("@");
       System.out.println(Arrays.toString(arr2));
       
       // * % ^ & ( ) - you cannot use them as delimeters
       
       //ex4 
       String name="John Kenedy";
       System.out.println(name.contains("john"));
       
       System.out.println(name.replace("J","j").contains("john"));
       System.out.println(name.toLowerCase().contains("john"));
       s="  Akash ";
       s.trim();
       System.out.println(s);
       //aur yha yeh yad rkhna ki yeh sb methods apply krke aap kisi dusre variable m store kr skte ho real string m isse kuch change ni hota 
       
       
       
		
		 	
	}

}
