/**
 * Description:
 * This class is used to contain the data of a MenuItem.
 * 
 * @author Ali Ouakhchachi
 * @contact ls7771en@go.minnstate.edu
 * @since 11/25/2024
 * 
 * Institution: Metro State University
 * Course: ICS 240
 * 
 * Professor: Sena Houeto
 * 
 */
import java.text.DecimalFormat;

public class MenuItem implements Comparable<MenuItem>{
	private String name;
	private double price;
	private int quantity;
	
	public MenuItem( String name, Double price, Integer quantity ) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		DecimalFormat df =  new DecimalFormat("#0.00");
		double totalValue = price * quantity;
		
		return name + "\t\t$" + df.format(price) + "\t\t" + quantity + "\t$" + df.format(totalValue);
	}
	
	public boolean equals( MenuItem m ) {
		if (this == m) {
			return true;
		}
		if (m == null || getClass() != m.getClass()) {
			return false;
		}
		
		MenuItem test = (MenuItem) m;
		return this.name.equalsIgnoreCase(test.getName());
	}
	
	@Override
	public int compareTo(MenuItem m) {
		return this.name.compareToIgnoreCase(m.getName());
	}
}
