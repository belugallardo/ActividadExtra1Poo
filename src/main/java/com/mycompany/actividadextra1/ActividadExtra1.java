/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadextra1;

import Entidad.Vehiculo;
import Servicios.VehiculoServicios;

/**
 *
 * @author belugallardo
 */
public class ActividadExtra1 {

    public static void main(String[] args) {
        
        VehiculoServicios vs = new VehiculoServicios();
        Vehiculo v1 = new Vehiculo("mazda", "323", 1988, "automovil",3 );
        Vehiculo v2 = new Vehiculo("gw", "txl", 2020, "bicicleta",1 );
        Vehiculo v3 = new Vehiculo("yamaha", "rx", 1997, "motocicleta",2 );
        
        
        
        System.out.println("El vehiculo " + v1.getTipo() + " recorrió en 5 segundos " + vs.moverse(v1, 5));
        System.out.println("El vehiculo " + v1.getTipo() + " recorrió en 10 segundos " + vs.moverse(v1, 10));
        System.out.println("El vehiculo " + v1.getTipo() + " recorrió en 60 segundos " + vs.moverse(v1, 60));
        
        System.out.println("El vehiculo " + v2.getTipo() + " recorrió en 5 segundos " + vs.moverse(v2, 5));
        System.out.println("El vehiculo " + v2.getTipo() + " recorrió en 10 segundos " + vs.moverse(v2, 10));
        System.out.println("El vehiculo " + v2.getTipo() + " recorrió en 60 segundos " + vs.moverse(v2, 60));
        
        System.out.println("El vehiculo " + v3.getTipo() + " recorrió en 5 segundos " + vs.moverse(v3, 5));
        System.out.println("El vehiculo " + v3.getTipo() + " recorrió en 10 segundos " + vs.moverse(v3, 10));
        System.out.println("El vehiculo " + v3.getTipo() + " recorrió en 60 segundos " + vs.moverse(v3, 60));
        
        vs.moverse(v1, 300);
        vs.frenar(v1);
        
        vs.moverse(v2, 300);
        vs.frenar(v2);
        
        vs.moverse(v3, 300);
        vs.frenar(v3);
        
        if(v1.getPosicion() > v2.getPosicion() && v1.getPosicion() > v3.getPosicion()) {
            System.out.println("El vehiculo que mas se movio fue " + v1.getTipo() + " moviendose " + v1.getPosicion() + " metros.");
        } else if( v2.getPosicion()> v3.getPosicion() && v2.getPosicion()> v1.getPosicion()){
            System.out.println("El vehiculo que mas se movio fue " + v2.getTipo() + " moviendose " + v2.getPosicion() + " metros.");
        }else if (v3.getPosicion() > v2.getPosicion() && v3.getPosicion()> v1.getPosicion()){
            System.out.println("El vehiculo que mas se movio fue " + v3.getTipo() + " moviendose " + v3.getPosicion() + " metros.");
        }else {
            System.out.println("Todos los vehiculos se trasladaron los mismos metros");
        }


        
    }
}
