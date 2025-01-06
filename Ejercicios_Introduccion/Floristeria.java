package floristeria;

public class Floristeria {

    private String nombre;
    private Florista florista;
    private static int contadorPedidos = 0;

    public Floristeria (String nombre, Florista florista){
        this.nombre = nombre;
        this.florista = florista;
    }

    public String getNombre(){
        return nombre;
    }

    public void gestionarPedido(String tipoDeFlores, String direccion){
        int numeroDePedido =  (++contadorPedidos);
        florista.prepararFlores(tipoDeFlores);
        florista.coordinaEnvio(numeroDePedido, direccion);
    }

    public static void main(String[] args){
        Florista florista = new Florista("Pedro");
        Floristeria floristeria = new Floristeria("Maru", florista);
        Cliente cliente = new Cliente("Juan");

        //Juan solicita un envio
        cliente.solicitarEnvio("Ramo de Rosas Negras", "Calle Falsa 1234");
        floristeria.gestionarPedido("Ramo de Rosas Negras", "Calle Falsa 1234");
    }
}
