public class MiProceso extends Thread {

    @Override
    public void run() {
        super.run();

        System.out.println("Ejecuntando el proceso " + Thread.currentThread().getName());

    }
}
