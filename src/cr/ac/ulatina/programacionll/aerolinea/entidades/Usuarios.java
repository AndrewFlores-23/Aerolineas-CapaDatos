/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ulatina.programacionll.aerolinea.entidades;

/**
 *
 * @author Andrew Corea Flores
 */
public class Usuarios {
    private String ID;
    private String Nombre;
    private String NombreUsuario;
    private String Contrasena;
    private String Rol;

    public Usuarios(String ID, String Nombre, String NombreUsuario, String Contrasena, String Rol) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
        this.Rol = Rol;
    }

    public Usuarios() {
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

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    
}
