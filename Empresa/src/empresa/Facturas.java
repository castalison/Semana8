/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author aliso
 */
public class Facturas {
//declaro los atributos
    public String nombreCliente;
    public String cedulaCliente;
    public String codigoFactura;
    public double monto;
    public int mes;
    public boolean contieneElectricos;
    public boolean contieneAutomotrices;
    public boolean contieneConstruccion;
    public int estadoFacturas;
//creo un constructor
    public Facturas(String nombreCliente, String cedulaCliente, String codigoFactura, double monto, int mes, boolean contieneElectricos, boolean contieneAutomotrices, boolean contieneConstruccion, int estadoFacturas) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.contieneElectricos = contieneElectricos;
        this.contieneAutomotrices = contieneAutomotrices;
        this.contieneConstruccion = contieneConstruccion;
        this.estadoFacturas = estadoFacturas;
    }
//setter and getter
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isContieneElectricos() {
        return contieneElectricos;
    }

    public void setContieneElectricos(boolean contieneElectricos) {
        this.contieneElectricos = contieneElectricos;
    }

    public boolean isContieneAutomotrices() {
        return contieneAutomotrices;
    }

    public void setContieneAutomotrices(boolean contieneAutomotrices) {
        this.contieneAutomotrices = contieneAutomotrices;
    }

    public boolean isContieneConstruccion() {
        return contieneConstruccion;
    }

    public void setContieneConstruccion(boolean contieneConstruccion) {
        this.contieneConstruccion = contieneConstruccion;
    }

    public int getEstadoFacturas() {
        return estadoFacturas;
    }

    public void setEstadoFacturas(int estadoFacturas) {
        this.estadoFacturas = estadoFacturas;
    }
    
//aplico toString para obtener mejores respuestas y salidas
    @Override
    public String toString() {
        return "Facturas{" + "nombreCliente=" + nombreCliente + ", cedulaCliente=" + cedulaCliente + ", codigoFactura=" + codigoFactura + ", monto=" + monto + ", mes=" + mes + ", contieneElectricos=" + contieneElectricos + ", contieneAutomotrices=" + contieneAutomotrices + ", contieneConstruccion=" + contieneConstruccion + ", estadoFacturas=" + estadoFacturas + '}';
    }
    
    
}