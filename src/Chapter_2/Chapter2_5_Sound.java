package Chapter_2;

public class Chapter2_5_Sound {
	public static void main(String[] args) {
		double speed, time, distance;
		speed = 300;
		time = 7.2;
		distance = speed * time;

		System.out.println("Расстояние до места вспышки молнии составляет " + distance + " метров.");
		System.out.println();
		double speedOfSound = 331;
		double distanceToObject = 331 * (7.2 / 2);
		System.out.println("Расстояние до объекта, от которого отразилось эхо, равно: " + distanceToObject);
	}
}