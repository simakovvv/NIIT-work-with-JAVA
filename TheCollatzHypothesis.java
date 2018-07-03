import java.util.ArrayList;  

public class TheCollatzHypothesis {//*����� ���������� ������������������ �������� ��� ����� � ��������� �� 1 �� 1 000 000
	private int inp = 1;
	private int outp = 1000000;
	int max;
	int Num;
	int Counter;
	 
	public static int Even(int Num) {//* ������������������ ��� ������� �����
		return Num/2;
	}
	public static int Odd(int Num) {//* ������������������ ��� ��������� �����
        int Num1 = Num*3 +1;
		return Num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheCollatzHypothesis myTheCollatzHypothesis = new TheCollatzHypothesis();
		
		int []CounterArr = new int[10]; //* �������� ������ ��� ���������� �������� ������������������
		
		for(int x = myTheCollatzHypothesis.inp; x <= myTheCollatzHypothesis.outp; x++) {//* �������� ���� �� 1 �� ��������
			int peresch = x;
			while(peresch > 1) { //* ������ � ������ ����������, ���� ����� �� ������ ��������
			
			  myTheCollatzHypothesis.Counter++;  //* ������� ���������� �������� � �������
			  
			  if (peresch % 2 == 0) {//* ����������� ��������/���������� �����
				  peresch = Even(peresch);
			  }
			  else {
				  peresch = Odd(peresch);
			  }
			  
			}
			if (myTheCollatzHypothesis.max < myTheCollatzHypothesis.Counter) {  //* ���������  ������ �������,���� ��
				myTheCollatzHypothesis.max = myTheCollatzHypothesis.Counter;  
				myTheCollatzHypothesis.Num = x;
			}
		    myTheCollatzHypothesis.Counter = 0;
		}
		System.out.println("���������� ������������������ �������� ��� ����� � ��������� �� 1 �� 1 000 000 � ����� :" + myTheCollatzHypothesis.Num);
		System.out.println("�� ����������: " + myTheCollatzHypothesis.max);
		
		while(myTheCollatzHypothesis.Num > 1) { //* ������ � ������ ����������, ���� ����� �� ������ ��������
			 
			  if (myTheCollatzHypothesis.Num % 2 == 0) {//* ����������� ��������/���������� �����
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
