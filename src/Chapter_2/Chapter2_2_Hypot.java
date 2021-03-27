package Chapter_2;
/* определение длины гипотенузы исходя из длины катетов,
по теореме Пифагора
*/
public class Chapter2_2_Hypot {
	public static void main(String[] args) {
		double x, y, z;

		x = 3;
		y = 4;

/* Обратите внимание на вызов метода sqrt().
Перед именем метода указывается имя класса, членом которого он является.
*/
		z = Math.sqrt(x*x + y*y);

		System.out.println("Длина гипотенузы: " + z);
	}
}
