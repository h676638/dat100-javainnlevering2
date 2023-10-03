package no.hvl.dat100.lab5.tabeller;


import 	java.util.Arrays;


public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
   
		for(int i= 0; i< tabell.length; i ++) {
			System.out.println(tabell[i]);
		}
		
		
		
	}

	// b)
	public static String tilStreng(int[] tabell) {

	
		
		 String a = Arrays.toString(tabell);
		 
		 a = a.replaceAll(" ","");
		 
		 return a;
		 
		
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int resultat = 0;
		for(int element: tabell) {
			
			
		resultat += element;
		
			
		}
		return resultat;
		
		
		
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

	
		for(int i= 0; i< tabell.length; i ++) {
			
			if(tall==tabell[i]){
				return true;
			
		}
		}
		return false;
		
		
		
		
	}	
		
		

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

      	for(int i= 0; i< tabell.length; i ++) {
			
			if(tall==tabell[i]){
				return i;
			
			}
		}
		
      	return -1;
		
		

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int [] tabell2= new int [tabell.length];
          for(int i=0, j= tabell.length-1; i<tabell.length; i++, j--) {
        	  tabell2[i]= tabell[j];
        	  
        
          }
    return tabell2;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i=0; i< tabell.length-1; i ++) {
			
			if(tabell[i+1]<tabell[i]){
				
			return false;
			}
		
	}
		return true;
	}
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int [] tabell3= new int [tabell1.length];
        for(int i=0; i<tabell1.length; i++) {
      	  tabell3[i]= tabell1[i]; 
      	  
       
        }
        for(int i=0; i<tabell2.length; i++) {
        	tabell3[i]= tabell2[i]; 
        }
  return tabell3;
	}
}
