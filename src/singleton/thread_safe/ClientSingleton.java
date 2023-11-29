package singleton.thread_safe;

public class ClientSingleton {
    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getThreadSafeSingleton();
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getThreadSafeSingleton();
        //test
        System.out.println(threadSafeSingleton == threadSafeSingleton1 ? "Thread safe" : "Failed singleton");
    }
}
