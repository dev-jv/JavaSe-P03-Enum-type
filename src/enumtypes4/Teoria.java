package enumtypes4;

enum Transport{
    COCHE, CAMION, AVION, TREN, BARCO; // No olvide el (;)!!!
}

	//----EJEMPLOS USO
	
// Transporte tp; //Esto declara tp como una variable del tipo de enumeraci�n Transporte:

// tp = Transporte.AVION; //Esto asigna tp el valor AVION [los �nicos valores que se le pueden asignar son los definidos por la enumeraci�n]
	
// if(tp == Transporte.TREN) // ...  // Esta declaraci�n compara el valor en tp con la constante TREN:


/*
switch(tp){					//Uso de enum para controlar una sentencia switch
            case COCHE:
                //
            case CAMION:
                //
        }
*/

//System.out.println(Transporte.BARCO); // Muestra el nombre BARCO.
	











