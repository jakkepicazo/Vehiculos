
package vehiculos;

/**
 *
 * @author Jakke
 */
public class UsoVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Auto A1 = new Auto ();
        Moto M1 = new Moto();
        System.out.println("El Auto 1:");
        System.out.println(A1.acelerar(90));
        System.out.println(A1.frenar(50));
        System.out.println(A1.apagar(-1));
        System.out.println("\nEl Motocicleta 1:");
        System.out.println(M1.acelerar(90));
        System.out.println(M1.frenar(75));
        System.out.println(M1.apagar(-1));
        System.out.println(M1.plazas(2));
        

    }
    
}
