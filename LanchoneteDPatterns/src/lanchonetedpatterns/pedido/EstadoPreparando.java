/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.pedido;

/**
 *
 * @author elois
 */
public class EstadoPreparando implements EstadoPedido {
    public void proximo(Pedido pedido) {
        pedido.setEstado((EstadoPedido) new EstadoPronto());
    }
    public String getEstado() { return "Preparando..."; }
}
