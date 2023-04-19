public class MaquinaDeTemperaturaDeAgua
{
    private int temperatura;
    private int temperaturaactual;
    private int temperaturaminima;
    private int temperaturamaxima;
    
    public MaquinaDeTemperaturaDeAgua()
    {
        this.temperatura=0;
        this.temperaturaactual = 0;
        this.temperaturaminima = 0;
        this.temperaturamaxima = 50;
    }
    
    public MaquinaDeTemperaturaDeAgua(int temperatura,int temperaturaactual,int temperaturaminima,int temperaturamaxima)
    {
        this.temperatura=temperatura;
        this.temperaturaactual = temperaturaactual;
        this.temperaturaminima = temperaturaminima;
        this.temperaturamaxima = temperaturamaxima;
    }
    
    public int getTemperatura()
    {
      return this.temperatura;
    }
    public void setTemperatura(int temperatura)
    {
      this.temperatura=temperatura;
    }
    
    public int getTemperaturaactual()
    {
      return this.temperaturaactual;
    }
    public void setTemperaturaactual(int temperaturaactual)
    {
      this.temperaturaactual=temperaturaactual;
    }
    
    public int getTemperaturaminima()
    {
      return this.temperaturaminima;
    }
    public void setTemperaturaminima(int temperaturaminima)
    {
      this.temperaturaminima=temperaturaminima;
    }
    
    public int getTemperaturamaxima()
    {
      return this.temperaturamaxima;
    }
    public void setTemperaturamaxima(int temperaturamaxima)
    {
      this.temperaturamaxima=temperaturamaxima;
    }
    
    //SOLICITAR CALENTAR AGUA
    
    public void solicitarCalentar(int temperatura)
    {
        if(this.getTemperatura()<50)
        {
               
                System.out.println("****************************");
                System.out.println("El Agua se calento exitosamente");
                System.out.println("****************************");

        }
        else{
            System.out.println("****************************");
            System.out.println("El agua debe ser calentado a mas de 20°");
            System.out.println("****************************");
        }
        
    }
    
    //SOLICITAR ENFRIAR AGUA
    
    public void solicitarEnfriar(int temperatura)
    {
        if(this.getTemperatura()<5)
        {
               
                System.out.println("****************************");
                System.out.println("El Agua se enfrio exitosamente");
                System.out.println("****************************");

        }
        else{
            System.out.println("****************************");
            System.out.println("El agua debe ser enfriado menor a 8°");
            System.out.println("****************************");
        }
        
    }
    
    //MOSTRAR ALERTAS
    
    public void alertaMaxima()
    {
        System.out.println("***************************");
        System.out.println("MENSAJE DE ALERTA");
        System.out.println("Temperatura maxima alcanzada "+this.getTemperaturamaxima());        
        System.out.println("***************************");
    }
    
    public void alertaMinima()
    {
        System.out.println("***************************");
        System.out.println("MENSAJE DE ALERTA");
        System.out.println("Temperatura manima alcanzada "+this.getTemperaturaminima());        
        System.out.println("***************************");
    }   
}
