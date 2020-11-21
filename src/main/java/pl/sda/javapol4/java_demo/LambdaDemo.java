package pl.sda.javapol4.java_demo;

class MyRunnabke implements Runnable{

    @Override
    public void run() {
        System.out.println("From Myrunnabele class");
    }
}
public class LambdaDemo {
    public static void main(String[] args) {
        Runnable job = new Runnable() {
            @Override
            public void run() {
                System.out.println("From annonymous Runnable");

            }
        };
        job.run();

        Runnable job2 = () -> {};

        }
    }

