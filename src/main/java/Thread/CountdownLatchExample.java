package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Long> tmp = new ArrayList<Long>();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
//                System.out.print("run.");
                tmp.add(countDownLatch.getCount());
                countDownLatch.countDown();
            });
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("do something");
        }
        countDownLatch.await();
        tmp.stream().forEach(System.out::println);

        System.out.println("end");
        executorService.shutdown();
    }
}