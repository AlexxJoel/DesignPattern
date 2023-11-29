package singleton.thread_safe;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton threadSafeSingleton;
    private ThreadSafeSingleton() {}
    public static ThreadSafeSingleton getThreadSafeSingleton(){
        if (threadSafeSingleton == null){
            synchronized (ThreadSafeSingleton.class){
                if (threadSafeSingleton == null){
                    threadSafeSingleton = new ThreadSafeSingleton();
                }
            }
        }
        return threadSafeSingleton;
    }
}
