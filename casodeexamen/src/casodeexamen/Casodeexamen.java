/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeexamen;

import javax.swing.JOptionPane;

/**
 *
 * @author Esteban Picado
 */
public class Casodeexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        examen cliente = new examen (); 
        String solicitud = JOptionPane.showInputDialog("Indique las facturas a digitar:");
        int s = Integer.parseInt(solicitud);
        for (int i = 1; i < s; i++) {
            String cedula = JOptionPane.showInputDialog("Indique su cedula:");
            int c = Integer.parseInt(cedula);
            String nombre = JOptionPane.showInputDialog("Indique su nombre:");
            String total = JOptionPane.showInputDialog("Indique el total:");
            int t = Integer.parseInt(total);
            String fecha = JOptionPane.showInputDialog("Indique la fecha:");
            String idFacturas = JOptionPane.showInputDialog("Indique el id de la factura:");
            int k = Integer.parseInt(idFacturas);
            String periodo = JOptionPane.showInputDialog("Indique el periodo:");
            int p = Integer.parseInt(periodo);
            JOptionPane.showMessageDialog(null, "" + nombre + "");
            JOptionPane.showMessageDialog(null, "" + c + "");
            JOptionPane.showMessageDialog(null, "" + t+ "");
            JOptionPane.showMessageDialog(null, "" + fecha + "");
            JOptionPane.showMessageDialog(null, "" + k + "");
            JOptionPane.showMessageDialog(null,"" + p+"");
            cliente. setPeriodo_de_la_factura (p);
            cliente. setId_de_la_persona (c);
            cliente. setFecha_de_la_factura (fecha);
            cliente. setNombre (nombre);
            cliente. setId_de_factura (k);
     cliente. setTotal_de_la_factura (t);
          }
           
        String numero = JOptionPane.showInputDialog("Indique el numero de recibos a calcular:");
        int n = Integer.parseInt(numero);
        double montoTotal = 0.0;
        for (int i = 1; i <= n; i++) {
      	 String recibo1 = JOptionPane.showInputDialog("indique el monto del recibo a pagar " + i+":");
           	 double recibo2 = Double.parseDouble(recibo1);

            double beneficio = recibo2 * 0.05 / n;
            montoTotal += beneficio;

        }
        JOptionPane.showMessageDialog(null, " deberá abonar  el monto de ₡" + montoTotal + " con beneficios del 0.05 ya agreagados y de los anteriores" + n + "meses");

    }
    
}
