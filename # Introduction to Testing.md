# Introduction to Software Testing

# What is Software?
Software is a collection of programs/routines that help us perform a task. To use a computer (hardware), we need software. To use a phone (hardware), we need software.

## Types of Software
- System Software:
    - Device drivers: software that allows you to use your devices on your computer
        - Mouse driver
        - Keyboard driver
        - Graphics card driver
        - etc.
    - Operating System
- Programming Software:
    - Compilers
    - Debuggers
    - Interpreters
- Application Software:
    - Web applications
    - Console applications
    - Desktop applications
    - Mobile applications
    - Can break down application software into two categories:
        - Frontend: What the user actually utilizes on their own computer
        - Backend: What the server is actually running

# Why Do We Need Testing?
We always want to release a quality product to the customer
- Minimize bugs
- Ensure that the requirements are met

# Error v. Bug v. Failure
- Error: a human mistake
    - Example: a developer incorrectly plans out the logic for a method that checks whether a number is prime or not
- Bug/defect: A mistake that is embedded in the actual code
    - Example: A developer incorrectly writes the algorithm for prime number checking. It compiles fine with no syntax issues, but the algorithm is logically incorrect (ex. an input of 13 returns false)
- Failure: A manifestation of the bug by the end user
    - A user inputs 13 and the application tells the user that 13 is not a prime number

How do we test if the prime number algorithm is correct or not?
- We use our prior knowledge of prime numbers
    - Prime numbers are numbers that can only be divided by themselves or 1
    - Negative numbers are not prime
    - 1 is not prime
    - 2, 3, 5, 7, 11, 13, 17, 19, 23, etc. are prime numbers
    - We can look at extreme examples as well, such as 73939133

- We could then manually test this application out, inputting both prime and non-prime numbers to see if the application gives us the results we would expect

- **Think back to the calculator application**. How would you test if your calculator app was working correctly?

# Software Development Lifecycle
Just as a recap, the SDLC involves 7 phases:
1. Planning phase
2. Requirements phase
3. Analysis phase
4. Design phase
5. Development phase
6. **Testing phase**
7. Deployment + maintenance phase

The testing phase is where "actual testing" happens. But in fact, software testers are involved in all phases in order to catch issues early to prevent them turning into major issues later.

# QA v. QC
QA (Quality Assurance) is describing the activities related to improving/maintaining/adhering to certain processes to ensure quality.

QA is involved with every stage in the SDLC, because it is taking care of the processes. QC on the other hand is involved in the testing phase of the SDLC.

![qa and qc](https://www.softwaretestinghelp.com/wp-content/qa/uploads/2011/09/QA_QC.jpg)

QC (Quality Control) is an example of an activity that helps to ensure quality. QC is part of QA

As a comparison,
- QA has a focus on building quality
- QA prevents bugs
- QA is process oriented
- QC has a focus on testing for qaulity
- QC detects bugs
- QC is product oriented

**QC is inherently reactive**

**QA consists of both proactive and reactive activities**

## Verification and Validation
Verification: (proactive) are we building the right product?
- Focus on documentation
- Review
- Walkthrough
- Inspection

Validation: (reactive) are we building the product correctly?
- Focus on software
- Where "actual testing" occurs
    - Unit
    - Integration
    - System / E2E
    - User Acceptance Tests (UAT)