/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.lanche;

/**
 *
 * @author elois
 */
public class LancheAntigoAdapter implements Lanche {
    private LancheAntigo antigo = new LancheAntigo();

    @Override
    public void preparar() {
        if (antigo.isDisponivel()) {
            antigo.aquecer();
            antigo.fazerLanche();
            System.out.println("Ingredientes: " + antigo.ingredientes());
            System.out.println(antigo.bonusBatata());
        } else {
            System.out.println("Lanche antigo indisponivel no momento.");
        }
    }

    @Override
    public double getPreco() {
        return antigo.valor();
    }
}
