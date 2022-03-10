package day2;
class D
{
	public void m1()
	{
System.out.println("hello everyone");		
	}
}
class B extends  D
{
	public void m2()
	{
		System.out.println("wellcome to c2tc");
	}
	public void m1()
	{
		System.out.println("good mrng");
	}
	public void m1(String s)
	{
		System.out.println(s);
	}
}


public class A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D d,d1;
B b;
d = new D();
//a1=new A();
b = new B();
d1 = d;
d1.m1();
d1=b;
d1.m1();

	}

}
