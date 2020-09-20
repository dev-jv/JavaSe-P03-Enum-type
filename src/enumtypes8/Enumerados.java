package enumtypes8;

	//ENUM Y HERENCIA
		//Uso de ordinal( ) y compareTo()
/*
final int ordinal()  // Devuelve el valor ordinal de la constante invocadora. 

final int compareTo(tipo-enum e) // Puede comparar el valor ordinal de dos constantes de la misma enumeraci�n
*/

//Demostraci�n de ordinal() y compareTo()
enum Transporte{
 COCHE, CAMION, AVION, TREN, BARCO; // No olvide el (;)!!!

}

class Enumerados {
 public static void main(String[] args) {
     Transporte tp,tp2,tp3;

     //Obtenga todos los valores ordinales usando ordinal().
     System.out.println("Aqu� est�n todas las constantes de Transporte " +
             "y sus valores ordinales: ");
     for (Transporte t:Transporte.values())
         System.out.println(t+ " "+t.ordinal());

     tp=Transporte.AVION;
     tp2=Transporte.TREN;
     tp3=Transporte.AVION;

     System.out.println();

     //Uso de CompareTo()
     if (tp.compareTo(tp2)<0)
         System.out.println(tp+ " llega antes que "+tp2);

     if (tp.compareTo(tp2)>0)
         System.out.println(tp2+ " llega antes que "+tp);

     if (tp.compareTo(tp3)==0)
         System.out.println(tp+ " es igual que "+tp3);

 }
}