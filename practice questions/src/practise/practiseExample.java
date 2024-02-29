package practise;

public class practiseExample {

	practiseExample(){
	int[][] arr= {
			{1,2,3},
			{3,4,5},
			{5,6,7}
	};
	
	
	
for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr.length;j++) {
    		  System.out.println(arr[i][j]);  
    	  }
    	  
      }
      System.out.println("all the array elements are printed");
	}
	
	public static void main(String[] args) {
	practiseExample p=new practiseExample();
	
		
}
}
