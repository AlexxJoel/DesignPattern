package singleton.example;

public class ClientSingleton {
    public static void main(String[] args) {

        //example gave by the codigoFacilito
        Monitor monitor = Monitor.getInstance(); 
        Monitor monitor1 = Monitor.getInstance();

        System.out.println(monitor == monitor1 ? "Only 1 monitor" : "Failed action :(");
        
    }
}
