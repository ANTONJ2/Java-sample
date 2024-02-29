package practise;

public class arrayofobjects {
int firstnum;
int secondnum;

public arrayofobjects test(arrayofobjects x) {
	return x;
}
public void show() {
	System.out.println(firstnum);
    System.out.println(secondnum);
}

	public static void main(String[] args) {
		
		arrayofobjects[] ao=new arrayofobjects[5];
		 for(int i=0;i<5;i++) {
	        	ao[i]=new arrayofobjects();
	        }
		ao[0].firstnum=5;
		ao[0].secondnum=7;
		ao[1]=ao[0].test(ao[0]);
        ao[2]=ao[1];
        ao[3]=ao[2];
        ao[4]=ao[3];
        
       
        for(int i=0;i<5;i++) {
        	ao[i].show();
        }
        
        
        
	}

}
