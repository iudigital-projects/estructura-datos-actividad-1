package com.learning;

class Producto {
    private String nombre;
    private String descripcion;
    private String codigo;
    private double precio;
    private int cantidadEnInventario;

    public Producto() {
        this.nombre = "No definido";
        this.descripcion = "No definido";
        this.codigo = "No definido";
        this.precio = 0.0;
        this.cantidadEnInventario = 0;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.descripcion = "No definido";
        this.codigo = "No definido";
        this.precio = 0.0;
        this.cantidadEnInventario = 0;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.descripcion = "No definido";
        this.codigo = "No definido";
        this.precio = precio;
        this.cantidadEnInventario = 0;
    }

    public Producto(String nombre, String descripcion, String codigo, double precio, int cantidadEnInventario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    // METODOS SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidadEnInventario (int cantidadEnInventario){
        this.cantidadEnInventario = cantidadEnInventario; 
    }

    // METODOS GETTER
    public String getNombre() {
        return this.nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public double getPrecio() {
        return this.precio;
    }
    public int getCantidadEnInventario(){
        return this.cantidadEnInventario;
    }
    

    public void mostrarInformacion() {
        System.out.println("================================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad en inventario: " + this.cantidadEnInventario);
        System.out.println("================================");
    }
};
