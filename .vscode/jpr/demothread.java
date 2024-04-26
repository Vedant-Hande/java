class n1 extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }
}

class n2 extends Thread {
    public void run() {
        for (int i = 50; i >= 1; i++) {
            System.out.println(i);
        }
    }
}

class demothread {
    public static void main(String[] args) {
        n1 obj1 = new n1();
        n2 obj2 = new n2();
        obj1.start();
        obj2.start();
    }
}
