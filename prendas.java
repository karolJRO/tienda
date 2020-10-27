
package tienda;


public class prendas extends Check{
    private final String Edad;
    private final Boolean numeroDePrendas;

    public prendas(String nombre, 
            String apellido,
            String Edad, 
            Boolean numeroDePrendas) {
        super(nombre, apellido);
        this.Edad = Edad;
        this.numeroDePrendas = numeroDePrendas;
        
    }
    
    
}
    
