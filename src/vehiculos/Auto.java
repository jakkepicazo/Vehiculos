
package vehiculos;

/**
 *
 * @author Jakke
 */
public class Auto implements Vehiculo{
    
    int vel = 0;
    int maxVel = 90;
    int menosVel =-1;
    int campo = 4;

    @Override
    public String frenar(int cuanto) {
        vel = cuanto;
        return "El auto frena a una velocidad de " +vel+" KM/h ";
    }

    @Override
    public String acelerar(int cuanto) {
        maxVel = 90;
        maxVel = cuanto;
        return "El auto accelera a una velocidad de " +maxVel+" KM/h ";
    }

    @Override
    public String apagar(int cuando) {
        int menosVel = 0;
        menosVel = cuando;
        return "El auto se apaga cuando esta a "+menosVel+" KM/h ";
    }

    @Override
    public String plazas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
