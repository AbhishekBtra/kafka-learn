import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        for (int i=0; i<10; i++){
            String message=String.format("Hello World ! %s",i);
            String key = String.format("Key %s",i);
            ProducerRecord<String,String> record = new ProducerRecord("quickstart-events",key,message);
            producer.send(record);
            System.out.println(record.toString());
            
        }
        System.out.println("Kafka Producer initialized!");
        producer.close();
        
    }
}
