# 💳 Bank Account System in Java

This project simulates a basic **Banking System** using Java's **Abstract Classes**, **Inheritance**, and **Polymorphism**. It includes two account types: `SavingsAccount` and `CurrentAccount`, both derived from the abstract base class `BankAccount`.

---

## 🧠 Key Concepts Used

- ✅ Abstract Classes & Methods  
- ✅ Method Overriding  
- ✅ Polymorphism via method calls (`super`)  
- ✅ OOP Design using inheritance  

---

## 📂 Class Structure

### `abstract class BankAccount`
- **Fields**:
  - `String accountNumber`
  - `double balance`
- **Abstract Methods**:
  - `deposit(double amount)`
  - `withdraw(double amount)`
- **Concrete Methods**:
  - `display()`: Shows current balance
  - `calculateInterest(rate, time)`: Returns simple interest

### `class SavingsAccount extends BankAccount`
- Implements deposit & withdrawal logic
- Overrides `calculateInterest()` to add ₹100 bonus
- Inherits `display()` method from base class

### `class CurrentAccount extends BankAccount`
- Allows overdraft up to ₹5000 (corrected logic)
- Implements deposit & withdrawal logic

---

## 💻 How to Run

```bash
javac Main.java
java Main
```

## 📌 Notes
Interest Formula Used:

Simple Interest = 𝑃×𝑅×𝑇/100​
 
SavingsAccount adds ₹100 to the interest.

CurrentAccount permits overdraft down to ₹−5000.

## 📎 Sample Method Call

```bash
SavingsAccount ba1 = new SavingsAccount();
ba1.deposit(2000);
ba1.withdraw(500);
System.out.println(ba1.calculateInterest(2, 5));
```