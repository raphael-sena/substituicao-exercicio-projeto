package factory;

import adapter.CameraSegurancaAdapter;
import adapter.LampadaInteligenteAdapter;
import adapter.TermostatoAdapter;
import adapter.adaptees.CameraSegurancaAPI;
import adapter.adaptees.LampadaInteligenteAPI;
import adapter.adaptees.TermostatoAPI;
import model.Dispositivo;

public class DispositivoFactory {
    public static Dispositivo criarDispositivo(String tipo, String fabricante) {
        return switch (tipo + ":" + fabricante) {
            case "lampada:lampadaInteligenteInc" -> new LampadaInteligenteAdapter(new LampadaInteligenteAPI());
            case "camera:cameraSegura" -> new CameraSegurancaAdapter(new CameraSegurancaAPI());
            case "termostato:termoBom" -> new TermostatoAdapter(new TermostatoAPI());
            default -> throw new IllegalArgumentException("Dispositivo ou fabricante desconhecido");
        };
    }
}
