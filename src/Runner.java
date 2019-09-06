

public class Runner extends Thread {

    Thread runner1 = new Thread("Runner 1");
    Thread runner2 = new Thread("Runner 2");
    Thread runner3 = new Thread("Runner 3");
    Thread runner4 = new Thread("Runner 4");
    Thread runner5 = new Thread("Runner 5");

    @Override

    public void run() {
        super.run();


        System.out.println(runner1.getName() + " Берет палку ");
        System.out.println(runner1.getName() + " Бежит к " + runner2.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner2.getName() + " Берет Палку ");
        System.out.println(runner2.getName() + " Бежит к " + runner3.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner3.getName() + " Берет Палку ");
        System.out.println(runner3.getName() + " Бежит к " + runner4.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner4.getName() + " Берет Палку ");
        System.out.println(runner4.getName() + " Бежит к " + runner5.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner5.getName() + " Берет Палку ");
        System.out.println(runner5.getName() + " Бежит к финишу");
        System.out.println(runner5.getName() + " Бежит к " + runner4.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner4.getName() + " Берет Палку ");
        System.out.println(runner4.getName() + " Бежит к " + runner3.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner3.getName() + " Берет Палку ");
        System.out.println(runner3.getName() + " Бежит к " + runner2.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner2.getName() + " Берет Палку ");
        System.out.println(runner2.getName() + " Бежит к " + runner1.getName());
        try {
            sleep(500);
        } catch (InterruptedException sas) {
            sas.printStackTrace();
        }


        System.out.println(runner1.getName() + " Берет Палку ");
        System.out.println("Финиш!!!");

    }
}