
public class RelojDigital
{
    private int hora;
    private int minuto;
    
    public RelojDigital(){
        this.hora=0;
        this.minuto=0;
    }
    
    public int getHora(){
        return this.hora;
    }
    public void setHora(int hora){
        this.hora=hora;
    }
    
    public int getMinuto(){
        return this.minuto;
    }
    public void setMinuto(int minuto){
        this.minuto=minuto;
    }
    
    public void RelojDigital(int h, int m){
        this.hora=h%24;
        this.minuto=m%60;
    }
    
    public void ponerEnHora(int hh, int mm){
        hora=hh%24;
        minuto=mm%60;
    }
    
    public void incrementar(){
        minuto++;
        if(minuto==60){
            minuto=0;
            hora=(hora+1)%24;
        }
    }
    
    public String verHora(){
        String hm="Son las ";
        if(hora==12){
         hm+=(hora>12)?hora-12:hora;
         hm+= ";" +minuto;
         hm+=(hora>=12)?"pm":"am";
        }
        else{
            hm+=hora+":"+minuto;
        }
        return(hm);
        
    }
       
}
