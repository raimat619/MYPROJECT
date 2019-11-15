package seleniumrc;

 class Reg_class implements Interface_test

{

	@Override
	public void add() 
	
	{
		System.out.println("I m inside add");
		
	}
	 
	
	public static void main (String []args)
	{
		
		System.out.println("I m inside Main");
		System.out.println("......................");
		
		Reg_class c = new Reg_class ();
		c.add();
		System.out.println("......................");
		c.sub();
	}
	
	 

}
