package exceptionProblems;

public class PrintException {
	public static void main(String args[]) {
		try {
			System.out.println("Exception Hadling Path");
			System.out.println(10/0);
		} catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println();
			System.out.println(e.getMessage());
		}
	}
}
