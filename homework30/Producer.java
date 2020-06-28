import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


import static java.lang.Thread.sleep;

public class Producer {

    private final static String QUEUE_NAME = "queue";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {

        Connection connection;
        ConnectionFactory connectionFactory;
        Channel channel;

        String text = ("Hello, reciever!");

        connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");

        connection = connectionFactory.newConnection();

        channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        while (true) {
            channel.basicPublish(" ", QUEUE_NAME, null, text.getBytes());
            System.out.println("Waiting for reciever answer...");
            sleep(500);
        }
    }
}