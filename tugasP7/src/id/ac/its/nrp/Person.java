package id.ac.its.nrp;

public class Person {
	//object
	private String name;
	private String address;
	private String city;
	private String state;
	private int ZIPcode;

	//constructor
	public Person(String name, String address, String city, String state, int zIPcode) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		ZIPcode = zIPcode;
	}

	@Override
	public String toString() {
		return String.format (" nama = %s%n alamat = %s%n kota = %s%n negara = %s%n kodepos = %s%n",
				name, address, city, state, ZIPcode);
	}
	
	
	/*
	 * public String toString() { return "[name=" + name + ", address=" + address +
	 * ", city=" + city + ", state=" + state + ", ZIPcode=" + ZIPcode + "]"; }
	 */
}
