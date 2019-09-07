
package singleton;

/**
 *
 * @author USUARIO
 */
public class Auto {

    private String color;
    private String marca;
    private static Auto carro;
    
    public static Auto getObjeto(String color,String marca) {
        if(carro==null){
            carro=new Auto(color,marca);
        }else{
             System.out.println("No se puede crear el objeto "+ marca +" "+ color + " porque ya existe un objeto de la clase Auto");
        }
        return carro;
    }
    
    
    private Auto(String color,String marca){
        this.color = color;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    

}
