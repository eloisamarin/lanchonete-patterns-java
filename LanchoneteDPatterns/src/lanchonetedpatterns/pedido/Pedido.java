/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.pedido;

/**
 *
 * @author elois
 */
public class Pedido {

    private EstadoPedido estado = new EstadoNovo();

    public void proximoEstado() {
        estado.proximo(this);
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado.getEstado();
    }

}
