package practise;

public class objex2 {
int firsnum;
int secondnum;


	public objex2 test(objex2 y) {
        	
		return y;
	}
	public void show() {
		System.out.println(firsnum);
		System.out.println(secondnum);
	}
	public static void main(String[] args) {
		objex2 ob1=new objex2();
		objex2 ob2=new objex2();
		objex2 ob3=new objex2();
		objex2 ob4=new objex2();
		ob1.firsnum=5;
		ob1.secondnum=6;
		ob1.show();
		ob2=ob1.test(ob1);//here we are passing ob1 as argument so we are getting firstnuma nd secnum from ob2
		ob2.show();
		ob3=ob2;
		ob3.show();
		
		
		
        
	}

}
