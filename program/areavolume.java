import java.util.*;
class area {
    // int len,width;
    int areaa(int len, int wid) {
        return len * wid;
    }
}

class areavolume extends area {
    int volume(int len, int wid, int hig) {
        return len * wid * hig;
    }

    public static void main(String[] args) {
        areavolume av = new areavolume();
        System.out.println("the area is " + av.areaa(10, 20));
        System.out.println("the volume is " + av.volume(10, 20, 30));
    }
}
