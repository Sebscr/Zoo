/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * 
 */
public class Leon {
    
    String tipoLeon;
    String nombreLeon;

    
    public Leon(){
        
    }
    
    public Leon(String nombreLeon){
    }
   

    public String getTipoLeon() {
        return tipoLeon;
    }

    public void setTipoLeon(String tipoLeon) {
        this.tipoLeon = tipoLeon;
    }

    public String getNombreLeon() {
        return nombreLeon;
    }

    public void setNombreLeon(String nombreLeon) {
        this.nombreLeon = nombreLeon;
    }
    
    public Leon(String tipoLeon, String nombreLeon, boolean isHibernando){
        if(isHibernando){
            this.tipoLeon= tipoLeon;
        }
        this.nombreLeon= nombreLeon;
    }
    
    public void leonComiendo(int indicadorComiendo){
        if (indicadorComiendo==0){
            System.out.println("El leon esta comiendo");
        }
        else{
            System.out.println("El leon NO esta comiendo");
        }
    }
    
    @Override
    public String toString() {
        return "Leon: " + tipoLeon + ", nombre: " + nombreLeon ;
    }
}
