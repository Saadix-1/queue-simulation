# 🛒 Queue Simulation

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)
[![Build](https://img.shields.io/badge/Build-Manual-lightgrey)](https://github.com/Saadix-1/queue-simulation)

A Java simulation of supermarket queues featuring regular and express checkout lines, modeled using a custom queue implementation.

---

## 📌 Project Description

This simulation models customer behavior and queue processing in a supermarket with two types of lines:

- **Regular queues** for customers with a larger number of items.
- **Express queues** for customers with fewer items.

Customers arrive randomly, and cashiers process items over discrete time steps.

---

## 🎯 Objectives

- Simulate the behavior of checkout queues over a fixed number of time steps.
- Implement a custom queue using an array-based structure.
- Study the effect of different parameters (arrival probability, item count, etc.) on system performance.
- Practice implementing interfaces and class-based design in Java.

---

## ⚙️ Simulation Details

- The simulation advances in discrete time steps (`ITER`).
- At each step, the following events may occur:
  - A new customer arrives with a probability `PROBABILITY_NEW_CLIENT`.
  - The number of items per customer is randomly chosen between `1` and `MAX_ITEMS`.
  - Each cashier processes exactly **one item per time step** (if their queue is not empty).

---

## 📦 Project Structure

```plaintext
📁 queue-simulation
│
├── Q1.java            // Contains logic for basic queue simulation
├── Q2.java            // Enhanced simulation with multiple queues (regular/express)
├── Queue.java         // Interface for queue data structure
├── ArrayQueue.java    // Implementation of Queue using arrays
└── README.md
````

---

## 🛠️ How to Run

Make sure you have **Java 17+** installed.

```bash
# Compile all files
javac *.java

# Run simulation (example with Q1)
java Q1

# Or run advanced version (Q2)
java Q2
```

---

## 🧠 Key Concepts

* Interfaces and class implementation in Java
* Simulation and event-driven programming
* Queue data structures (FIFO logic)
* Randomized modeling using `Math.random()` or `Random`
* Discrete time systems

---
## Screenshots: 
<img width="1512" height="460" alt="Screenshot 2025-07-18 at 11 36 53" src="https://github.com/user-attachments/assets/af5154b4-02a8-40e1-b8ff-59be6f12a767" />


## 🚀 Potential Improvements

* Track average wait time per customer
* Add statistics on queue lengths and throughput
* Support multiple express lanes
* Visual output or GUI with JavaFX

---

## 🙋‍♂️ Author

👤 **Saad Mehamdi**
📫 GitHub: [@Saadix-1](https://github.com/Saadix-1)

---

