/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author aliso
 */
public class AgentesVentas {
//declaro atributos
    public String nombre;
    public String cedula;
    public String codigo;
    public String monto;
    public String apellidos;
    public String nombreEmpresa;
    public boolean tieneVehiculo;

    //creo un constructor
    public AgentesVentas(String nombre, String cedula, String codigo, String monto, String apellidos, String nombreEmpresa, boolean tieneVehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.monto = monto;
        this.apellidos = apellidos;
        this.nombreEmpresa = nombreEmpresa;
        this.tieneVehiculo = tieneVehiculo;
    }
//setters and getters
    AgentesVentas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    AgentesVentas(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public boolean isTieneVehiculo() {
        return tieneVehiculo;
    }

    public void setTieneVehiculo(boolean tieneVehiculo) {
        this.tieneVehiculo = tieneVehiculo;
    }

    public double calculoPuntos(double totalFacturas){
        return totalFacturas * 0.20;
    }
    
   //aplicamos toString para datos mas claros
    @Override
    public String toString() {
        return "AgentesVentas{" + "nombre=" + nombre + ", cedula=" + cedula + ", codigo=" + codigo + ", monto=" + monto + ", apellidos=" + apellidos + ", nombreEmpresa=" + nombreEmpresa + ", tieneVehiculo=" + tieneVehiculo + '}';
    }

}
