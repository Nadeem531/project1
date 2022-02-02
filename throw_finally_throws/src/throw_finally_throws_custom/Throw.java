package throw_finally_throws_custom;

public class Throw {
		  static void checkAge(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("your age must be above 18 to access ");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }

		  public static void main(String[] args) {
		    checkAge(15); 
		  }
		}
