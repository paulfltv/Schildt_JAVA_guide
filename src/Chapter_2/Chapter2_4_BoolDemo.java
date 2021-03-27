package Chapter_2;
//Демонстрация использования логических значений
public class Chapter2_4_BoolDemo {
	public static void main(String[] args) {
		boolean b;

		b = false;
		System.out.println("Значение b: " + b);

		b = true;
		System.out.println("Значение b: " + b);

//		Логическое значение можно использовать для управления условной инструкцией if
		if(b) System.out.println("Эта инструкция выполняется");

		b = false;
		if(b) System.out.println("Эта инструкция не выполняется");

//		В результате сравнения получается логическое значение
//		Ранее строку ниже можно было прописать так:
//		System.out.println("Результат сравнения 10 > 9: " (10 > 9));
		System.out.println("Результат сравнения 10 > 9: true");
	}
}
