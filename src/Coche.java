import java.util.Random;

public class Coche implements Runnable {
    private String nombre;
    private int distancia;
    private static final int DISTANCIA_META = 100;
    private long tiempoRecorrido;

    public Coche(String n){
        this.nombre = n;
        this.distancia = 0;
    }

    public long getTiempoRecorrido() {
        return tiempoRecorrido;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        long tiempoInicio = System.currentTimeMillis();
        while (distancia < DISTANCIA_META){
            distancia+= new Random().nextInt(1,100);
            try{
                Thread.sleep(1000);
                tiempoRecorrido = System.currentTimeMillis();
                System.out.println("El coche "+ nombre +" ya ha recorrido "+ distancia);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        long tiempoFin = System.currentTimeMillis();
        tiempoRecorrido = tiempoFin - tiempoInicio;
        System.out.println("El coche "+ nombre + " ha finalizado!. Ha tardado: "+tiempoRecorrido + " milisegundos");
    }



}
