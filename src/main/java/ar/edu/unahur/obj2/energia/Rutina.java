package ar.edu.unahur.obj2.energia;

import java.util.List; 
import java.util.ArrayList;

public class Rutina implements Operacion {
    private List<Operacion> operaciones = new ArrayList<>();

    public void agregarOperacion(Operacion operacion) {
        operaciones.add(operacion);
    }

    @Override
    public void ejecutar() throws ReservaFisicaException {
    }

    @Override
    public void deshacer() throws ReservaFisicaException {}
}
