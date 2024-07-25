/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador;

/**
 *
 * @author Aulas Heredia
 */
public class Producto {

    private String nombreSupermercado = "Super Chino";
    private int codigoSupermercado = 54302;
    private int codigoProducto;
    private String nombreProducto;
    private String nombreEmpleado;
    private int cedulaEmpleado;
    private int cantProducto;
    private double precioBase;
    private String tipoProducto;
    private double precioBruto;
    private double gananciaEsperada;

    public void obtTipoProduc(){
        switch (tipoProducto){
            case "alimento":
            precioBruto = precioBase * 0.3 + precioBase;
            gananciaEsperada = ((precioBruto-precioBase) * cantProducto);  
            case "bebida":
            precioBruto = precioBase * 0.2 + precioBase;
            gananciaEsperada = ((precioBruto-precioBase) * cantProducto);
            case "higiene":
            precioBruto = precioBase * 0.25 + precioBase;
            gananciaEsperada = ((precioBruto-precioBase) * cantProducto);
            case "limpieza":
            precioBruto = precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
            gananciaEsperada = ((precioBruto-precioBase) * cantProducto);   
        }
    }
    
    
    

    public String getNombreSupermercado() {
        return nombreSupermercado;
    }

    public void setNombreSupermercado(String nombreSupermercado) {
        this.nombreSupermercado = nombreSupermercado;
    }

    public int getCodigoSupermercado() {
        return codigoSupermercado;
    }

    public void setCodigoSupermercado(int codigoSupermercado) {
        this.codigoSupermercado = codigoSupermercado;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(double gananciaEsperada) {
        this.gananciaEsperada = gananciaEsperada;
    }
}
    
   