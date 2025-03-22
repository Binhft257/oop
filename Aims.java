package ex1;

public class Aims {
	public static void main(String[] args) {
		/*
		 * Cart anOrder = new Cart(); DigitalVideoDisc dvd1 = new
		 * DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		 * DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
		 * "George Lucas", 87, 24.95f); DigitalVideoDisc dvd3 = new
		 * DigitalVideoDisc("Aladin", "Animation", 18.99f);
		 * anOrder.addDigitalVideoDisc(dvd1,dvd2); anOrder.displayCart();
		 */
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella");
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avengers");

		System.out.println("DVD 1 ID: " + dvd1.getId() + ", Title: " + dvd1.getTitle());
		System.out.println("DVD 2 ID: " + dvd2.getId() + ", Title: " + dvd2.getTitle());
		System.out.println("DVD 3 ID: " + dvd3.getId() + ", Title: " + dvd3.getTitle());
	}
}
