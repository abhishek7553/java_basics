abstract class A
{
	int r;
}
interface Shape
{
	void area();
}
class Circle extends A implements Shape
{
	Circle(int x)
	{
		r=x;
	}
	public void area()
	{
		System.out.println("Area: "+3.14*r*r);
	}
}
class Compute
{
	public static void main(String args[])
	{
		Circle c1=new Circle(10);
		c1.area();
	}
}