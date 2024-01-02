import java.util.*;

public class Supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Producto por defecto
        Producto producto = new Producto(
            "Pera",
            2000,
            true,
            10,
            0
        );

        int op;
        do{
            System.out.println("Supermarket menu");
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
                    System.out.println("Ingresa el las existencias del producto:");
                    int pExistencias = sc.nextInt();
                    System.out.println("Ingresa la cantidad de unidades vendidas sí aplica:");
                    int pUnidadesVendidas = sc.nextInt();
                    producto = new Producto(pNombre, pPrecio, pDisponible, pExistencias, pUnidadesVendidas);

                    System.out.println("Producto agregado: " + producto);
                    break;
                case 2:
                    System.out.println("Precio de venta cada producto");
                    // Esto iria dentro de un ciclo que iteraria los productos con su precio de un Array Productos
                    System.out.println("Producto: " + producto.getNombre());
                    System.out.println("Precio: " + producto.getPrecio());
                    System.out.println("Existencias: " + producto.getExistencias());
                    System.out.println("-----------------------------------");
                    break;
                case 3:
                    System.out.println("Vende los productos disponibles");
                    producto.vender();
                    break;
                case 4:
                    System.out.println("Elimina productos vendidos");
                    System.out.println("¿Está seguro de eliminar los productos vendidos? (true/false)");
                    boolean si = sc.nextBoolean();

                    if (si) {
                        // Iría ciclo para eliminar cada producto de Array Productos
                        if (producto!=null) {
                            producto.eliminar();
                            producto = null;
                        } else {
                            System.out.println("El producto ya ha sido eliminado.");
                        }
                    }
                    break;
            }
        }while(op!=0);

        sc.close();
    }
}
