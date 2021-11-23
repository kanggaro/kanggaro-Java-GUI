package id.ac.its.nrp;

public class Semalam extends Paketan {
	//object
	private double overnightFeePerOunce;
	private Person sender;
	private Person recepient;

	//contructor
	public Semalam(Person sender, Person recepient, double weigth, double costPerOunce, double overnightFeePerOunce) {
		
		super(sender, recepient, weigth, costPerOunce);
		// TODO Auto-generated constructor stub
		this.sender = sender;
		this.recepient = recepient;
		if (overnightFeePerOunce > 0.0)
			this.overnightFeePerOunce = overnightFeePerOunce;
	}
	
	//setter getter
	public double getOvernightFeePerOunce() {
		return overnightFeePerOunce;
	}
	public void setOvernightFeePerOunce(double overnightFeePerOunce) {
		if (overnightFeePerOunce > 0.0)
			this.overnightFeePerOunce = overnightFeePerOunce;
	}
	
	//method atau behaviour
	@Override 
	public double calculateCost() {
		return getWeigth() * (getCostPerOunce() + getOvernightFeePerOunce());
	}
	
	@Override
	public String toString() {
		return String.format("---[PAKETAN SEMALAM]---%n>sender			{ ongkir = %.2f }%n%s--%n>recepient%n%s%n  -{ ongkir = %.2f }-%n",
				calculateCost(),sender, recepient, calculateCost());
	}
	
	/*	public String toString() { 
		return "Semalam [ongkir=" + calculateCost() + "]"; 
	}*/
}
