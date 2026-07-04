package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BateriaTest {
    @Test
    void cargarEnergia() {
        Bateria bateria = new Bateria("bateria1", 1000);

        bateria.cargar(500);

        assertEquals(1500, bateria.getEnergia());
    }
    @Test
    void muchoConsumo() {
        Bateria bateria1 = new Bateria("batteria", 0);
        assertThrows(ReservaFisicaException.class,() -> bateria1.consumir(6000));
    }
}


