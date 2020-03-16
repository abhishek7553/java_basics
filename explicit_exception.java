import java.util.*;
interface Bank{
	public void withdrawl_Amount();
}
class Account implements Bank{
	int balance;
	Account(int x){
		balance=x;
	}
	public void withdrawl_Amount(){
		System.out.println("Enter the withdrawl_Amount:" + balance);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		try{
			if(balance < x)
				throw new ArithmeticException("Insufficient balance");
				balance=balance-x;
				System.out.println("Transaction Successfully Complete");
		}
		catch(ArithmeticException e){
			System.out.println("Exception: " + e.getMessage());	
		}
		finally{
			System.out.println("Balance left:" + balance);

		}

	}
}
class explicit_exception{
	public static void main(String[] args){
		Account person1=new Account(5000);
		person1.withdrawl_Amount();
	}
}