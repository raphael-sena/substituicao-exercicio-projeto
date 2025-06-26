package adapter;

import adapter.adaptees.CameraSegurancaAPI;
import model.Dispositivo;

public class CameraSegurancaAdapter implements Dispositivo {
    private final CameraSegurancaAPI adaptee;

    public CameraSegurancaAdapter(CameraSegurancaAPI adaptee) {
        this.adaptee = adaptee;
    }

    public void ligar() {
        adaptee.gravar();
    }

    @Override
    public void desligar() {
        adaptee.pararGravacao();
    }
}
