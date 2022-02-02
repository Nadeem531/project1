package exeption_handling_eg;

public class UnCexception { 
		   public static void main(String args[]) {
			try{
			   int arr[] ={1,2,3,4,5};
			   System.out.println(arr[7]);
			}
		        catch(ArrayIndexOutOfBoundsException e){
			   System.out.println("The given index  is  not present" +
				"in array. Please correct the error.");
			}
		   }
		}

