package ar.edu.unahur.obj2.energia;

public class OperacionCarga implements Operacion{

    private Bateria bateria;
    private double energia;


    public OperacionCarga(Bateria bateria, double energia) {
        if (energia <= 0) {
            throw new ValorInvalidoException("La cantidad de energia tiene que ser mayor a 0.");
        }
        
        this.bateria = bateria;
        this.energia = energia;
    }
    @Override
    public void ejecutar() throws ReservaFisicaException {
        bateria.cargar(energia);
    }

    @Override
    public void deshacer()  throws ReservaFisicaException {
        bateria.consumir(energia);
    }
}
