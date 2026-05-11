# W3D2 Assignment: The Employee Management System

### Your Mission
You are building a multi-file architecture using Inheritance. 
1. Build `Employee.java` as the foundational Superclass. Protect its variables with `private` and build Getters.
2. Build `Manager.java` and make it `extend` Employee. 
3. Use the `super()` keyword to route the manager's name and base salary up to the parent. 

*Hint: Because the Employee's salary is private, the Manager class cannot say `salary + bonus`. It MUST use `getSalary() + bonus`!*
