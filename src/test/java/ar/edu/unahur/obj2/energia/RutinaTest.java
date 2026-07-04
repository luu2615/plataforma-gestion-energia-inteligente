package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RutinaTest {
@Test
void ejecutarRutina() throws ReservaFisicaException {

    Bateria bateria = new Bateria("bateria",1000);

    Rutina rutina = new Rutina();

    rutina.agregarOperacion(new OperacionCarga(bateria,500));
    rutina.agregarOperacion(new OperacionConsumo(bateria,300));

    rutina.ejecutar();

    assertEquals(1200,bateria.getEnergia());
}

@Test
void deshaceTodoSiFalla() {

    Bateria bateria = new Bateria("bateria",1000);

    Rutina rutina = new Rutina();

    rutina.agregarOperacion(new OperacionCarga(bateria,1000));
    rutina.agregarOperacion(new OperacionConsumo(bateria,500));
    rutina.agregarOperacion(new OperacionConsumo(bateria,7000));

    assertThrows(ReservaFisicaException.class,() -> rutina.ejecutar());

    assertEquals(1000,bateria.getEnergia());
}

@Test
void deshacerManual() throws ReservaFisicaException {
    Bateria bateria = new Bateria("21421", 1000);
    Rutina rutina = new Rutina();
    rutina.agregarOperacion(new OperacionCarga(bateria, 1000));  // +1000
    rutina.agregarOperacion(new OperacionConsumo(bateria, 200)); // -200

    rutina.deshacer();
    assertEquals(200, bateria.getEnergia());
}
}
