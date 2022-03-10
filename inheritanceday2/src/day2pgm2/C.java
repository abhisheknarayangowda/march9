package day2pgm2;
class A
{
	public A()
	{
    }
	public void m1()    
	{                                   /*super class/parent/base*/
		System.out.println("hello everyone");
	}
	class B extends A                    /*sub class / child / derived */
	{
		public void m2()
		{
			System.out.println("wellcome to c2tc");
		}
		public void m1()
		{
			System.out.println("good mrnd");
		}
		public void m1 (String s)
		{
			System.out.println(s);
		}
	}
	class D
	{
		public D()
		{
	}
		public void m1()              /*superclass/parent/base*/
		{
			System.out.println("hello everyone");
		}
	}


public class C
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
A a,a1;
B b;
a = new A();
//a1 = new A();    //instantiating the object
b = new B();
a1 = a;
a1.m1();         /*hello everyone*/
a1=b;
b.m1();        /* good mrng */
a1.m1();       /* good mrng */
D d = new D();
d.m1();
	}

}