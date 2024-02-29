package practise;

import java.util.Scanner;

public class sumquestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int sizeofthearray=sc.nextInt();
		String[] sarr=new String[sizeofthearray];
		for(int i=0;i<sizeofthearray;i++) {
			sarr[i]=sc.next();
		}
		String stringresult=sarr[0]+sarr[1]+sarr[2];
		System.out.println("this will give"+stringresult);
	    int toint=Integer.parseInt(stringresult);
	    System.out.println("enter the final int");
	    int i1=sc.nextInt();
	    //System.out.println("this is toint"+toint);
	    int finalresult=toint+i1;
	    //System.out.println("This is final result"+finalresult);
	    String finalres=String.valueOf(finalresult);
	    //System.out.println("This is final result in string"+finalres);
	    int[] arr=new int[sizeofthearray];
	//System.out.println("finalres char a 0 is:"+finalres.charAt(0));    
	    for(int i=0;i<sizeofthearray;i++) {
	    	arr[i]=Character.getNumericValue(finalres.charAt(i));
	    }

    System.out.println("["+arr[0]+","+arr[1]+","+arr[2]+"]");
		

	}

}
