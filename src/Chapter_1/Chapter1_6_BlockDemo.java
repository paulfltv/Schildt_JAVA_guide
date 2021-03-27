package Chapter_1;

public class Chapter1_6_BlockDemo {
public static void main(String[] args) {
	double i, j, d;

	i = 5;
	j = 10;

	if (i != 0) {
//		3 строки ниже - это БЛОК КОДА, являющийся телом оператора if
		System.out.println("i не равно нулю");
		d = j / i;
		System.out.println("j / i равно " + d);
	}
}
}
