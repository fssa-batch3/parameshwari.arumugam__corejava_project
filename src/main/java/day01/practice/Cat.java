package day01.practice;

public class Cat {
	

	private String age;
    private String color;
    private String Speaks;
	
	    public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSpeaks() {
		return Speaks;
	}
	public void setSpeaks(String speaks) {
		Speaks = speaks;
	}
	    
	public static void main(String[] args) {
        // Create two Dog objects
		Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setAge("4");
        cat1.setSpeaks("Meow!");
       
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setAge("3");
        cat2.setSpeaks("Meow!");
       

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
       
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Speaks: " + cat1.getSpeaks());
        

        System.out.println("Cat 2:");
        
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Speaks: " + cat2.getSpeaks());
    }
}




