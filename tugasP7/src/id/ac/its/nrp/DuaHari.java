package id.ac.its.nrp;

public class DuaHari extends Paketan {
	//object
	private double flatFee;
	private Person sender;
	private Person recepient;
	
	//constructor
	public DuaHari(Person sender, Person recepient, double weigth, double costPerOunce, double flatFee) {
		
		super(sender, recepient, weigth, costPerOunce);
		
		this.sender = sender;
		this.recepient = recepient;
		if (flatFee > 0.0)
			this.flatFee = flatFee;
	}
	
	//setter getter
	public double getFlatFee() {
		return flatFee;
	}
	public void setFlatFee(double flatFee) {
		if(flatFee > 0.0)
			this.flatFee = flatFee;
	}
	
	//method atau behaviour
	@Override
	public double calculateCost() {
		return getWeigth() * getCostPerOunce() + getFlatFee();
	}
	
	@Override
	public String toString() {
		return String.format("---[PAKETAN DUA HARI]---%n>sender			{ ongkir = %.2f }%n%s--%n>recepient%n%s%n  -{ ongkir = %.2f }-%n",
				calculateCost(),sender, recepient, calculateCost());
	}

}
