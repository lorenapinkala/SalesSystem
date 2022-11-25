
package store;

public class Orden {
    
    //atributos
    private int idOrden;
    private Producto productos[]; // se inicializo pero no se creo el array
    private static int contadorDeOrdenes;
    private int contadorDeProductos;
    private static final int MAX_PRODUCTOS=10;
    
    //constructor
    public Orden (){
        this.idOrden=++Orden.contadorDeOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];//se crea el producto en el index de max productos--
    }
    
    //Metodos
    
    //metodo para agregar los productos al array
    public void agregarProducto(Producto producto){
        if(this.contadorDeProductos < MAX_PRODUCTOS){
            this.productos[this.contadorDeProductos++]=producto;
        }else{
            System.out.println("Se ha superado el maximo de productos");
        }
        
    }
    
    //metodo para calcular el precio total de los productos del array
    public double calcularTotal(){
        double total = 0;
        
        for(int i = 0 ;i<this.contadorDeProductos;i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
            // forma de hacerlo en una sola linea
            //total += this.productos[i].getPrecio();
        }
        
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden );
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorDeProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
}