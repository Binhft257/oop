package ex1;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < 20) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;

		} else {
			System.out.println("The cart is almost full.");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered < 20) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
		} else {
			System.out.println("The cart is almost full. Can't add: " + dvd1.getTitle());
		}

		if (qtyOrdered < 20) {
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
		} else {
			System.out.println("The cart is almost full. Can't add: " + dvd2.getTitle());
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] == disc) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered--;
				return;
			}
		}
		System.out.println("The disc is not found in the cart.");
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

	public void displayCart() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println((i + 1) + " " + itemsOrdered[i].getTitle() + " " + itemsOrdered[i].getCost());
			totalCost += itemsOrdered[i].getCost();
		}
		System.out.println("Total Cost " + totalCost);
	}

}
