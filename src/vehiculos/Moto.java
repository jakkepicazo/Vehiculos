
package vehiculos;

/**
 *
 * @author Jakke
 */
public class Moto implements Vehiculo {

    @Override
    public String frenar(int cuanto) {
        int vel = 0;

        vel = cuanto;
        return "La moto frenar a una velocidad de " +vel+" KM /h";
    
    }

    @Override
    public String acelerar(int cuanto) {
        int maxVel = 90;
        maxVel = cuanto;
        return "La moto accelera a una velocidad de " +maxVel+" KM/h ";
        
    }

    @Override
    public String apagar(int cuando) {
        int menosVel = -1;
        menosVel = cuando;
        return "La moto se apaga cuando esta a "+menosVel+" KM/h ";
    }

    @Override
    public String plazas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
}
