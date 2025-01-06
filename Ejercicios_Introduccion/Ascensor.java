/*  Gestionar para un edificio la simulación del desplazamiento de su ascensor que puede viajar desde 
el piso 1 hasta el piso final que se indique (no puede bajar menos del piso 1 y no puede subir más del
 piso final). Cuenta con una limitación de peso de 750Kg. Para realizar el desplazamiento hay que indicar
  la cantidad de personas que se suben y el piso destino. La cantidad de personas se usa para calcular el
   peso a desplazar (considerando que cada persona pesa 50 kg) */

   public class Ascensor {
   
    private int pisoActual;
    private int pisoFinal; 
    private int pesoMaximo = 750; 
    private int pesoPersona = 50; 

    public Ascensor(int pisoFinal){
     this.pisoActual= 1; //porque el Ascensor comienza con el piso 1
     this.pisoFinal = pisoFinal; 
    }

    public void desplazar(int cantidadPersonas, int pisoDestino){
        int pesoTotal = cantidadPersonas * pesoPersona;


        if (pesoTotal > pesoMaximo) {
            System.out.println("\nEl peso total excede el límite de 750Kg. No se puede mover el ascensor.");
            return;
        }

        if (pisoDestino < 1 || pisoDestino > pisoFinal) {
            System.out.println("\nPiso destino inválido. El ascensor solo puede moverse entre el piso 1 y el piso " + pisoFinal + ".");
            return;
        }

        if (pisoDestino > pisoActual) {
            System.out.println("\nSubiendo el ascensor del piso: " + pisoActual + " al piso: " + pisoDestino);
        } else if (pisoDestino < pisoActual) {
            System.out.println("\nBajando el ascensor del piso: " + pisoActual + " al piso: " + pisoDestino); 
        } else {
            System.out.println("\nEl ascensor ya está en el piso " + pisoActual + ".");
        }

        pisoActual = pisoDestino;
        System.out.println("El ascensor ha llegado al piso: " + pisoActual);
    }

    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor(12);

        ascensor.desplazar(5,10);
        ascensor.desplazar(3,1);
        ascensor.desplazar(10,7);
        ascensor.desplazar(5,5);
        ascensor.desplazar(2,5);
        ascensor.desplazar(30,3);
        ascensor.desplazar(8,20);
    }
   }