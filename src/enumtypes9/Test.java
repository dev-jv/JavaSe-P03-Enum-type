package enumtypes9;


//Programa Java para demostrar que los enum pueden tener constructores
//y métodos concretos.

//Una enumeración (Note la palabra enum en lugar de class)
enum Color
{
 ROJO, VERDE, AZUL; // No olvide el (;)!!!

 // enum constructor llamado por separado para cada
 // constante
 private Color()
 {
     System.out.println("Constructor llamado para : " +
     this.toString());
 }

 // Solo métodos concretos (no abstractos) permitidos
 public void colorInfo()
 {
     System.out.println("Color Universal");
 }
}

public class Test
{    
 // Metodo
 public static void main(String[] args)
 {
     Color c1 = Color.ROJO;
     System.out.println(c1);
     c1.colorInfo();
 }
}