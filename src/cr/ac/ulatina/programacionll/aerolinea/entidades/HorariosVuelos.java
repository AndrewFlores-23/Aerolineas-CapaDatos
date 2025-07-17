/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ulatina.programacionll.aerolinea.entidades;

/**
 *
 * @author Andrew Corea Flores
 */
public class HorariosVuelos {
    private String ID;
    private String Aerolinea;
    private String TipoVuelo;
    private String PilotoAsig;
    private String AvionAsig;
    private String FechaSalida;
    private String HoraSalida;
    private String FechaLlegada;
    private String HoraLlegada;
    private String Origen;
    private String Destino;

    public HorariosVuelos(String ID, String Aerolinea, String TipoVuelo, String PilotoAsig, String AvionAsig, String FechaSalida, String HoraSalida, String FechaLlegada, String HoraLlegada, String Origen, String Destino) {
        this.ID = ID;
        this.Aerolinea = Aerolinea;
        this.TipoVuelo = TipoVuelo;
        this.PilotoAsig = PilotoAsig;
        this.AvionAsig = AvionAsig;
        this.FechaSalida = FechaSalida;
        this.HoraSalida = HoraSalida;
        this.FechaLlegada = FechaLlegada;
        this.HoraLlegada = HoraLlegada;
        this.Origen = Origen;
        this.Destino = Destino;
    }

    public HorariosVuelos() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public String getTipoVuelo() {
        return TipoVuelo;
    }

    public void setTipoVuelo(String TipoVuelo) {
        this.TipoVuelo = TipoVuelo;
    }

    public String getPilotoAsig() {
        return PilotoAsig;
    }

    public void setPilotoAsig(String PilotoAsig) {
        this.PilotoAsig = PilotoAsig;
    }

    public String getAvionAsig() {
        return AvionAsig;
    }

    public void setAvionAsig(String AvionAsig) {
        this.AvionAsig = AvionAsig;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getFechaLlegada() {
        return FechaLlegada;
    }

    public void setFechaLlegada(String FechaLlegada) {
        this.FechaLlegada = FechaLlegada;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String HoraLlegada) {
        this.HoraLlegada = HoraLlegada;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    
    
}
