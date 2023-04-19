public class Estudiante
{
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;

    //CONSTRUCTOR PARA INICIAR ESTUDIANTE
    public Estudiante(int codigo,String nombre,String apellido,int edad){
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    
    //METODOS
    public int getCodigo()
    {
        return this.codigo;
    }
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
   
    public String getApellido()
    {
        return this.apellido;
    }
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
    
    public int getEdad()
    {
        return this.codigo;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    
    public void mostrar()
    {
        System.out.println("------------------------------------");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("------------------------------------");
    }
    
    
    
    
    
    
}
