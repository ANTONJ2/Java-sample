package practise;

import java.util.Scanner;

public class assqn2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char C=sc.next().charAt(0);
		//System.out.println(C);
		int a=str.indexOf(C);
		//System.out.println(a);
		int b=str.lastIndexOf(C);
		//System.out.println(b);
		StringBuilder sb=new StringBuilder(str);
		if(a!=b) {
			sb.deleteCharAt(b);
			sb.deleteCharAt(a);
		}
System.out.println(sb.toString());
	}

}
