package ar.edu.unahur.obj2.energia;

public class Bateria {
    private String identificador;
    private double energia;

    public Bateria(String identificador, double energiaInicial) {
        this.identificador = identificador;
        this.energia = energiaInicial;
    }

    public double getEnergia(){
        return energia;
    }

    public void cargar(double cantidad) {
        energia += cantidad;
    }

    public void consumir(double cantidad) throws ReservaFisicaException {
        if (energia - cantidad < -5000) {
            throw new ReservaFisicaException ("La bateria no puede consumir por debajo de -5000 kwg
            .");
        }
        energia -= cantidad;
    }
}
