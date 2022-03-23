public class CarritoTaller {
    public static void main(String[] args) {
        llamarFunciones();
    }

    public static int [] crearCarrito() {
        int largoArreglo = (int) ((Math.random() * 20) + 1);
        return new int [largoArreglo];
    }

    public static int [] asignarPrecioCarrito(int [] carrito) {
        int aux = 500;
        for (int i = 0; i < carrito.length; i++) {
            carrito[i] = aux;
            aux += 150;
        }

        return carrito;
    }

    public static int [] agregarProductos(int []carrito) {
        int [] cantidadDeProductos = new int [carrito.length];

        for(int i = 0; i < carrito.length; i++) {
            cantidadDeProductos[i] = (int) (Math.random() * 16);
        }

        return cantidadDeProductos;
    }

    public static int calcularCantidadTotalDeProductos(int [] cantidadDeProductos) {
        int cantidadTotalDeProductos = 0;
        for(int i = 0; i < cantidadDeProductos.length; i++) {
            cantidadTotalDeProductos += cantidadDeProductos[i];
        }
        
        return cantidadTotalDeProductos;
    }

    public static void imprimirResultados(int cantidadTotalDeProductos) {
        imprimirCantidadDeProductos(cantidadTotalDeProductos);
    }

    public static void imprimirCantidadDeProductos(int cantidadDeProductos) {
        System.out.println("El carrito contiene " + cantidadDeProductos + " productos.");
    }

    public static void llamarFunciones() {
        int [] carrito = crearCarrito();
        carrito = asignarPrecioCarrito(carrito);
        int [] cantidadDeProductos = agregarProductos(carrito);
        int cantidadTotalDeProductos = calcularCantidadTotalDeProductos(cantidadDeProductos);
        imprimirResultados(cantidadTotalDeProductos);
    }
}
