package week3.day1;

public class Automation extends MultipleLanguage implements Language{

	public void ruby() {
		System.out.println("ruby");

	}

	public void python() {
		
		System.out.println("python");
	}

	public void selenium() {
		
		System.out.println("selenium");

	}

	public void java() {
	
		System.out.println("java");

	}

	public static void main(String[] args) {

		Automation auto = new Automation();
		auto.java();
		auto.python();
		auto.ruby();
		auto.selenium();
	}

}