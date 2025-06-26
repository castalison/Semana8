/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this templatea
 */
package empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author aliso
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //solicito datos al agente
        String nombre = JOptionPane.showInputDialog("digite el nombre del agente");
        String cedula = JOptionPane.showInputDialog("Digite la cedula del agente");
        String apellidos = JOptionPane.showInputDialog("Digite los apellidos del agente");
        String codigo = JOptionPane.showInputDialog("Digite el codigo del agente");
        String sucursal = JOptionPane.showInputDialog("Digite la sucursal del agente");
        String empresa = JOptionPane.showInputDialog("Digite los apellidos del agente");
        int tieneVehiculo = JOptionPane.showConfirmDialog(null, "¿Tiene vehiculo? SI o NO");
        int mes = 0;
        //declaramientos
        int cantidadFacturas = 0;
        double totalFacturas = 0;
        double totalComisiones = 0;
        int totalPuntos = 0;

        //antes de avanzar, pregunto si quiere o no
        String continuar = "si";
        while (continuar.equalsIgnoreCase("si")) {

            //pido datos al cliente
            String nombreCliente = JOptionPane.showInputDialog("Digite nombre del cliente");
            String cedulaCliente = JOptionPane.showInputDialog("Digite la cedula del cliente");
            String codigoFactura = JOptionPane.showInputDialog("Digite nombre del cliente");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Digite nombre del cliente"));
            

            //se valida el mes
            
            boolean mesCorrecto= false;
            while (!mesCorrecto) {
                mes = Integer.parseInt(JOptionPane.showInputDialog("Numero del mes del 1-12"));
                if (mes >= 1 && mes <= 12) {
                    mesCorrecto = true;
                } else {
                    JOptionPane.showInputDialog("mes invalido");

                }

            }

            int cantidadElectrico = Integer.parseInt(JOptionPane.showInputDialog("cantidad de productos electricos"));
            int cantidadAuto = Integer.parseInt(JOptionPane.showInputDialog("cantidad de autos"));
            int cantidadConstruccion = Integer.parseInt(JOptionPane.showInputDialog("cantidad de productos de construccion"));

        }

        

                
        
        
    }
    
}
