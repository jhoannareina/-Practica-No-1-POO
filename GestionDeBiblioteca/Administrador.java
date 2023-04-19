import java.util.ArrayList;
public class Administrador
{
    
    public Administrador(){
        //inicializar la coleccion
        lista=new ArrayList<Libro>();      
    }
   public void addLibro(Libro libro){
       lista.add(libro);      
   }
   
   public void addMapa(Mapa mapa){
       lista.add(mapa);      
   }

}
