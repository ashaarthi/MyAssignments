package week3.day1;

public class Students {
	public void getstudentinfo(int id) {
		System.out.println(id);

	}

	public void getstudentinfo(int id, String name) {

		System.out.println(id + name);

	}

	public void getstudentinfo(String email, int phone) {
		System.out.println(email + phone);

	}

	public static void main(String[] args) {
		Students o = new Students();

		o.getstudentinfo(2);

		o.getstudentinfo(3, "asha");
		o.getstudentinfo("asharam@gmail.com", 9789480);
	}
}

