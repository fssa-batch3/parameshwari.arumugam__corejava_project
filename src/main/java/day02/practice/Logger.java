package day02.practice;



public class Logger {
	
	public static void debug(String msg) {
		System.out.println("DEBUG: " + msg);
	}

	public static void log(String msg) {
		// TODO complete this code using the above template
		System.out.println("Log: " + msg);
	}

	public static void error(String msg) {
		// TODO complete this code using the above template
		System.out.println("Error: " + msg);
	}

	public static void debug(int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);
	}
    
	public static void log(int num) {
		// TODO Complete this code
		System.out.println("Log: " + num);
	}

	public static void error(int num) {
		// TODO Complete this code
		System.out.println("Error: " + num);
	}
	
	public static void main(String[] args) {
		
		Logger loger = new Logger();
		
		loger.debug("Hello");
		loger.log("Hello");
		loger.error("Hello");
		
		
		loger.debug(22);
		loger.log(8);
		loger.error(10);
		
		
		
		
	}

	// Similarly write overloaded methods for error and info.
}

