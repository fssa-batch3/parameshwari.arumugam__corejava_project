package day10.misc;



class Divider{
	public static int divisor(int a , int b) throws Exception{
		if(b==0) {
			throw new Exception("Divider can't be zero");
		}
		
		int c = a/b;
		return c;
	}
}



public class MainMethod {
   public static void main(String[] args) {
	Divider.divisor(5,0);
}
}
