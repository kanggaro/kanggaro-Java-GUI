package id.ac.its.tryanderror;

public class PengirimanSemalam extends paket {

	//class tambahan
	private double overnightFeePerOunce;
	
	public PengirimanSemalam(String senderName, String senderAddress, String senderCity, String senderState,
			int senderZIP, String recipientName, String recipientAddress, String recipientCity, String recipientState,
			int recipientZIP, double weigth, double costPerOunce, double overnightFeePerOunce) {
		
		super(senderName, senderAddress, senderCity, senderState, senderZIP, recipientName, recipientAddress,
				recipientCity, recipientState, recipientZIP, weigth, costPerOunce);
		
		if(overnightFeePerOunce > 0.0)
			this.overnightFeePerOunce = overnightFeePerOunce;
	
	}

	public double getOvernightFeePerOunce() {
		return overnightFeePerOunce;
	}

	public void setOvernightFeePerOunce(double overnightFeePerOunce) {
		this.overnightFeePerOunce = overnightFeePerOunce;
	}

//	perhitungan biayanya
	public double calculateCost() {
		return getWeigth() * ( getCostPerOunce() + getOvernightFeePerOunce());
	}

	@Override
	public String toString() {
		return "PengirimanSemalam [calculateCost()=" + calculateCost() + "]";
	}
	
	
	
	
}
