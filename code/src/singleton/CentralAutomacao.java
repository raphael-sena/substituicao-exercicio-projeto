package singleton;

import model.Dispositivo;

public class CentralAutomacao {
    private static CentralAutomacao instancia;

    private CentralAutomacao() {
    }

    public static synchronized CentralAutomacao getInstancia() {
        if (instancia == null) {
            instancia = new CentralAutomacao();
        }
        return instancia;
    }

    public void conectar(Dispositivo dispositivo) {
        dispositivo.ligar();
    }

    public void desconectar(Dispositivo dispositivo) {
        dispositivo.desligar();
    }
}
