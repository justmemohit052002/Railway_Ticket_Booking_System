Railway Ticket Registration System (Console-Based)

<img width="885" height="673" alt="Screenshot 2025-12-02 185823" src="https://github.com/user-attachments/assets/972c0aef-335c-4aca-a62a-e26822fbef14" />

A simple Java console application that allows users to book, cancel, and view railway ticket reservations.
This project demonstrates basic OOP concepts, arrays, custom exceptions, and a menu-driven interface.

📌 Features

Show available seats

Book a seat

Cancel a booked seat

Display all booked tickets

Validate seat numbers

Prevent invalid operations using custom exceptions

-> Modules
Passenger Module

Stores passenger name, age, and seat number

Represents a booked user

-> Seat Module

Manages seat numbers (1–20)

Handles booking, cancellation, and availability

Uses a String[] reservation array to track which seats are taken

-> Train Module

Contains the seat manager

Acts as the main operational unit

-> Exception Module

SeatNotAvailabilityException
Thrown when:

Booking an already booked seat

Entering an invalid seat number

Canceling an empty seat

Main Module

Handles user input

Displays menu

Calls booking/cancellation/display methods

How to Run?

Install Java (JDK 8 or above)

Compile:

javac Main.java


Run:

java Main

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
