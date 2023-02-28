package hu.petrik.sokszogoop;

public class Main {
    public static void main(String[] args) {
        Haromszog haromszog1 = new Haromszog();
        Haromszog haromszog2 = new Haromszog();
        Haromszog haromszog3 = new Haromszog(3, 4, 5);
        Teglalap teglalap1 = new Teglalap(5, 10);
        Teglalap teglalap2 = new Teglalap(10, 2);
        Teglalap teglalap3 = new Teglalap(6, 3);
        System.out.println(haromszog1);
        System.out.println(haromszog2);
        System.out.println(haromszog3);
        System.out.println(teglalap1);
        System.out.println(teglalap2);
        System.out.println(teglalap3);
    }
}
