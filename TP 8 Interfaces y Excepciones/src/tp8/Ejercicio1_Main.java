package tp8;

public class Ejercicio1_Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gino", "gino@java.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Mouse", 25.0));
        pedido.agregarProducto(new Producto("Teclado", 45.0));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        PagoConDescuento pagoTarjeta = new TarjetaCredito();
        double montoConDescuento = pagoTarjeta.aplicarDescuento(pedido.calcularTotal());
        pagoTarjeta.procesarPago(montoConDescuento);

        pedido.cambiarEstado("Enviado");
    }
}
