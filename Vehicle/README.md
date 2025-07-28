# 🚗 Java Interface Demonstration - Vehicles

This project demonstrates the use of **Interfaces** and **Polymorphism** in Java using a simple Vehicle system.

---

## 🧠 Concepts Covered

- **Interfaces**
  - `Vehicle`: Common contract for all vehicles
  - `ElectricVehicle`: Contract for electric-specific features
- **Polymorphism**
  - An array of `Vehicle` can hold any object that implements `Vehicle`
- **Multiple Interface Implementation**
  - `EVCar` implements both `Vehicle` and `ElectricVehicle`
- **Dynamic Method Dispatch**
  - At runtime, the appropriate implementation is called

---

## 🚙 Class Descriptions

| Class   | Implements                     | Description                           |
|---------|-------------------------------|---------------------------------------|
| `Car`   | `Vehicle`                     | Represents a normal car               |
| `Bike`  | `Vehicle`                     | Represents a motorbike                |
| `EVCar` | `Vehicle`, `ElectricVehicle` | Represents an electric car with battery charging feature |

---

## 💻 How to Compile & Run

1. Save the file as `Main.java`
2. Open terminal or command prompt and navigate to the file directory
3. Compile the code:
   ```bash
   javac Main.java
   ```