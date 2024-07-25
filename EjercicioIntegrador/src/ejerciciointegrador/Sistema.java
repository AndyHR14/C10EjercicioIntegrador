/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Sistema {
    private double sumTotal = 0;
    Producto producto = new Producto();
    
    public void obtenerInformacion() {
        producto.setNombreEmpleado(JOptionPane.showInputDialog("Ingrese el nombre del empleado:"));
        producto.setCedulaEmpleado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del empleado (sin guiones)")));
        producto.setCantProducto(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos a ingresar:")));
        producto.setNombreProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
        producto.setCodigoProducto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto")));
        producto.setPrecioBase(Double.parseDouble(JOptionPane.showInputDialog("El precio del producto es: ")));
        producto.setTipoProducto(JOptionPane.showInputDialog("Ingrese el tipo de producto (alimento, bebida, higiene o limpieza):"));
        producto.obtTipoProduc();
            } 
        
    
    public void arregloProductos(){
        Producto arrProducto[] = new Producto[2];
    }
    
    public void mostrarInformacion(){
        JOptionPane.showMessageDialog(null, "El monto total de ganancia esperado por venta es de: " + sumTotal);
    }
}

