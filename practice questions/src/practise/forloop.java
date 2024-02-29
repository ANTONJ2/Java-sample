package practise;

import java.util.Scanner;

public class forloop {
	
	public static void main(String[] args) {
		int n=5; 
		for(int i=1;i<2*n;i++) {
			int tootalcol=i>n?i-5:(2*n-i)-5;
			for(int j=0;j<=tootalcol;j++ ) {
				System.out.print(" ");
			}
		int totalcol=i>n?i-5:(2*n-i)-5;
			for(int j=0;j<=totalcol;j++ ) {
				System.out.print("*");
				
			}
			
			
			int toootalcol=i>n?20-2*i:2*i;
			for(int j=1;j<=toootalcol;j++ ) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=toootalcol;j++ ) {
				System.out.print(" ");
				
			}
			
			for(int j=0;j<=totalcol;j++ ) {
				System.out.print("*");
				
			}
			
			
			System.out.println(" ");
	    }
	}
}
		
		
	

