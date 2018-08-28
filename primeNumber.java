
//returns true or false 
// based on whether an entered value
// is prime or not
// value must be at most 4 digits
// and be numeric


import java.util.*;

public class primeNumber{

		static boolean prime = false;
		static boolean isPrime(int val){
			int length = String.valueOf(val).length(); // length of a digit
		
				if(val%2==0 || val==1){
					prime = false;
					return prime;
				}

				for(int i=3;i*i<val;i+=2){
					if(val%i==0){
						prime = false;
						return prime;
					}
					

				}
				prime = true;
				return prime;
		}


	public static void main(String[] args){
		try{
			Scanner input = new Scanner(System.in);
			System.out.print("");
			int valueEntered = input.nextInt();
			int length = String.valueOf(valueEntered).length();
			if(length <= 4){
				System.out.println(isPrime(valueEntered));
		}
		else{
			System.out.println("Please Enter a number that has less than 4 digits");
		}

		}
		catch(Exception e){
			System.out.println("Only Numbers may be entered");
		}

	}
	}
