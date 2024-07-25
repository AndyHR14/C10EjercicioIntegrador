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
    Producto producto = new Producto();
    
    public void obtenerYMostrarInformacion() {
        producto.setNombreEmpleado(JOptionPane.showInputDialog("Ingrese el nombre del empleado:"));
        producto.setCedulaEmpleado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del empleado (sin guiones)")));
        producto.setCantProducto(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos a ingresar:")));
        producto.setNombreProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
        producto.setCodigoProducto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto")));
        producto.setPrecioBase(Double.parseDouble(JOptionPane.showInputDialog("El precio del producto es: ")));
        producto.setTipoProducto(JOptionPane.showInputDialog("Ingrese el tipo de producto (alimento, bebida, higiene o limpieza):"));
        switch (producto.getTipoProducto()){
            case "alimento":
            producto.setPrecioBruto(producto.getPrecioBase() * 0.3 + producto.getPrecioBase());
            case "bebida":
            producto.setPrecioBruto(producto.getPrecioBase() * 0.2 + producto.getPrecioBase());
            case "higiene":
            producto.setPrecioBruto(producto.getPrecioBase() * 0.25 + producto.getPrecioBase());
            case "limpieza":
            producto.setPrecioBruto(producto.getPrecioBase() * 0.19 + producto.getPrecioBase() * 0.4 + 1000 + producto.getPrecioBase());   
        }
        producto.setGananciaEsperada((producto.getPrecioBruto()-producto.getPrecioBase()) * producto.getCantProducto()); 
        JOptionPane.showMessageDialog(null, "El monto total de ganancia esperado por la venta es de: " + producto.getGananciaEsperada());
    } 
        
    
    public void arregloProductos(){
        Producto arrProducto[] = new Producto[producto.getCantProducto()];
    }
    

        
   
}

