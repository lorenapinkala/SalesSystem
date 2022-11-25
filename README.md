# SalesSystem


En Java normalmente crearemos más de una clase con el objetivo de crear sistemas funcionales, por ejemplo algún
sistema que procese ventas en alguna tienda o por internet, o un sistema de facturación, contabilidad, o cualquier
sistema de propósito general. Cuando creemos clases que se interrelacionen lo conoceremos como el diseño de
clases.

Con Java es posible crear cualquiera de estos sistemas, ya que es un lenguaje de propósito general. De esta manera
cubrir los requerimientos solicitados por nuestros usuarios, que son las personas o entidades que utilizarán e
interactuarán con nuestro sistema. La idea de este curso es brindar las bases de la sintaxis y conceptos de Java más
fundamentales que nos permitirán ir creando y entendiendo este tipo de sistemas.

Por ello la clase Orden contiene los métodos de agregarProducto, calcularTotal (de la orden), y mostrarOrden, este
último método su objetivo es mostrar el Id de la orden, el monto total de la orden, así como cada uno de los
productos agregados a la orden. Para almacenar varios productos, la clase Orden tiene como atributo un arreglo de
productos, y de esta manera podremos agregar varios productos a una orden, con ayuda del método
agregarProducto.

La clase Producto contiene tres atributos: idProducto, nombre y precio del producto, por medio de estos atributos
podremos identificar fácilmente a un producto.

Finalmente tenemos la clase con la que realizaremos las pruebas de que todo función correctamente y es donde crearemos los objetos Orden y Producto y utilizaremos los métodos, respectivos para probar que funciona correctamente nuestro código.
