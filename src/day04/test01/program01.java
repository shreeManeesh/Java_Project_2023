package day04.test01;

public class program01 {
	public static void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}	
	private static void subMethod(int a,int b)
	{
		System.out.println(a-b);
	}	
	protected static void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}	
	static void sqrtMethod(int a)
	{
		System.out.println(a*a);
	}
	 	
	public void addMethodNonStatic(int a,int b)
	{
		System.out.println(a+b);
	}
	private void subMethodNonStatic(int a,int b)
	{
		System.out.println(a-b);
	}	
	protected void mulMethodNonStatic(int a,int b)
	{
		System.out.println(a*b);
	}	
	void sqrtMethodNonStatic(int a)
	{
		System.out.println(a*a);
	}	


}
