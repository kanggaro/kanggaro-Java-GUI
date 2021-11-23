package id.ac.its.tryanderror;

public class CEK {

	public static void main(String[] args) {
		
		  // inisialisasi 
		paket paket1 = new paket("faisal", "jl. ahmad yani","Surabaya", "ID", 73546, 
				"aldi", "jl. sutomo", "Semarang", "ID", 73646, 10.5,0.65); 
		PengirimanDuaHari paket2 = new PengirimanDuaHari("aldi","jl. soetomo", "Sarawak", "RM", 53434, 
				"ipul", "jln. pandjaitan", "Jakarta","ID", 65393, 10.5, .65, 2.0); 
		PengirimanSemalam paket3= new PengirimanSemalam("aldi", "jl. soetomo", "Sarawak", "RM", 53434, 
				"ipul","jln. pandjaitan", "Jakarta", "ID", 65393, 10.5, .65, 2.0);
		  
		  // yang ditampilkan dilayar untuk paket 1 (paket) 
		  System.out.printf("[paket 1] %n%n<<sender>>%nnama: %s%nalamat: %s%nkota: %s%nnegara: %s%nkode pos: %s%n ",
				  paket1.getSenderName(),paket1.getSenderAddress(),paket1.getSenderCity(),
				  paket1.getSenderState(),paket1.getSenderZIP() ); System.out.
		  printf("%n<<recepient>>%nnama: %s%nalamat: %s%nkota: %s%nnegara: %s%nkode pos: %s%n",
				  paket1.getRecipientName(),paket1.getRecipientAddress(),paket1.getRecipientCity(),
				  paket1.getRecipientState(),paket1.getRecipientZIP() );
		  System.out.printf("%nbiaya pengirimannya : Rp %.2f ",paket1.calculateCost());
		  
		  // yang ditampilkan dilayar untuk paket 2 (Semalam) 
		  System.out.printf("%n-----%n[paket 2] %n%n<<sender>>%nnama: %s%nalamat: %s%nkota: %s%nnegara: %s%nkode pos: %s%n ",
				  paket2.getSenderName(),paket2.getSenderAddress(),paket2.getSenderCity(),
				  paket2.getSenderState(),paket2.getSenderZIP() ); System.out.
		  printf("%n<<recepient>>%nnama: %s%nalamat: %s%nkota: %s%nnegara: %s%nkode pos: %s%n",
				  paket2.getRecipientName(),paket2.getRecipientAddress(),paket2.getRecipientCity(),
				  paket2.getRecipientState(),paket2.getRecipientZIP() );
		  System.out.printf("%nbiaya pengirimannya : Rp %.2f ",paket2.calculateCost());
		  
		  // yang ditampilkan dilayar untuk paket 3 
		  System.out.printf("%n-----%n[paket 3] %n%n<<sender>>%nnama: %s%nalamat: %s%nkota: %s%nnegara: %s%nkode pos: %s%n ",
				  paket3.getSenderName(),paket3.getSenderAddress(),paket3.getSenderCity(),
				  paket3.getSenderState(),paket3.getSenderZIP() ); 
		  System.out.printf("%n<<recepient>>%nnama: %s%nalamat: %s%nkota: %s%nnegara: %s%nkode pos: %s%n",
				  paket3.getRecipientName(),paket3.getRecipientAddress(),paket3.getRecipientCity(),
				  paket3.getRecipientState(),paket3.getRecipientZIP() );
		  System.out.printf("%nbiaya pengirimannya : Rp %.2f ",paket3.calculateCost());
		 

	}

}
