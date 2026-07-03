package ar.edu.unahur.obj2.energia;

public class OperacionConsumo implements Operacion{

    private Bateria bateria;
    private double energia;


    public OperacionConsumo(Bateria bateria, double energia) {
        if (energia <= 0) {
            throw new ValorInvalidoException("La cantidad de energia tiene que ser mayor a 0.");
        }
        
        this.bateria = bateria;
        this.energia = energia;
    }
    @Override
    public void ejecutar() throws ReservaFisicaException {
        bateria.consumir(energia);
    }

    @Override
    public void deshacer()  throws ReservaFisicaException {
        bateria.cargar(energia);
    }
}