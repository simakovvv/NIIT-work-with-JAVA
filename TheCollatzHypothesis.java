import java.util.ArrayList;  

public class TheCollatzHypothesis {//*Find the largest Collatz sequence for numbers in the range from 1 to 1 000 000
	private int inp = 1;
	private int outp = 1000000;
	int max;
	int Num;
	int Counter;
	 
	public static int Even(int Num) {//* Sequence for an even number
		return Num/2;
	}
	public static int Odd(int Num) {//* Sequence for an odd number
        int Num1 = Num*3 +1;
		return Num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheCollatzHypothesis myTheCollatzHypothesis = new TheCollatzHypothesis();
		
		for(int x = myTheCollatzHypothesis.inp; x <= myTheCollatzHypothesis.outp; x++) {//* main cycle from 1 to 1 million
			int peresch = x;
			while(peresch > 1) { //* The entry in the array occurs until the number becomes one
			
			  myTheCollatzHypothesis.Counter++;  //* Count of characters in the array
			  
			  if (peresch % 2 == 0) {//* Definition of parity / odd number
				  peresch = Even(peresch);
			  }
			  else {
				  peresch = Odd(peresch);
			  }
			  
			}
			if (myTheCollatzHypothesis.max < myTheCollatzHypothesis.Counter) {  //* We check the size of the array, if it is larger than the maximum, we assign
				myTheCollatzHypothesis.max = myTheCollatzHypothesis.Counter;  
				myTheCollatzHypothesis.Num = x;
			}
		    myTheCollatzHypothesis.Counter = 0;
		}
		System.out.println("Наибольшая последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000 у числа :" + myTheCollatzHypothesis.Num);
		System.out.println("Их количество: " + myTheCollatzHypothesis.max);
		
		while(myTheCollatzHypothesis.Num > 1) { //* The entry in the array occurs until the number becomes one
			 
			  if (myTheCollatzHypothesis.Num % 2 == 0) {//* Definition of parity / odd number
				  System.out.println(" " + myTheCollatzHypothesis.Num);
				  myTheCollatzHypothesis.Num = Even(myTheCollatzHypothesis.Num);
			  }
			  else {
				  System.out.println(" " + myTheCollatzHypothesis.Num);
				  myTheCollatzHypothesis.Num = Odd(myTheCollatzHypothesis.Num);
			  }
		}
	}
	
}
