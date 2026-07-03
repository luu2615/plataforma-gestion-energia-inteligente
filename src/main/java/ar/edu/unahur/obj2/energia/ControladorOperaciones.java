package ar.edu.unahur.obj2.energia;

public class ControladorOperaciones {
    private Rutina rutina;

    public ControladorOperaciones(){
        this.rutina = new Rutina();
    }
    public void ejecutarOperacion(Operacion operacion) throws ReservaFisicaException {
        operacion.ejecutar();
    }

    public void ejecutarRutina() throws ReservaFisicaException {
        rutina.ejecutar();
        rutina = new Rutina();
    }
}
