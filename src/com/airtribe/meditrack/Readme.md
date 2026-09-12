# **Airtribe MediTrack Application**

### **Implemented Packages**
1) constants
2) entity
3) notificationmanagement
4) paymentstrategy
5) util


### Implemented Code OOPs 

1. [x] Encapsulation - All the fields are set private and created getters/setters to set values
2. [x] Inheritance - Implemented for Person class -> Doctor and Patient will be using Person class
3. [x] Overloading - Implemented in Patient search with Id/Name
4. [X] Overriding - Payment strategy will implemented with overriding [payHospitalBill](src/com/airtribe/meditrack/paymentstrategy/UPIPayment.java)
5. [X] Immutable Class - Implemented for Billsummary class
6. [X] Enums - Enums are created for Speciality department and booking Status


### **Application Logics**

1) Patient and Doctor - Search, Create, Update and Delete functionalites created 
2) Appointment - Create Appointment, view Appointment 
3) Billing - Bill objects created and immutable Bill summary class created. Tax will be from the Constants
4) console - Main.java plays as the console ui. 

### **Design Patterns Implemented**

1) Singleton - Implemented for id generator util class
2) Strategy - Implemented for Billing and Payment handling
3) Factory - Implemented for Patient notification management

### **Bonus Features**

1) CSV file creation for patients and doctors
2) Implemented Design Patterns for idgeneration, billing and notification management. 