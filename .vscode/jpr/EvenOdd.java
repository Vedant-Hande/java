class Even extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 50; i = i + 2) {
                System.out.println("\t Even thread :" + i);
                sleep(500);
            }
        } catch (Exception e) {
            System.out.println("even thread interrupted");
        }
    }
}

class Odd extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 50; i = i + 2) {
                System.out.println("\t Odd thread :" + i);
                sleep(500);
            }
        } catch (Exception e) {
            System.out.println("odd thread interrupted");
        }
    }
}

class EvenOdd {
    public static void main(String args[]) {
        // new Even().start();
        Even E = new Even();
        Odd O = new Odd();
        E.start();
        O.start();
        // new Odd().start();
    }
}