package enumtypes;


			//-------------------

//public enum Lenguajes {
	
//	JAVA,
//	PHP,
//	C,
//	PERL,
//	RUBY,
//	PYTHON; // No olvide el (;)!!!
//}

			//-------------------
public enum Lenguajes {
	
	JAVA(4),
	PHP(2),
	C(5),
	PERL(6),
	RUBY(3),
	PYTHON(4); // No olvide el (;)!!!
 
	//Atributo
	int aniosAprendizaje ;
 
	//Constructor
	Lenguajes(int aniosAprendizaje){
		this.aniosAprendizaje=aniosAprendizaje;
	}
 
	//Metodo
	public int getAniosAprendizaje(){
		return aniosAprendizaje;
	}
	
			//-------------------
}
