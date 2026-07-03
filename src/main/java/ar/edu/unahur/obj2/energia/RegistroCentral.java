package ar.edu.unahur.obj2.energia;

import java.util.ArrayList;
import java.util.List;

public class RegistroCentral implements Observador {

    private List<String> alteraciones = new ArrayList<>();

    @Override
    public void actualizar(Bateria bateria, double energia) {

        String movimiento = "Bateria " + bateria.getIdentificador()
                + " movimiento de " + energia;

        alteraciones.add(movimiento);

        System.out.println(movimiento);
    }

    public List<String> getAlteraciones() {
        return alteraciones;
    }
}
