package week8;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0; 
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered != 20) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println ("The disc has been added");
		}
		else
			System.out.println ("The cart is almost full");
	}
	public void addDigitalVideoDisc (DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc dvdEachDisc : dvdList) {
			qtyOrdered++;
		}
		System.out.println("The disc has been added");
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		qtyOrdered += 2;
		System.out.println ("The disc has been added");
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for (int i=0; i<qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle() == disc.getTitle()) {
				for (int j=i; j<qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				i--;
				qtyOrdered--;
				System.out.println ("The disc has been removed");
			}
		}
	}
	public float totalCost() {
		float total = 0;
		for (int i=0; i<qtyOrdered; i++)
			total += itemsOrdered[i].getCost();
		return total;
	}
	
	public void print() {
		for (DigitalVideoDisc disc : itemsOrdered) {
			System.out.print(disc.getTitle() + " " + disc.getCategory() + " " + disc.getDirector());
			System.out.print(disc.getLength());
			System.out.print(" ");
			System.out.print(disc.getCost());
			System.out.println();
		}
	}
}

