package practise;

import java.util.Scanner;

public class assessqn {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the count for the 1st pattern");
	int type1=sc.nextInt();
	     assessqn.pattern(3);
	     System.out.println("Please enter the count for the 2nd pattern");
	     int type2=sc.nextInt();
	     assessqn.pattern(2);
	     System.out.println("Please enter the count for the 2nd pattern");
	     int type3=sc.nextInt();
	     assessqn.pattern(4);

	}
	
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
	    	 for(int l=n;l>i;l--) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print(i+ " ");
	    	 }
	    	 System.out.println(" ");
	    	 
	     }
	}

}
