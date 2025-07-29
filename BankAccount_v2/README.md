# 🏦 Bank Account Interest Calculator (Java OOP Demo)

This Java project demonstrates key **Object-Oriented Programming (OOP)** concepts using a simple banking system with `SavingsAccount` and `CheckingAccount` types. The project showcases:

- ✅ **Polymorphism**
- 🔁 **Method Overriding**
- 🔒 **Final methods**
- 📐 **Abstract class usage (non-abstract in code but concept illustrated)**
- ☑️ **Upcasting**

---

## 📂 Class Structure

```java
abstract class BankAccount
↑
├── SavingsAccount
└── CheckingAccount
```

- **BankAccount**: Base class representing a generic account. Includes:
  - A `balance` field
  - A `final` method `accountType()` that cannot be overridden
  - A method `calculateInterest(rate, time)` for computing interest
  - A `printDetails()` method to print account summary

- **SavingsAccount**: Extends `BankAccount`, overrides `calculateInterest()`, prints account-specific details, and calls the superclass method.

- **CheckingAccount**: Extends `BankAccount`, overrides `calculateInterest()` to return 0 (no interest).

---

## 💡 Key Concepts Demonstrated

### 🔁 Method Overriding
Both child classes override `calculateInterest()` to customize logic for different account types.

### ☑️ Upcasting
```java
BankAccount a1 = new SavingsAccount();  // Upcasting
BankAccount a2 = new CheckingAccount(); // Upcasting
```

### 🔒 Final Method
```java
final String accountType() {
    return "Generic Bank Account";
}
```

### 📘 Inheritance
Common behavior (balance, printing, interest logic) is placed in BankAccount to be reused by child classes.

---

## 🧪 Sample Output
```java
Savings Account Interest Calculated
BankAccount: Balance: 5000.0; Account Type: Generic Bank Account
This is a Savings Account
Interest: 200.0

Checking Account Interest Calculated
BankAccount: Balance: 2000.0; Account Type: Generic Bank Account
This is a Checking Account
Interest: 0.0
```

---

## 🛠 How to Run
Save all the .java files in the same directory.

Compile using:
```bash
javac Main.java
```
Run using:
```bash
java Main
```

## 📎Additional Notes
The base class is marked abstract to prevent direct instantiation.
This is a console-based simulation and is ideal for understanding core Java OOP features.

