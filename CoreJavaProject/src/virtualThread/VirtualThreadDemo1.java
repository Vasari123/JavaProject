package virtualThread;

import java.util.concurrent.Executors;

public class VirtualThreadDemo1 {
    public static void main(String[] args) {
        try(var executor = Executors.newVirtualThreadPerTaskExecutor()){
            for (int i = 0; i< 5; i++){
                int taskId = i;
                executor.submit(() -> {
                    System.out.println("Running task " + taskId + " in virtual thread " + Thread.currentThread().getName());
                });
            }
        }
    }
}
