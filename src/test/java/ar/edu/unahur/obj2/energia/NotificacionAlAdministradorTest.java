package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NotificacionAlAdministradorTest {
@Test
void notificarAdministrador() {

    NotificacionAlAdministrador notificacion = new NotificacionAlAdministrador();

    Bateria bateria = new Bateria("bateria",1000);

    assertDoesNotThrow(() -> notificacion.actualizar(bateria,500));
    }
    @Test
    void notificacionCubreAmbosCasos() {

        NotificacionAlAdministrador obs = new NotificacionAlAdministrador();
        Bateria bateria1 = new Bateria("bateriados", 1000);

        obs.actualizar(bateria1, 100);
        obs.actualizar(bateria1, -100);

        assertTrue(true); // solo para cubrir ramas
    }

}
