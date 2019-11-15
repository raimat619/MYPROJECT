package seleniumrc;

public class Keyword_this

{
	 int a = 10;
	 int b = 10;

	
		
		void display(int a, int c )
		{
			
		
			int sum = a + b;
			System.out.println("Result:" +sum);
			this.Keyword_this();
			
		}
		
		void Keyword_this( )
		{
			
		
			System.out.println("default method:" + a);
			System.out.println(this.a);
		}
		
		public static void main (String []args)
		
		{
			
			Keyword_this k = new Keyword_this();
			
			k.display(10,20);
			
			
			
	}
}
