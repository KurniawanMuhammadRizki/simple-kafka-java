package kurniawan_rizki.simple_kafka_java;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.List;
import java.util.Properties;

public class ConsumerApp {
     public static void main(String[] args) {
          Properties props = new Properties();
          props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
          props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
          props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
          props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
          props.put(ConsumerConfig.GROUP_ID_CONFIG, "java");

          KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
          consumer.subscribe(List.of("helloworld"));

          while (true) {
               ConsumerRecords<String, String> records = consumer.poll(1000);
               for (ConsumerRecord<String, String> record : records) {
                    System.out.println("Received message: " +record.value());
               }
          }
     }
}
