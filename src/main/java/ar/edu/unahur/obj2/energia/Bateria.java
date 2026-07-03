package ar.edu.unahur.obj2.energia;

import java.util.ArrayList;
import java.util.List;

public class Bateria {
    private String identificador;
    private double energia;

    private List<Observador> observadores = new ArrayList<>();

    public Bateria(String identificador, double energiaInicial) {
        this.identificador = identificador;
        this.energia = energiaInicial;
    }

    public double getEnergia(){
        return energia;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void cargar(double cantidad) {
        energia += cantidad;
        //Alerta a los subs
        notificar(cantidad);
    }

    public void consumir(double cantidad) throws ReservaFisicaException {
        if (energia - cantidad < -5000) {
            throw new ReservaFisicaException ("La bateria no puede consumir por debajo de -5000 kwg.");
        }
        energia -= cantidad;
        notificar(cantidad);
    }

    //Seccion de observadores
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
    
    private void notificar(double energia) {
        for (Observador observador : observadores) {
            observador.actualizar(this, energia);
        }
    }
}
