package singleton.structure;

public class ClientSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1 == singleton ? "Only a instance" : "Failed singleton");



    }
}
