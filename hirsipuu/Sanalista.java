package vt6;
import java.util.*;
import java.io.*;
public class Sanalista {
	
	private List<String> sanat;
	
	
	public Sanalista(String tiedostonNimi) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		  try (ObjectInputStream oIn = new ObjectInputStream( new FileInputStream( tiedostonNimi ))){
		        
		         while ( true ){
		            String s =(String)oIn.readObject();
		            this.sanat.add( s );
		         }

		         
		  }   
	}

	
	public Sanalista(List<String> sanat){
		this.sanat = sanat;
	}
	
	public List<String> annaSanat(){
		return sanat;
	}
	
	public Sanalista sanatJoidenPituusOn(int pituus){
		List<String> uSanat = new ArrayList<String>();
		for(String sana : this.sanat){
			if(sana.length() == pituus){
				uSanat.add(sana);
			}
		}
		
		return new Sanalista(uSanat);
	}
	
	public Sanalista sanaJoissaMerkit(String mjono){
		List<String> uSanat = new ArrayList<String>();
		
		for(String sana : this.sanat){
			if(sana.length() != mjono.length()){
				continue;
			}
			for(int i = 0; i < mjono.length(); i++){
				if(mjono.charAt(i) != '_'){
					if(mjono.charAt(i) != sana.charAt(i)){
						break;
					}
				}
				if(i == mjono.length()-1)
					uSanat.add(sana);
			}
	
		
		
		}
		return new Sanalista(uSanat);
	}
	
	
}
