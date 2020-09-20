package enumtypes6;
//Programa Java para demostrar el funcionamiento de values(),
//ordinal() y valueOf()


	// M�todos values(), ordinal() y valueOf()
		// Todas las enumeraciones tienen autom�ticamente dos m�todos predefinidos: values() y valueOf().
/*
public static tipo-enum[ ] values( )
public static tipo-enum valueOf(String str)
*/



enum Color
{
    ROJO, VERDE, AZUL; // No olvide el (;)!!!
}
 
public class Test
{
    public static void main(String[] args)
    {
        // Llamando a values()
        Color arr[] = Color.values();
 
        // enum con bucle
        for (Color col : arr)
        {
            // Llamando a ordinal() para encontrar el �ndice
            // de color.
            System.out.println(col + " en el �ndice "
                             + col.ordinal());
        }
 
        // Usando valueOf(). Devuelve un objeto de
        // Color con la constante dada.
        // La segunda l�nea comentada causa la excepci�n
        // IllegalArgumentException
        System.out.println(Color.valueOf("ROJO"));
        // System.out.println(Color.valueOf("BLANCO"));
    }
}










