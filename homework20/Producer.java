package yarchuk;

public final class Producer {
    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (Main.buffer) {
                if (Buffer.isFull()) {
                    Main.buffer.wait();
                }

                System.out.println("Producer produced: " + (value + 1));

                Buffer.getList().add(value++);

                Main.buffer.notify();

                Thread.sleep(500);
            }
        }
    }
}


