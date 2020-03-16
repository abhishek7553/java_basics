class exception_handling{
	public static void main(String[] args) {
		try{
			System.out.println("In try");
			System.out.println(0/0);
			
		}
		catch(ArithmeticException e){
			System.out.println("Exception: " + e.getMessage());
		}
		finally{
		System.out.println("Hello");
		}
	}
}