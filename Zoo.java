/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoo;
import java.util.Date;
/**
 *
 *
 */
public class Zoo {

    public static void main(String[] args) {

        Leon leonAfricano = new Leon("surafricano", "Tony", true);
        System.out.println(leonAfricano.toString());
        leonAfricano.leonComiendo(0);

        Tortuga tortuga1 = new Tortuga("Tortuga Marina", new Date(), true);
        Oso oso1 = new Oso("Oso Polar", new Date(), "polar");
        Guacamaya guacamaya1 = new Guacamaya("Guacamaya Roja", new Date(), "rojo", true);

        System.out.println(tortuga1.getNombre() + " esta" + tortuga1.actividad());
        System.out.println(oso1.getNombreOso()+ " esta hibernando? " + oso1.isHibernando());
        System.out.println(guacamaya1.getNombre() + " esta " + guacamaya1.actividad());
    }
}
    
