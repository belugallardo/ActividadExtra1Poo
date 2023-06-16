/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;
/*
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un automóvil, una motocicleta, o una bicicleta).
*/
/**
 *
 * @author belugallardo
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int velocidad;
    private int posicion;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.velocidad = velocidad;
        
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipo=" + tipo + ", velocidad=" + velocidad + ", posicion=" + posicion + '}';
    }

   
    
    
}
