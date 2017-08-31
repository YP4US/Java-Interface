//Name: Yogesh Pawar Date:31/08/2017
//interface is with respect to only abstract methods not concrete methods

//Interface Class
interface Demo1
{
	static final int k=10;
	void test();
	void disp();
}

//Implementation class
class Demo2 implements Demo1 									//For defining body to abstract Method class should inherit with interface using implements keywod
{
	public void test()											//while implementing method of abstractMethod of Interface Class we need to provide public access modifier
	{
		System.out.println("Running test() in Demo2...");
	}

	public void disp()
	{
	System.out.println("Running disp() in Demo3...");
	}
}


class MainClass
{
	public static void main(String arg[])
	{
		Demo2 d2=new Demo2();
		d2.disp();
		d2.test();
	}
}