public class CarreraDeCoches {
    public static void main(String[] args) {
        Coche[] coches = {
                new Coche("Rojo"),
                new Coche("Verde"),
                new Coche("Amarillo"),
                new Coche("Azul"),
                new Coche("Rosa"),
        };


        Thread hilo1 = new Thread(coches[0]);
        Thread hilo2 = new Thread(coches[1]);
        Thread hilo3 = new Thread(coches[2]);
        Thread hilo4 = new Thread(coches[3]);
        Thread hilo5 = new Thread(coches[4]);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        try{
            //El metodo join sirve para espera a que los metodos finalicen
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Coche cocheGanador = coches[0];
        for (int i =0; i<coches.length; i++){
            if(coches[i].getTiempoRecorrido()< cocheGanador.getTiempoRecorrido()){
                cocheGanador = coches[i];
            }
        }

        System.out.println("El coche ganador es: "+ cocheGanador.getNombre()+"!");




    }
}
