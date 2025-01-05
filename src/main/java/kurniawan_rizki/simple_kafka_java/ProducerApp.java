package kurniawan_rizki.simple_kafka_java;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class ProducerApp {
     public static void main(String[] args) throws ExecutionException, InterruptedException {
          Properties props = new Properties();
          props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
          props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
          props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

          KafkaProducer<String, String> producer = new KafkaProducer<>(props);

          for (int i = 0; i < 10; i++) {
               ProducerRecord<String, String> message = new ProducerRecord<>("helloworld", Integer.toString(i), "Hello from Java: " + i);
               producer.send(message).get();
          }
          producer.close();
     }
}
