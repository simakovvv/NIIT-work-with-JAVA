
import java.util.Scanner;
import java.util.Random;

public class MultiArray {//*Given a square matrix, the size is entered by the user. Find the sum of the elements of each of the diagonals without using nested loops
	 int Side_length;
	int matrixA[][];
	int Summ;
	int Buf;
	
	
	public int Listener() {//*Listens to a number from the keyboard
		System.out.println("Enter the length of the sides of the multidimensional array :");
		 Scanner in = new Scanner(System.in);
		 int S_length = in.nextInt();
		 return S_length;
	}
	
	public static int [][] Rand(int [][]n){//*Filling an array with random numbers up to 100
		Random random = new Random();
		for( int i = 0; i <= n.length-1; i++)
			for(int j = 0; j <= n.length-1; j++) {
				n[i][j] = Math.abs(random.nextInt(100));
				
			}
			return n;	  
	} 
	public static int Summ(int [][]n, int count, int Sum){//* summation 
			if(count<= n.length-1) {
			Sum = Sum + n[count][count]; //* summation of a diagonal
			Sum = Sum + n[count][n.length-count-1];//*summation of the inverse diagonal
			//System.out.print(Sum+" ");
			//System.out.println(n[count][n.length-count-1]);
			count++;
			return Summ(n,count, Sum);	
		}
		
		return Sum;	
	}
	
	public static void main(String[] args) {
		MultiArray myMultiArray = new MultiArray();
		myMultiArray.Side_length = myMultiArray.Listener();
		myMultiArray.matrixA = new int[myMultiArray.Side_length][myMultiArray.Side_length];
		//System.out.println(myMultiArray.matrixA[1][3]);
		myMultiArray.matrixA = Rand(myMultiArray.matrixA);
		myMultiArray.Summ = Summ(myMultiArray.matrixA, myMultiArray.Buf, myMultiArray.Summ);
		
		
		System.out.println("The sum of the numbers of the direct and inverse diagonals of the array:" + myMultiArray.Summ);
		System.out.println("Array:");
		for( int i = 0; i <= myMultiArray.matrixA.length-1; i++) {
			System.out.println();
			for(int j = 0; j <= myMultiArray.matrixA.length-1; j++) 
				System.out.print(myMultiArray.matrixA[i][j] + " ");        
			 }		
		}
			
}
