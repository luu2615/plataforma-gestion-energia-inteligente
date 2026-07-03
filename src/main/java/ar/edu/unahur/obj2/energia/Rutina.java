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
        List<Operacion> operacionesEjecutadas = new ArrayList<>();
        try {
        for (Operacion operacion : operaciones) {
            operacion.ejecutar();
            operacionesEjecutadas.add(operacion);
        }

        operaciones.clear();
        
        } catch (ReservaFisicaException e) {

        for (int i = operacionesEjecutadas.size() - 1; i >= 0; i--) {
            operacionesEjecutadas.get(i).deshacer();
        }

        throw e;
        } finally {
            operaciones.clear();
        }
    }

    @Override
    public void deshacer() throws ReservaFisicaException {
        for (int i = operaciones.size() - 1; i >= 0; i--) {
        operaciones.get(i).deshacer();
        }
    }
}
