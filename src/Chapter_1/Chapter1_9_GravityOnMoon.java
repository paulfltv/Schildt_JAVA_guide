package Chapter_1;

public class Chapter1_9_GravityOnMoon {
	public static void main(String[] args) {
		double F_Earth, F_Moon, m_Earth, m_Moon, g;
		m_Earth = 60;
		g = 9.81;
		F_Earth = m_Earth * g;
		F_Moon = F_Earth * 0.17;
		m_Moon = F_Moon / g;
		System.out.println("Гравитация на Земле равна " + F_Earth);
		System.out.println("Ускорекние свободного падения на Луне равно " + F_Moon);
		System.out.println("Масса тела (кг.) на Луне равна " + m_Moon);
	}
}