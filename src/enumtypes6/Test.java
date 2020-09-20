package enumtypes6;
//Programa Java para demostrar el funcionamiento de values(),
//ordinal() y valueOf()


	// Métodos values(), ordinal() y valueOf()
		// Todas las enumeraciones tienen automáticamente dos métodos predefinidos: values() y valueOf().
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
            // Llamando a ordinal() para encontrar el índice
            // de color.
            System.out.println(col + " en el índice "
                             + col.ordinal());
        }
 
        // Usando valueOf(). Devuelve un objeto de
        // Color con la constante dada.
        // La segunda línea comentada causa la excepción
        // IllegalArgumentException
        System.out.println(Color.valueOf("ROJO"));
        // System.out.println(Color.valueOf("BLANCO"));
    }
}










