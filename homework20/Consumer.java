package yarchuk;

public class Consumer {
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (Main.buffer) {
                if (Buffer.isEmpty()) {
                    Main.buffer.wait();
                }

                int value = Buffer.getList().removeFirst();

                System.out.println("Consumer consumed: " + (value + 1));

                Main.buffer.notify();

                Thread.sleep(500);
            }
        }
    }
}
