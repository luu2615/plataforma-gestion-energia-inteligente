package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RegistroCentralTest {
@Test
void registraMovimientos() {

    RegistroCentral registro = new RegistroCentral();

    Bateria bateria = new Bateria("bateria",1000);

    registro.actualizar(bateria,500);

    assertEquals(1,registro.getAlteraciones().size());
}
}
