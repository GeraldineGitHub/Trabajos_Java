package floristeria;

public class Florista {

    private String nombre;

    public Florista(String nombre){
        this.nombre = nombre;
    }

public void prepararFlores(String tipoDeFlores){
System.out.println("\nEl florista: "+nombre+ "\nPrepara: "+tipoDeFlores);
}

public void coordinaEnvio(int numeroDePedido, String direccion){
repartidor rep = new repartidor(" Pablo ");
rep.entregarPedido(numeroDePedido, direccion);
}

}
