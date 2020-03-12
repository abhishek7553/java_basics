import java.util.*;
interface Motor{
    int capacity=100;
	public void run();
	public void consume();
}
 class washing implements Motor {
	public int n;
  public void run() 
    {
    System.out.println("This is run method");
	Scanner s = new Scanner(System.in);
        System.out.println("Enter the capacity");
        n = s.nextInt();
		if(n<=capacity)
			System.out.println("Run");
		else
			System.out.println("Won't run");
    }
  public void consume()
  {
	  System.out.println("This is consume method");
	  if(n<=capacity)
		  System.out.println("Machine will consume power");
  }
}
class function
{
public static void main(String args[])
{
	washing m= new washing();
	m.run();
	m.consume();
}
}