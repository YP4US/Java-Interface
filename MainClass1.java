//Name: Yogesh Pawar Date:31/08/2017
//We can have more than one interface
interface Demo1
{
	void test();
}
interface Demo2 extends Demo1
{
	void disp();
}

class Demo3 implements Demo2
{
	public void disp()
	{
		System.out.println("Running disp() in Demo3...");
	}

	public void test()
	{
		System.out.println("Running test() in Demo3...");
	}
}

class MainClass1
{
	public static void main(String arg[])
	{
		Demo3 d3=new Demo3();
		d3.disp();
		d3.test();
	}
}
