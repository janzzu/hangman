package vt6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	static String tiedosto = "./src/sanalista.txt";
	static int arvaustenMaara = 8;
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
		System.out.println("Tervetuloa Hirsipuu-peliin.");
		Sanalista sanalista = new Sanalista(tiedosto);
		Hirsipuu hirsipuu = new Hirsipuu(sanalista, arvaustenMaara);
		
	}
	
	
	
	
	
}
