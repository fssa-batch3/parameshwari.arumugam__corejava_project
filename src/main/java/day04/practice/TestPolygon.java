package day04.practice;

public class TestPolygon {
	public static void main(String[] args) {
		
		try {
		    Polygon rec;
			rec = new Rectangle (10.5, 5.0);
			System.out.println(rec.calculateArea());
			System.out.println(rec.circumference());
			
			
			RightAngelTringle ratt = new RightAngelTringle(20.0, 10.0);
			System.out.println(ratt.calculateArea());
			System.out.println(ratt.circumference());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	   
}
}
