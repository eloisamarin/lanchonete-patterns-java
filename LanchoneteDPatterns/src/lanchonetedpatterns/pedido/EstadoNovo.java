/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.pedido;

/**
 *
 * @author elois
 */
public class EstadoNovo implements EstadoPedido {
    public void proximo(Pedido pedido) {
        pedido.setEstado(new EstadoPreparando());
    }

    public String getEstado() {
        return "Novo";
    }
}