import java.util.Scanner;


public class CreditCard {

	 public static void main(String[] args) {
	     Scanner c = new Scanner(System.c);
	        int count = 0;
	        long array[] = new long [16];
	       do
	       {
	        count = 0;
	       array = new long [16];
	        System.out.print("Enter your Credit Card Number : ");
	        long number =c.nextLong();
	        for (int i = 0; number != 0; i++) {
	        array[i] = number % 10;
	        number = number / 10;
	        count++;
	        }
	       }
	        while(count < 16); 
	        if ((array[count - 1] == 4) || (array[count - 1] == 5) || (array[count - 1] == 3 && array[count - 2] == 7)){
	            if (isValid(array) == true) {
	                System.out.println("\n The Credit Card Number is Valid. ");
	        } else {
	            System.out.println("\n The Credit Card Number is Invalid. ");
	        }
	        } else{
	          System.out.println("\n The Credit Card Number is Invalid. ");
	        }
	    }

	    public static boolean isValid(long[] array) {
	        int total = sumOfDEvenPlace(array) + sumOfOddPlace(array);        
	        if ((total % 10 == 0)) {
	         for (int i=0; i< array.length; i++){
	            System.out.println(array[i]);}
	            return true;
	        } else {
	          for (int i=0; i< array.length; i++){
	            System.out.println(array[i]);}
	            return false;
	        }
	    }

	    public static int getDigit(int number) {
	        if (number <= 9) {
	            return number;
	        } else {
	            int firstDigit = number % 10;
	            int secondDigit = (int) (number / 10);
	            return firstDigit + secondDigit;
	        }
	    }

	    public static int sumOfOdddPlace(long[] array) {
	        int result = 0;
	        for (int i=0; i< array.length; i++)
	        
	        
	        {
	        while (array[i] > 0) {
	            result += (int) (array[i] % 10);
	            array[i] = array[i] / 100;
	         }}
	         System.out.println("\n The sum of odd place is " + result);
	        return result;
	    }

	 
	
	
}
