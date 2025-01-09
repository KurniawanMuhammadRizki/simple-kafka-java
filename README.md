# Kafka Producer and Consumer Example

This project was created by me as part of my journey to learn and experiment with Apache Kafka. It showcases a simple producer and consumer setup using Java.

---

## How It Works

- **ProducerApp**:
  Sends 10 messages to a Kafka topic named `helloworld`.
  - Key: Message number as a string (e.g., "0").
  - Value: Message text (e.g., "Hello from Java: 0").

- **ConsumerApp**:
  Listens to the `helloworld` topic and prints messages to the console.

---

## Prerequisites

1. **Kafka Server**: Make sure Kafka is running on `localhost:9092`.
2. **Java (JDK 8 or later)**.
3. **Maven**: To build the project.

---

## How to Run

1. **Start Kafka**: Ensure your Kafka server is up and running.
2. **Clone the Repo**
3. **Build the Project**
4. **Run the Producer**
5. **Run the Consumer**
6. **Watch the Output**: See the producer and consumer in action!

---

## What's Next?

I’m planning to extend this project by integrating **Spring Boot** for a real-world use case: **an order management system**. Stay tuned!

---

Thanks for visiting! Feel free to share feedback or suggestions.

