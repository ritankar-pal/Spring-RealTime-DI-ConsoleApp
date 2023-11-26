package in.ineuron.comp;

import java.util.Arrays;
import java.util.Random;

//Target Class::
public class Flipkart {
	
	//Dependent Object:: 
	private ICourier courier;
	private Float discount;

	static {
		System.out.println("Flipkart .class file is loading");
	}
	
	public Flipkart() {
		System.out.println("Flipkart zero argument constructor is being created");
	}
	
	
	public void setCourier(ICourier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
	}
	
	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
	}

	
	//Business Logic::
	public String doShopping(String[] items, float[] prices) {
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is:: " + courier.getClass().getName());
		System.out.println("Discount amount is:: " + discount);
		
		float billAmount = 0.0f;
		int oid = 0;
		Random random = null;
		
		for (float f : prices) {
			billAmount = billAmount + f;
		}
		
		billAmount = billAmount - (billAmount * (discount/100.0f));
		
		random = new Random();
		oid = random.nextInt(1000);
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items) + " are purchased having prices " + Arrays.toString(prices) + " with bill Amount of " + billAmount 
				+ " ----> " + msg;	
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}
	
}
