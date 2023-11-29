package singleton.example;

public class Monitor {
    private static Monitor monitor;
    private Monitor() {}

    public synchronized static Monitor getInstance(){
        if (monitor == null) monitor = new Monitor();
        return monitor;
    }

}
