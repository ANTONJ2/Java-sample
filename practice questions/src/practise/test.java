package practise;

public class test {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int p=n;p>i;p--) {
			System.out.print(" ");
		}
		for(int j=0;j<i;j++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
}
}
