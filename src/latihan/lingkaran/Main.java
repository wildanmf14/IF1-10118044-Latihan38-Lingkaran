package latihan.lingkaran;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double diameter = 0;
		boolean isAngka;
		Lingkaran lingkaran = null;
		DecimalFormat ft = new DecimalFormat("#");
		System.out.println("======Perhitungan Lingkaran======");
		do {
			System.out.print("Masukan nilai diameter : ");

			if(reader.hasNextDouble()) {
				diameter = reader.nextDouble();
				lingkaran = new Lingkaran(diameter);
				isAngka = true;
			}else {
				System.out.println("Nilai Diameter Tidak Sesuai");
				isAngka = false;
				reader.next();
			}
			
			
		}while(!isAngka);
		
		System.out.println("");
		System.out.println("======Hasil Perhitungan Lingkaran======");
		System.out.println("Jari-jari Lingkaran =  "+ ft.format(lingkaran.getRadius()) + " cm");
		
		ft = new DecimalFormat("#.##");
		System.out.println("Luas Lingkaran = "+ ft.format(lingkaran.Luas()) + " cm");
		System.out.println("Keliling Lingkaran = "+ ft.format(lingkaran.Keliling()) + " cm");
		reader.close();

	}

}
