package refactoringSample;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private static final int DEFAULT_AMOUNT = 0;
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
	int numberOfLateDeliveries=0;
	


	public Customer(String name) {
		_name = name;
	};

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	};

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			// determine amounts for each line
			switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.getDaysRented() > 2)

					thisAmount += (each.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;
				break;
			}
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
					&& each.getDaysRented() > 1)
				frequentRenterPoints++;
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		return result;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	// 1. EXTRACT METHOD
	public void printAmount () {
		int amount = 0 ;
		
		amount = getAmount(amount);
		printDetails(amount);
		
	}

	private int getAmount(int amount) {
		for (Integer integer = 0; integer <10 ; integer ++) {
			amount += integer;
		}
		return amount;
	}

	private void printDetails(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	// 2. INLINE METOD
	/*
	 * int getRating() {
    	return moreThanFiveLateDeliveries() ? 2 : 1;
  		}
  		boolean moreThanFiveLateDeliveries() {
    	return numberOfLateDeliveries > 5;
  		}
		}*/
	
	 int getRating() {
		    return numberOfLateDeliveries > 5 ? 2 : 1;
	 }
	 
	 
	 // 3. INLINE TEMP
	 /*
	  * boolean hasDiscount(Order order) {
  		double basePrice = order.basePrice();
  		return basePrice > 1000;
		}
	  */
	 boolean hasDiscount(Order order) {
		return order.basePrice() > 1000;
	}
	 
	 
	 public int suma (int n, int n2) {
		return n + n2;
	 }
	
	 
	 // 4. REPLACE TEMP
	/* 
	 * 	double calculateTotal() {
		double basePrice = quantity * itemPrice;
		if (basePrice > 1000) {
		    return basePrice * 0.95;
		  }
		  else {
		    return basePrice * 0.98;
		  }
		}*/
	 
	 double calculateTotal() {
		int quantity=0;
		int itemPrice=0;
		final double basePrice = baseprice2(quantity, itemPrice);
		  if (basePrice < 1000) {
		    return basePrice * 0.95;
		  }
		  else {
		    return basePrice * 0.98;
		  }
		}

	private double baseprice2(int quantity, int itemPrice) {
		return (double) (quantity * itemPrice);
	}
	
	// 5. Introduce Explaining Variable
	
	/*private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
	 void renderBanner() {
  		String platform = null;
		String browser = null;
		int resize = 0;
		if ((platform.toUpperCase().indexOf("MAC") > -1) &&
       (browser.toUpperCase().indexOf("IE") > -1) &&
        wasInitialized() && resize > 0 )
  		{
    	// do something
  		}
		}
*/
	
	private boolean wasInitialized() {
		// TODO Auto-generated method stub
		return false;
	}
	 void renderBanner() {
  		String platform = null;
		String browser = null;
		int resize = 0;
		final boolean isMacos = platform.toUpperCase().indexOf("MAC") > -1;
		final boolean isIEBrowser = browser.toUpperCase().indexOf("IE") > -1;
		final boolean wasResized = wasInitialized() && resize > 0;
		if (isMacos &&       isIEBrowser &&        wasResized )	{
			
    	// do something
  		}
		}

	// 6. Remove Assignments to Parameters
	 
	public void discount(final int inputVal, int quantity) {
		  int result = inputVal;
		if (result > 50) {
		    result -= 2;
		  }
		  
		}
	 	
	
	
}