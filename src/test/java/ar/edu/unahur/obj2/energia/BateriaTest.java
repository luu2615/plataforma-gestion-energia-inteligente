package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BateriaTest {
    @Test
    void cargarEnergia() {
        Bateria bateria = new Bateria("BAT1", 1000);

        bateria.cargar(500);

        assertEquals(1500, bateria.getEnergia());
    }
}
