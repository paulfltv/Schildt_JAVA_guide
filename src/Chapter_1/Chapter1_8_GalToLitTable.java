package Chapter_1;

public class Chapter1_8_GalToLitTable {
public static void main(String[] args) {
	double gallons, liters;
	int counter;

//	Счетчик строк инициализируется нулевым значением
	counter = 0;
	for (gallons = 1; gallons <= 100; gallons++) {
//		преобразование в литры
		liters = gallons * 3.7854;
		System.out.println(gallons + " галлонам соответствует " + liters + " литра.");

//		увеличение значения счетчика строк на 1 на каждой итерации цикла
		counter++;
		if (counter == 10) {
			System.out.println();
//			сбросить счетчик строк
			counter = 0;
		}
	}
}
}

