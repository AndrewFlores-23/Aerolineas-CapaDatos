/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ulatina.programacionll.aerolinea.entidades;

/**
 *
 * @author Andrew Corea Flores
 */
public class Aerolineas {
    private String ID;
    private String Nombre;
    private String PaisOrg;
    private String AnnoFundacion;

    public Aerolineas(String ID, String Nombre, String PaisOrg, String AnnoFundacion) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.PaisOrg = PaisOrg;
        this.AnnoFundacion = AnnoFundacion;
    }

    public Aerolineas() {
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

    public String getPaisOrg() {
        return PaisOrg;
    }

    public void setPaisOrg(String PaisOrg) {
        this.PaisOrg = PaisOrg;
    }

    public String getAnnoFundacion() {
        return AnnoFundacion;
    }

    public void setAnnoFundacion(String AnnoFundacion) {
        this.AnnoFundacion = AnnoFundacion;
    }
    
    
}
