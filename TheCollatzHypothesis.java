import java.util.ArrayList;  

public class TheCollatzHypothesis {//*Найти наибольшую последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000
	private int inp = 1;
	private int outp = 1000000;
	int max;
	int Num;
	int Counter;
	 
	public static int Even(int Num) {//* Последовательность для чётного числа
		return Num/2;
	}
	public static int Odd(int Num) {//* Последовательность для нечётного числа
        int Num1 = Num*3 +1;
		return Num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheCollatzHypothesis myTheCollatzHypothesis = new TheCollatzHypothesis();
		
		int []CounterArr = new int[10]; //* Объявили массив для временного хранения последовательности
		
		for(int x = myTheCollatzHypothesis.inp; x <= myTheCollatzHypothesis.outp; x++) {//* основной цикл от 1 до миллиона
			int peresch = x;
			while(peresch > 1) { //* Запись в массив происходит, пока число не станет единицей
			
			  myTheCollatzHypothesis.Counter++;  //* Счётчик количества символов в массиве
			  
			  if (peresch % 2 == 0) {//* Определение чётности/нечётности числа
				  peresch = Even(peresch);
			  }
			  else {
				  peresch = Odd(peresch);
			  }
			  
			}
			if (myTheCollatzHypothesis.max < myTheCollatzHypothesis.Counter) {  //* Проверяем  размер массива,если но
				myTheCollatzHypothesis.max = myTheCollatzHypothesis.Counter;  
				myTheCollatzHypothesis.Num = x;
			}
		    myTheCollatzHypothesis.Counter = 0;
		}
		System.out.println("Наибольшая последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000 у числа :" + myTheCollatzHypothesis.Num);
		System.out.println("Их количество: " + myTheCollatzHypothesis.max);
		
		while(myTheCollatzHypothesis.Num > 1) { //* Запись в массив происходит, пока число не станет единицей
			 
			  if (myTheCollatzHypothesis.Num % 2 == 0) {//* Определение чётности/нечётности числа
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
