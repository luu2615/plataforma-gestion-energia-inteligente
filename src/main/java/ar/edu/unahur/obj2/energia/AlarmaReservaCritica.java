package ar.edu.unahur.obj2.energia;

public class AlarmaReservaCritica implements Observador{
    @Override
    public void actualizar(Bateria bateria, double energia) {
        if (bateria.getEnergia() < 0) {
            System.out.println("la bateria " + bateria.getIdentificador()+ " esta utilizando el limite de reserva");
        }
    }
}
