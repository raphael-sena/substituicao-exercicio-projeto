package adapter.adaptees;

public class TermostatoAPI {
    public void iniciarControleDeTemperatura() {
        System.out.println("Termostato ativado via adapter.adaptees.TermostatoAPI");
    }

    public void pararControleDeTemperatura() {
        System.out.println("Termostato desativado via adapter.adaptees.TermostatoAPI");
    }
}
