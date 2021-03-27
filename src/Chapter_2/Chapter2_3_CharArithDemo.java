package Chapter_2;

public class Chapter2_3_CharArithDemo {
	public static void main(String[] args) {
		char ch;

		ch = 'X';
		System.out.println("ch содержит " + ch);

		/* Если инкременировать переменную ch на 1, то она превращается в 'Y',
		т.е. следующую по порядку в наборе ASCII (а также в наборе Unicode) перерменную.
 */
		ch++;
		System.out.println("теперь сh содержит " + ch);

		// Следующая по порядку в ASCII (и в Unicode) переменная 'Z' равна 90.
		ch = 90;
		System.out.println("теперь ch содержит " + ch);
	}
}
