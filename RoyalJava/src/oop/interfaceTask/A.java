package oop.interfaceTask;

public interface A {
	
	//	1.Constant Variables(public static final)

	int NO1 = 100;
	public final int NO2 = 100;
	public static int NO3 = 100;
	public static final int NO4 = 100;
	
	//	2.methods
	//		1. Abstract methods(public abstract)

		void test1();
		public void test2();
		abstract void test3();
		public abstract void test4();
		
//		2. Non-abstract methods(static(Java-8),default(Java-8),private(Java-9))
		
		static void test5() {
			
			System.out.println("A : static--test5()");
			
		}
		
		default void test6() {
			
			test7();
			System.out.println("A : default--test6()");
			
		}
		
		private void test7() {
			
			System.out.println("A : private--test7()");
		}
	
	
}
