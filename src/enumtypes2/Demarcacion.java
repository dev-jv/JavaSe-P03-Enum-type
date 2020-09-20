package enumtypes2;


	
public enum Demarcacion { 
	
	PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO; // No olvide el (;)!!!
	
	public static void main(String[] args) {
    	
		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;
				
		// Devuelve un String con el nombre de la constante
		System.out.println("delantero.name()= "+delantero.name());
		System.out.println("defensa.toString()= "+defensa.toString());
				
		//  Devuelve un entero con la posici�n de la constante seg�n est� declarada.
		System.out.println("delantero.ordinal()= "+delantero.ordinal());
				
		// Compara el enum con el par�metro seg�n el orden en el que est�n declaradas las constantes. 
		System.out.println("delantero.compareTo(portero)= "+delantero.compareTo(defensa));
		System.out.println("delantero.compareTo(delantero)= "+delantero.compareTo(delantero));
				
		// Recorre todas las constantes de la enumeraci�n
		for(Demarcacion d: Demarcacion.values()){
			System.out.println(d.toString()+" - ");
		}	
	}
	
}














































//	Demarcacion delantero = Demarcacion.DELANTERO;    // Instancia de un enum de la clase Demarcaci�n
//	delantero.name();    // Devuelve un String con el nombre de la constante (DELANTERO)
//	delantero.toString();    // Devuelve un String con el nombre de la constante (DELANTERO)
//	delantero.ordinal();    // Devuelve un entero con la posici�n del enum seg�n est� declarada (3).
//	delantero.compareTo(Enum otro);    // Compara el enum con el par�metro seg�n el orden en el que est�n declarados lo enum
//	Demarcacion.values();    // Devuelve un array que contiene todos los enum
//	




























