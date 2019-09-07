
package singleton;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args){
        Auto renault = Auto.getObjeto("azul", "Renault");
        Auto ford = Auto.getObjeto("Rojo", "Ford");
        
        System.out.println(renault.getMarca()+" "+renault.getColor());
        System.out.println(ford.getMarca()+" "+ford.getColor());
    }
    
}
