package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OperacionConsumoTest {
@Test
void ejecutarConsumo() throws ReservaFisicaException {
    Bateria bateria1 = new Bateria("bateria45", 1000);

    OperacionConsumo consumo = new OperacionConsumo(bateria1, 300);

    consumo.ejecutar();

    assertEquals(700, bateria1.getEnergia());
}

@Test
void deshacerConsumo() throws ReservaFisicaException {
    Bateria bateria1 = new Bateria("bateria", 1000);

    OperacionConsumo consumo = new OperacionConsumo(bateria1, 300);

    consumo.ejecutar();
    consumo.deshacer();

    assertEquals(1000, bateria1.getEnergia());
}

@Test
void energiaInvalida() {
    Bateria bateria1 = new Bateria("bateria", 1000);

    assertThrows(ValorInvalidoException.class,() -> new OperacionConsumo(bateria1, -10));
    }
}
