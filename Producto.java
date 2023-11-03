class Producto {
private String nombre;
private double precio;

public Producto(String nombre, double precio) {
this.nombre = nombre;
this.precio = precio;
}
public String getNombre() {
return nombre;
}
public double precio() {
return precio;
}
}
class EncargoProductos {
private List<Producto> listaProductos = new ArrayList<>();

public void  agregarProducto(Producto producto) {
listaProductos.add(producto);
}
public void mostarInformacionProductos() {
System.out.println("Lista de productos: ");
for (Producto producto : listaProductos) {
System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getprecio());
