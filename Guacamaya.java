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
public class Guacamaya {

    private String nombre;
    private Date fechaIngreso;
    private String colorPrincipal;
    private boolean tienePareja;

    public Guacamaya(String nombre, Date fechaIngreso, String colorPrincipal, boolean tienePareja) {
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.colorPrincipal = colorPrincipal;
        this.tienePareja = tienePareja;
    }

    public String actividad() {
        return "Volar";
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
}
