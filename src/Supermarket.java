import java.util.*;

public class Supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista para almacenar productos en el inventario
        List<Producto> inventario = new ArrayList<>();

        // Producto por defecto
        Producto productoD = new Producto(
            "Pera",
            2000,
            true,
            10,
            0
        );
        inventario.add(productoD);

        int op;
        do{
            System.out.println("Supermarket Menú");
            System.out.println("(1) Agregar nuevo producto al inventario");
            System.out.println("(2) Listar precios de venta de productos");
            System.out.println("(3) Vender productos disponibles");
            System.out.println("(4) Eliminar productos vendidos");
            System.out.println("(0) Salir");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.println("Agrega un nuevo producto");
                    System.out.println("Ingresa el nombre del producto:");
                    String pNombre = sc.nextLine();
                    System.out.println("Ingresa el precio de venta del producto:");
                    double pPrecio = sc.nextDouble();
                    System.out.println("Indique sí el producto estará disponible a la venta (true/false):");
                    boolean pDisponible = sc.nextBoolean();
                    System.out.println("Ingresa las existencias del producto:");
                    int pExistencias = sc.nextInt();
                    System.out.println("Ingresa la cantidad de unidades vendidas sí aplica:");
                    int pUnidadesVendidas = sc.nextInt();

                    // Evitar que se ingresen unidades vendidades mayores a las existencias
                    while (pUnidadesVendidas>pExistencias) {
                        System.out.println("Las existencias que ingresó del producto son de: " + pExistencias + " no pueden haber esta cantidad de unidades vendidas: " + pUnidadesVendidas);

                        System.out.println("Por favor, ingrese una cantidad menor o igual a las existencias:");
                        pUnidadesVendidas = sc.nextInt();
                    }

                    // Crear nuevo producto y agregarlo a la lista
                    Producto nuevoProd = new Producto(pNombre, pPrecio, pDisponible, pExistencias, pUnidadesVendidas);
                    inventario.add(nuevoProd);

                    System.out.println("Producto agregado: " + nuevoProd.getNombre());
                    break;
                case 2:
                    System.out.println("Info de cada producto");

                    for (Producto producto : inventario) {
                        System.out.println("Producto: " + producto.getNombre());
                        System.out.println("Precio: " + producto.getPrecio());
                        System.out.println("Existencias: " + producto.getExistencias());
                        System.out.println("Unidades Vendidas: " + producto.getUnidadesVendidas());
                        System.out.println("-----------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Venta de productos disponibles");
                    System.out.println("A continuación, podrá vender los productos disponibles del inventario (ingrese -true- para continuar)");
                    boolean vender = sc.nextBoolean();

                    if (vender) {
                        for (Producto producto : inventario) {
                            if (producto.isDisponible()) {
                                System.out.println("Ingrese la cantidad a vender del producto: " + producto.getNombre());
                                System.out.println("Existencias: " + producto.getExistencias());
                                int cantV = sc.nextInt();

                                while (cantV > producto.getExistencias()) {
                                    System.out.println("Las existencias son de: " + producto.getExistencias() + " por lo que no podemos vender la cantidad solicitada de: " + cantV);

                                    System.out.println("Por favor, ingrese una cantidad menor o igual a las existencias:");
                                    cantV = sc.nextInt();
                                }

                                producto.vender(cantV);
                            } else {
                                System.out.println("El producto: " + producto.getNombre() + " no está disponible");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Elimina productos vendidos");
                    System.out.println("¿Está seguro de ELIMINAR los productos vendidos? (true/false)");
                    boolean eliminar = sc.nextBoolean();

                    if (eliminar) {
                        Iterator<Producto> iterator = inventario.iterator();
                        while (iterator.hasNext()) {
                            Producto producto = iterator.next();
                            if (producto.getUnidadesVendidas() > 0) {
                                iterator.remove();
                                producto.eliminar();
                            }
                        }
                    }
                    break;
            }
        }while(op!=0);

        sc.close();
    }
}
