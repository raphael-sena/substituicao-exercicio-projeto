import factory.DispositivoFactory;
import model.Dispositivo;
import singleton.CentralAutomacao;

public class Main {
    public static void main(String[] args) {
        CentralAutomacao central = CentralAutomacao.getInstancia();

        Dispositivo lampada = DispositivoFactory.criarDispositivo("lampada", "lampadaInteligenteInc");
        Dispositivo camera = DispositivoFactory.criarDispositivo("camera", "cameraSegura");
        Dispositivo termostato = DispositivoFactory.criarDispositivo("termostato", "termoBom");

        central.conectar(lampada);
        central.conectar(camera);
        central.conectar(termostato);

        central.desconectar(lampada);
        central.desconectar(camera);
        central.desconectar(termostato);
    }
}
