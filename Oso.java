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
public class Oso {

    private String colorOso;
    private String nombreOso;
    private boolean hibernando;
    public Date fechaIngreso;
    public String familia;

    public Oso(String nombreOso, Date fechaIngreso, String familia) {
        this.nombreOso = nombreOso;
        this.fechaIngreso = fechaIngreso;
        this.familia = familia;
    }

    public boolean isHibernando() {
        return hibernando;
    }

    public String getColorOso() {
        return colorOso;
    }

    public String getNombreOso() {
        return nombreOso;
    }

    public void setColorOso(String colorOso) {
        this.colorOso = colorOso;
    }

    public void setNombreOso(String nombreOso) {
        this.nombreOso = nombreOso;
    }

    public void setHibernando(boolean hibernando) {
        this.hibernando = hibernando;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    

    public void indicadorHibernando() {
        if (this.hibernando) {
            System.out.println("El oso está hibernando, silencio.");
        } else {
            System.out.println("El oso está despierto, manténgase alerta.");
        }
    }

    @Override
    public String toString() {
        return "Oso:" + nombreOso + ", color: " + colorOso + ", hibernando: " + hibernando;
    }
}
