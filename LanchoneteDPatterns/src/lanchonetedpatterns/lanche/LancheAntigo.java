/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanchonetedpatterns.lanche;

/**
 *
 * @author elois
 */
public class LancheAntigo {
    public void fazerLanche() {
        System.out.println("Fazendo lanche antigo...");
    }

    public double valor() {
        return 15.0;
    }

    public String ingredientes() {
        return "Pao frances, mortadela e queijo";
    }


    public boolean isDisponivel() {
        return true;
    }

    public void aquecer() {
        System.out.println("Aquecendo lanche antigo no forno...");
    }

    public String bonusBatata() {
        return "Voce ganhou uma batata gratis com esse lanche!";
    }
}