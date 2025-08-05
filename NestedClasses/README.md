# 🧩 Java Nested Classes

This folder contains code examples demonstrating the different types of **Nested Classes** in Java, including:

1. **Static Nested Class**
2. **Member Inner Class (Non-static Inner Class)**
3. **Local Inner Class**
4. **Anonymous Inner Class**

These examples help understand the scope, accessibility, and usage patterns of nested classes in Java.

---

## 📘 What are Nested Classes?

A nested class is a class defined within another class. It can access members of its enclosing class (depending on its type) and is primarily used for logical grouping and encapsulation.

---

## 🔍 Types of Nested Classes

### 1. 🔹 Static Nested Class
- Declared with the `static` keyword.
- Can access **only static** members of the outer class.
- Does **not need** an instance of the outer class to be created.

```java
static class StaticNested {
    void display() {
        System.out.println("Static nested class: " + x);
    }
}
```

------------------------------------


## 2. 🔸 Member Inner Class (Non-static)
- Has access to all members (static, non-static, private) of the outer class.
- Must be created with an instance of the outer class.

```java
class Inner {
    void display() {
        System.out.println("Inner class: " + x + ", " + y);
        System.out.println("Member Inner Class: " + msg);
    }
}
```

------------------------------------


## 3. 🧷 Local Inner Class
- Declared within a method of the outer class.
- Can access method variables only if they are effectively final.
- Usually used for simple logical encapsulation inside methods.

```java
void outerMethod() {
    int local = 5;
    String name = "Pritam";
    class LocalInner {
        void print() {
            System.out.println("Local Variable: " + local);
            System.out.println("My name is: " + name);
        }
    }
    new LocalInner().print();
}

```

------------------------------------


## 4. 🧨 Anonymous Inner Class
- A class without a name.
- Instantiated and declared at the same time, usually to override methods or provide quick implementation.

```java
Outer.Greetings ob4 = new Outer().new Greetings() {
    void wishes() {
        System.out.println("Hello sir");
    }
};
ob4.wishes();
```

## ▶️ How to Run
Compile and run the Outer.java file:

```java
javac Outer.java
java Outer
```

------------------------------------

## 📌 Output Sample
```text
Static nexted class: 10
Innter class: 10, 15
Member Inner Class: Welcome
Local Variable: 5
My name is: Pritam
Hello sir
```

------------------------------------

## ✅ Covered Topics
- Static Nested Class
- Member Inner Class
- Local Inner Class
- Anonymous Inner Class

Pritam Roy
📁 This is a part of my Java learning series.
