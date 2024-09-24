/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;
import java.util.Date;
/**
 *
 * 
 */
public class Tortuga {
    public String nombre;
    public Date fechaIngreso;
    public boolean esMarina;

    public Tortuga(String nombre, Date fechaIngreso, boolean esMarina) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.esMarina = esMarina;
    }

    public String actividad() {
        return esMarina ? "Nadar" : "Caminar lentamente";
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
}
