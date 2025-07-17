/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ulatina.programacionll.aerolinea.entidades;

/**
 *
 * @author Andrew Corea Flores
 */
public class Aviones {
    private String ID;
    private String Modelo;
    private String Fabricante;
    private int CapacidadTotal;
    private int CapacidadPriClas;
    private int CapacidadEjecClas;
    private int CapacidadEconomiClas;
    private String AerolineaAsig;

    public Aviones(String ID, String Modelo, String Fabricante, int CapacidadTotal, int CapacidadPriClas, int CapacidadEjecClas, int CapacidadEconomiClas, String AerolineaAsig) {
        this.ID = ID;
        this.Modelo = Modelo;
        this.Fabricante = Fabricante;
        this.CapacidadTotal = CapacidadTotal;
        this.CapacidadPriClas = CapacidadPriClas;
        this.CapacidadEjecClas = CapacidadEjecClas;
        this.CapacidadEconomiClas = CapacidadEconomiClas;
        this.AerolineaAsig = AerolineaAsig;
    }

    public Aviones() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public int getCapacidadTotal() {
        return CapacidadTotal;
    }

    public void setCapacidadTotal(int CapacidadTotal) {
        this.CapacidadTotal = CapacidadTotal;
    }

    public int getCapacidadPriClas() {
        return CapacidadPriClas;
    }

    public void setCapacidadPriClas(int CapacidadPriClas) {
        this.CapacidadPriClas = CapacidadPriClas;
    }

    public int getCapacidadEjecClas() {
        return CapacidadEjecClas;
    }

    public void setCapacidadEjecClas(int CapacidadEjecClas) {
        this.CapacidadEjecClas = CapacidadEjecClas;
    }

    public int getCapacidadEconomiClas() {
        return CapacidadEconomiClas;
    }

    public void setCapacidadEconomiClas(int CapacidadEconomiClas) {
        this.CapacidadEconomiClas = CapacidadEconomiClas;
    }

    public String getAerolineaAsig() {
        return AerolineaAsig;
    }

    public void setAerolineaAsig(String AerolineaAsig) {
        this.AerolineaAsig = AerolineaAsig;
    }
    
    
}
