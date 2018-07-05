import static java.lang.Math.*;

public class MyComplex {
	private double real;
	private double imag;

	MyComplex() {// *constructor
		this.real = 0.0;
		this.imag = 0.0;
	}

	MyComplex(double real, double image) {// *constructor overloading
		this.real = real;
		this.imag = image;
	}

	public double getReal() {// *get the real part of a complex number
		return real;
	}

	public void setReal(double real) {// *set the real part of a complex number
		this.real = real;
	}

	public double getImag() {// *get the imaginary part of a complex number
		return imag;
	}

	public void setImag(double imag) {// *set the imaginary part of a complex number
		this.imag = imag;
	}

	public void setValue(double real, double image) {// *set the field parameters obtained in the method
		this.real = real;
		this.imag = image;
	}

	public String toString() {// *convert to text
		if (this.real == 0) {
			return String.valueOf(this.imag) + "i";
		} else if (this.imag == 0) {
			return String.valueOf(this.real);
		} else {
			return String.valueOf(this.real) + " + " + String.valueOf(this.imag) + "i";
		}
	}

	public boolean isReal() {// *check for the number
		if (this.real == 0)
			return false;
		else
			return true;
	}

	public boolean isImaginary() {// *check for the number
		if (this.imag == 0)
			return false;
		else
			return true;
	}

	public boolean eqals(double real, double imag) {// *comparison of received objects
		if (imag == real)
			return true;
		else
			return false;
	}

	public boolean eqals() {// *comparing objects within a class
		if (this.imag == this.real)
			return true;
		else
			return false;
	}

	public double magnitude() {// *returns the number module
		return Math.sqrt(this.real * this.real + this.imag * this.imag);
	}

	public double argument() {// *finding the argument of a complex number
		if (this.real > 0) {
			return Math.atan(imag / real);
		} else {
			if (real < 0 && imag > 0) {
				return Math.PI + Math.atan(imag / real);
			} else {
				return -Math.PI + Math.atan(imag / real);
			}
		}
	}

	public MyComplex add(MyComplex rigth) {// *adding a complex number
		this.real += rigth.real;
		this.imag += rigth.imag;
		return rigth;
	}

	public MyComplex addNew(MyComplex rigth) {// *adding туц a complex number
		return new MyComplex(this.getReal() + rigth.getReal(), this.getImag() + rigth.getImag());
	}

	public MyComplex subtract(MyComplex rigth) {// *subtraction of complex numbers
		this.real -= rigth.real;
		this.imag -= rigth.imag;
		return rigth;
	}

	public MyComplex subtractNew(MyComplex rigth) {// *subtraction of complex numbers and the return of a new
		return new MyComplex(this.getReal() - rigth.getReal(), this.getImag() - rigth.getImag());
	}

	public MyComplex multiply(MyComplex rigth) {// *multiply of complex numbers
		this.real *= rigth.real;
		this.imag *= rigth.imag;
		return rigth;
	}

	public static MyComplex divide(MyComplex rigth) {// * Allows to get the product of two complex numbers given in the
		// parameters.
		MyComplex temp = new MyComplex(rigth.getReal(), (-1) * rigth.getImag());
		temp.multiply(rigth);

		double denominator = rigth.getReal() * rigth.getReal() + rigth.getImag() * rigth.getImag();
		return new MyComplex(temp.getReal() / denominator, temp.getImag() / denominator);
	}

	public MyComplex conjugate() {// * Compute complex number conjugate
		MyComplex temp = new MyComplex();
		temp.real *= this.real;
		temp.imag *= -this.imag;
		return temp;
	}

	public static void main(String[] args) {
		MyComplex a = new MyComplex(0, 0);
		MyComplex b = new MyComplex(-2, 3);
		System.out.println("Зададим комплексное число a = " + a.toString());
		System.out.println("Зададим комплексное число b = " + b.toString());
		System.out.println("Проверим реальную часть числа a = " + a.isReal());
		System.out.println("Проверим мнимую часть числа a = " + a.isImaginary());
		System.out.println("Проверим реальную часть числа b = " + b.isReal());
		System.out.println("Проверим мнимую часть числа b = " + b.isImaginary());
		a.setValue(4., 4.);
		System.out.println("Установим значения 4+4i в число a = " + a.toString());
		System.out.println("Сравним действительную и мнимую части a= " + a.eqals());
		System.out.println("Сравним действительную и мнимую части b= " + b.eqals());
		System.out.println("Найдём модуль числа b= " + b.magnitude());
		System.out.println("Найдём аргумент числа b= " + b.argument());
		a.add(b);
		System.out.println("Добавим к числу а число b = " + a.toString());
		System.out.println("Чекнем их");
		System.out.println("Зададим комплексное число a = " + a.toString());
		System.out.println("Зададим комплексное число b = " + b.toString());

		a.multiply(b);
		System.out.println("А теперь умножим а на b = " + a.toString());
		a.divide(b);
		System.out.println("И поделим = " + b.toString());

	}
}
