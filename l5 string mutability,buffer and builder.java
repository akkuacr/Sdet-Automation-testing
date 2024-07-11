package day2;
import java.util.Arrays;
import java.util.Scanner; 

public class Variables {
	public static void main(String[] args) {
//       String s="Welcome";
//       String rev="";
//        for(int i=s.length()-1;i>=0;i--)
//        {
//            rev=rev+s.charAt(i); 
//        }
//        System.out.println(rev);
//        //approach 2
//        //Without using string methods
//        
//        rev="";
//        char a[] = s.toCharArray();
//        for(int i=a.length-1;i>=0;i--) {
////        	char temp=a[i];
////        	a[i]=a[a.length-i-1];
////        	a[a.length-i-1]=temp;
//        	rev=rev+a[i];
//        }
//        System.out.println(rev);
//        
//        //approach 3:using StringBuffer class
//        //yha se pta chl ja ra h ki string buffer mutable hote h
//        StringBuffer s1=new StringBuffer("welcome");
//        s1.append("to java");
//        System.out.println(s1);
//        System.out.println("Reverse String is: "+s1.reverse());
//        System.out.println(s1);
//        //approach 4 : using StringBuilder
//        
//        StringBuilder s2 = new StringBuilder("Akash");
//        s2.append("Chand");
//        System.out.println(s2);
//        System.out.println("Reverse String is "+s2.reverse());
//        
//		//strings are immutable 
//        //while arrays ,stringbuffer,stringBuilder are mutable in nature
//        
		
		
		//case1 
//		String s1="Welcome";
//		String s2="welcome";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		
		
		
		//case2 
//		String s1= new String ("Welcome");
//		String s2 = new String("Welcome");
//		System.out.println(s1==s2);//false //to compare the objects
//		System.out.println(s1.equals(s2));//to compare the values of objects
//		
		//case 3
//		String s1="abc";
//		String s2=new String("abc");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
	
		//case 4
		//here objects are same so output will be true 
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
