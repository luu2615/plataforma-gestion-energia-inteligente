package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ControladorOperacionesTest {
@Test
void ejecutarOperacion() throws ReservaFisicaException {

    Bateria bateria = new Bateria("bateria9999",1000);

    ControladorOperaciones controlador = new ControladorOperaciones();

    controlador.ejecutarOperacion(new OperacionCarga(bateria,500));

    assertEquals(1500,bateria.getEnergia());
}
}
