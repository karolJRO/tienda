#tienda /trabajo karol rodriguez, daniela vidal

package tienda;

//este es un nuevo comentario
public class Tienda {

   
    
    
    private string nombre; Diore //este es el nombre de la tienda
    private int numeroDeTrabajadores; 5 //son los trabajadores contratados
    private Date fechaDeFundacion; 2010 //la fecha en la que se fundo la tienda
    private string especialidad; ropa // es en lo que se desempeña la tienda
    private Boolean internacional; true // dice si la tienda hace exportaciones o no

    //este es el constructor de clase
    public Tienda(
            string nombre, 
            int numeroDeTrabajadores,
            Date fechaDeFundacion,
            string especialidad,
            Boolean internacional) {
        this.nombre = nombre;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.especialidad = especialidad;
        this.internacional = internacional;
    }
    
    //el metodo aumenta la cantidad de trabajadores de la tienda en 100
    //y la convierte en internacional
    public void contratarTrabajadores(){
        this.numeroDeTrabajadores +=100;
        this.internacional = true;
    }
    
    //este metodo permite cambiar el nombre de la tienda y su especialidad
    @param nuevoNombre es el nuevo nombre de la tienda
    @param nuevaEspecialidad es la nueva especialidad despues de la inaguracion//
    public void reinaguracion(
            string nuevoNombre, 
            string nuevaEspecialidad){
        this.nombre = nuevoNombre;
        this.especialidad = nuevaEspecialidad;
        this.numeroDeTrabajadores += 1;
    }
        
  // a partir de esta linea se encuentran los metodos get y set
    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public string getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(string especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(Boolean internacional) {
        this.internacional = internacional;
    }
    
    public static void main(string[]args){
       tienda tiendaUno = New tienda(
               "Diore",
               15,
               new Date(),"ropa de todo tipo",
               false);
       tienda tiendaDos = New tienda(
               "maquillaje",
               16,
               new Date(),
               "ropa y accesorios", 
               true);
       
       system.out.println(tiendaUno.getNombre());
       system.out.println(tiendaUno.getNumeroDeTrabajadores());
       system.out.println(tiendaUno.getInternacional());
       
       tiendaUno.contratarTrabajadores();
       
       system.out.println(tiendaUno.getNombre());
       system.out.println(tiendaUno.getNumeroDeTrabajadores());
       system.out.println(tiendaUno.getInternacional());
       
    }
    
}
   
