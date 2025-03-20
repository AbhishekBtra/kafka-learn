# kafka-learn
This repo contains material for learning kafka

# Producer - Consumer - Broker in Kafka
1. Kafka Broker:
A Kafka broker is a server that stores and manages the data (messages) within a Kafka cluster. 
It receives messages from producers, stores them in topics (which are essentially named channels), and makes them available to consumers. 
Brokers ensure data reliability and availability, even in case of failures. 
A Kafka cluster can consist of multiple brokers, which allows for scalability and fault tolerance. 
2. Kafka Producer:
A producer is an application or system that writes messages to Kafka topics. 
It connects to a Kafka broker and sends data, which is then stored in the designated topic. 
Producers can be any application that needs to send data to Kafka, such as web servers, event streams, or other applications. 
Producers are responsible for choosing the topic to which they will send messages. 
3. Kafka Consumer:
A consumer is an application or system that reads messages from Kafka topics. 
It connects to a Kafka broker and subscribes to one or more topics. 
Consumers can then process the messages they receive from those topics. 
Consumers can be part of a consumer group, allowing multiple consumers to read from the same topic concurrently, improving throughput. 
Consumers can also control their consumption rate and process messages asynchronously, according to Confluent Documentation. 
