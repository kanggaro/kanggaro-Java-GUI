package id.ac.its.nrp;

public class Paketan {
	//object
	private Person sender;
	private Person recepient;
	private double weigth;
	private double costPerOunce;
	
	
	//constructor
	public Paketan(Person sender, Person recepient, double weigth, double costPerOunce) {
		this.sender = sender;
		this.recepient = recepient;
		if (weigth > 0.0)
			this.weigth = weigth;
		if (costPerOunce > 0.0)
			this.costPerOunce = costPerOunce;
	}
	
	//setter getter
	public Person getSender() {
		return sender;
	}
	
	public void setSender(Person sender) {
		this.sender = sender;
	}
	
	public Person recepient() {
		return recepient;
	}
	public void setRecepient(Person recepient) {
		this.recepient = recepient;
	}
	
	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		if (weigth > 0.0)
			this.weigth = weigth;
	}

	public double getCostPerOunce() {
		return costPerOunce;
	}

	public void setCostPerOunce(double costPerOunce) {
		if(costPerOunce > 0.0)
			this.costPerOunce = costPerOunce;
	}

	//	method atau behaviour
	public double calculateCost() {
		return getWeigth() * getCostPerOunce();
	}
	
	public String toString() {
		return String.format("---[PAKETAN]---%n>sender			{ ongkir = %.2f }%n%s--%n>recepient%n%s%n  -{ ongkir = %.2f }-%n",
				calculateCost(),sender, recepient,calculateCost());
	}
	
	
	/*
	 * public String toString() { return "Paketan [sender=" + sender +
	 * ", recepient=" + recepient + "]"; }
	 */
}
