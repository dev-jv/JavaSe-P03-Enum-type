package enumtypes;

public class ProgramadorApp {

			//-------------------
	
	/*
    public static void main(String[] args) {
    	 
        Programador programador1=new Programador("Fernando", 23, Lenguajes.JAVA);
        Programador programador2=new Programador("Alberto", 27, Lenguajes.PHP);
        Programador programador3=new Programador("Sergio", 30, Lenguajes.PYTHON);
 
        System.out.println("La informacion sobre el programador 1 es la siguiente: \n" +
                "Nombre: "+programador1.getNombre()+"\n" +
                "Edad: "+programador1.getEdad()+"\n" +
                "Es experto en: "+programador1.getExpertoEn()+"\n");
 
        System.out.println("La informacion sobre el programador 2 es la siguiente: \n" +
                "Nombre: "+programador2.getNombre()+"\n" +
                "Edad: "+programador2.getEdad()+"\n" +
                "Es experto en: "+programador2.getExpertoEn()+"\n");
 
        System.out.println("La informacion sobre el programador 3 es la siguiente: \n" +
                "Nombre: "+programador3.getNombre()+"\n" +
                "Edad: "+programador3.getEdad()+"\n" +
                "Es experto en: "+programador3.getExpertoEn()+"\n");
		}
	*/
	
			//-------------------
	
	/*

    public static void main(String[] args) {
    	 
        //Array de Programadores
        Programador programadores[]=new Programador[3];
        programadores[0]=new Programador("Fernando", 23, Lenguajes.JAVA);
        programadores[1]=new Programador("Alberto", 27, Lenguajes.PHP);
        programadores[2]=new Programador("Sergio", 30, Lenguajes.PYTHON);
 
        //Contador Java
        int contador=0;
 
        for(int i=0;i<3;i++){
            if (programadores[i].getExpertoEn()==Lenguajes.JAVA){
                contador++;
            }
        }
 
        System.out.println("Hay "+contador+" experto/s en Java");
		}
	*/
			//-------------------

    public static void main(String[] args) {
      	 
        //Array de Programadores
        Programador programadores[]=new Programador[3];
        programadores[0]=new Programador("Fernando", 23, Lenguajes.JAVA);
        programadores[1]=new Programador("Alberto", 27, Lenguajes.PHP);
        programadores[2]=new Programador("Sergio", 30, Lenguajes.PYTHON);
 
        int cuentaAniosAprendizaje=0;
 
        for(int i=0;i<programadores.length;i++){
            //Invoco el lenguaje de programacion y a partir de este el numero de años de aprendizaje
            cuentaAniosAprendizaje+=programadores[i].getExpertoEn().getAniosAprendizaje();
        }
 
        System.out.println("La suma de los años de aprendizaje de los programadores es de "+cuentaAniosAprendizaje);
        
        
        System.out.println(Lenguajes.JAVA);
        
		}
	
}
