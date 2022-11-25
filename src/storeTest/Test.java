
package storeTest;

import store.*;

public class Test {
    public static void main(String[] args) {
        //se crean los productos
        Producto producto1 = new Producto("Remera" , 150.99);
        Producto producto2 = new Producto ("Jeans" , 80.00);
        
        //se crea la orden
        Orden orden1= new Orden();
        
        //agrego los productos a la orden
        
        orden1.agregarProducto(producto1);
        
        orden1.agregarProducto(producto2);
        
        //muestro el contenido de las ordenes
        
        orden1.mostrarOrden();
    }
}