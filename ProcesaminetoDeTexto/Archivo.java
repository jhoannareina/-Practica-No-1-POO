import java.util.ArrayList;
public class Archivo
{
   private ArrayList<Documento> lista;
   
   public Archivo(){
       lista=new ArrayList<Documento>();
   }
   // CREAR DOCUMNETO
   public void addDocumento(Documento documento){
       lista.add(documento);
   }
   //LISTAR DOCUMENTOS
   public void listarDocumento(){
       if(lista.size()>0){
           //MOSTRAR NOTAS
           for(Documento item : lista){
               item.mostrar();
           }
       }
       else{
           System.out.println("************************************");
           System.out.println("No hay Documentos Archivados");
           System.out.println("************************************");
       }
   }
   
   //BORRAR DOCUMENTOS
   public void borrarDocumento(int id){
       int pos=-1;
       boolean flag=false;
       
       if(lista.size()>0){
           pos++;
           for(Documento item : lista){
               if(item.getId()==id){
                   flag=true;
                   break;
               }
           }
           if(flag){
               lista.remove(pos);
           }
       }
   }
   
   
   
   
   
   
   
   
   
   
   
   
}
