public class InventarioBasico {

    static class Producto {
        public int id;
        public String nombre;
        public int cantidad;
        public double precioUnitario;

        public Producto(int i, String n, int c, double p) {
            id = i;
            nombre = n;
            cantidad = c;
            precioUnitario = p;
        }
    }

    public static void main(String[] args) {
        Producto[] productos = new Producto[10];
        int cantidadProductos = 0;

        productos[cantidadProductos++] = new Producto(1, "Manzana", 50, 0.5);
        productos[cantidadProductos++] = new Producto(2, "Banana", 30, 0.3);
        productos[cantidadProductos++] = new Producto(3, "Naranja", 10, 0.4);

        
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].id == 1) {
                productos[i].cantidad = productos[i].cantidad + 20;
            }
        }

       
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].id == 2) {
                if (productos[i].cantidad >= 5) {
                    productos[i].cantidad = productos[i].cantidad - 5;
                } else {
                    System.out.println(" insuficientes para: " + productos[i].nombre);
                }
            }
        }

        
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].id == 3) {
                if (productos[i].cantidad >= 15) {
                    productos[i].cantidad = productos[i].cantidad - 15;
                } else {
                    System.out.println(" insuficiente para: " + productos[i].nombre);
                }
            }
        }

        
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total = total + (productos[i].cantidad * productos[i].precioUnitario);
        }
        System.out.println("Valor total del inventario: $" + total);

       
        System.out.println("Productos con bajo stock (<= 15):");
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].cantidad <= 15) {
                System.out.println(productos[i].nombre + " - Cantidad: " + productos[i].cantidad);
            }
        }
    }
}
