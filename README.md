Railway Ticket Registration System (Console-Based)

<img width="885" height="673" alt="Screenshot 2025-12-02 185823" src="https://github.com/user-attachments/assets/972c0aef-335c-4aca-a62a-e26822fbef14" />

A simple Java console application that allows users to book, cancel, and view railway ticket reservations.
This project demonstrates basic OOP concepts, arrays, custom exceptions, and a menu-driven interface.
 ## ✨ Features

✔ **Show Available Seats**  
✔ **Book a Seat**  
✔ **Cancel a Booked Seat**  
✔ **Display All Booked Tickets**  
✔ **Validate Seat Numbers (1–20)**  
✔ **Prevent Invalid Operations Using Custom Exceptions**

---

## 🧩 Modules Overview

### 🔹 Passenger Module
- Stores **name**, **age**, and **seat number**  
- Represents a **ticket holder**

---

### 🔹 Seat Module
- Manages all **20 seats**  
- Handles **booking**, **cancellation**, and **availability checks**  
- Uses a `String[] reservation` array to track booked seats  

---

### 🔹 Train Module
- Contains the **Seat Manager**  
- Acts as the **main operational unit** of the system  

---

### 🔹 Exception Module
**SeatNotAvailabilityException**  
Thrown when:  
- Booking an **already booked seat**  
- Entering an **invalid seat number**  
- Canceling an **empty seat**

---

### 🔹 Main Module
- Displays the **user menu**  
- Handles input  
- Calls booking, cancellation, and ticket display methods  

---

## 🚀 How to Run

### 1️⃣ Install Java (JDK 8 or above)

### 2️⃣ Compile the program:


===============================================
        > RAILWAY TICKET REGISTRATION <        
===============================================
               MAIN MENU OPTIONS              
-----------------------------------------------
   1. Show Available Seats
   2. Book a Seat
   3. Cancel a Seat
   4. Display All Booked Tickets
   5. Exit
-----------------------------------------------
Enter your choice:

👤 Author

Mohit Singh Chouhan
