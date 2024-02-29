package practise;
class parent{
	public int num;
	public String name;
	parent(){
		//System.out.println("this is a test of parent");
	}
	public parent parentmethod(parent x){
		this.name=name;
		this.num=num;
		System.out.println(name);
		System.out.println(num);
		return x;
	}
}
public class child extends parent{

	child(){
		//System.out.println("this is a test of child");
	}
	public void parentmethod(){
		System.out.println("This is the child method");
	}
	public static void main(String[] args) {
		parent c=new parent();
		c.name="name";
		c.num=123;
		parent d=new parent();
		d=c.parentmethod(c);
		d.parentmethod(c);
		parent e=new parent();
	    e=d;
	    e.parentmethod(d);
		

	}

}
