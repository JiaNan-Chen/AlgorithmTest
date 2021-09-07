import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author chenjianan
 * @create 2021/9/1
 * @since 1.0.0
 */
public class ReportName {
    public static final int STU_COUNT = 100;
    private final AtomicInteger mCount = new AtomicInteger(0);
    private final ArrayList<String> mRecordName = new ArrayList<>();
    private final LinkedBlockingQueue<String> mNameQueue = new LinkedBlockingQueue<>();

    //学生线程调用
    public void reportName(String name) {
        mNameQueue.offer(name);
    }

    //老师线程调用一次
    public void recordName() {
        while (true) {
            try {
                String name = mNameQueue.take();
                mRecordName.add(name);
                mCount.getAndIncrement();
                if (mCount.get() == STU_COUNT) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        printAllName();
    }

    private void printAllName() {
        for (String name : mRecordName) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        //ReentrantLock
        ReportName reportName = new ReportName();
        Thread techThread = new Thread() {
            @Override
            public void run() {
                super.run();
                reportName.recordName();
            }
        };
        techThread.start();
        Random random=new Random();
        for (int index = 0; index < STU_COUNT; index++) {
            Thread stuThread = new Thread() {
                @Override
                public void run() {
                    super.run();
                    try {
                        Thread.sleep(random.nextInt(10000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    reportName.reportName(Thread.currentThread().getName());
                }
            };
            stuThread.start();
        }
    }
}
