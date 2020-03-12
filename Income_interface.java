import java.util.*;
interface Income{
	public void earnings();
	public void deduction();
	public void bonus();
}
 public abstract class Manager implements Income {
	public int basic;
  public void earnings() 
    {
    System.out.println("This is earning method");
	Scanner s = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        basic= s.nextInt();
		System.out.println("Therefore earning is "+(basic + 0.8*basic+ 0.15*basic)); 
		
    }
  public void deduction()
  {
	  System.out.println("This is deduction method");
	 System.out.println("Therefore deduction is "+(0.12*basic)); 
  }
 public abstract void bonus();
 }

public class Substaff extends Manager implements Income
{
 public void bonus()
  {
	  System.out.println("This is bonus method");
	 System.out.println("Therefore bonus is "+(0.5*basic)); 
  }
}
class newfunc
{
public static void main(String args[])
{
	Substaff s= new Substaff();
	s.earnings();
	s.deduction();
	s.bonus();
}
}
