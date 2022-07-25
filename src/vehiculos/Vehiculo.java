
package vehiculos;

/**
 *
 * @author Jakke
 */
public interface Vehiculo {
    int vel = 0;
    int maxVel = 90;
    int menosVel =-1;
    int campo = 4;

    String frenar(int cuanto);
    String acelerar(int cuanto);
    String apagar(int cuando);    
    String plazas(int i);
}
