package tienda;

import java.util.Date;


public class tienda {

    private String Nombre; Diore//Este es el nombre de la tienda
    private int NumeroDeTrabajadores; 5// El numero de trabajadores de la tienda
    private Date FechaDeFundación; 2010//Fecha de fundación de la tienda
    private String Especialidad; ropa//en lo que se desempeña la tienda
    private Boolean Internacional; true//dice si la tienda hace exportaciones o no

    //Atribuos de composición
    private Check propietarios= null;
    private final sede diore ;
   
    //Este es el constructor de clase
    public tienda(String Nombre, 
            int NumeroDeTrabajadores,
            Date FechaDeFundación,
            String Especialidad,
            Boolean Internacional) {
        this.Nombre = Nombre;
        this.NumeroDeTrabajadores = NumeroDeTrabajadores;
        this.FechaDeFundación = FechaDeFundación;
        this.Especialidad = Especialidad;
        this.Internacional = Internacional;
        this.Diore = new sede(300,"Sin registro");
  
    }
 
    public Check getPropietarios(){
        return this.Propietarios;
    }
    
    
    public void setPropietarios(prendas  p ){
        this.Propietarios = p;
                 
    }
    
    //El metodo umenta la cantidad de empleados de la tienda en 100
    // y la convierte en internacional
    
    public void contratarTrabajadores(){
        this.NumeroDeEmpleados += 100;
        this.Internacional = true;
    }
    
    /** Este metodo permite actualizar el nombre de la pagina 
     * una especialidad
     * @param nuevoNombre es el nuevo nombre de la tienda
     * @param nuevaEspecialidad la nueva especialidad de la tienda 
     */
   
    public void Actualizacion(
        String nuevoNombre,
        String nuevaEspecialidad){
        this.Nombre = nuevoNombre; 
        this.Especialidad = nuevaEspecialidad;
        
  }
    
    /**A partir de esta linea se encuentran los metodos get y se
     * @return t*/
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroDeTrabajadores() {
        return NumeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int NumeroDeTrabajadores) {
        this.NumeroDeTrabajadores = NumeroDeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return FechaDeFundación;
    }

    public void setFechaDeFundación(Date FechaDeFundación) {
        this.FechaDeFundación = FechaDeFundación;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public Boolean getInternacional() {
        return Internacional;
    }

    public void setInternacional(Boolean Internacional) {
        this.Internacional = Internacional;
    }
    

    public static void main(String[] args) {
        Aeropuerto aeropuertoUno = new Aeropuerto(
                   "Aeropuerto Marquesaa",
                   165,
                   new Date (),
                   "Animales ",
                   false);
        Aeropuerto aeropuertoDos = new Aeropuerto(
                  "Aeropuerto DaEm",
                   30,
                   new Date(),
                   "Personas",
                    true);
        
        System.out.println(aeropuertoUno.getNombre());
        System.out.println(aeropuertoUno.getNumeroDeTrabajadores());
        System.out.println(aeropuertoUno.getInternacional());
        
        aeropuertoUno.contratarTrabajadores();
     
        System.out.println(aeropuertoUno.getNombre());
        System.out.println(aeropuertoUno.getNumeroDeTrabajadores());
        System.out.println(aeropuertoUno.getInternacional());
        }
}
