/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Vehiculo;
import java.util.Scanner;

/*
El vehículo debe tener los métodos de moverse y frenar:
Moverse: Es la cantidad de metros que avanzará por segundo.
Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará más metros.
Referencias:
Un automóvil avanza 3 metros por segundo. Una motocicleta avanza 2 metros por segundo. Una bicicleta avanza 1 metro por segundo.

 */
/**
 *
 * @author belugallardo
 */
public class VehiculoServicios {

    public Vehiculo crearVehiculo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Vehiculo v1 = new Vehiculo();

        System.out.println("Ingrese la marca de su vehículo");
        v1.setMarca(leer.nextLine());

        System.out.println("Ingrese el modelo de su vehículo");
        v1.setModelo(leer.nextLine());

        System.out.println("Ingrese el año de su vehículo");
        v1.setAnio(leer.nextInt());

        System.out.println("Ingrese el tipo de su vehículo");
        String type;
        leer.nextLine();
        do {
            type = leer.nextLine().toLowerCase();
            
            if (!type.equals("bicicleta") && !type.equals("automovil") && !type.equals("motocicleta")){
                System.out.println("El tipo no es válido ingrese nuevamente");
            }

        } while (!type.equals("bicicleta") && !type.equals("automovil") && !type.equals("motocicleta"));

        v1.setTipo(type);
        
        switch (v1.getTipo()) {
            case "bicicleta":
                v1.setVelocidad(1);
                break;
            case "motocicleta":
                v1.setVelocidad(2);
                break;
            case "automovil":
                v1.setVelocidad(3);
                break;
            default:
                break;
            
        }
        
        
        return v1;

    }
    
    public int moverse(Vehiculo v1, int tiempo){
        
        v1.setPosicion(v1.getVelocidad()*tiempo);
        return v1.getPosicion() ;
        
    }
    
    public int frenar(Vehiculo v1){
        
       
        if(v1.getTipo().equals("bicicleta")){
            return v1.getPosicion();
        } else{
            v1.setPosicion(v1.getPosicion()+2);
            return v1.getPosicion();
        }
        
    }

}
