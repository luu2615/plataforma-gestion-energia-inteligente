package ar.edu.unahur.obj2.energia;

public class NotificacionAlAdministrador implements Observador {

    @Override
    public void actualizar(Bateria bateria, double energia) {

        if (energia > 0) {
            System.out.println("Se han cargado " + energia +
                    " kWh en la bateria " + bateria.getIdentificador());
        } else {
            System.out.println("Se han consumido " + energia +
                    " kWh en la bateria " + bateria.getIdentificador());
        }

    }
}