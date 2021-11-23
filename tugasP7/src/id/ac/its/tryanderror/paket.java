package id.ac.its.tryanderror;

public class paket {
	private String senderName;
	private String senderAddress;
	private String senderCity;
	private String senderState;
	private int senderZIP;
	private String recipientName;
	private String recipientAddress;
	private String recipientCity;
	private String recipientState;
	private int recipientZIP;
	private double weigth;
	private double costPerOunce;
	
	public paket(String senderName, String senderAddress, String senderCity, String senderState, int senderZIP,
			String recipientName, String recipientAddress, String recipientCity, String recipientState,
			int recipientZIP, double weigth, double costPerOunce) {
		super();
		this.senderName = senderName;
		this.senderAddress = senderAddress;
		this.senderCity = senderCity;
		this.senderState = senderState;
		this.senderZIP = senderZIP;
		this.recipientName = recipientName;
		this.recipientAddress = recipientAddress;
		this.recipientCity = recipientCity;
		this.recipientState = recipientState;
		this.recipientZIP = recipientZIP;
		
//		invariant class
		if (weigth > 0.0)
			this.weigth = weigth;
		if (costPerOunce > 0.0)
			this.costPerOunce = costPerOunce;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderCity() {
		return senderCity;
	}

	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}

	public String getSenderState() {
		return senderState;
	}

	public void setSenderState(String senderState) {
		this.senderState = senderState;
	}

	public int getSenderZIP() {
		return senderZIP;
	}

	public void setSenderZIP(int senderZIP) {
		this.senderZIP = senderZIP;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientAddress() {
		return recipientAddress;
	}

	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public String getRecipientCity() {
		return recipientCity;
	}

	public void setRecipientCity(String recipientCity) {
		this.recipientCity = recipientCity;
	}

	public String getRecipientState() {
		return recipientState;
	}

	public void setRecipientState(String recipientState) {
		this.recipientState = recipientState;
	}

	public int getRecipientZIP() {
		return recipientZIP;
	}

	public void setRecipientZIP(int recipientZIP) {
		this.recipientZIP = recipientZIP;
	}

	public double getWeigth() {
		return weigth;
	}

//	invariant class
	public void setWeigth(double weigth) {
		if (weigth > 0.0)
			this.weigth = weigth;
	}

	public double getCostPerOunce() {
		return costPerOunce;
	}

//	invariant class
	public void setCostPerOunce(double costPerOunce) {
		if (costPerOunce > 0.0)
			this.costPerOunce = costPerOunce;
	}
	
//	method atau beahaviour
	public double calculateCost() {
		return getWeigth() * getCostPerOunce();
	}
	
	
}
