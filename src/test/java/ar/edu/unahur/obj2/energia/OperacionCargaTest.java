package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OperacionCargaTest {
@Test
void ejecutarCarga() throws ReservaFisicaException{
    Bateria bateria1 = new Bateria("bateria1", 1000);

    OperacionCarga carga = new OperacionCarga(bateria1, 500);

    carga.ejecutar();

    assertEquals(1500, bateria1.getEnergia());
}

@Test
void deshacerCarga() throws ReservaFisicaException {
    Bateria bateria1 = new Bateria("bateria2", 1000);

    OperacionCarga carga = new OperacionCarga(bateria1, 500);

    carga.ejecutar();
    carga.deshacer();

    assertEquals(1000, bateria1.getEnergia());
}

@Test
void noPermiteEnergiaInvalida() {
    Bateria bateria3 = new Bateria("bateria3", 1000);

    assertThrows(ValorInvalidoException.class,
            () -> new OperacionCarga(bateria3, 0));
}
}
