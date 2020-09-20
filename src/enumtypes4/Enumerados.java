package enumtypes4;

enum Transporte{
    COCHE, CAMION, AVION, TREN, BARCO; // No olvide el (;)!!!
}


class Enumerados {
    public static void main(String[] args) {
        Transporte tp;
        tp=Transporte.AVION;

        System.out.println("Valor de tp: "+tp);
        System.out.println();

        tp=Transporte.TREN;

        //Comparaci�n de 2 valores enum
        if (tp==Transporte.TREN)
            System.out.println("tp tiene el valor de TREN\n");

        //enum para controlar sentencia switch
        switch(tp){
            case COCHE:
                System.out.println("Un auto lleva personas.");
                break;
            case CAMION:
                System.out.println("Un cami�n lleva carga.");
                break;
            case AVION:
                System.out.println("Un avi�n vuela.");
                break;
            case TREN:
                System.out.println("Un tren corre sobre rieles.");
                 break;
            case BARCO:
                System.out.println("Un barco navega en el agua.");
                break;
        }
    }
}