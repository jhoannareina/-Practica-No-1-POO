import java.util.ArrayList;
public class Laboratorio
{
    private ArrayList<Estudiante> lista;
    private int identidad;
    private String instructor;
    private String horario;
    private int cupo;
    private int tam;
      
    //constructor
    public Laboratorio(int identidad,String instructor,String horario,int cupo)
    {
        System.out.println("-----------------------------");
        System.out.println("IDENTIDAD: "+identidad);
        System.out.println("INSTRUCTOR: "+instructor);
        System.out.println("HORARIO: "+horario);
        System.out.println("CUPO: "+cupo);
        System.out.println("-----------------------------");
        //inicializar la coleccion
        lista=new ArrayList<Estudiante>() ;    
    }
    
    //ASIGNAR ESTUDIANTE A LABORATORIO
    public void addEstudiante(Estudiante estudiante)
    {
        lista.add(estudiante);    
    }
    
    
    //LISTAR ESTUDIANTES ASIGNADOS
    public void listarEstudiante()
    {
        if (lista.size()>0){
            //mostrar las notas
            for (Estudiante item : lista){
                item.mostrar(); 
            }
        }
        else{
            System.out.println("----------------------------------------------");
            System.out.println("No hay Estudiantes asignados en el laboratorio");
            System.out.println("----------------------------------------------");
        }
    }
    
    public void contarEstudiantes()
    {
        System.out.println("--------------------------------------------------------------");
        System.out.println("En el laboratio existen: "+lista.size() + " estudiantes");
        System.out.println("--------------------------------------------------------------");
    }
       
       
        
        
        
        
}

