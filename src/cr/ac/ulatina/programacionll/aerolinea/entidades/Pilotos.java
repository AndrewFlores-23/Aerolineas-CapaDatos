/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ulatina.programacionll.aerolinea.entidades;

/**
 *
 * @author Andrew Corea Flores
 */
public class Pilotos {
    private String ID;
    private String Nombre;
    private String Nacionalidad;
    private String Licencia;
    private String AnosExperiencia;

    public Pilotos(String ID, String Nombre, String Nacionalidad, String Licencia, String AnosExperiencia) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Licencia = Licencia;
        this.AnosExperiencia = AnosExperiencia;
    }

    public Pilotos() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getLicencia() {
        return Licencia;
    }

    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
    }

    public String getAnosExperiencia() {
        return AnosExperiencia;
    }

    public void setAnosExperiencia(String AnosExperiencia) {
        this.AnosExperiencia = AnosExperiencia;
    }
    
    
}
