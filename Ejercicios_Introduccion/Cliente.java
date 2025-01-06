package floristeria;

public class Cliente {

    private String nombre;
    
    public Cliente(String nombre){
        this.nombre = nombre; 
    }

    public String getNombre() {
      return nombre; 
    }

    public void solicitarEnvio(String tipoDeFlores, String direccion){
      System.out.println("El cliente: "+getNombre() + "\nSolicita enviar: "+tipoDeFlores+ "\nA : "+direccion);
    }
}
