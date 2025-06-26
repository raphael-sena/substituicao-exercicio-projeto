package adapter;

import adapter.adaptees.TermostatoAPI;
import model.Dispositivo;

public class TermostatoAdapter implements Dispositivo {
    private final TermostatoAPI adaptee;

    public TermostatoAdapter(TermostatoAPI adaptee) {
        this.adaptee = adaptee;
    }

    public void ligar() {
        adaptee.iniciarControleDeTemperatura();
    }

    @Override
    public void desligar() {
        adaptee.pararControleDeTemperatura();
    }
}
