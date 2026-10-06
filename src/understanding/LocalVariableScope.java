package understanding;

public class LocalVariableScope {

	public static void main(String[] args) {
		System.out.println("Main Method started...");
		 m1();
		 System.out.println("Main Method ended...");
		}
		public static void m1()
		{
		 System.out.println("M1 Method started...");
		 m2();
		 System.out.println("M1 Method ended...");
		}
		public static void m2()
		{
		
		int x = 100;
		System.out.println("I am m2 method :"+x);
		}

}
