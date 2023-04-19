public class Documento
{
    private int id;
    private String nombre;
    private String descripcion;
    private String texto;
    
    //CONSTRUCTOR
    public Documento(int id,String nombre,String descripcion,String texto){
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.texto=texto;
    }
    
    //METODOS
    public int getId(){
        return this.id;
    }
    public void setId(){
        this.id=id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(){
        this.descripcion=descripcion;
    }
    
    public String getTexto(){
        return this.texto;
    }
    public void setTexto(){
        this.texto=texto;
    }
    
    //MOSTRAR DOCUMENTOS
    public void mostrar(){
        System.out.println("-------------------------------------");
        System.out.println("Id: "+getId());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Texto: "+getTexto());
        System.out.println("-------------------------------------");
    }
    
    //MODIFICAR DOCUMENTO
        public void modificar(String nombre,String descripcion,String texto){
            this.nombre=nombre;
            this.descripcion=descripcion;
            this.texto=texto;
        }
      
    //IMPRIMIR DOCUMENTO
    public void imprimirDocumeto(){
       System.out.println("************************************");
       System.out.println("Texto: "+getTexto());
       System.out.println("************************************");
       
       
    }
   
}
