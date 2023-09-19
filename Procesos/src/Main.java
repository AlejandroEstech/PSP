public class Main {
    public static void main(String[] args) {

        System.out.println("Hola mundo " + Thread.currentThread().getName());

        MiProceso p1 = new MiProceso();

        p1.start();

        for(int i=0;i<=10;i++){
            System.out.println(i + " " + Thread.currentThread().getName());

        }





    }





}