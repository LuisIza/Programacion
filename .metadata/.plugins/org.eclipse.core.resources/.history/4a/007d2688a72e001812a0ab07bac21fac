package refactoringSample;

public class MainToTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// Kico's Movies
	Customer c = new Customer("Kico");
	
	// Creating Rentals & intro it
	Movie m1 = new Movie("StarWars", Movie.REGULAR);
	Rental r1 = new Rental(m1, 10); // 10 days
	c.addRental(r1);
	
	Movie m2 = new Movie("StarWars2", Movie.REGULAR);
	Rental r2 = new Rental(m2, 10); // 10 days
	c.addRental(r2);

	// My Kid's Movies!
	Customer c2 = new Customer("Stefan");

	// Creating Rentals & intro it
	Movie m3 = new Movie("Toy Story", Movie.CHILDRENS);
	Rental r3 = new Rental(m3, 10); // 10 days
	c2.addRental(r3);
	
	Movie m4 = new Movie("ToyStory2", Movie.CHILDRENS);
	Rental r4 = new Rental(m4, 10); // 10 days
	c2.addRental(r4);

	
	// Laura's
	Customer c3 = new Customer("Laura");

	// Creating Rentals & intro it
	Movie m5 = new Movie("Lincoln", Movie.NEW_RELEASE);
	Rental r5 = new Rental(m5, 15); // 10 days
	c3.addRental(r5);
	
	
	
	// Show data
	System.out.println (c.statement());
	System.out.println (c2.statement());
	System.out.println (c3.statement());

	} // main

}
