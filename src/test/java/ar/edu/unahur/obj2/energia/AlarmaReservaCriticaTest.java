package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AlarmaReservaCriticaTest {
@Test
void alarmaNoLanzaExcepciones() {
    AlarmaReservaCritica alarma = new AlarmaReservaCritica();
    Bateria bateria = new Bateria("bateria77",-100);
    assertDoesNotThrow(() -> alarma.actualizar(bateria,-50));
}
}
