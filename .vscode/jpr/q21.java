class animal {
    void makesound() {
        System.out.println("animal makes sound ");
    }
}

class cat extends animal {
    @Override
    void makesound() {
        System.out.println("cat mowe ");
    }
}

class dog extends animal {
    @Override
    void makesound() {
        System.out.println("dog bhoou ");
    }
}

class q21 {
    public static void main(String[] args) {

        animal a = new animal();
        animal b = new cat();
        animal c = new dog();
        a.makesound();
        b.makesound();
        c.makesound();
    }

}
