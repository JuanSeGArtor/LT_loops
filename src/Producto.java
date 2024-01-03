public class Producto {
    private String nombre;
    private double precio;
    private boolean disponible;
    private int existencias;
    private int unidadesVendidas;
    private boolean eliminado;

    // Getters & Setters
    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public Producto(String pNombre, double pPrecio, boolean pDisponible, int pExistencias, int pUnidadesVendidas) {
        this.nombre = pNombre;
        this.precio = pPrecio;
        this.disponible = pDisponible;
        this.existencias = pExistencias;
        this.unidadesVendidas = pUnidadesVendidas;
    }

    public void vender(int cantV) {
        if (cantV == 0) {
            System.out.println("No se ha vendido ninguna unidad del producto: " + this.getNombre());
        } else {
            this.unidadesVendidas = cantV;
            this.existencias = this.existencias-cantV;
            System.out.println("Venta realizada con éxito. " + this.unidadesVendidas + " unidades vendidas de " + this.nombre);
        }
    }

    public void eliminar() {
        if (!eliminado) {
            System.out.println("El producto " + this.nombre + " ha sido eliminado");
            this.eliminado = true;
        } else {
            System.out.println("El producto ya ha sido eliminado.");
        }
    }
}
