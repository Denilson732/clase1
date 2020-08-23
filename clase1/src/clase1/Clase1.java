
package clase1;

public class Clase1 {


    public static void main(String[] args) {
//        funcionesMatematicasSuma  Funciones = new funcionesMatematicasSuma();      
//        System.out.println(Funciones.division());

        coche miCarro = new coche("TOYOTA",2019,"ROJO");
        coche tuCarro = new coche("Nissan",2019,"Azul");
        coche CarroConMasParametros = new coche("Nissan",2019,"Azul",4);
        
        
//        System.out.println(tuCarro.toString());
        System.out.println(CarroConMasParametros.toString()); 
         
    }
    
}