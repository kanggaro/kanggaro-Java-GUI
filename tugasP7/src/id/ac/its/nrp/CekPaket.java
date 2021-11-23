package id.ac.its.nrp;

import java.util.Scanner;

public class CekPaket {

	public static void main(String[] args) {
		
		Person sender1 = new Person("faisal", "jl. ahmad yani","Surabaya", "ID", 73546);
		Person recepient1 = new Person( "aldi", "jl. sutomo", "Semarang", "ID", 73646);
		
		Paketan pertama = new Paketan(sender1, recepient1, 6.5, 7);
				
		Person sender2 = new Person("faqih", "jl. yani","Semarang", "ID", 73546);
		Person recepient2 = new Person( "alfan", "jl. motosi", "Suarbaya", "ID", 73646);
		
		Semalam kedua = new Semalam(sender2, recepient2, 6.5, 7, 1);
		
		Person sender3 = new Person("agil", "jl. yani","Semarang", "ID", 73546);
		Person recepient3 = new Person( "yonif", "jl. motosi", "Surabaya", "ID", 73646);
		
		DuaHari ketiga = new DuaHari(sender3, recepient3, 6.5, 7, 1);
		
		System.out.println(pertama);
		System.out.println(kedua);
		System.out.println(ketiga);

	}

}
