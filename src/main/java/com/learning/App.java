package com.learning;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();
        menuPrincipal(listaProductos, scanner);
        scanner.close();
    }

    static void menuPrincipal(ArrayList<Producto> listaProductos, Scanner scanner) {
        boolean menuActivo = true;
        while (menuActivo) {
            System.out.println();
            System.out.println("========= MENU DE TIENDA =========");
            System.out.println("Bienvenido a la tienda, por favor elija una opción");
            System.out.println("1. Crear producto");
            System.out.println("2. Ver lista de productos");
            System.out.println("3. Salir");
            System.out.println("================================");
            System.out.println();
            String opcionUsuario = scanner.nextLine();
            switch (opcionUsuario) {
                case "1":
                    menuCreacionProducto(listaProductos, scanner);
                    break;
                case "2":
                    if (listaProductos.isEmpty()) {
                        System.out.println("No se han creado productos");
                        break;
                    }
                    System.out.println();
                    System.out.println("***** LISTA DE PRODUCTOS *****");
                    for (Producto productoEnLista : listaProductos) {
                        productoEnLista.mostrarInformacion();
                    }
                    System.out.println("***** FIN LISTA DE PRODUCTOS *****");
                    System.out.println();
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Gracias por usar la tienda, ¡hasta pronto!");
                    System.out.println();
                    menuActivo = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }
        ;
    }

    static void menuCreacionProducto(ArrayList<Producto> listaProductos, Scanner scanner) {
        boolean menuActivo = true;

        while (menuActivo) {
            System.out.println();
            System.out.println("========= CREAR UN PRODUCTO =========");
            System.out.println("Elija una opción para crear un producto");
            System.out.println("1. Crear producto completo");
            System.out.println("2. Crear producto en blanco");
            System.out.println("3. Crear producto con setters");
            System.out.println("4. Crear producto con nombre y precio");
            System.out.println("5. volver al menu principal");
            System.out.println("================================");
            System.out.println();
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    crearProductoCompleto(listaProductos, scanner);
                    System.out.println("Producto completo creado");
                    System.out.println();
                    menuActivo = false;
                    break;
                case "2":
                    crearProductoEnBlanco(listaProductos);
                    System.out.println("Producto en blanco creado");
                    System.out.println();
                    menuActivo = false;
                    break;
                case "3":
                    crearProductoConSetters(listaProductos, scanner);
                    menuActivo = false;
                    break;
                case "4":
                    crearProductoConNYP(listaProductos, scanner);
                    menuActivo = false;
                    break;
                case "5":
                    menuActivo = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    static void crearProductoCompleto(ArrayList<Producto> listaProductos, Scanner scanner) {
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la descripcion del producto");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese el codigo del producto");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = Double.valueOf(scanner.nextLine());
        System.out.println("Ingrese la cantidad en inventario");
        int cantidadEnInventario = Integer.valueOf(scanner.nextLine());

        Producto producto = new Producto(nombre, descripcion, codigo, precio, cantidadEnInventario);
        listaProductos.add(producto);
    }

    static void crearProductoEnBlanco(ArrayList<Producto> listaProductos) {
        Producto producto = new Producto();
        listaProductos.add(producto);
    }

    static void crearProductoConSetters(ArrayList<Producto> listaProductos, Scanner scanner) {
        Producto productoConSetters = new Producto();
        System.out.println("Ingrese el nombre del producto");
        productoConSetters.setNombre(scanner.nextLine());
        System.out.println("Ingrese la descripcion del producto");
        productoConSetters.setDescripcion(scanner.nextLine());
        System.out.println("Ingrese el codigo del producto");
        productoConSetters.setCodigo(scanner.nextLine());
        System.out.println("Ingrese el precio del producto");
        productoConSetters.setPrecio(Double.valueOf(scanner.nextLine()));
        System.out.println("Ingrese la cantidad en inventario");
        productoConSetters.setCantidadEnInventario(Integer.valueOf(scanner.nextLine()));
        listaProductos.add(productoConSetters);
    }

    static void crearProductoConNYP(ArrayList<Producto> listaProductos, Scanner scanner) {
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = Double.valueOf(scanner.nextLine());
        Producto productoConNYP = new Producto(nombre, precio);
        listaProductos.add(productoConNYP);
    }
}
