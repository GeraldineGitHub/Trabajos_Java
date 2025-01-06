package floristeria;

public class repartidor {

    private String nombre;

public repartidor(String nombre){
     this.nombre = nombre;
}
    
public void entregarPedido(int numeroDePedido, String direccion){
System.out.println("\nEl repartidor: " +nombre+ "\nEntrega el pedido: " +numeroDePedido+ "\nA la direccion: "+direccion);
}
}
