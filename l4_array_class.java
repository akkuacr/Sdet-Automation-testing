package day2;
import java.util.Arrays;
import java.util.Scanner; 

public class Variables {
	public static void main(String[] args) {
       
		
		int a[]= {1,2,3,4,5,-1};
		
          	for(int x:a)
          	{
          		if(x==5)
          		{
          			System.out.println("yes it is present");
          		}
          		
          	}
//          	to print the whole  array tou can use this
          //	System.out.println(Arrays.toString(a));
          	
          	
          	Arrays.sort(a);
          	System.out.println(Arrays.toString(a));
          	
	}

}
