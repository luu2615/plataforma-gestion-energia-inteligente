package ar.edu.unahur.obj2.energia;

public interface Operacion {
    void ejecutar() throws ReservaFisicaException;;

    void deshacer() throws ReservaFisicaException;;
}
