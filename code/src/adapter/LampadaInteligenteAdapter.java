package adapter;

import adapter.adaptees.LampadaInteligenteAPI;
import model.Dispositivo;

public class LampadaInteligenteAdapter implements Dispositivo {
    private final LampadaInteligenteAPI adaptee;

    public LampadaInteligenteAdapter(LampadaInteligenteAPI adaptee) {
        this.adaptee = adaptee;
    }

    public void ligar() {
        adaptee.acenderLampada();
    }

    @Override
    public void desligar() {
        adaptee.desligarLampada();
    }
}
