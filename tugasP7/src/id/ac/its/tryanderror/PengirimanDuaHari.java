package id.ac.its.tryanderror;

public class PengirimanDuaHari extends paket {
	
	//class tambahan
	private double flatFee;

	public PengirimanDuaHari(String senderName, String senderAddress, String senderCity, String senderState,
			int senderZIP, String recipientName, String recipientAddress, String recipientCity, String recipientState,
			int recipientZIP, double weigth, double costPerOunce, double flatFee) {
		
		super(senderName, senderAddress, senderCity, senderState, senderZIP, recipientName, recipientAddress,
				recipientCity, recipientState, recipientZIP, weigth, costPerOunce);
		
		if (flatFee > 0.0)
			this.flatFee = flatFee;
	}

	public double getFlatFee() {
		return flatFee;
	}

	public void setFlatFee(double flatFee) {
		if (flatFee > 0.0)
			this.flatFee = flatFee;
	}
	
//	perhitungan biayanya
	public double calculateCost() {
		return getWeigth() * getCostPerOunce()+ getFlatFee();
	}

	@Override
	public String toString() {
		return "PengirimanDuaHari [getFlatFee()=" + getFlatFee() + ", calculateCost()=" + calculateCost() + "]";
	}
	
	
}
