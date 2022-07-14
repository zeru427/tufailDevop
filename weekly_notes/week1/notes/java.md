# Java

Java is an Object Oriented Programming language. It was picked up by Oracle, that develops 1 common implementation of the JRE and JDK, and through their (and others) efforts, Java has become very widely used.

## Features/Characteristics

- Object Oriented
- Strongly and Statically Typed
- Leverages Java ByteCode (.class files) to accomplish distribution of Java programs
    - Makes it easier to share/collaborate
- Garbage Collector handles Memory Management for the developer
- The JVM is small, and so can be run on many different platforms
    - Particularly useful for embedded systems (Raspberry Pis)
- Many standard libraries are provided
- Relatively performant
    - Not as fast as C or C++, but faster than most other languages
- As of Java 8, introduced some APIs for Functional Programming

## JVM / JRE / JDK

JDK stands for Java Devlopment Kit

JRE stands for Java Runtime Environment

JVM stands for Java Virtual Machine

JDK contains the JRE, as well as many different developer tools, such as the compiler or the archiver.

JRE contains the JVM as well as supporting libraries that the JVM needs to function.

The Java Compiler is the executable that produces Java ByteCode from Java Source Code (From .java to .class)

The JVM (along with the libraries from the JRE) executes the Java ByteCode.


## Garbage Collection

The Java Garbage Collector is a separate thread that runs alongside your Java program. This is a Deamon Thread, which means it is a long running thread, that will often be "asleep". It will occasionally "wake up" and perform some garbage collection. This means it will find any objects in memory that are no longer being used, and freeing that memory so that other processes can use it again.

System.gc();	//for requesting to invoke

finalize method()

	- object class
	- gc gurantees that whenever they claim the class object, they will call finalize method



## Memory Structure

Memory is separated into 2 regions: The Stack and The Heap.

The Stack is a organized structure that stores information about method/function calls as well as local variables.

The Heap is an unstructured area of memory that stores Objects.


Static variable will get stored - Heap 

Java has 8 primitive datatypes that are NOT objects. These primitive datatypes are generally stored on the stack (if they are local variables).
- int
    - 4 bytes = 32 bits
- double
    - 8 bytes = 64 bits
- byte
    - 1 byte = 8 bits
- boolean
    - 1 byte = 8 bits (sort of)
    - JVM dependent
    - They can potentially be stored in only 1 bit, if many booleans are created
    - Among other optimizations
- char
    - 2 bytes = 16 bits
- long
    - 8 bytes = 64 bits
- float
    - 4 bytes = 32 bits
- short
    - 2 bytes = 16 bits

There is an additional concept of "Reference Variables". These are variables that store the memory address of an object located somewhere in the heap. These Reference variables can be stored on the Stack.

The Stack has "Stack Frames". Each frame is associated with a single function/method call. Any local variables (or parameters) created will be associated with only this stack frame.
When you call/invoke another function, a new stack frame is produced.

## Java Source Code

Syntax for a programming language is quite important. The specific grammer is interpreted another program (the Java Compiler) to produce Java ByteCode. The result of this, is that it is very particular about that grammar. We have certain specialized (reserved) keywords that indicate certain information to the Compiler. Of particular note, is the `class` keyword. Other examples are `public`, `static`, `void`, etc.
A little bit different from grammer/syntax is Naming Conventions. These are specific styles that we (as developers) like to enforce in order to make it easier for other human beings to understand the code. The first example, is having class names that begin with a capital letter. From there, every new word that is part of the name will have another capital letter. Variable names have a similar convention, except that will begin with a lowercase letter. For example, `myString`.

Constructors :
	special method
	will be called automatically whenever you create an instance of that class
	it is used for initialization
	it can be overloaded also
	make the constructor private
	

OOP Concepts indepth:
Abstraction,
Polymorphism,
Encapsulation,
Inheritance


 Abstraction

Data Abstraction is the property by virtue of which only the essential details are displayed to the user. 

 Encapsulation

It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield. 

Inheritence 

Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class. 

Polymorphism

It refers to the ability of OOPs programming languages to differentiate between entities with the same name efficiently.


========

What are the 4 Pillars of OOP in Java and can you give me an example of each
Abstraction is a process of hiding implementation details and exposes only the functionality to the user. In abstraction, we deal with ideas and not events. This means the user will only know “what it does” rather than “how it does”.
Encapsulation

Encapsulation is the process of wrapping code and data together into a single unit.
In order to achieve encapsulation in java follow certain steps as proposed below:

Declare the variables as private
Declare the setters and getters to set and get the variable values

Inheritance is the process of one class inheriting properties and methods from another class in Java. Inheritance is used when we have is-a relationship between objects.  Inheritance in Java is implemented using extends keyword.

Real-life Example:

The planet Earth and Mars inherits the super class Solar System and Solar system inherits the Milky Way Galaxy. So Milky Way Galaxy is the top super class for Class Solar System, Earth and Mars.



Polymorphism is the ability to perform many things in many ways. The word Polymorphism is from two different Greek words- poly and morphs. “Poly” means many, and “Morphs” means forms. So polymorphism means many forms. The polymorphism can be present in the case of inheritance also. The functions behave differently based on the actual implementation.

Real-life Example:

A delivery person delivers items to the user. If it’s a postman he will deliver the letters. If it’s a food delivery boy he will deliver the foods to the user. Like this polymorphism implemented different ways for the delivery function.

Overloading and overriding

Method overloading & Overriding
========================
same name, different arguments in same or child class -overloading
only when there is inheritance same name and same method arguments- overriding 



Serialization- is a process of storing objects in a file. ObjectInputStream and ObjectoutputStream 

String and list out some string methods ?

StringBuilder  is not sync since jdk1.5	- faster
and StringBuffer is synchronized  since 1
----------------------------------------------------


Abstract classes and interface

abstract class						interface
can have abstract and non abstract method			can have only abstract method (default)
							starting jdk1.8 , interfaces can have default and static method too
variables and constants					constants (final)
can have constuctors					not have cons

extends							implements
java does not support multiple inheritance via
classes							multiple inheritance can be implemented via interfaces



JDK1.8
What is functional interface ?							
interface with only one method
can be used with lambdas 
-> 
taking a parameter and returning a value w/o creating a method call.


Exception handling
==============

Super class  of all the exception class : Thorwable

Checked 		vs 	unchecked exception
Exception			 RuntimeException

How do you create custom exceptions in java ?


by extending Exception or RuntimeException
and by creating constructors


Why we use static keyword with variables and classes.	- Chris Powell
Why we use static with main method in java.		- 
- What is the finally keyword? Will a finally block in a try catch block run if both try and catch have return statements
Can you talk about exceptions?
Classpath versus Path.
Ways split a String
is there a specific order on which keywords you use when creating a method.
Can a static method be overridden in Java?
What is the difference between the static and final keywords in Java?
































