minikube start --driver=virtualbox --no-vtx-check

https://revature.zoom.us/j/7841280666

Day 1

Git	-	https://git-scm.com/download/win
Jdk1.8	-	uninstall any other versions of jdk and install jdk 1.8
IntelliJ	- 	https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC	


Java
==========

JDK	- Java Development Kit
JVM	- Java Virtual machine
JRE	- Java runtime Environment

JDK
	-JVM - 
	-JRE - used to run java applications

JRE	- just run
	JVM


Java is platform independent, it is because of JVM



void main()
{
}

java is case sensitive.
statements must be terminated by semi colon (;)


java - compile the code ( compiler)
1) check for the syntax errors
2) They will generate bytecode	(Hello.java --> Hello.class)


Naming conventions in java
==================

class name must begin with upper case

HelloWorld
Revature
Employee
Customer
Product
String


variables
must start with a lowercase 

helloWorld
hello_world
employeeName

methods
helloWorld()
displayRecord()

final variable
ALL CAPS

AGE
APPLY_AGE

eage
empAge
employeeAge

packages
=============
alllowercase


Modularity
================

main method is a special method which JVM calls

15 minutes
checkUserDetails()
This method must be called before displaying details



packages in java
	benefits of packages
		easy accessible
		maintain
		security
		name conflict

two types of packages
	built in		- java.lang,java.util, java.sql
	user defined
	

	String 	- java.lang	( automatically imported in all java classes)

access specifiers in java


folders

import hr.*;


import hr.Salary;
import hr.Tax;

===================================


hr
	Salary
	Tax	


finance
	Company
	Investors


Write one method in every class and call it in main method

15 minutes 




================================
Can u list Access specifiers in java ?
-------------------------------

public		- least access specifier , ec
private		- most restrictive one
protected		- same package and all child classes (irrespective of package)
default		- same package



10:00 AM EST


https://revature.zoom.us/j/96121243699?pwd=djhsQzJiMnp0VUwvcGZLMmNRb1dQQT09







QC			- 
Quiz	
Coding challenge

=======================
Day 2 agenda
Hardware fundamentals
CPU/Processor/OS
Garbage Collection
Stack & heap


Control Flow statements
if else
switch
nested if else


Primitive data types
	
int 
byte
short
long


float
double

char

boolean



Code structure in java
---------------------------
put your class in file
put your methods in class
put your statements in methods



package day2;

public class ControlFlowDemo {
    
    int num=10;
    int age;
    age = 99;
  
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}



WAP to check the highest number between the three.

num1=981
num2=867
num3=93

The highest number is : num1




15  minutes


Operators
==============
Arithmetic

++
--

+

=
>
<
Logical Operators
		Short circuit
& 		&&
|		||



&
&&

condi1 &	condi2 &	condi3


condi1 && condi2 &&  condi3



num1=10
num2=20

num2=10
num1=9

OUT	-9

num2=9
num1=10

OUT - 9


OUT - 19

Ternary Operator.
age

?:



			


Operators



Constructors
-----------------
	- special method
	- get called automatically whenever you create an object
	- same name as the class name
	- not have any return type, not even void
	- it is used for initialization
	- can be overloaded



public class Customer
{
	String customerName="Ananda";
	public Customer(){
		customerName="Daniel";
	}
	public void changeName(){
		customerName="Andrew";
	}
	public static void main(String args[]){
		Customer cust = new Customer();

		System.out.println(cust.customerName);
	}

}


cust.customerName="Daniel"










Methods and parameters
Order of initialization







Employee

	employeeId
	employeeName


	Create default cons
		employeeId=-1
		employeeName="NA"


	Paramertized cons
		



	Employee e1 = new Employee();
	System.out.println(e1.employeeId);		//-1
	System.out.println(e1.employeeName);	//NA


	Employee e2 = new Employee(181,"Opeyemi");
	System.out.println(e1.employeeId);		//181
	System.out.println(e1.employeeName);	//Opeyemi



static

Num 1 : 11
Num 2 : 19
Num 1 : 100
Num 2 : 200

package day2;
//QC : static keyword in java :
//Ans :The static keyword in Java is used to share the same variable or method of a given class
//The static keyword belongs to the class than an instance of the class.
//Real Time Scenario : count number of objects created
public class StaticDemo {
    int num1=10;
    static int counter=0;
    static int num2=20;
    public void changevalue(){
        num1--;
        num2++;
    }
    public static void changeValueAgain(){
          num2++;
    }
    public static void main(String[] args) {

            StaticDemo d1 = new StaticDemo();
            d1.counter++;
            d1.changevalue();
            StaticDemo d2 = new StaticDemo();
              d2.counter++;
            d2.changevalue();
            StaticDemo.changeValueAgain();
            System.out.println("D1 num1 :"+d1.num1);
            System.out.println("D1 num2 :"+d1.num2);

            System.out.println("D2 num1 :"+d2.num1);
            System.out.println("D2 num2 :"+d2.num2);
            //9 23 9 23

        System.out.println("No of objects created :"+d1.counter);
    }
}




---------------------------------------------------------------------------------

Order of initialization

static block,
 In main
W constructor
instance block
Z constructor
W constructor
instance block
Z constructor



Stack 
function calls
primitive data types (int, double, etc.) and 
local and reference variables of the functions are stored



Heap

object



QC**
Scopes of a variable
======================

instance scope
class scope	-static/global
local scope
block scope




Constuctor
Order of initalization
Overloading
instance scope
class scope	-static/global
local scope
block scope




Product

	productId
	productName
	quantityOnHand
	price


	count number of objects


	* Use initialzer block and static intializer block to initilize the member variables

	* Create default cons to initialize productId=100, productName=Lakme,quantityOnHand=100, price=90

	*Create parametrized cons to assign different product values
		201, Aroma, 900, 899
		
		202, Pendrive , 877, 99

	* create one  to calculate the bill for a product

	int calculatePrice(Product product)
	{	
		//create local variable total
		product.quantityOnHand * product.price;
	}

	

	main()
	{
		Print the bill for all the products

		Aroma : 809100

		Total products : totalNumberOfObjects
	}







Week 1 Java DevOps/SRE (AWS) QC w/Tufail - Auditors (HH/ES)
Wednesday, 5/11/2022
10:30 AM EST



Agenda - Day 3
-----------------------
Review - Constructor
class Employee
{

    public Employee(String name) {
    }

    public Employee() {

    }
}

public class ConstructorDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        //java provides default constructor in every class if no constructor is there
        Employee e2 = new Employee("Daniel");
    }
}


OOPS concepts		**


As the name suggests, Object-Oriented Programming or OOPs refers to languages that uses objects in programming. 

Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc in programming. 



The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function. 


Access Modifier: Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers. 
public: accessible in all class in your application.
protected: accessible within the package in which it is defined and in its subclass(es)(including subclasses declared outside the package)
private: accessible only within the class in which it is defined.
default (declared/defined without using any modifier): accessible within same class and package within which its class is defined.



The return type: The data type of the value returned by the method or void if does not return a value.
Method Name: the rules for field names apply to method names as well, but the convention is a little different.
Parameter list: Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().
Exception list: The exceptions you expect by the method can throw, you can specify these exception(s).
Method body: it is enclosed between braces. The code you need to be executed to perform your intended operations.
Message Passing: Objects communicate with one another by sending and receiving information to each other. A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desired results. Message passing involves specifying the name of the object, the name of the function and the information to be sent.

Now with basic prerequisite to step learning 4 pillar of OOPS is as follows. Let us start with learning about the different characteristics of an Object-Oriented Programming language


Abstraction	- showing only relevant information
Encapsulation	- hiding the irrelavant information
Polymorphism	- many forms . patient
		overloading
Inheritance	- Re usability	, extends

OOPs Concepts are as follows: 

Class
Object 
Method and method passing
Pillars of OOPS
Abstraction
Encapsulation
Inheritance
Polymorphism
Compile-time polymorphism
Run-time polymorphism

---Class
A class is a user defined blueprint or prototype from which objects are created. 
It represents the set of properties or methods that are common to all objects of one type. 
In general, class declarations can include these components, in order: 

Modifiers: A class can be public or has default access (Refer this for details).
Class name: The name should begin with a initial letter (capitalized by convention).
Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body surrounded by braces, { }.

public class Product extends Demo implements Hello,Thanks
{
	int productId;
	
	public void addProduct()
	{
	
	}
}

Object is a basic unit of Object Oriented Programming and represents the real life entities. 
A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of: 

State : It is represented by attributes of an object. It also reflects the properties of an object.
Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
Identity : It gives a unique name to an object and enables one object to interact with other objects.

Method: A method is a collection of statements that perform some specific task and return result to the caller. A method can perform some specific task without returning anything. Methods allow us to reuse the code without retyping the code. In Java, every method must be part of some class which is different from languages like C, C++ and Python. 


Methods are time savers and help us to reuse the code without retyping the code.
Let us now discuss 4 pillars of OOPS:

Pillar 1: Abstraction

Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviours of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.
Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is. 
In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

Pillar 2: Encapsulation

It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield. 

Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
Todo---------------
Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

Pillar 3: Inheritence 

Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class. 

Let us discuss some of frequent used important terminologies:

Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
Sub Class: The class that inherits the other class is known as subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

Pillar 4: Polymorphism

It refers to the ability of OOPs programming languages to differentiate between entities with the same name efficiently. This is done by Java with the help of the signature and declaration of these entities. 

Note: Polymorphism in Java are mainly of 2 types: 

Overloading	- Compile time polymorphism
Overriding 	- Later today - Run time polymorphism
Example


// Java program to Demonstrate Polymorphism
 
// This class will contain
// 3 methods with same name,
// yet the program will
// compile & run successfully
public class Sum {
 
    // Overloaded sum().
    // This sum takes two int parameters
    public int sum(int x, int y)
    {
        return (x + y);
    }
 
    // Overloaded sum().
    // This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
 
    // Overloaded sum().
    // This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }
 
    // Driver code
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}


Arrays
==============

continous memory location

int num1,num2,num3,num4,num5;

int []num = new int[5000];

-subscript starts from 0
num[0]

int marks[] = { 23,78,91,87,65,87,87};

for(int i=0;i<5;i++)
{
	System.out.println(marks[i]);
}


for(int i=0;i<marks.length;i++)
{
	System.out.println(marks[i]);
}


String names[] = new String[5];

names[0] = "Jay";
names[1] = "Daniel";
names[2] = "Richard";
names[3] = "Tarun";
names[4] = "Ahmed";


//TODo - Please print all the names



this keyword in java 
----------------------------
without chaining

###Print product1 details
Product Id :-1
Product Name :NotAvailable
Product QOH :-1
Product Price :-1
###Print product2 details
Product Id :122
Product Name :Lakme
Product QOH :100
Product Price :30
###Print product3 details
Product Id :123
Product Name :Pendrive
Product QOH :0
Product Price :0
###Print product4 details
Product Id :124
Product Name :null
Product QOH :99
Product Price :100

----------------------------------------
###Print product1 details
Product Id :-1
Product Name :NotAvailable
Product QOH :-1
Product Price :-1
###Print product2 details
Product Id :122
Product Name :Lakme
Product QOH :100
Product Price :30
###Print product3 details
Product Id :123
Product Name :Pendrive
Product QOH :-1
Product Price :-1
###Print product4 details
Product Id :124
Product Name :NotAvailable
Product QOH :99
Product Price :100

































Inheritance
-------------------
extends

Employee					super/base/parent
	int employeeId

PermanentEmployee extends Employee

ContractEmployee extends Employee		sub/derived/child/


super

*child class can access parent class resources without creating an object
* super keyword is there to acccess super class methods and variables

Object class

	//Object class is the super class for all the classes in java



	* multiple inheritance is not allowed in java 

	extends Employee,Product


//is- a test

Overrding
===========
In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.



public
private
default
protected



Public, protected,default,private
public, default, protected, private
public, protected, default, private
public,default,protected private.


public
proctected
default
private

* while overriding , you can increase the accessbility, you cannot decrease it




**Difference between overriding and overloading
The difference between overloading is that overloading is when you change the parameters of a method while in the same class and overriding is when you change the implementation of a method in a child class


S.NO	
Method Overloading					Method Overriding



1.	Method overloading is a compile-time polymorphism.	Method overriding is a run-time polymorphism.
3.	It occurs within the class.	It is performed in two classes with inheritance relationships.
4.	Method overloading may or may not require inheritance.	Method overriding always needs inheritance.
5.	In method overloading, methods must have the same name and different signatures.	In method overriding, methods must have the same name and same signature.
6.	In method overloading, the return type can or can not be the same, but we just have to change the parameter.	In method overriding, the return type must be the same or co-variant.


** Can you overload static method ?
Yes,

** Can you override static method ?
No, we cannot override static methods, it is known  as hiding.


what is a co-variant.?

constructor invocation in inheritance

SubOrder static, order static, 0,10,9,15

Order class static block
SubOrder class static block
Order class instance block, i = 0
Order class constructor, i = 10
SubOrder class instance block, j = 9
SubOrder class constructor, j = 15


SubOrder class static block
Order class static block
Order class instance block,i= 0
Order class constructor,i= 10
SubOrder class instance block,j= 9
SubOrder class constructor,j= 15


Order class static block --> Order class instance block --> Order class constructor -->Suborder class static block --> Suborder class instance block --> Suborder class constructor


Order class static block
Suborder class static block
Order class instance block, i=0
Order class constructor, i=10
Suborder class instance block, j=9
Suborder class constructor, j=15

=======

Order class static block 
SubOrder class static block
Order class instance block,i= 0
Order class constructor,i= 10
SubOrder class instance block,j= 9
SubOrder class constructor,j= 15

=================================================================
Method overloading and overiding **

Abstract class
Interface

What is constructor ?
What are the OOPS concepts?
What is inheritance ?
What is static keyword in java ?
What is default constructor ?
What is overriding?
Rules for overriding ?
super and this keyword ?
Difference between overriding and overloading ?


=============Method and Parameters
void
any primivite or any object
public <RT> MN<parameters>
{
}








=









Day4 Agenda



Abstract class 
interfaces
====================

ABSTRACTION
- OOPS - 
Abstract class is a class which contains abstract method.

  *Cannot create an object of abstract class
Abstract is a java modifier applicable for classes and methods in java but not for Variables. 

Abstract can also inherit from an abstract class

*** Interface
==============
pure abstract 
you cannot have non abstract method in an interface
by default all the methods are abstract
by default all the variables are final (constant)


***Difference between abstract class and interface

all methods are abstract in an interface
Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
7) An abstract class can be extended using keyword "extends".	An interface can be implemented using keyword "implements".
8) A Java abstract class can have class members like private, protected, etc.	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}


class -->class		extends
class -> interface		implements
interface --> interface 	extends
interface --> class 		not possible	XX


final keyword
-----------------

class final 	- it cannot be inherited
method final 	- it cannot be overridden
variable final	- it cannot be changed once assigned, 













var-args
---------------
variable arguments
Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.




GC
-----------------------------------------
Garbage collection
c	- malloc		free
c++	- new		delete
java	- new		  X



System.gc();		- request the GC to run

Eligible for GC.

Object class
=============

	finalize method()


The purpose of a finalize() method can be overridden for an object to include the cleanup code or to dispose of the system resources that can be done before the object is garbage collected


** What is the purpose of GC ?
Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program

** Can we call the GC ?
You can call Garbage Collector explicitly, but JVM decides whether to process the call or not



**String

----------------------------------------------------

jdk1.0
** it is immutable (cannot be changed)
--java.lang
--group of characters
--final class
** -- how many ways are there to create string
Two ways to create string

1) String name="Daniel";
2) String name = new String("Richard");

** What is difference between == and equals method .


   //equals     - will check whether the two string values are same or not
        //==        - will check refernce of the two strings



**List out some string methods

Exercise Objective(s): String class, String immutability  

Exercise: Write class that declares the following String.
		“The quick brown fox jumps over the lazy dog”.
Perform the following modifications to the above string using appropriate methods.

1.	Print the character at the 12th index. 

2.	Check whether the String contains the word “is”. 
false		- 
3.	Add the string “and killed it” to the existing string. 

4.	Check whether the String ends with the word “dogs”. 
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.                                
7.	Find the length of the String. 
8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. 
9.	Replace the word “The” with the word “A”. 
10.	Split the above string into two such that two animal names do not come together. 
11.	Print the animal names alone separately from the above string. 
12.	Print the above string in completely lower case. 
13.	Print the above string in completely upper case.
14.	Find the index position of the character “a”. 
15.	Find the last index position of the character “e”. 

Recommended duration: 30 Mins


Solution :

package day4;

public class StringAssignmentSolution {

    public static void main(String[] args) {

        String string = "The quick brown fox jumps over the lazy dog";

        //print char at index 12
        System.out.println(string.charAt(12));
        //add string "and killed it" to existing string
        String string1 = string.concat(" and killed it");
        System.out.println(string1);
        //check weather string is equal to "The quick brown fox jumps over the lazy Dog"
        System.out.println(string.equals("The quick brown fox jumps over the lazy Dog"));
        //check weather string is equal to "THE QUICK BROWN..."
        System.out.println(string.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        //find length of string
        System.out.println(string.length());
        //check weather string matches "The quick.... Dog"
        System.out.println(string=="the quick brown fox jumps over the lazy Dog");
        //replace word "The" with the word "A"
        String string2 = string.replace("The", "A");
        System.out.println(string2);
        //split string into two so
        String[] stringparts = string.split("j");
        String string3 = stringparts[0];
        String string4 = stringparts[1];
        System.out.println(string3 + " - " + string4);
        //print animal names alone
        String string5 = string.substring(15,19);
        String string6 = string.substring(39,43);
        System.out.println(string5 +" - "+ string6);
        //print above string in lower case
        String string7 = string6.toLowerCase();
        System.out.println(string7);
        //print above string in upper case
        String string8 = string7.toUpperCase();
        System.out.println(string8);
        //find index of character a
        System.out.println(string.indexOf('a'));
        //find index of character e
        System.out.println(string.indexOf('e'));
    }
}




Mutable

StringBuffer
	all the methods of string , replace


Length vs capacity


A string buffer or string builder's length is the number of characters it contains; its capacity is the number of character spaces that have been allocated. 


================self study
StringBuilder	- 
StringTokenizer




Object
==============
super class for all the classes in java

finalize
toString
equals
hashCode


wait
notify



Group discussion 

What is an abstract class ? Why we need it ?
What is an interface ?
Difference between interface and abstract class
What is String and some of the methods of string ?
Object class methods
	finalize
	toString
	equals
	hashCode
What is GC ? 
What is the use of final keyword ?





Day 5 
==============

12:00 PM - week1 wrap meeting
https://revature.zoom.us/j/92456091980

Wrapper classes
==================
Why we need it ?
 A Wrapper class is a class whose object wraps or contains primitive data types.

Need of Wrapper Classes

They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).


int	Integer
char	Character
float	Float



byte	1			Byte
short	2			Short
*int	4			Integer
long	8			Long


float	4
*double	8

boolean	false	1

char		2		Character




int num=65;
char p = (char)num;		
sout(p);				//A

byte b = 10;
int num1 = b;



float salary=98.7;

sout(salary+2);




Boxing	-AutoBoxing		-Converting primitive to objects
Unboxing - AutoBoxing		-Converting objects to primitives


Casting
	-Explicit
	-Implicit

Wrapper












Annotations
==============

JDK1.5

Enhanced for loop
AutoBoxing & AutoUnboxing


JDK1.8



Annotations
============
Meta data information
comments

Annotations are used to provide supplemental information about a program. 

Annotations start with ‘@’.
Annotations do not change the action of a compiled program.
Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.
Annotations are not pure comments as they can change the way a program is treated by the compiler.


Two types of annotation :

1) Builtin 
	@Override
	@Deprecated
	.. many many
	@Test
	@Order
	
2) Custom annotation

package day5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Author {
    String authorName();
    String purpose();
    String dateCreated();
}


package day5;
@Author(authorName = "Tufaill", purpose = "demo", dateCreated = "6/5/22")
public class AnnotationDemo {

    int num1;

    @Deprecated
    public void display(){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

    }
}




















Scanner 
==============
- java.util package
- used to take input from keyboard


package day5;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name :");
        name = scanner.next();
        System.out.println("Please enter your age :");
        age = scanner.nextInt();

        System.out.println("Welcome : "+name+ " and your age is :"+age);
    }
}

Exercise : 
WAP to accept five numbers and print the sum of all the positive numbers 


Enter five numbers :

12
12
-9
-7
2

Sum of all the positive numbers are : 26

(Optional) - You have entered 2 negative numbers.

Hint : Arrays, for loop, continue keyword


Exercise : WAP to accept five numbers and print the number of evens and odds and also negative numbers are not allowed.


Enter five numbers :

12
12
-9
	Sorry, Cant continue , because you have entered negative value


Enter five numbers :
12
19
12
88
23


The count of even numbers are :3
The count of odd numbers are :2

Hint : Arrays, for loop, break keyword

numbers[i]%2 == 0


Install Maven	-https://dlcdn.apache.org/maven/maven-3/3.8.5/binaries/apache-maven-3.8.5-bin.zip
Install Postgresql	-https://www.enterprisedb.com/postgresql-tutorial-resources-training?uuid=7c756686-90b4-4909-89ed-043e0705a76e&campaignId=7012J000001BfmaQAC

Install Dweaver
======================



I/O
=============================================


Deals with storing and retrieving data from files.


Input	- Reading


Output	-Write

java.io
		-Reader/Writer				-CharacterStreams(Correct)

InputReader
	FileInputReader
OutputReader
	FileOutputReader
does not support seralization

		-InputStream/OutputStream			- Byte Streams(Correct)
FileInputStream	
FileOutputStream
ObjectInput


File	- java.io package



use case : listing all files in directory

Write a program that creates a new file called BatchMates.txt 
and store it in a directory named Batch. Also list the files 
or subdirectories present in the drive/directory where 
the directory Batch exists, stating if it is a file or directory.

package day5;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        File f1 = new File("h:\\Batch\\BatchMates.txt");
        File f2 = new File("h:\\Batch");
        if(f2.exists() && f2.isDirectory()){
            System.out.println("Folder batch already exists");
        }
        else {
                f2.mkdir();
            System.out.println("Successfully created the folder -Batch");
        }
        System.out.println("Creating BatchMates.txt inside "+f2.getAbsolutePath());
        f1.createNewFile();
    }
}


Enter the file name to copy : h:\\home.txt

1) Not there h:\\ah.txt does not exist, Hence cannot continue

2) Enter the file name to paste : h:\\house.txt

Successfully copied h:\\home.txt to h:\\house.txt


Solution

package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFileSolution {

    public static void main(String[] args) throws IOException {

        //user to input read file and write name ?
        /* Please enter the full file name of the file to be copied
        h:\\ah.txt
            System.exit(0);
            h:\\ah.txt does not exist, Hence cannot continue

            Please enter the full file name where this to be copied
            h:\\jj.txt
         */
        //create complete program
        Scanner input = new Scanner(System.in);

        //1. Asking the user to input read file name
        System.out.println("Please enter the full name of the file to be copied:");
        String file = input.nextLine();
        File readFile = new File(file);

        //2. checking the existence of the read file
        if (!readFile.exists()) {
            //if file is not there , then exiting
            System.out.println("File does not exists, hence cannot continue");
            System.exit(0);
        }else{

            //3. continue
            System.out.println("Please enter the full name of the file to be pasted:");
            String writeFileName = input.nextLine();
            File writeFile = new File(writeFileName);
            FileInputStream readStream = new FileInputStream(readFile);          //byte stream
            FileOutputStream writeStream = new FileOutputStream(writeFile);
            int i = 0;
            while ((i = readStream.read()) != -1) {
                writeStream.write(i);
            }

            //closing the file
            readStream.close();
            writeStream.close();

            System.out.println("Successfully copied");
        }
    }
}





BufferredReader
===============
BufferedInputStream
It buffers the characters so that it can get the efficient reading of characters, arrays, etc.


======================
Object Seralization
	- is a process by which you reading and writing objects to a file.


ObjectInputStream		-read
ObjectOutputStream	-write



Marker interfaces





What is Wrapper class in java ?
What is annotation ?
What is Serilization ?


10 minutes




Week2 
============



Core Java - 

Exception Hanlding
Other topics

Maven

Git

AWS

JDBC

Logback


Day 6
========

Exception handling

Three types of errors 
1) Syntax error	
2) Logical error
3) Runtime errors (Exception Handling)



*Throwable
-	Error
-	Exception


CheckedException	- checked at compile time	- Exception and all its subclasses except RuntimeException		
UncheckedException



Solution:

try
catch
finally




Throwable
	Exception
		RuntimeException




throw	- raise the exception
throws	-throws the exception to the caller,delegate the exception 

------------------------



throw	- bring an exception


Userdefined exception
======================

-sub class exception or runtimexception
- creating constructor and passing the message to the super class

JDK1.7 	- try with resources	- no need to close the resources explicitly





JDK
---

Maven
======
Dependency management tool
used for build process


Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation.



pom.xml
Project Object model
XML file

artifacyid
groupid
version



-- .M2 folder				local repository

mvn repository		- mvnrepository	central repository








JUnit Testing
=================
TDD - Test Driven Development

Why test the code?

Open source testing framework
junit - 5 - also know as jupiter

write test first

Use case : We have to create a calculator

add two numbers

Order Tests
------------------
	Why ?
	How ?

Methods stubs 
@BeforeAll	-static
@AfterAll		-static

@BeforeEach
@AfterEach


@Test is used to signal that the annotated method is a test method.
@Test methods must not be private or static and must not return a value.



Calculator.java

package day6;

public class Calculator {

    public int sum(int num1,int num2){
        return num1+num2;
    }

    public int multiply(int num1, int num2) {
            return num1*num2;
    }
}


CalculatorTest.java

import day6.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest2 {

    Calculator calc;
    int expected =0;
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Welcome to Calculator Test");

    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Congratulations your tests completed.");
    }
    @BeforeEach
    public  void setUp(){
        calc = new Calculator();
        expected = 20;
        System.out.println("before each");
    }
    @AfterEach
    public  void tearDown(){
        calc= null;
        expected =0;
        System.out.println("after each");
    }
    @Test
    @DisplayName("Testing sum with two whole numbers - 2nd")
    @Order(2)
    public void testCalculatorSum1(){
        System.out.println("testCalculatorSum1 called");
              int actual =   calc.sum(10,10);
              assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and zero - 3rd")
    @Order(3)
    public void testCalculatorSum2(){
        System.out.println("testCalculatorSum2 called");
        int actual =   calc.sum(20,0);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and negative number - 1st")
    @Order(1)
    public void testCalculatorSum3(){
        System.out.println("testCalculatorSum3 called");
        int actual =   calc.sum(30,-10);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing multiply with two whole numbers ")
    @Order(4)
    public void testCalculatormultiply1(){
        System.out.println("testCalculatorMultiply1 called");
        int actual =   calc.multiply(10,2);
        assertEquals(expected,actual);
    }
}



Testing Exception
===================Hands-on 
Create two test cases to check the divide method.

calc.divide(40,2);



calc.divide(40,0);		-	ArithmeticException




15 minutes(4:55 PM EST)

Solution :

import Week2Day1.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)

public class CalculatorTest {
    Calculator calc;
    int expected = 0;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Welcome to the Calculator Test");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Thank you for using Calculator Test");
    }

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
        expected = 20;
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown(){
        calc = null;
        expected = 0;
    }

    // Testing
    @Test
    @DisplayName("Subtraction Test1")
    @Order(4)
    public void testCalculatorDifference(){
        int actual = calc.subtract(22, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtraction Test2")
    @Order(5)
    public void testCalculatorDifference2(){
        int actual = calc.subtract(40, 20);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtraction Test3")
    @Order(6)
    public void testCalculatorDifference3(){
        int actual = calc.subtract(19, -1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Addition Test1")
    @Order(1)
    public void testCalculator(){
        int actual = calc.add(18, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Addition Test2")
    @Order(2)
    public void testCalculator2(){
        int actual = calc.add(22, -2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Addition Test3")
    @Order(3)
    public void testCalculator3(){
        int actual = calc.add(20, 0);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication Test1")
    @Order(7)
    public void testCalculatorMultiplyTest1(){
        int actual = calc.multiply(20, 1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication Test2")
    @Order(8)
    public void testCalculatorMultiplyTest2(){
        int actual = calc.multiply(10, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication Test3")
    @Order(9)
    public void testCalculatorMultiplyTest3(){
        int actual = calc.multiply(5, 4);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing convert to numbers \"20\" ")
    @Order(12)
    public void testConvertNumbers1(){
        System.out.println("testConvertNumbers1 called");
        int actual =   calc.convertToNumber("20");
        assertEquals(expected,actual);
    }

    //Handle exception in junit
    @Test
    @DisplayName("Testing convert to numbers \"Twenty\" ")
    @Order(13)
    public void testConvertNumbers2(){
        System.out.println("testConvertNumbers2 called");
        assertThrows(NumberFormatException.class, () -> {
            int actual =   calc.convertToNumber("Twenty");
            assertEquals(expected,actual);
        });
    }

    @Test
    @DisplayName("Division Test1")
    @Order(10)
    public void testCalculatorDivideTest1(){
        int actual = calc.divide(40, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Division Test2")
    @Order(11)
    public void testCalculatorDivideTest2(){
        System.out.println("divideTest2 called");
        assertThrows(ArithmeticException.class, () -> {
            int actual = calc.divide(40, 0);
            assertEquals(expected, actual);
        });
    }

}




=======================


Quiz has been assigned.







Group Discussion ?

What is exception handling ?
What is try /catch and finally block ?
**what is the difference between throw and throws
why we need custom exception?
**How to create custom  exception ?

** What is junit ?
How to write test in junit?
List some junit annotations and usage?














































. "Collections" is?
1534
QUESTION TYPE:Best Choice
DON'T EVALUATE:NO
STICKY:NO
TAGS:Core JavaJava Collections
CATEGORY:Java
SCORE:1
ANSWER OPTION(S):
NO	TEXT	CORRECT ANSWER?
1	
The interface that all java collections implement

NO
2	
A class filled with static methods used to manipulate collections

YES

---------

43. Which interface does not extend the Collection interface?
1535
QUESTION TYPE:Best Choice
DON'T EVALUATE:NO
STICKY:NO
TAGS:Core JavaJava Collections
CATEGORY:Java
SCORE:1
ANSWER OPTION(S):
NO	TEXT	CORRECT ANSWER?
1	
List

NO
2	
Set

NO
3	
Queue

NO
4	
Map

YES

**Details of collections later


Written Evalutaion	- Quiz

Day 7

Git
AWS
Unix


Any questions ?

Git 
-----------









Tom,Dick, Harry,Ahmed,Elisa

---------------------------------------
Day 1
	create controller
Day 2	
	update the code in controller by Tom





git commands
=============
git init	- 	create en empty local repository



  git config --global user.name "Tufail Ahmed"


git config --global user.email "tufailahmedkhan@gmail.com"



README.md	- welcome file of your repository


 git status

 git add .			-- add all the files

git commit -m "message"

git push



how can we add only one file
git add bye.txt
git add 


Create a repository named revature and put README.md in local as well as central repo
Create welcome.txt and write some message.
commit the changes in local and then in central repository







equals() vs ==?
equals 	- values				true
==	- reference of the two objects	false

String str1="Git";
String str2= new String("Git");



-----------------
Branching
rebase
merge


git init
git add .
git commit -m "message"
git push

README.md	-


tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (jayden)
$ git branch daniel

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (jayden)
$ git checkout daniel
Switched to branch 'daniel'

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
$ git add JDBCDemo1.java

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
$ git commit -m "daniel finished his task"
[daniel 935a7f3] daniel finished his task
 1 file changed, 8 insertions(+)
 create mode 100644 JDBCDemo1.java

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
$ git push origin daniel
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 459 bytes | 459.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote:
remote: Create a pull request for 'daniel' on GitHub by visiting:
remote:      https://github.com/tufailahm/DMS/pull/new/daniel
remote:
To https://github.com/tufailahm/DMS.git
 * [new branch]      daniel -> daniel

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
**	Create four branches - java,sql,docker,jenkins and push one file in each of these branch.




Merging
=============
**master branch will always have production ready code
java
	- AbstractClassDemo.java


AWS
==============
Amazon Web Services

What ?


ShoppingApp

security
db

Linux/Unix
DB				- RDS

Virtual machine	/ installation



Use case : For learning UNIX, we need a linux machine. 
Solution : You can create EC2 instances

EC2- Ubuntu	- 54.90.196.239		/keypair-downloads
		- 52.90.1.81		/devops2

Putty - remote servers

===================ec2 INSTANCES for windows machine

54.82.66.212
172.31.16.58


Administrator
Ssz24Rm5GtHLi.8%i6y)g;h4@eVbL4k)
Ssz24Rm5GtHLi.8%i6y)g;h4@eVbL4k)

Second Windows
User name	Administrator
Password	
rqahBVXv3NC7)$!ds!S@wnO9hXxOh(qc


Unix
==================
O.S
most popular alongwith windows
Linux


Unix File system

/

	bin

	dev

	home

		ubuntu

			sql/

			jenkins

	etc

	..
	
	..


Absolute path	- doesnt require where are you
	
	cp

Relative Path


Day 8
============

Unix
SQL = Postgresql


54.87.50.42

Permission in UNIX
----------------------------

users/owner
group
others

read
write
execute

U   G   O
rwxrwxr-x

  U   G  O
-rw-rw-r--

chmod +	- grant
           -  - revoke


chmod ugo-rwx records.txt

Numberic :

4	- read
2	- write
1	- execute

chmod 000 records.txt	- 	remove all the permissions
chmod 777 records.txt	- 	grant all the permissions to everyone
chmod 745 records.txt	- 	-rwxr--r-x 

Use case : -rw--w---x

chmod  621 records.txt


--wxrw-r-x		??

chmod 365	records.txt	


chmod ug+rw records.txt

User management 

tufail - U
daniel - G
richard - O

group : (hr) - tufail,daniel

tufail:)  hello.txt

/etc/passwd
/etc/group




 sudo useradd tufail		-- Add a user


 sudo passwd ahmed		- change password

 su tufail				- switch user


whoami

 sudo userdel ahmed		- delete



ubuntu@ip-172-31-20-106:~$ sudo groupadd software
ubuntu@ip-172-31-20-106:~$ sudo useradd -g software mohammad
ubuntu@ip-172-31-20-106:~$ sudo usermod -Gsoftware tufail
ubuntu@ip-172-31-20-106:~$ id software
id: ‘software’: no such user
ubuntu@ip-172-31-20-106:~$ id tufail
uid=1001(tufail) gid=1001(tufail) groups=1001(tufail),1002(software)
ubuntu@ip-172-31-20-106:~$ id mohammad
uid=1002(mohammad) gid=1002(software) groups=1002(software)




richard
daniel
mohan
trump

groups
hr
	daniel
	mohan

software
	richard
	trump


* please remove mohan from the user list


Editors
----------------
vi
pico

Shell Scripting
=============
	- programming techniques
	- set of statements






SQL
----------
Postgres

DBeaver - Universal sql commands - Great UI 


https://dbeaver.io/files/dbeaver-ce-latest-x86_64-setup.exe

https://github.com/tufailahm/devops/blob/master/db_scripts.zip


Todo 

**Stack & Heap




Day 9
=============

SQL 
*SQL Queries

Structurted Query Language



https://github.com/tufailahm/devops/blob/master/sql_ppt.zip

https://github.com/tufailahm/devops/blob/master/db_scripts.zip
**sub languages
** DQL - 	select
** DML - insert , delete , update
** DDL - create,alter,drop,truncate
** DCL - grant, revoke
** TCL - commit, rollback , savepoint


** Joins
** Subqueries
** Set operators
** Procedures


select is a command by which retrieve the data.

select first_name as "First Name" ,salary ,manager_id  from employees e ;

select * from employees e  where salary > 30000 ;

--AND,OR,NOT, IN, NOT IN , NULL, BETWEEN
select * from employees e  where salary > 30000 ;
select * from employees e  where salary > 10000 and manager_id = 110 ;
select * from employees e  where salary > 10000 OR manager_id = 110 ;
select * from employees e  where salary between 10000 and 20000;
select * from employees e  where job_id = 'IT_PROG'
--wild card % AND _ - like 
select * from employees e  where first_name = 'A%'	-- will not work because of =
select * from employees e  where first_name like  'A%'	-- will work because of like
select * from employees e  where first_name like  'T%'	-- will work because of like

select * from employees e  where first_name like  '_a%'	-- 

select * from employees e  where first_name like  '%a%'	

--hands on - list out all the names of employees that ends with a
--??

--using or 
select * from employees e  where job_id = 'IT_PROG' or job_id = 'AD_PRES' or job_id = 'PU_CLERK'

--using in
select * from employees e  where job_id in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

select * from employees e  where job_id not in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

--print all the employees who have not been allocated to a manager
select * from employees e  where manager_id  is null;

--hands on - list out all the names of employees that ends with a
-- print first_name,salary of all the employees who reports to manager 103
-- print all the employees who is getting salary more than 10,000 and also works in department 60
-- print all the employees whose last name starts with L
-- print all the employees (first_name,hire_date) who got hired after 25-06-05



Functions
===========

Aggregate functions 	- sum,max,min,avg,count

*** Group By clause

--Find max salary in each department
select department_id, max(salary) from employees;


group by clause - The SQL GROUP BY clause is used in collaboration with the SELECT statement to arrange identical data into groups. 
having clause - can be used only with group by and it is used to restrict the data in group by clause for aggregate functions.
The HAVING clause was added to SQL because the WHERE keyword cannot be used with aggregate functions


========Joins in SQL====================

employees	departments
first_name	, department_name

Neena		 Executive

Joins are used to display the data from more than one table using a join condition.

A JOIN clause is used to combine rows from two or more tables, based on a related column between them


Natural


Equi/Inner/Normal Join
select first_name, salary, d.department_name , l.city from employees e join departments d 
on e.department_id = d.department_id 
join locations l on d.location_id = l.location_id;


** Difference between inner join and outer join


* 
 * Inner Join: Returns only the rows that are common in both tables.
 * Outer Joins: 
 * 			   Full Outer Join:  Returns all rows from both tables.
 *             Left Outer Join:  Returns all rows from the left table plus the rows that the right table have in common.
 *             Right Outer Join: Returns all rows from the left table plus the rows that the right table have in common.
 * Self Join:  A self-join is a regular join that joins a table to itself. 
 *             In practice, we typically use a self join to compare rows within the same table.
 *             To form a self-join, you specify the same table twice with different table aliases and provide the join 
 *             predicate after the ON keyword.
 */


-- find all the information about employees
select * from employees e 

select * from departments d 

select * from jobs

select * from locations l 

select * from countries c 

--WHERE 
-- *

select first_name as "First Name" ,salary ,manager_id  from employees e ;

select * from employees e  where salary > 30000 ;

--AND,OR,NOT, IN, NOT IN , NULL, BETWEEN
select * from employees e  where salary > 30000 ;
select * from employees e  where salary > 10000 and manager_id = 110 ;
select * from employees e  where salary > 10000 OR manager_id = 110 ;
select * from employees e  where salary between 10000 and 20000;
select * from employees e  where job_id = 'IT_PROG'
--wild card % AND _ - like 
select * from employees e  where first_name = 'A%'	-- will not work because of =
select * from employees e  where first_name like  'A%'	-- will work because of like
select * from employees e  where first_name like  'T%'	-- will work because of like

select * from employees e  where first_name like  '_a%'	-- 

select * from employees e  where first_name like  '%a%'	

--hands on - list out all the names of employees that ends with a
--??

--using or 
select * from employees e  where job_id = 'IT_PROG' or job_id = 'AD_PRES' or job_id = 'PU_CLERK'

--using in
select * from employees e  where job_id in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

select * from employees e  where job_id not in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

--print all the employees who have not been allocated to a manager
select * from employees e  where manager_id  is null;

--hands on - list out all the names of employees that ends with a

--hands on - list out all the names of employees that ends with a
select * from employees e where first_name like '%a';	--ends with a


-- print first_name,salary of all the employees who reports to manager 103
-- print all the employees who is getting salary more than 10,000 and also works in department 60
-- print all the employees whose last name starts with L
-- print all the employees (first_name,hire_date) who got hired after 25-06-05

--print first)name and salary of employees who report to manager 103
select first_name as "First Name", salary from employees e where manager_id = 103;

--print all the employees who has salary more than 10000 and works in dept 60
select * from employees e where salary > 10000 and department_id = 60;

--print all the employees whose last name starts with L
select * from employees e where last_name like 'L%';

--print all employees (first_name, hire_date) who got hired after 25-06-05
select first_name as "First Name", hire_date from employees e where hire_date >= '25-06-05';

**--distinct

select distinct department_id  from employees e 


select column_name, data_type, character_maximum_length, column_default, is_nullable
from INFORMATION_SCHEMA.COLUMNS where table_name = 'employees'

** --sorting - order by 
select first_name ,salary , salary *12 AnnualSalary from employees e 
order by AnnualSalary desc ;

select first_name ,salary  from employees e 
order by salary,first_name ;


select first_name ,salary  from employees e 
order by 1;


=========================
--WAQ to sort the employees based on  hire date

----functions 
select upper('Tufail') 
select lower('AHMED')
select substring('ahmed',2,4) 

select * from employees e where lower(first_name) = 'steven';
select * from employees e where upper(first_name) = 'NEENA';

select upper(first_name) from employees e ;




==========
WAQ to print like this

select  *from  employees e ;

STEVEN SALARY IS 24000 $US
NEENA SALARY IS 17000 $US

select upper(concat(first_name,' salary is ',salary,' $us')) from employees e 


select * from employees e ;

---------Date functions

select hire_date-CURRENT_DATE  from employees e ;

select  to_date('12/05/2009') - hire_date from employees e ;

SELECT AGE(timestamp '2001-04-10', timestamp '1957-06-13');

SELECT CURRENT_TIME;

  SELECT DATEDIFF(to_date(hire_date), CURRENT_DATE) from employees e 
  
 --- To Fix 

  
 --Aggregate functions
  
  select count(*) from employees e ;
  
   select count(commission_pct) from employees e ;
   
  select max(salary),min(salary),avg(salary), sum(salary) from employees e ;
 
 select max(first_name) from employees e
  select min(first_name) from employees e
 select max(hire_date) from employees e 
 
 
 ---WAQ to count how many unique departments are there ?

 
 select count(distinct department_id) from employees e ;

  select distinct department_id from employees e ;
 
 

--Find max salary in each department
select department_id, max(salary) from employees
group by department_id
order by department_id 

-- Count number of employees reporting to each manager
select manager_id , count(employee_id) from employees e 
group by manager_id order by manager_id ;


--Count the number of employees working in each department 
select department_id , count(employee_id) from employees e 
group by department_id 
order by department_id 


-- Count number of employees reporting to each manager and display only details of managers 
-- who are having more than 10 employees report to them
--** ggregate functions are not allowed in WHERE
select manager_id , count(employee_id) from employees e 
where count(employee_id) > 10
group by manager_id order by manager_id ;

--Solution is us having clause

select manager_id , count(employee_id) from employees e 
group by manager_id 
having count(employee_id) > 7
order by manager_id ;


----Joins
select * from employees e 

select * from departments d 

--NATURAL JOIN

select first_name,department_name from employees e natural join departments d  

select department_name, city from departments d2  natural join locations l 

--using

select e.first_name ,e.employee_id ,e.salary ,d.department_name from employees e join departments d 
using (department_id)

--on
-- List all the managers department 
select e.first_name ,e.employee_id ,e.salary ,d.department_name from employees e join departments d 
on (e.employee_id = d.manager_id)


-- WAQ to display first_name,salary ,department_name, city
--Three way joins
 select first_name, salary, department_name, city from employees e join departments d 
using (department_id)
join locations l
using (location_id) ;


select first_name, salary, department_name, city from employees e 
join departments d on e.employee_id = d.manager_id  
join locations l on l.location_id = d.location_id 
and (d.manager_id = 149)
order by salary desc;

--self join

self join

select * from employees e 

Neena reports to Steven
Bruce reports to Alexander

select employee.first_name || ' reports to ' || manager.first_name 
from employees employee join employees manager
on manager.employee_id  = employee .manager_id  


---Inner Join

select first_name, salary, department_name, city from employees e 
join departments d on e.department_id = d.department_id
join locations l on l.location_id = d.location_id 		//106


//employees who does not belong to any department is not showing up in inner join

//departments which does not have any employee is also not showing up in inner join


---Outer join 
select *from employees e where department_id is null;
select *from departments d  where manager_id  is null;

--left
select first_name, salary, department_name from employees e 
left outer join departments d on e.department_id = d.department_id



--right 
select first_name, salary, department_name from employees e 
right outer join departments d on e.department_id = d.department_id

--full
select first_name, salary, department_name from employees e 
full outer join departments d on e.department_id = d.department_id

--------sub query

--who is getting better salary than Neena

select first_name from employees e where salary > 17000

select salary from employees e where first_name = 'Neena'

--subquery
select first_name from employees e where salary > ( select salary from employees e where first_name = 'Neena')

--find out the name of the person who has been hired on the same date neena was hired



select first_name from employees e where hire_date  = (select hire_date  from employees e where first_name = 'Neena')

--: more than one row returned by a subquery used as an expression
select first_name from employees e where hire_date  IN (select hire_date  from employees e where first_name = 'Alexander')


select * from employees e 

-- GET ME THE NAME/s of the employee/s who works in same job_id as Lex
select first_name from employees e where job_id in (select job_id from employees e where first_name = 'Lex')

-- get the details of the employee who is getting maximum salary
select * from employees e where salary = (select max(salary) from employees e);



---SET Operators
create table retired_employees
as
select * from employees e  where employee_id in (108,109,110,111,112)

delete from employees where employee_id in (108,109);

employees		not find 108,109
retured_employees	not find 100 and others 
but common 110,111,112 

select count(*) from employees e 				//107
select count(*) from retired_employees e 		//5


---union
select * from employees
union
select * from retired_employees	

---union all
select * from employees
union all
select * from retired_employees	


---insersect		-- only common datas
select * from employees
intersect
select * from retired_employees	

--minus is not supported in postgres











ToDo

	Person p = new Employee();
		
		Object o = p; // Up-Casting
		// Moving our reference variable UP the inheritance tree
		
		Employee e = (Employee) o; // Down-Casting
		// Moving our reference variable DOWN the inheritance tree
		// Potentially dangerous
		
//		Zoo z2 = (Zoo) o;
		
		// The instanceof operator will return true if the object IS-A instance of the Class
		// Then the down-cast would be safe
		if(o instanceof Zoo) {
			Zoo z2 = (Zoo) o;
		}


Reference links :

## Useful Links
* [Git Cheat Sheet](https://www.git-tower.com/blog/git-cheat-sheet)
* [Git Basics](https://youtu.be/0fKg7e37bQE)
* [Git Team Basics](https://youtu.be/oFYyTZwMyAg)
* [Hacker Rank](https://www.hackerrank.com)
  * Good source of practice. Use it often for practice.


Day 10
---------------

SQL - DDL, TCL, DML

JDBC

Design Patterns
	- Creational
	- Singleton



----------Transaction
Unit of work	

insert into emp	
update salary
update pf
updates tax

**ACID -A transaction is a single logical unit of work that accesses and possibly modifies the contents of a database. Transactions access data using read and write operations. 
Atomicity	- Either everything should be done or none
Consistency - 
Isolation
Durability


-------
commit
rollback
savepoint

Isloation Levels
-------------------

Dirty Read – A Dirty read is a situation when a transaction reads data that has not yet been committed.
 For example, Let’s say transaction 1 updates a row and leaves it uncommitted, meanwhile, Transaction 2 reads the updated row. If transaction 1 rolls back the change, transaction 2 will have read data that is considered never to have existed.

Non Repeatable read – Non Repeatable read occurs when a transaction reads the same row twice and gets a different value each time. For example, suppose transaction T1 reads data. Due to concurrency, another transaction T2 updates the same data and commit, Now if transaction T1 rereads the same data, it will retrieve a different value.


Phantom Read – Phantom Read occurs when two same queries are executed, but the rows retrieved by the two, are different. For example, suppose transaction T1 retrieves a set of rows that satisfy some search criteria.
 Now, Transaction T2 generates some new rows that match the search criteria for transaction T1. If transaction T1 re-executes the statement that reads the rows, it gets a different set of rows this time.

Based on these phenomena, The SQL standard defines four isolation levels : 

 

Read Uncommitted – Read Uncommitted is the lowest isolation level.
 In this level, one transaction may read not yet committed changes made by other transactions, thereby allowing dirty reads. 
At this level, transactions are not isolated from each other.


Read Committed – This isolation level guarantees that any data read is committed at the moment it is read.
 Thus it does not allow dirty read. The transaction holds a read or write lock on the current row, and thus prevents other transactions from reading, updating, or deleting it.

Repeatable Read – This is the most restrictive isolation level. The transaction holds read locks on all rows it references and writes locks on referenced rows for update and delete actions. Since other transactions cannot read, update or delete these rows, consequently it avoids non-repeatable read.


Serializable – This is the highest isolation level. A serializable execution is guaranteed to be serializable. Serializable execution is defined to be an execution of operations in which concurrently executing transactions appears to be serially executing.





Constraints

PK
FK	- Referential Integrity
Check
default


Composite Key
------------------
ProductId	 	scancode
1		1
1		2

--------Tow ways to create constraints
Column Level
Table level



Next QC : Week2 contents - Tue 5/17/2022 11:00 AM - 1:00 AM


--Referential Integrity

**Referential integrity refers to the relationship between tables. Because each table in a database must have a primary key, this primary key can appear in other tables because of its relationship to data within those tables. When a primary key from one table appears in another table, it is called a foreign key .

-- FK 

Student
	studentId		studentName   	courseId
	101		Ahmed		3
	102		Mohammad	190		XX	

Course
	courseId		courseName
	1		Java
	2		Docker
	3		AWS



---------------

Movie
	movieId
	movieName
	directorId


Director

	directorId
	directorName
	directorSpeciality


script1.sql

DROP TABLE IF EXISTS public.users CASCADE;
-- Completely remove the users table, regardless of any rlationships
-- Without the CASCADE keyword, this DROP statement would fail
-- if there were any relationships that needed to be upheld
-- Such as Foreign Keys

-- CASCADE operations are VERY dangerous and couble be very large scale
-- DO NOT do this on ANY database that you are concerned about maintaining data on

CREATE TABLE public.users (
	-- We list our columns along with their types
	-- Along with any constraints
	-- column_name DATATYPE CONSTRAINTS
	id SERIAL PRIMARY KEY,
	-- the SERIAL datatype is a type in postgres specifically
	-- that provides auto-incrementing for our primary keys
	-- This means that when inserting a new record, we can ignore
	-- inserting a value for the primary key, and it will be
	-- generated for us
	-- Aside from that, it is effectively just an INTEGER
	first_name VARCHAR (2000) NOT NULL CHECK (LENGTH(first_name) > 0),
	last_name VARCHAR (2000) NOT NULL CHECK (LENGTH(last_name) > 0),
	email VARCHAR (250) UNIQUE,
	age INTEGER NOT NULL DEFAULT 0 CHECK (age >= 0),
	supervisor INTEGER
);

ALTER TABLE public.users
	ADD CONSTRAINT users_supervisor_fk
	FOREIGN KEY (supervisor) REFERENCES users (id);
-- ALTER TABLE schema.table
--	ADD CONSTRAINT constraint_name
--  CONSTRAINT_TYPE (column) [REFERENCES table (column)]

/*
This is a multi-line
comment
*/

DROP TABLE IF EXISTS public.phonenumbers CASCADE;

CREATE TABLE public.phonenumbers (
	id SERIAL PRIMARY KEY,
	user_id INTEGER NOT NULL REFERENCES public.users (id),
	home VARCHAR (20),
	mobile VARCHAR (20),
	work VARCHAR (20)
);

DROP SCHEMA IF EXISTS project0 CASCADE;

CREATE SCHEMA project0;

DROP TABLE IF EXISTS public.accounts CASCADE;

CREATE TABLE accounts (
	id SERIAL PRIMARY KEY,
	owner_id INTEGER NOT NULL REFERENCES users (id),
	balance NUMERIC (40, 2) NOT NULL DEFAULT 0
);

INSERT INTO public.users (first_name, last_name) VALUES ('Matthew', 'Oberlies');

SELECT first_name, last_name FROM users;

SELECT * FROM users;

-- You can construct custom columns from the columns within the tables
-- The || is performing string concatenation
-- Can use the AS keyword as an alias
SELECT first_name || ' ' || last_name AS full_name FROM users;

INSERT INTO public.accounts (owner_id) VALUES (1);

INSERT INTO public.users (first_name, last_name) VALUES ('Jared', 'Malkin');

INSERT INTO public.accounts (owner_id, balance) VALUES (2, 3);

INSERT INTO public.users (first_name, last_name) VALUES ('Fatima', 'Melgar');

SELECT * FROM public.users INNER JOIN public.accounts
	ON public.users.id = public.accounts.owner_id;

SELECT first_name || ' ' || last_name AS full_name, balance FROM public.users INNER JOIN public.accounts
	ON public.users.id = public.accounts.owner_id;

SELECT public.accounts.id AS account_id, public.users.id AS user_id, balance FROM public.users INNER JOIN public.accounts
	ON public.users.id = public.accounts.owner_id;

-- You can nest SELECT statements by creating sub-queries
-- This has a lot of useful use-cases
-- However, you must be careful about ambiguity
SELECT sub1.user_id AS user_id, sub1.balance FROM
	(SELECT public.accounts.id AS account_id, public.users.id AS user_id, balance FROM public.users INNER JOIN public.accounts
		ON public.users.id = public.accounts.owner_id) AS sub1;

SELECT * FROM (
	SELECT public.accounts.id AS account_id, public.users.id AS user_id, balance FROM public.users INNER JOIN public.accounts
			ON public.users.id = public.accounts.owner_id) AS sub1
	WHERE sub1.balance > 0;

-- WHERE
-- ORDER BY
-- GROUP BY
-- HAVING
-- LIMIT
-- HAVING and WHERE are almost the exact same clause
-- The difference is that WHERE applies the filter BEFORE data is grouped
-- And HAVING applies the filter AFTER the data is grouped

DROP TABLE IF EXISTS one CASCADE;
DROP TABLE IF EXISTS two CASCADE;

CREATE TABLE one (
	one INTEGER PRIMARY KEY,
	two INTEGER
);

CREATE TABLE two (
	one INTEGER PRIMARY KEY,
	two INTEGER
);

INSERT INTO one VALUES (1, 1), (2, 2);
INSERT INTO two VALUES (1, 1), (2, 1);

-- All SET operations only operate on results that have
-- the same number and type of columns

-- The UNION operator will combine all results together
-- However, it will not include duplicates
SELECT * FROM public.one UNION SELECT * FROM public.two;

-- UNION ALL does include duplicates
SELECT * FROM public.one UNION ALL SELECT * FROM public.two;

-- INTERSECT will only include matching results
SELECT * FROM public.one INTERSECT SELECT * FROM public.two;

-- EXCEPT will keep results from the left view, and remove any matching
-- results that came from the right
SELECT * FROM public.one EXCEPT SELECT * FROM public.two;

-- SQL supports scalar and aggregate functions that can be used
-- along with SELECT statements

-- Scalar functions are functions that operate on only a single input
-- and produce 1 output for each input
-- e.g UPPER, LOWER, TRIM, SIN, COS, TAN

-- Aggregate functions are functions that operate on an entire column as input
-- and produce 1 output for all inputs
-- e.g SUM, AVG, etc

SELECT SIN(one) FROM one;

SELECT SUM(one) FROM two;

SELECT AVG(LENGTH(first_name)) FROM users;

SELECT AVG(LENGTH(last_name)) FROM users;

INSERT INTO public.users (first_name, last_name, age) VALUES ('Rubeus', 'Hagrid', 33);

SELECT age, AVG(LENGTH(first_name)) AS first_name_length_avg FROM users GROUP BY age;

-- The below query does not work, since we must either group by id OR use id in an aggregate function
SELECT id, age, AVG(LENGTH(last_name)) AS last_name_length_avg FROM users GROUP BY age;



scrip1.sql

DROP TYPE IF EXISTS project0.role CASCADE;
CREATE TYPE project0.role AS ENUM ('Admin', 'Employee', 'Customer');

DROP TABLE IF EXISTS project0.users CASCADE;
CREATE TABLE project0.users (
	id SERIAL PRIMARY KEY,
	username VARCHAR (250) UNIQUE NOT NULL,
	password VARCHAR (250) NOT NULL,
	role project0.ROLE NOT NULL
);

DROP TABLE IF EXISTS project0.accounts CASCADE;
CREATE TABLE project0.accounts (
	id SERIAL PRIMARY KEY,
	balance NUMERIC (50, 2) NOT NULL CHECK (balance >= 0) DEFAULT 0
--	owner INTEGER NOT NULL REFERENCES project0.users (id)
--	active BOOLEAN DEFAULT false
);

DROP TABLE IF EXISTS project0.users_accounts_jt;
CREATE TABLE project0.users_accounts_jt (
	owner INTEGER NOT NULL REFERENCES project0.users (id),
	account INTEGER NOT NULL REFERENCES project0.accounts (id)
);

DROP TABLE IF EXISTS project0.applications CASCADE;
CREATE TABLE project0.applications (
	id SERIAL PRIMARY KEY,
	owner INTEGER NOT NULL REFERENCES project0.users (id)
);

INSERT INTO project0.users (username, password, role) VALUES ('moberlies', 'password', 'Admin');





JDBC
======

Java database connectivity

Types of drivers :

JDBC-ODBC bridge driver
The JDBC-ODBC bridge driver uses ODBC driver to connect to the database. The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls. This is now discouraged because of thin driver.

Native-API driver (partially java driver)
Network Protocol driver (fully java driver)

Thin driver (fully java driver)
The thin driver converts JDBC calls directly into the vendor-specific database protocol. That is why it is known as thin driver. It is fully written in Java language.


Steps to connect 
1) Load an appropriate driver



 ResultSet	 stat.executeQuery		-DQL
 int		 stat.executeUpdate		-DML
 boolean		 stat.execute			-DDL


** Difference between statement and PreparedStatement

Statement					PreparedStatement
It is used when SQL query is to be executed only once.	It is used when SQL query is to be executed multiple times.
You can not pass parameters at runtime.	You can pass parameters at runtime.
Used for CREATE, ALTER, DROP statements.	Used for the queries which are to be executed multiple times.
Performance is very low.	Performance is better than Statement.
It is base interface.	It extends statement interface.
Used to execute normal SQL queries.	Used to execute dynamic SQL queries.
We can not use statement for reading binary data.	We can use Preparedstatement for reading binary data.
It is used for DDL statements.	It is used for any SQL Query.
We can not use statement for writing binary data.	We can use Preparedstatement for writing binary data.
No binary protocol is used for communication.	Binary protocol is used for communication.



Week2 completed


Week3 - 
** Project1
Design Patterns
DAO
Singleton Design Pattern
factory DP
Dependency Injection

Collections
HTML5
CSS3
Spring Core
Spring Boot
Spring MVC
Spring Data

AWS
	- S3
 	- RDS
REST
Agile
Scrum
SonarLint


Tomo QC - 11:00 AM -1


Day 11
-----------

Design Pattern
---------------------
solution to a probem in a given context
In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design.


Creational
	Singleton
	Factory Design Pattern
Structural 
Behavioural 

DAO
Singleton Design Pattern
factory DP


Authenticate a user


Problem : We want a single object to be serving to all the customers.
Solution : Singleton Design Pattern

The singleton pattern is one of the simplest design patterns. Sometimes we need to have only one instance of our class for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may be costly. Similarly, there can be a single configuration manager or error manager in an application that handles all problems instead of creating multiple managers.
Definition: 
The singleton pattern is a design pattern that restricts the instantiation of a class to one object. 
Let’s see various design options for implementing such a class. If you have a good handle on static class variables and access modifiers this should not be a difficult task.


private
static

without singleton
Bank App object created
5000 debited successfully
Bank App object created
8000 debited successfully
Bank App object created
8000 debited successfully


with singleton
Bank App object created
5000 debited successfully
8000 debited successfully
8000 debited successfully


** How you implement singleton design pattern ?

Make a constructor private.
Write a static method that has the return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.

Factory Design pattern
---------------------------------


Software Design Principle
	SRP (SIngle Responsibility principle)
	
	
Software Design Patterns









DAO (Data access Object design pattern)



package structure
SRP 
should adhere to interfaces

    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.3.5</version>
        </dependency>


    </dependencies>



Product Crud App
---------------------
M E N U 

	1. Add Product
	2. Update Product
	3. Delete Product
	4. Find Product By Id
	5. Find Product By Name
	6. Find all Products
	7. Update Stock
	8. Update Price

	9. E X I T 


Collection
============

	is a framework for storing datas.
	

	create an array		- 

	store the names	

	
	sort the names		- 



	- list of interfaces and classes 
	- avoids you to reinvent the wheel




Collection	-I


		Set(no duplicates)	-I	List(accept duplicates) - I			||		Map- key value(keys cannot be duplicate)

C
		HashSet (no order)		ArrayList(serach)						HashMap
		LinkedHashSet (As it is)	LinkedList(insert/delete)					TreeMap
		TreeSet	(sorted)		Vector							LinkedHashMap


	Stack
	Queue

	
linkedlist easy to insert/delete
arraylist easy to search/iterate



Collection uses generics 

JDK1.8 ( new features in jdk1.8)
=========

Lambdas
-------------
A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

	Functional Interface
		- Any interface which contains only one method

	Example : Comparator,Comparable,Runnable
	
	@FunctionalInterface


Classes			- lot of useful static methods

Collections	
Arrays



Streams
-------------






What is an exception ?
What is difference between checked and unchcked exception ?
How you create custom exception?
difference between throw and throws
what is the use of try, catch and finally block ?
What is the name of super class of exception ?

Maven :

What is Maven ?
What is pom?
What is the difference between central and local repository ?

JUNit
What is junit ?
List junit annotations ?
assertEquals 

What is git?
commands of git ( add, push, pull , init, commit )
what is the use of git branching ?



What are the sub languages of sql ?
What is DDL?
What is DML?
What is DQL?

Transaction
ACID

Joins
Types of joins
Inner vs Outer joins

DFifference between joins and subquery ?
What do you mean by referential integrity ?
What are different set operators ?
List out some constraints
List some isolation levels
What is JDBC ?
Difference between Statement and PreparedStatement
What is the use of CallableStatement ?





Code
----------

SQL ==
---stored procedures 


drop table if exists accounts;
 
create table accounts (
    id int generated by default as identity,
    name varchar(100) not null,
    balance dec(15,2) not null,
    primary key(id)
);
 
insert into accounts(name,balance) values('Ahmed',10000);
 
insert into accounts(name,balance) values('Neha',10000);
 

select * from accounts;




create or replace procedure transfer(
   sender int,
   receiver int, 
   amount dec
)
language plpgsql    
as $$
begin
    -- subtracting the amount from the sender's account 
    update accounts 
    set balance = balance - amount 
    where id = sender;
 
    -- adding the amount to the receiver's account
    update accounts 
    set balance = balance + amount 
    where id = receiver;
 
    commit;
end;$$


----------calling stored procedure

call transfer(1,2,1000);




===========================================================

Calling procedure with callable statement

package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.revature.pms.util.DBConnection;

public class CallingProcedure_Transfer {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBConnection.getDBConnection();
		//CS is used to call stored procedure from java
		CallableStatement stat = connection.prepareCall("call public.transfer(?,?,?)");
		stat.setInt(1, 1);
		stat.setInt(2, 2);
		stat.setInt(3, 7000);
		
		stat.execute();
		
		System.out.println("Done");
		
	}
}















---------------------------------------------------

--------------Procedure with OUT parameter

create or replace procedure transferAmountAndGetbalance
(
   sender int,
   reciever int,
   amount dec,
  INOUT debitorBalance int,
  INOUT creditorBalance int
)
language  plpgsql
as $$
begin 
		update hr.accounts set balance = balance - amount where id = sender;
		update hr.accounts set balance = balance + amount where id = reciever;
		select balance into debitorBalance from hr.accounts where id = sender;
		select balance into creditorBalance from hr.accounts where id = reciever;
commit;
end;$$


package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;

import com.revature.pms.util.DBConnection;

public class CallingProcedure_TransferWithOut {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBConnection.getDBConnection();
		int bal1=0;
		int bal2=0;
		CallableStatement stat = connection.prepareCall("call hr.transferAmountAndGetbalance(?,?,?,?,?)");
		stat.setInt(1, 1);
		stat.setInt(2, 2);
		stat.setInt(3, 100);
		stat.registerOutParameter(4, Types.INTEGER);
		stat.setInt(4, bal1);
		stat.registerOutParameter(5, Types.INTEGER);
		stat.setInt(5, bal2);

		stat.execute();
		
		bal1 = stat.getInt(4);
		bal2 = stat.getInt(5);
		
		System.out.println(bal1);
		System.out.println(bal2);
		System.out.println("Done");
		
	}
}



Day 12
===========

HTML

	Hyper text markup language
	Used to create web pages
	It uses tags
	<H1>
	Tags are of two types
		1) Container/Paired	<b></b>
		2) Empty			<br/><hr/>

Editor - 
Browser


	Tags have attributes/properties
	Block Tags	- will change the line		h1,hr,br,div
	Inline		- will not change the line		b,font,i,u,span



Hyperlink
	-navigate
	<a href="



Table
	<table>

Forms
	- it is used to take inputs

	- textbox,radio, checkbox,dropdowns,password

file:///H:/ideaProjects/JDBCDemo/src/main/loginForm.html?username=mohammad.tufail&password=hello%40123213



Hands on 
============
Create product Form

Product Id 	[	]
Product Name	[	]
QOH		- drop down (1-10)
Price		[	]	input type="number"


Save Product		Clear



Whats new HTML5
------------------------
2008
many new tags audio , video , progress 
semantic and 		non semantic tags

<header>	
<footer>
<section>
<aside>
<article>







week1	- X

week2	-QUIZ,CodingAssessment,QC
	
week3	- Coding Assessment QC, Quiz, Coding Assessment

project1
----------------
Core Java, SQL,SpringBoot

Day 13
CSS
==========


Cascading Stylesheets

Cascading Style Sheets, fondly referred to as CSS, is a simple design language intended to simplify the process of making web pages presentable.

Three ways to create CSS

1) Internal
2) External


tomo
3) Inline



Spring
==============
What is Spring ?

Dependency Injection (DI)
Inversion of control (IOC)

	-open source framework
	- works on IOC and DI principle
	- spring IOC container
	-  IOC container manages the objects ( creates and destroys)  lifecycle of objects

	- framework of frameworks
	- core spring
	- spring data jpa
	- spring aop ( aspect oritented programming )


Spring aims to simplify the complex and cumbersome enterprise Java application development process by offering a framework that includes technologies such as:

Aspect-oriented programming (AOP)
Dependency injection (DI)
Plain Old Java Object (POJO)

IoC (Inversion of Control) Container
IoC container is one of the core features of Spring that provides a streamlined way to configure and manage Java objects. This container is responsible for managing the lifecycle of a defined Java object, significantly increasing the configurability of a Spring-based application.

IoC uses the dependency injection or dependency lookup patterns to provide the object reference during runtime. The container consists of assembler code that is required for configuration management.

Spring provides org.springframework.beans and org.springframework.context packages that can be used to facilitate these functions.


Problems with spring
------------------------
	configuration is little complex
	

Spring Boot
--------------
	spring with zero configuration
	Embedded Tomcat
		8080

	Spring Core
	Spring AOP
	Spring Data JPA
	Spring Rest

	beans - object managed by spring IOC container

	



SpringBoot
=============

SpringBoot - Intellij

File --> Settings --> Plugins --> Spring Boot Assistant -=> Install This



P1

com.revature.training
			model
			
			controller


		localhost:8081


		Welcome to Revature




localhost:8082			- Revature Welcomes You
localhost:8082/devops			- This is devops batch
localhost:8082/docker		- Docker isa tool 


15 minutes


controller


MVC Design pattern
==================


Two types of apps :
	1) To be consumed by end users		google.com	- HTML
	2) To be consumed by another app				- JSON	

		amazon	buy-->CC	request	-->	--response	bankapp


		app that has be consumed another app

		RestController	- 

Rest - Representation state transfer

URL/URI

	192.68.71.76:8097/devops

Rest Web Services

	


	Http Methods

		GET		- get a record		@GetMapping
		POST		- insert/create		@PostMapping
		PUT		- update			@PutMapping
		DELETE		- delete			@DeleteMapping

Use case :  create an app that should give another these options

	localhost:8084/product



lombok 
	- third party library which is reduce boilerplate codes
	- 





p1 : Set up the backend for an online store to buy items. Users can register and login to add items to their cart. Then they can place orders. Registered users are are stored in the Users table. Items that users can buy are stored in the Items table. User's carts are stored in the Cart table. Users order's are stored in the Orders table.

Features Implemented
Register - register new users
Login/Logout - login and logout users
Get Users - get all users and their cart
Get Items - gets all items that are available in store
Add Item to Cart - adds selected item to cart




										HTTP methods
localhost:8084/product/home
localhost:8084/product		- GET ALL products					- GET
localhost:8084/product/123		-GET a single product
localhost:8084/product/Lakme	- GET all products matching the productName


@PathVariable
--------------------
is used to take parameters


localhost:8084/product/123		- DELETE a single record				-DELETE



Postman
------------
Tool to test Rest web services

Save			
	
localhost:8084/product/		-Saving a single record	body {product}			-POST		

Update
localhost:8084/product/		-Update a single record	body {product}			-PUT


Dev tools

--------------
live reload

You need to enable the “Make project automatically” option. You can find it in Settings – Build, Execution, Deployment – Compiler
Settings - Advanced settings - Allow auto make


------------------
Spring Core
------------------
DI /IOC


bean	- spring will create if you specify by certain annotations, few are sterotypes annotations
	- we can also create explicitly by @bean annotation



@Bean
	- used to create a bean in spring

@Configuration
	- annotates a class a configuration class

@Autowired
	- scans the container and auto inject the bean if it is available
	- if the bean is not available --> 



**@SpringBootApplication

	@SpringBootApplication annotation indicates a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component 



com.revature.pms
		Client/@SpringBootApplication




		.model
		/dao


Stereotypes annotation
	
	@Component		- scan and creates a bean - treat
	@Controller		- controller	- VIEWS
	@Service			- service layer
	@Repository		- DAO


	@RestController		- JSON



Exercies : 

Create one classes

		
	Create a class and a method to check negative values

	boolean checkNegativeValue(int)
	{
	}

	
use autowiring to inject the above class in productcontroller





Spring JPA
---------------------

	Hibernate 
		- framework ORM
Java Persistence API
	- use of this is to work with DB

1. create product table	- not required	- automatically it will creates the table
2. JpaRepository/CrudRepository		- provides lots of methods to work like save,update, delete





Step 1 : update pom.xml with jpa dependency and also postgres dependency

Stop your app :

<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
    <version>2.6.7</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.3.5</version>
</dependency>


Once you restart , it will give some error, database not configured


***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).


Step 2: 

configure database properties in application.properties

spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.generate-ddl=true
spring.jpa.properties.hibernate.format_sql=true


Step 3: Start your app and check the logs that you dont have any error


Step 4: List some JPA annotation

@Entity
@Table
@Id
@Column




JpaRepository
----------------
CrudRepository


	- interface 
	- which has the methods crud methods





Service class 
----------------


HTTP Status Codes
------------------------

200	-OK
400	- Bad Request
404	- Not Found
500	- Internal server error


ResponseEntity 
 Extension of HttpEntity that adds an HttpStatus status code





Logback

Step 1:
pom.xml


<!-- SLF4J - API -->
<dependency>
<groupId>org.slf4j</groupId>
<artifactId>slf4j-api</artifactId>
<version>1.7.7</version>
</dependency>

<!-- logback -->
<dependency>
<groupId>ch.qos.logback</groupId>
<artifactId>logback-classic</artifactId>
<version>1.1.2</version>
</dependency>
<dependency>
<groupId>ch.qos.logback</groupId>
<artifactId>logback-core</artifactId>
<version>1.1.2</version>
</dependency>


Step 2: 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);



The library defines 5 log levels: TRACE, DEBUG, INFO, WARN, ERROR;







Spring JPA
--------------------

public List<Product> findByProductName(String productName);


@Query 
	- writing custom queries

	

AOP
============
Aspect oriented programming - Spring


@EnableAspectJAutoProxy











Product object created
Product object created
Product controller called
Product object created
Call me First called






project1



p1 : Set up the backend for an online store to buy items. Users can register and login to add items to their cart. Then they can place orders. Registered users are are stored in the Users table. Items that users can buy are stored in the Items table. User's carts are stored in the Cart table. Users order's are stored in the Orders table.

Features Implemented
Register - register new users
Login/Logout - login and logout users
Get Users - get all users and their cart
Get Items - gets all items that are available in store
Add Item to Cart - adds selected item to cart






localhost:8085/registerUser
localhost:8085/login/{username}/{password}

body

	{
	}



Week3 Completed

Agile,Scrum,Spring,SRE,Spring Projects, SDLC











Day 17
===========

Docker

Dockerfile

	postgres
	email
	





https://desktop.docker.com/win/main/amd64/Docker%20Desktop%20Installer.exe
https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi
hub.docker.com - register 





docker run nginx


open new command prompt


docker ps

docket images



docker run --name mywebsite -p 8080:80 nginx

Browser : localhost:8080


download postgres image as well



1) Stop nginx container
2) Check the running container
3) Check all the containers
4) Delete the container
5) Delete the nginx image
6) donwload postgres image
7) run the postgres image on port : 5433

docker run --name ahmedpostgres1 -e POSTGRES_USER=tufail -e POSTGRES_PASSWORD=ahmed -p 5433:5432 -d postgres


How you can dockerize your application :
===================================

Maven - dependencies	-pom.xml

Generate the jar file

Maven Lifecycle
Validate, 
Compile,
 Test,
 Package, 		- jar file / target folder
Integration test, 
Verify, 
Install
Deploy






Use case : To dockerize our spring boot app 







FROM openjdk:8
EXPOSE 8080
ADD target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT [ "java", "-jar" , "/demo.jar"]







Lunch break : 1:15 - 2:15 PM EST

2:15 - Coding Assessment - 70 minutes





Create Dockerfile in project root

Step 1: 
FROM openjdk:8
EXPOSE 8080
ADD target/revatureapp.jar demo.jar
ENTRYPOINT [ "java", "-jar" , "/demo.jar"]


Step2 :build the image
 docker build -t springboot-demo-1.0 .

Step3: Verify
docker images


Step 3: Run the image
 docker run -p 8080:8080 springboot-demo-1.0 

Browser : http://localhost:8080/demo/message












Next QC : Monday , 30th May 2022. 2:00 - 4:00 PM EST Week3 and Week4 topics


Monday - Holiday ?


Docker
Docker Compose






Dockerfile


FROM openjdk:8
EXPOSE 8080
ADD target/mohammadapp.jar app.jar
ENTRYPOINT [ "java" , "-jar" , "/app.jar"]

docker build -t springboot-mohammad-demo-1.0 .

 docker run -p 8080:8080 springboot-mohammad-demo-1.0





Docker Compose
=================




spring.data.jpa.user=root
spring.data.jpa.password=root

yml

spring:
data:
		jpa:
			user:root
			password:root



























version: '2'

services:
  product-app:
    image: 'spring-boot-revature-product-app:latest'
    build:
      context: ./
    container_name: product-app
    ports:
      - 8080:8080
    depends_on:
      - db
    environment:
      - SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/compose-postgres
      - SPRING_DATASOURCE_USERNAME=compose-postgres
      - SPRING_DATASOURCE_PASSWORD=compose-postgres
      - SPRING_JPA_HIBERNATE_DDL_AUTO=update

  db:
    image: 'postgres:13.1-alpine'
    container_name: db
    environment:
      - POSTGRES_USER=compose-postgres
      - POSTGRES_PASSWORD=compose-postgres















** Difference between JpaRepository and CrudRepository





Create a user with role CUSTOMER :

localhost:8080/users	- POST


{
    "username":"mohammad",
    "role":"CUSTOMER"
}
















Actuator : Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. 

==============
AWS RDS




local postgres
docker postgres
cloud postgres ?


AWS RDS


postgres
rootroot
jdbc:postgresql://database-1.ctfccinh3r5l.us-east-1.rds.amazonaws.com:5432/postgres


Day 21

QC 2:00 - 4:00 PM EST
Lunch 1:00 - 2:00 

Grafana 
Prometheus

What ?
Why ?

SRE

Monitoring



Grafana provides a way to visualize that data through graphs and level of reporting and alerting.
Grafana doesnt have any data, it has to extract the data , it has to extract data from all data sources like mysql, loki, promethues,


Organizations utilizez Grafana for monitoring logs

Docker
AWS


Dashbaord Versioning 
-------------------------------




QC:

Spring
============
What is spring and why we need spring for our projects ?

The Spring Framework is an inversion of control container that provides flexible infrastructural support to create loosely coupled Java applications by utilizing dependency injection.

Spring an umbrella term for a family of frameworks which can be utilized to rapidly create loosely coupled Java applications.


IOC
DI
Autowire

@Configuration
@Autowire
@Service
@Repository
@Component

Constructor Injection: Dependency Injection accomplished when the container invokes a constructor with arguments to instantiate a bean in which each argument of said constructor represents a dependency.
Setter Injection: Dependency Injection accomplished when the container calls setter methods on a bean after invoking a no-argument constructor to instatiate a bean.

path variable vs request param

The @RequestParam is used to extract query parameters while @PathVariable is used to extract data right from the URI.

AOP
====

point cut
join point


n Aspect Oriented Programming, the key component are aspects, which modularizes particular transactional concerns which can present across multiple classes, known as cross-cutting concerns.

Examples of these concerns are, Database Access (security for a database), data entities (transactions to take place), error handling, or logging system messages. 

 Aspect Oriented Programming works to eliminate this redundancy by transferring responsibility of these common problems to aspects


Aspect - A representation of a concern which cuts across multiple classes.
Weaving - The process of linking aspects with other objects, such as beans, to create advised objects. This can be done at compile time (such as when using the AspectJ compiler), load time or runtime. Spring performs weaving at Runtime.
Join Point - A specified moment during the execution of a program, such as the invocation of a method, in which actions can be taken.
_Advice _ - Action taken by an aspect at a specified Join point.
Pointcut - A definition of which methods in our application advice ought to be injected into or around, for example, when a method of a certain name is executed. By default, spring uses AspectJ pointcut expression language.
Introduction - Declaration of new interfaces and corresponding implementations in subclasses of any advised object. Introductions use the @DeclareParents annotation with the defaultImpl attribute to define a default concrete class for the bean definition. For Example:

==========================

What Is Scrum in Agile?
Scrum is a framework of rules, roles, events, and artifacts used to implement Agile projects. It is an iterative approach, consisting of sprints that typically only last one to four weeks. This approach ensures that your team delivers a version of the product regularly. 

Scrum was designed using a software model that follows a set of roles, responsibilities, and meetings. It can be used for any complex project but works best when the result is a concrete product rather than a service.

Scrum in Agile requires particular roles and responsibilities, including the following:

Product owner: The product owner is responsible for representing the customer’s best interest. This person has the ultimate authority over the final product.
Scrum master: This person is a facilitator, responsible for arranging the daily meetings, improving team interactions, and maximizing productivity. The project manager often takes on the role of Scrum master, but they can delegate it to anyone on the team who is a Scrum expert and strong facilitator. 
Backlog: The backlog is a list of tasks and requirements included in the final product. It’s the responsibility of the product owner to create the backlog. 
Sprint: A sprint is a set time frame for completing each set of tasks from the backlog. Every sprint should be the same length. Two weeks is typical, but a sprint can be anywhere between one to four weeks long, depending on the team and project’s needs.  
Daily meetings: A Scrum project team is expected to meet every day to discuss progress. These meetings are typically referred to as a Daily Scrum or Daily Stand-Up.
Retrospective: Each sprint should end with a review meeting, called a retrospective. Here, the team reviews their progress and discusses how they can improve in the next sprint.

===================SDLC





1.  What are Spring Projects and Spring Modules?
	Use Spring Boot to build a Web Application. ...
	Create REST Service for an Education Site. ...
	Create an Employee Management System (Using Spring Boot and Thymeleaf) ...
	Work on the Open-source Project Sagan. ...
	Create a Web App with Spring Boot Starter Web. ...
	Use LDAP to Authenticate a User.
    
    Spring's Web module provides basic web-oriented integration features, such as multipart file-upload functionality, the initialization of the IoC container 
    using servlet listeners and a web-oriented application context. It also contains the web related parts of Spring's remoting support
    
2.  What is IOC and what does the IOC Container do?
    
3.  What is dependency injection and what are some of the benefits of using dependency injection?
    
4.  What types of dependency injection does Spring support?
    two types DI
	setter
	constructpr
5.  What are some differences between BeanFactory and ApplicationContext? Which one eagerly instantiates your beans?
    
    The ApplicationContext comes with advanced features, including several that are geared towards enterprise applications,
    while the BeanFactory comes with only basic features. Therefore, it's generally recommended to use the ApplicationContext, and we should use BeanFactory only 
    when memory consumption is critical.0
    
    BeanFactory will create a bean object when the getBean() method is called thus making it Lazy initialization.	
    ApplicationContext loads all the beans and creates objects at the time of startup only thus making it Eager initialization.
    
    
6.  What is the Spring Bean lifecycle?
    
7.  What is bean wiring? What about autowiring?
    
8.  What are the different ways that Spring can wire beans?
    ByName,
	ByType
	construtor
9.  What are the scopes of Spring beans? Which is default?
    
10.  What is the concept of component scanning and how would you set it up?
    
11.  What are the benefits and limitations of Java configuration?
    
12.  What does the @Configuration and @Bean annotations do?
    
13.  What is @Value used for?
    
14.  What is Spring Expression Language? What can you reference using SpEL? What is the difference between $ and # in @value expressions?
    

### Spring MVC

15.  Explain the MVC architecture and how HTTP requests are processed in the architecture
    
16.  What is the role of the DispatcherServlet? What about the ViewResolver?
    
17.  *** List some stereotype annotations. What are the differences between these?
    
18.  How would you declare which HTTP requests you’d like a controller to process?
    
19.  What is the difference between @RequestMapping and @GetMapping?
    
20.  How to declare the data format your controller expects from requests or will create in responses?
    
21.  What annotation would you use to bypass the ViewResolver?
    
22.  How would you extract query and path parameters from a request URL in your controller?
    
23.  What concerns is the controller layer supposed to handle vs the service layer?
    
24.  How would you specify HTTP status codes to return from your controller?
    
25.  How do you handle exceptions thrown in your code from your controller? What happens if you don’t set up any exception handling?
    
26.  How would you consume an external web service using Spring?
    
27.  What are the advantages of using RestTemplate?
    

### Spring AOP

28.  What is “aspect-oriented programming”? Define an aspect.
    
29.  Give an example of a cross-cutting concern you could use AOP to address
    
30.  Define the following:
    

*  Join point
    
*  Pointcut
    
*  Advice
Types of advice
    Before
    After
   Around
   Throws

31.  What are the different types of advice? What is special about the @Around advice? How is the ProceedingJoinPoint used?
    
33.  Explain the pointcut expression syntax
    
34.  What visibility must Spring bean methods have to be proxied using Spring AOP?
    

### Spring Data

34.  What is Spring ORM and Spring Data?
    
35.  What is the Template design pattern and what is the JDBC template?
    
36.  What does @Transactional do? What is the PlatformTransactionManager?
    
37.  What is a PersistenceContext?
    
38.  Explain how to integrate Spring and Hibernate using ContextualSession
    
39.  What interfaces are available in Spring Data JPA?
    
40.  *** What is the difference between JPARepository and CrudRepository?
    
41.  What is the naming conventions for methods in Spring Data repositories?

findBy
    
42.  How are Spring repositories implemented by Spring at runtime?
    
43.  What is @Query used for?
    

### Spring Boot

What is the advantage of spring boot ?


44.  How is Spring Boot different from legacy Spring applications? What does it mean that it is “opinionated”?
    
45.  What does “convention over configuration” mean?
    
46.  What annotation would you use for Spring Boot apps? What does it do behind the scenes?
    @SpringBootApplication
47.  How does Boot’s autoconfiguration work?
    
48.  What is the advantage of having an embedded Tomcat server?
    
49.  What is the significance of the Spring Boot starter POM?
    
50.  What is the Spring Boot actuator? What information can it give you?
    
51.  What files would you use to configure Spring Boot applications?
    



***Spring profiles
52.  What is the benefit of using Spring Boot profiles?


Grafana
Create Dashboard

Loki
-----------
Loki


Promtail








images
containers	- container
	
push
pull


docker
========
yml or yaml files



application.yml

server:
  port: 8085

spring:
  datasource:
    driver-class-name: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/postgres
    username: postgres
    password: root

  jpa:
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
    generate-ddl: true

  jackson:
    serialization:
      fail-on-empty-beans: false











Loki	- log aggregation tool 

nssm  - a tool to create window service
nssm start <servicename>
nssm restart <servicename>
nssm delete <servicename>


sudo start service <servicename>


nssm https://github.com/grafana/loki/releases/download/v2.5.0/loki-windows-amd64.exe.zip
https://nssm.cc/release/nssm-2.24.zip

loki 




Promethues


https://github.com/prometheus/prometheus/releases/download/v2.35.0/prometheus-2.35.0.windows-amd64.zip


Loki 		vs		 	Prometheus
 reading log files				metrics/numbers
relies on promtail for getting the data		request data from node exporter




More - Promethues

PromQL
How you can add another metrics	-windows metrics
Alerts
Notifications
Alert Manager
gmail conf
Sprng Boot		http://localhost:8084/product	-GET



Kubernetes
=============


# Prometheus

## What is it?

Prometheus is a Systems monitoring and alerting toolkit. It supports a highly dimensional data model, and stores as time series. With this in mind, Prometheus also acts as a Time Series Database.

http requests - 

http_requests_total(method="get")

metric name	 key         value

## What are its features?
- Supports PromQL (Prometheus Query Language) that allows highly customized queries to select metrics to visualize.
    - Has 4 primary types:
        - Instant Vectors
        - Range Vectors
        - Scalars
        - Strings	- very rarely used  "hello"
    - Has 4 metric types:
        - Gauge
        - Summary
        - Counter
        - Histogram
- Has a pull model over HTTP
    - Prometheus will "scrape" metrics from other sources at configured intervals
    - The default path that prometheus looks for is `/metrics` unless configured otherwise
- Supports a push model if needed for certain use-cases
    - Examples would be batch jobs that would not exist long enough to be scraped
    - In these scenarios, we can export the data directly to Prometheus through its `PushGateway`

## Pull vs Push Model

Each has their own pros/cons. Neither is necessarily better than the other.

Some pros of pull model:
- Services do not have to worry about packet loss'
- Don't have to worry about the location of prometheus

Some downsides of pull model:
- Services must exist long enough to be pulled from

### Understanding Prometheus Data Model

Prometheus' Highly dimensional data model can be quite difficult to wrap your mind around.

The perspective that I personally find most helpful is to think of metrics as 2-dimensional arrays
- For each metric, we have an array of labels/sources/tags
- Each of these arrays is itself an array, which consists of the metric's values over time

When we perform operations/functions, such as `sum` or `rate`, we must keep this dimensionality in mind.
`sum` expects an `Instant Vector`. This means, it wants only a single value across all of the different labels. `sum` will then add up all of those values, with a result of type `Counter` across all labels.

`rate` expects a Range Vector. For each label, it wants to compute a Counter that represents the "rate" of the counter over some time range. For example, the rate of some metric over the last 5m. This will output an Instant Vector.

#### Examples

```
sum(rate(container_cpu_usage_seconds_total{container="fluentd"}[5m]))
```

In the above case, we start from the `container_cpu_usage_seconds_total` metric. By using the `[5m]` timesacele, we obtain a Range Vector.

We further filter the `container_cpu_usage_seconds_total` metric to only include time-series that had the label of `container="fluentd"`. The result still has multiple labels. But for each metric, the value for the `container` label will definitely be `fluentd`. We are not removing labels, just filtering based on labels.

We then use the `rate` function on the provided Range Vector. This produces an Instant Vector in response. We finally use the `sum` function on the Instant Vector, getting a `Counter`.

Grafana will provide a Graph as well that shows what the result of this calculation would have been at different evaluation times.

```
sum(container_cpu_usage_seconds_total) by (container)
```

In the above case, we used the `sum` function on the `container_cpu_usage_seconds_total` metric to obtain a `Counter` that is the sum of all of the labels.

We then group the sum based on the value of the `container` label. This results in a Instant Vector, for the different values of the `container` label. Each time-series will have the sum across all of the other labels.

Once again, we get a graph that shows what the values would have been at different evaluation times.

In this particular example, one of the labels for `container`, the empty string (which represents the lack of a value for that label) had a far higher sum than all of the labeled time-series. With this in mind, we might want to choose to filter out that one time-series.

We can do so, by adding a selector against the `container` label, to not include the empty string.

```
sum(container_cpu_usage_seconds_total{container!=""}) by (container)
```




windows exporter
---------------------------

download the wmi
https://github.com/prometheus-community/windows_exporter/releases

https://github.com/prometheus-community/windows_exporter/releases/download/v0.18.1/windows_exporter-0.18.1-386.msi


configure the promethues.yml
restart your promethues



SERVICE_PAUSED in response to START control. again

** You have error in yaml/yml file



PromQL - query language

matchers
selectors
operators

process_cpu_seconds_total{job="wmi_exporter",instance="localhost:9182"}


process_cpu_seconds_total{job!="wmi_exporter"}

regular expressions - *

prometheus_http_requests_total{handler=~"/api.*"}

prometheus_http_requests_total{handler !~"/api.*"}





prometheus_http_request_duration_seconds_count 	- count only for metrics




prometheus_http_requests_total

ignoring - allows us to ignore certain matchers
on keyword allows the limiting the labels from the specified 


prometheus_http_requests_total or promhttp_metric_handler_requests_total 


prometheus_http_requests_total{code="200", handler="/api/v1/metadata", instance="localhost:9090", job="prometheus"}
7
prometheus_http_requests_total{code="200", handler="/api/v1/query", instance="localhost:9090", job="prometheus"}
30
prometheus_http_requests_total{code="200", handler="/api/v1/series", instance="localhost:9090", job="prometheus"}
12
prometheus_http_requests_total{code="200", handler="/metrics", instance="localhost:9090", job="prometheus"}
108
prometheus_http_requests_total{code="400", handler="/api/v1/query", instance="localhost:9090", job="prometheus"}
5
promhttp_metric_handler_requests_total{code="200", instance="localhost:9090", job="prometheus"}
108
promhttp_metric_handler_requests_total{code="500", instance="localhost:9090", job="prometheus"}
0
promhttp_metric_handler_requests_total{code="503", instance="localhost:9090", job="prometheus"}




promhttp_metric_handler_requests_total and ignoring(handler) prometheus_http_requests_total

promhttp_metric_handler_requests_total{code="200", instance="localhost:9090", job="prometheus"}

promhttp_metric_handler_requests_total or on(code) prometheus_http_requests_total





topk(1,sum(prometheus_http_requests_total) by (code))



Alerting
--------------


Examples of alerts : Free node memoeryh should not be less than 20%

Rules

Alert Manager	- sending notifitaions - gmail, slack 


https://github.com/prometheus/alertmanager/releases/download/v0.24.0/alertmanager-0.24.0.windows-amd64.zip


fie Email alerts using alert manager

SMTP

to	: tufailahmedkhan@gmail.com
from	: ta5005128@gmail.com

open alertmanager.yml

route:
  receiver: admin

receivers:
- name: admin
  email_configs:
  - to: 'tufailahmedkhan@gmail.com'
    from: 'ta5005128@gmail.com'
    smarthost: smtp.gmail.com:587
    auth_username: 'ta5005128@gmail.com'
    auth_identity: 'ta5005128@gmail.com'
    auth_password: 'uucvkpsmnpsfblfr'





Configure your to email smtp and please generate the password


Alert is Fired, then email will be sent



Spring boot - Monitoring using prometheus

Use case : How many times localhost:8084/product	- GET	is getting invoked

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>


<dependency>
  <groupId>io.micrometer</groupId>
  <artifactId>micrometer-registry-prometheus</artifactId>
  <scope>runtime</scope>
</dependency>


application.properties

management.endpoints.web.exposure.include=health,info,prometheus

postman

http://localhost:8084/actuator/prometheus


 - job_name: 'spring boot scrape'    metrics_path: '/actuator/prometheus'    scrape_interval: 5s    static_configs:      - targets: ['localhost:8084’]


http_server_requests_seconds_count











k8s (Kubernetes)
===================

container (Docker)

+ Orcechestration

images/flower.svg
Kubernetes, also known as K8s, is an open-source system for automating deployment, scaling, and management of containerized applications.

It groups containers that make up an application into logical units for easy management and discovery

# Overview

Kubernetes is a software solution for "Container Orchestration". We want to manage containers on a large scale, such as representing groups of containers and as many instances of a single container as we can, as well as track them. 
**If they fail, we will want to quickly replace it. 
As well as quickly scale up or down the number of instances. Among many other features.



Docker swarm (lacks advanced features)
Mesos (difficult to setup)


Advantages of container orchestrations (k8s)
1) scalable
2) Prevent failure - replication
3) manage containers in large scale
4) This things you can do with simple configuration files


Architecture of k8s
----------------------

API server - acts a front controller for k8s

etcd keystore - distributed key store used by k8s for managing clusters. who is master node and who is the worker node(later)

kubelet - is an agent which runs on every cluster. This is responsible for making sure that the containers are running as expected

Container runtime : are the underlying software used to run containers. In our case  it is docker/vm

Controllers : are the brain behind the orchestration.Responds when the node containers are down.

Scheduler : is responsible for distributing works/containers across multiple nods. It looks for newly created containers and assigns them the nodes



-------
Terms

Nodes (minions) (a machine)
cluster - set of nodes
master - 
worker 
replica - copy of the instances


Master			Worker

APIServer		kubelet
controller
scheduler
etcd 


kubectl
---------------
is used to deploy and manage applications on k8s cluster
get the cluster information

Installation k8s

Install kubectl
Install minikube
Install Oracle VM


Virtualization - Enabled

https://dl.k8s.io/release/v1.23.0/bin/windows/amd64/kubectl.exe

Download Minikube
https://minikube.sigs.k8s.io/docs/start/
https://storage.googleapis.com/minikube/releases/latest/minikube-installer.exe

minikube start --driver=virtualbox --no-vtx-check


username : docker
password : tcuser


kubectl commands
---------------------------------
minikube status
kubectl get nodes
kubectl get deployments
kubectl create deployment hello-minikube --image=k8s.gcr.io/echoserver:1.10
kubectl get deployments

kubectl expose deployment hello-minikube --type=NodePort --port=8080

minikube service hello-minikube --url


http://192.168.59.100:31822

Browser : http://192.168.59.100:31822

Your setup is fine and working

Let's delete ::

kubectl delete services hello-minikube
kubectl delete deployment hello-minikube

kubectl get pods


k8s pods
===============
smallest deployable units that you can create and mange in k8s



kubectl get pods

project p1

You have to upload your project into github




Deploy your application in aws
----------------------------------
RDS
EC2
S3 Bucket

Goal : I want application to be accessible by all. 

Step 1: Goto AWS and create RDS and update our application

username : postgres
password : rootroot
url : jdbc:postgresql://postgres.ctfccinh3r5l.us-east-1.rds.amazonaws.com:5432/postgres

Test this connection via DBeaver

Step 2 :

Update these db details in your app and generate the jar file

product-app-devops.jar

Step 3 : Create S3 bucket in aws and upload your jar file


https://revatureaws.s3.amazonaws.com/product-app-devops.jar
https://fridaypartybucket.s3.amazonaws.com/product-app-devops.jar

make it public 


Step 4 : Create EC2 instances (Network->Edit - SSh to All traffic) and download this jar and execute 
mynewawskey1
3.93.177.19

52.73.113.113
ec2-52-73-113-113.compute-1.amazonaws.com:8084/product


ec2-3-93-177-19.compute-1.amazonaws.com:8084/product
sudo apt-get update
----Install JRE
 sudo apt install openjdk-8-jre-headless
----Check JRE version
java -version



-----Get the jar file from S3
wget https://revatureaws.s3.amazonaws.com/product-app-devops.jar

 java -jar [Your-Jar]
** This will start the tomcat server on 8084

Postman :
http://ec2-3-93-177-19.compute-1.amazonaws.com:8084/product



** for in alert manager
------------------------------


it will wait before firing an alert























minikube update-context


minikube start --driver=virtualbox --no-vtx-check





C:\WINDOWS\system32>minikube status
minikube
type: Control Plane
host: Running
kubelet: Running
apiserver: Running
kubeconfig: Configured


C:\WINDOWS\system32>kubectl get nodes
NAME       STATUS   ROLES                  AGE    VERSION
minikube   Ready    control-plane,master   101s   v1.23.3

C:\WINDOWS\system32>kubectl get deployments
No resources found in default namespace.

C:\WINDOWS\system32>kubectl get services
NAME         TYPE        CLUSTER-IP   EXTERNAL-IP   PORT(S)   AGE
kubernetes   ClusterIP   10.96.0.1    <none>        443/TCP   2m18s

C:\WINDOWS\system32>kubectl create deployment hello-minikube --image=k8s.gcr.io/echoserver:1.10
deployment.apps/hello-minikube created

C:\WINDOWS\system32>kubectl get deployments
NAME             READY   UP-TO-DATE   AVAILABLE   AGE
hello-minikube   0/1     1            0           23s

C:\WINDOWS\system32>kubectl get deployments
NAME             READY   UP-TO-DATE   AVAILABLE   AGE
hello-minikube   0/1     1            0           36s

C:\WINDOWS\system32>kubectl expose deployment hello-minikube --NodePort --port 8080
Error: unknown flag: --NodePort
See 'kubectl expose --help' for usage.

C:\WINDOWS\system32>kubectl expose deployment hello-minikube --type=NodePort --port 8080
service/hello-minikube exposed

C:\WINDOWS\system32>kubectl get deployments
NAME             READY   UP-TO-DATE   AVAILABLE   AGE
hello-minikube   1/1     1            1           2m20s

C:\WINDOWS\system32>kubectl get services
NAME             TYPE        CLUSTER-IP      EXTERNAL-IP   PORT(S)          AGE
hello-minikube   NodePort    10.96.137.217   <none>        8080:32051/TCP   24s
kubernetes       ClusterIP   10.96.0.1       <none>        443/TCP          6m11s

C:\WINDOWS\system32>minikube service hello-minikube --url
http://192.168.59.108:32051

C:\WINDOWS\system32>kubectl get services
NAME             TYPE        CLUSTER-IP      EXTERNAL-IP   PORT(S)          AGE
hello-minikube   NodePort    10.96.137.217   <none>        8080:32051/TCP   67s
kubernetes       ClusterIP   10.96.0.1       <none>        443/TCP          6m54s

C:\WINDOWS\system32>kubectl delete services hello-minikube
service "hello-minikube" deleted

C:\WINDOWS\system32>kubectl delete deployments hello-miikube
Error from server (NotFound): deployments.apps "hello-miikube" not found

C:\WINDOWS\system32>kubectl delete deployment hello-miikube
Error from server (NotFound): deployments.apps "hello-miikube" not found

C:\WINDOWS\system32>kubectl delete deployment hello-minikube
deployment.apps "hello-minikube" deleted

C:\WINDOWS\system32>kubectl get pods
NAME                              READY   STATUS        RESTARTS   AGE
hello-minikube-7bfc84c94b-bldr8   1/1     Terminating   0          31m

C:\WINDOWS\system32>kubectl get services
NAME         TYPE        CLUSTER-IP   EXTERNAL-IP   PORT(S)   AGE
kubernetes   ClusterIP   10.96.0.1    <none>        443/TCP   34m

C:\WINDOWS\system32>kubectl get deployments
No resources found in default namespace.


C:\WINDOWS\system32>

Pods
==============

smallest deployable units of computing that you can create and manage in k8s.
Remember NPC  (Node -> Pod --> Container)

**Each pod has unique IP address


--------------Creating pods using yaml files
k8s yaml files 

Top level 4
			pod,service	replicaset,deployment
apiVersion:		v1,v1,		apps/v1,apps/v1

kind:			service,pod
Metadata:  [dictionary]
	name: myapp-pod
	labels:
	     app:myapp
spec: 
	containers(List/Array)
	-name: nginx-container
	 image: nginx


Use case : We want to create a pod using yaml files

Step : Create pod.yaml


apiVersion: v1
kind: Pod
metadata:
  name: nginx
  labels:
    app: nginx
    tier: frontend
spec:
  containers:
    -  name: nginx
       image: nginx



:\>cd k8sdemo

H:\k8sdemo>cd pods

H:\k8sdemo\pods>dir
 Volume in drive H is Work
 Volume Serial Number is F0C2-D241

 Directory of H:\k8sdemo\pods

06-06-2022  21:09    <DIR>          .
06-06-2022  21:09    <DIR>          ..
06-06-2022  21:17               161 pod.yaml
               1 File(s)            161 bytes
               2 Dir(s)  111,407,583,232 bytes free

H:\k8sdemo\pods>kubectl apply -f pod.yaml
pod/nginx created

H:\k8sdemo\pods>kubectl get pods
NAME    READY   STATUS    RESTARTS   AGE
nginx   1/1     Running   0          13s


==================
Kuberenetes Controller (RC)

Replication Controller (RC)
helps us run multiple instances of a single POD in k8s cluster .. thus providing high availiabilty.

load balancing and scaling.

Replica Set
-------------new way of replication in k8s




			pod,service	replicaset,deployment
apiVersion:apps/v1		v1,v1,		apps/v1,apps/v1

kind:		replicaSet	
Metadata:  [dictionary]
	name: myapp-pod
	labels:
	     app:myapp
spec: 
	containers(List/Array)
	-name: nginx-container
	 image: nginx

	template:

	replicas : 6


	selector: ** this is new 


selector: helps to identify what pod falls under it ?

Why would we have to specify this ?
Ans : replicaset can also manages the pods that were created as part of the replicaset creation (details later)


Use case : We want to create replicaset file to create 6 replicas of my nginx 


apiVersion: apps/v1
kind: ReplicaSet
metadata:
  name: myapp-replicaset
  labels:
    app: myapp
spec:
  selector:
    matchLabels:
      app: myapp
  replicas : 6
  template:
    metadata:
      name: nginx-2
      labels:
        app: myapp
    spec:
      containers:
        - name: nginx
          image: nginx
              


https://kubernetes.io/docs/concepts/workloads/controllers/replicaset/#how-a-replicaset-works


Another way :

kubectl edit replicaset myapp-replicaset



https://docs.google.com/spreadsheets/d/1t7KpwSPPmpy1ij6IjmcrNXU5i29ngo0oqcFWUTjo1Vs/edit?usp=sharing

==================================================================================================


Creating DemoService and creating deployments for that.

H:\k8sdemo\DemoService

Generate the jar file
Create docker image
Push docker image to docker hub


docker build -t demoservice:latest .

docker login

H:\k8sdemo\DemoService>docker tag demoservice:latest 8867205331/dockerhub:demoservice

H:\k8sdemo\DemoService>docker push 8867205331/dockerhub:demoservice

Your docker image should be in the docker hub


Create demo-deployment.yml

apiVersion: apps/v1
kind: Deployment
metadata:
  name: demo-deployment
  labels:
    app: demo
spec:
  replicas: 2
  selector:
    matchLabels:
      app: demo
  template:
    metadata:
      labels:
        app: demo
    spec:
      containers:
      - name: demo
        image: 8867205331/dockerhub:demoservice
        ports:
        - containerPort: 8080
        #imagePullPolicy: Never
        # livenessProbe:
        # readinessProbe:


H:\k8sdemo>kubectl create -f demo-deployment.yml
deployment.apps/demo-deployment created


H:\k8sdemo>kubectl get deployments
NAME              READY   UP-TO-DATE   AVAILABLE   AGE
demo-deployment   2/2     2            2           96s

H:\k8sdemo>kubectl get pods
NAME                               READY   STATUS    RESTARTS   AGE
demo-deployment-5987cf6f74-wtc78   1/1     Running   0          107s
demo-deployment-5987cf6f74-x4ppn   1/1     Running   0          107s

H:\k8sdemo>kubectl expose deployment demo-deployment --type=NodePort --port=8080
service/demo-deployment exposed

H:\k8sdemo>minikube service demo-deployment --url
http://192.168.59.109:32636

H:\k8sdemo>kubectl get svc
NAME              TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)          AGE
demo-deployment   NodePort    10.103.246.182   <none>        8080:32636/TCP   5m8s
kubernetes        ClusterIP   10.96.0.1        <none>        443/TCP          16m


http://192.168.59.109:32636/hello

Done!!


Deployments
==================
create deployment.yaml

apiVersion: apps/v1
kind: Deployment
metadata:
  name: myapp-deployment
  labels:
    tier: frontend
    app: myapp
spec:
  selector:
    matchLabels:
      app: myapp
  replicas: 6
  template:
    metadata:
      name: nginx-2
      labels:
        app: myapp
    spec:
      containers:
        - name: nginx
          image: nginx
      


kubectl create -f deployments.yaml


updates and rollback in deployments
--------------------------------------------

rollout and versioning

revision 1
new rollout revision 2

??helps ypu to rollback particular revision

kubectl rollout status myapp-deployment
kubectl rollout history myapp-deployment


deployment strategies :
1) destroy all the replicas at once then create 3 new replicas

2) rolling update ( defaut deployment strategy )

Use case : nginx


=========================================================

H:\k8sdemo\deployment>kubectl create -f deployments.yaml
deployment.apps/myapp-deployment created

H:\k8sdemo\deployment>kubectl rollout status deployment.apps/myapp-deployment
Waiting for deployment "myapp-deployment" rollout to finish: 0 of 6 updated replicas are available...
Waiting for deployment "myapp-deployment" rollout to finish: 1 of 6 updated replicas are available...
Waiting for deployment "myapp-deployment" rollout to finish: 2 of 6 updated replicas are available...
Waiting for deployment "myapp-deployment" rollout to finish: 3 of 6 updated replicas are available...
Waiting for deployment "myapp-deployment" rollout to finish: 4 of 6 updated replicas are available...
Waiting for deployment "myapp-deployment" rollout to finish: 5 of 6 updated replicas are available...
deployment "myapp-deployment" successfully rolled out

H:\k8sdemo\deployment>kubectl rollout history deployment.apps/myapp-deployment
deployment.apps/myapp-deployment
REVISION  CHANGE-CAUSE
1         <none>

=========================================================

1. 1.1.17
2. 1:18
3. 1.18-perl


kubectl create -f deployments.yaml

kubectl rollout status deployment.apps/myapp-deployment

kubectl rollout history deployment.apps/myapp-deployment

kubectl create -f deployments.yaml --record

kubectl rollout history deployment.apps/myapp-deployment

kubectl describe deployment myapp-deployment

kubectl set image deployment myapp-deployment nginx=nginx:1.18-perl --record=true

kubectl rollout undo deployment.apps/myapp-deployment

Please allow your cohort to join the portfolio orientation scheduled between 10:30 AM EST and 11 AM EST on Wednesday 6/8/2022.

Also, forward the zoom link attached in the calendar invite.

Dharshanaa Kamaraj is inviting you to a scheduled Zoom meeting.

Topic: Dharshanaa Kamaraj's Zoom Meeting
Time: Jun 8, 2022 08:00 PM India

Join Zoom Meeting
https://revature.zoom.us/j/86096960143?pwd=dnNCVVMwN3VGUFVKZTJ2TGt4U1RlZz09


====================================================================

Services in k8s
---------------------
	Use cases : External configuration



192.168.78.8	- node	
192.168.88.8	- my laptop
internal pod 	10.244.0.0	10.244.0.2
10.244.0.2 XXX - Your laptop




This type of service is known as NodePort


Types of services:
	Nodeport
		External access to the application
		
	ClusterIP
	Load Balancer



service-definition.yaml

apiVersion: v1
Kind: service
Meta-Data
	type:NodePort
	spec:(most crucial and differs)
		-targetPort:80
		*-port:
		nodePort:30008	30000 - 32767


	selector:
		app:myapp
		type: front-end

kubectl get service
kubectl create -f service-definition.yaml



Service - Multiple Pods(6) in a single node
All will have same labels
K8s will :
the service automatically selects 6 pods as the endpoints for the external requests. 
You don’t have to do any additional configuration to make this happen. 
Load balancing will happen. It uses Random Algorithm.
Thus it acts as distributed load balancer.

What happens when pods are there in different nodes.

K8s automatically creates a service to include all the 36.

No configuration change is required.

Any changes gets automatically gets reflected.


Demo for service

deployment.yml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: myapp-deployment
  labels:
    tier: frontend
    app: myapp
spec:
  selector:
    matchLabels:
      app: myapp
  replicas: 6
  template:
    metadata:
      name: nginx-2
      labels:
        app: myapp
    spec:
      containers:
        - name: nginx
          image: nginx:1.7.1
      

service-definition.yml

apiVersion: v1
kind: Service
metadata:
  name: myapp
spec:
  type: NodePort
  ports:
  - port: 80
    targetPort: 80
    nodePort: 30004
  selector:
    app: myapp


----------------


H:\k8sdemo\deployment>kubectl create -f deployments.yaml
deployment.apps/myapp-deployment created


H:\k8sdemo\deployment>cd..

H:\k8sdemo>cd services

H:\k8sdemo\services>kubectl create -f service-definition.yml
service/myapp created


H:\k8sdemo\services>minikube service myapp --url
http://192.168.59.109:30004


http://192.168.59.109:30004	- Browser 


!!

------------------------Jenkins

Jenkins in an Open-Source Automation Server. It helps automate the building, testing, and deployment of an application for continuous integration and delivery.

It supports the development of CI/CD or DevOps "Pipelines".

Use case : We want to automate the process of deployment for our demo service app

https://www.jenkins.io/download/
https://get.jenkins.io/war-stable/2.332.3/jenkins.war




java -jar jenkins.jar --port 9090 



Tools required :
JDK1.8			C:\Program Files\Java\jdk1.8.0_202
Git installed		C:\Program Files\Git
Maven installed		H:\apache-maven-3.8.2-bin\apache-maven-3.8.2
Jenkins Installed		Already installed jsut now


Next Step  : Configure Jenkins -> Manage plugins --> Available --> git parameter --> Install without restart

Successfully configured jenkins

Next 
==============
Your-app
upload your-app in git hub

https://github.com/tufailahm/demo-service

https://github.com/tufailahm/demo-service.git


------------------------------------------------------
H:\k8sdemo\DemoService>git init
H:\k8sdemo\DemoService>git add .
H:\k8sdemo\DemoService>git commit -m "first commit"
H:\k8sdemo\DemoService>git branch -M master

H:\k8sdemo\DemoService>git remote add origin https://github.com/tufailahm/demo-service.git

H:\k8sdemo\DemoService>git push -u origin master





demo spring boot

Upload this in github
Create a job in jenkins to build this project
Change this project and add
	@GetMapping("/guest")
	public String guest(){
		return "Hello Guest";
	}

commit this change and see whether it is automically build or not ?


Build 1
Build 2


Jenkins
Email Notification

Download and install email plugin

1)Email Extension Plugin
2) Go to your gmail from where you want to send email
ta5005128@gmail.com
vwahdqigcysqhjot



Configure smtp in your jenkins



























Jenkins Pipeline


starts with the devlopment 		and ends with production





development							production


retry in jenkins pipeline




SECRET_PASSCODE	- 














SonarLint - code quality
Terraform
Maven - Recap
Git - Recap



k8s - remaining topics











Jenkins Pipeline
---------------------------


Pre requisite :
Jenkins installed

checklist 

PATH
JAVA_HOME
Docker pipeline - plugin


Maven
Git

Steps

Build
Test
Deploy	-Docker hub	





Maven
------------
compile
test
package
install





Next QC : Wednesday 

15th June 10:00 EST

Topics : Week5 and Week6

------------------------------------


Terraform
=============


Terraform	-

terraform init
terraform plan
terraform apply
terrform show

after making the changes : terraform apply

Verify

to destroy : terraform destroy


state in terraform
=================

commands 

terraform validate


==========Terraform - AWS======




EC2
Bucket
IAM 	- create users/roles/policy



AWS CLI	- simple utility --
https://awscli.amazonaws.com/AWSCLIV2.msi


























Ingress
Helm
Promethues and Grafana in Kubernetes
setting up alerts in k8s (promethues & k8s)
Application Health Check
Volumes
k8s jobs
Probes in kubernetes
AWS EKS (chargeable)



Project 

Ingress
===================
Internal ClusterIP
External : NodePort and LoadBalancer


Ingress 
	external service
	way of routing mechanism


http://192.68.88.8:30004/hello
Ingress is an external service which will allow external traffic - based on routing mechanism

In real world scenario , domain name


www.revatureapp.com/hello


v1: networking,k8s.io/v1
Kind: Ingress
metadata:
	name: my-ingress


	host :revatureapp.com

	http:
		path:/hello


Ingress Controller : is a component -- we have to add in k8s cluster


minikube addons list
minikube addons enable ingress
minikube addons list

ingress		enabled


demo-service.yml
demo-deployment.yml
ingress-svc.yml

kubectl get ingress

NAME           CLASS   HOSTS             ADDRESS          PORTS   AGE
demo-service   nginx   revatureapp.com   192.168.59.115   80      7m39s

update hosts file in windows/linux

notepad C:\Windows\System32\drivers\etc\hosts


----------Delete all the resources

kubectl delete -f ./


namespace in k8s
------------------------
arranged in mohammadapp
Hands on -- create a namespace of your name and put demoservice/deployments inside that

H:\k8sdemo\ingress>kubectl delete -f ./
deployment.apps "demo-deployment" deleted
service "demo-service" deleted
ingress.networking.k8s.io "demo-service" deleted

H:\k8sdemo\ingress>kubectl get all
NAME                 TYPE        CLUSTER-IP   EXTERNAL-IP   PORT(S)   AGE
service/kubernetes   ClusterIP   10.96.0.1    <none>        443/TCP   36m

H:\k8sdemo\ingress>kubectl apply -f ./
Error from server (NotFound): error when creating "demo-deployment.yml": namespaces "mohammadapp" not found
Error from server (NotFound): error when creating "demo-service.yml": namespaces "mohammadapp" not found
Error from server (NotFound): error when creating "ingress-svc.yml": namespaces "mohammadapp" not found

H:\k8sdemo\ingress>kubectl create namespace mohammadapp
namespace/mohammadapp created

H:\k8sdemo\ingress>kubectl apply -f ./
deployment.apps/demo-deployment created
service/demo-service created
ingress.networking.k8s.io/demo-service created

H:\k8sdemo\ingress>kubectl get all
NAME                 TYPE        CLUSTER-IP   EXTERNAL-IP   PORT(S)   AGE
service/kubernetes   ClusterIP   10.96.0.1    <none>        443/TCP   39m

H:\k8sdemo\ingress>kubectl get all -n mohammadapp
NAME                                   READY   STATUS    RESTARTS   AGE
pod/demo-deployment-5987cf6f74-2vvgh   1/1     Running   0          16s

NAME                   TYPE       CLUSTER-IP      EXTERNAL-IP   PORT(S)        AGE
service/demo-service   NodePort   10.102.212.18   <none>        80:31590/TCP   16s

NAME                              READY   UP-TO-DATE   AVAILABLE   AGE
deployment.apps/demo-deployment   1/1     1            1           16s

NAME                                         DESIRED   CURRENT   READY   AGE
replicaset.apps/demo-deployment-5987cf6f74   1         1         1       16s


Use case : I want to create namespace by file



----creating namespace from file

apiVersion: v1
kind: Namespace
metadata:
  name: helloapp


Microservices
=============

http://198.78.76.88/product	-GET
http://198.78.76.88/product	-POST


REST

ActiveMQ 	- Messaging service		- 192.168.59.115:30010	
PositionTracker	-				- 192.168.59.115:30020


webapp		-				30060


richardchesterwood/k8s-fleetman-position-simulator



==============================================================================================
P3
----------
Promethues & Grafana-k8s
Alert Manager - Slack

promethues-operator

192.168.49.2:30882		- Prometheus

Download crds.yaml and .yaml kops-monitoring.yaml from devops repo
H:\k8sdemo\monitoring>kubectl create -f crds.yaml
H:\k8sdemo\monitoring>kubectl create -f kops-monitoring.yaml



kubectl edit svc monitoring-kube-prometheus-prometheus -n monitoring

kubectl edit svc monitoring-grafana -n monitoring

Change type to LoadBalancer in both

H:\k8sdemo\monitoring>kubectl get all -n monitoring
Get the port numbers for both the above services

minikube ip

192.168.49.2
31196
30416



Alert - Slack
===========================================


Signup and login to slack
Create Workspace
Create Channel
App - incoming - link

https://hooks.slack.com/services/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

POST

payload={"text": "This is a line of text in a channel.\nAnd this is another line of text."}


kubectl get secret -n monitoring

kubectl get secret -n monitoring alertmanager-monitoring-kube-prometheus-alertmanager

kubectl get secret -n monitoring alertmanager-monitoring-kube-prometheus-alertmanager -o yaml

kubectl delete secret -n monitoring alertmanager-monitoring-kube-prometheus-alertmanager

create alertmanager.yaml


global:
  slack_api_url: 'https://hooks.slack.com/services/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'
route:
  group_by: ['alertname']
  group_wait: 5s
  group_interval: 1m
  repeat_interval: 10m
  receiver: 'slack'

receivers:
- name: 'slack'
  slack_configs:
  - channel: '#my-alerts'
    icon_emoji: ':bell:'
    send_resolved: true
    text: "<!channel> \nsummary: {{ .CommonAnnotations.summary }}\ndescription: {{ .CommonAnnotations.description }}\nmessage: {{ .CommonAnnotations.message }}"

kubectl create secret generic --from-file=alertmanager.yaml -n monitoring alertmanager-monitoring-kube-prometheus-alertmanager

wait for 10 minutes


--
kubectl edit svc monitoring-kube-prometheus-alertmanager -n monitoring


192.168.59.124:32207	-grafana
192.168.59.124:31957	- alertmanager
192.168.59.124:31753	- promethues

** The alert manager will automatically fire all the alerts irrespective of namespaces



K8s jobs
==============


Jobs -- batch processing /schedule
cronjobs

Use case : Batch processing 



Create job.yaml

apiVersion: batch/v1 
kind: Job 
metadata:   
  name: kubernetes-job-example   
  labels:     
    jobgroup: jobexample 
spec:   
  template:     
    metadata:       
      name: kubejob       
      labels:         
        jobgroup: jobexample     
    spec:       
      containers:       
      - name: c         
        image: devopscube/kubernetes-job-demo:latest         
        args: ["100"]       
      restartPolicy: OnFailure


H:\kubdemo\monitoring>kubectl apply -f job.yaml
job.batch/kubernetes-job-example created

H:\kubdemo\monitoring>kubectl get jobs
NAME                     COMPLETIONS   DURATION   AGE
kubernetes-job-example   0/1           53s        53s

H:\kubdemo\monitoring>kubectl get po
NAME                           READY   STATUS              RESTARTS   AGE
kubernetes-job-example-blf6x   0/1     ContainerCreating   0          22s

H:\kubdemo\monitoring>kubectl get all
NAME                               READY   STATUS    RESTARTS   AGE
pod/kubernetes-job-example-blf6x   1/1     Running   0          58s

NAME                 TYPE        CLUSTER-IP   EXTERNAL-IP   PORT(S)   AGE
service/kubernetes   ClusterIP   10.96.0.1    <none>        443/TCP   3h35m

NAME                               COMPLETIONS   DURATION   AGE
job.batch/kubernetes-job-example   0/1           59s        59s

H:\kubdemo\monitoring>kubectl logs pod/kubernetes-job-example-blf6x -f
This Job will echo message 100 times
1] Hey I will run till the job completes.


Done!!



=============================Readiness and livenes probe


  spec:
        containers:
        - name: webapp
          image: richardchesterwood/k8s-fleetman-api-gateway:release1
          readinessProbe:
            httpGet:
              path: /
              port: 8080

=





Introduction to Helm Charts
Working with Helm charts



package manager

Before helm 
so many files

-- consistency 
-- revision history

Install choco (powershell)
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))

Install Helm(cmd(admin))
choco install kubernetes-helm


helm

helm install apach 

-----------------------------

helm

parameters

type: Loadbalancer

** It uses a go language

Charts files
===============

Chart.yaml
values.yaml
templates
	service.yaml
	deployments.yaml
	template.tpl
	
test



https://revature.zoom.us/rec/share/OiuP8_NRbWPMuOM04XymaTL7-_baWLTrD-P8iE4mcLm-XIzbbmnc6_OVt6DJgmQ2.j5HZ12zgR1N78vQo
Passcode: %G6Gk7Gi
recording link for portfolio orientation, incase if you need



{{  - Actions - used to write some logics /codes


Pipelines ( | )




  {{- "Hello guest"}}
  {{- "Message in deployment is :" }} {{- .Values.hello.message }}
  {{- "Message in deployment is :" }}
  {{- .Values.hello.authorname | default "values are missing" | upper | quote | nindent 2 }}
 
  {{- if .Values.hello.flag }}
  {{- "Output of" | indent 3}}
  {{- end}}

  {{- with .Values.hello.countries }}
  {{- toYaml . | indent 3 }}
  {{- end}}

  {{- range .Values.hello.countries }}
  {{- toYaml . | indent 3 }}
  {{- end}}

  
  {{- .Chart.Name }}
  {{- .Chart.Version }}
  {{- .Chart.AppVersion }}

  {{-  .Release.Name }}
  {{-  .Release.AppVersion }}
  {{-  .Release.IsInstall }}
  {{-  .Release.IsUpgrade }}

  {{-  .Template.Name }}
  {{-  .Template.BasePath }}


Grafana		-locally		-k8s	
Sonar Qube	-




Application Health Check: Health and monitoring of Kubernetes cluster
AWS EKS
K8s volumes





JProfiler
JMeter
Incident Management

----------------------------------------------

kubectl port-forward deployment/mongo 28015:27017


==============================================================
Helm charts

helm install 
Postgresql 	-local,rds,k8s
volumes
Sonarqube	- quality code analysis
AWS EKS
Application Health Check: Health and monitoring of Kubernetes cluster

Post lunch - p2



=========
DB - posgres-k8s

config.yaml
# Create ConfigMap postgres-secret for the postgres app
# Define default database name, user, and password
apiVersion: v1
kind: ConfigMap
metadata:
  name: postgres-secret
  labels:
    app: postgres
data:
  POSTGRES_DB: appdb
  POSTGRES_USER: appuser
  POSTGRES_PASSWORD: strongpasswordapp

---
apiVersion: v1
kind: PersistentVolume # Create PV 
metadata:
  name: postgres-volume # Sets PV name
  labels:
    type: local # Sets PV's type
    app: postgres
spec:
  storageClassName: manual
  capacity:
    storage: 10Gi # Sets PV's size
  accessModes:
    - ReadWriteMany
  hostPath:
    path: "/data/postgresql" # Sets PV's host path

---
apiVersion: v1
kind: PersistentVolumeClaim # Create PVC
metadata:
  name: postgres-volume-claim # Sets PVC's name
  labels:
    app: postgres # Defines app to create PVC for
spec:
  storageClassName: manual
  accessModes:
    - ReadWriteMany
  resources:
    requests:
      storage: 10Gi # Sets PVC's size

---
apiVersion: apps/v1
kind: Deployment # Create a deployment
metadata:
  name: postgres # Set the name of the deployment
spec:
  replicas: 3 # Set 3 deployment replicas
  selector:
    matchLabels:
      app: postgres
  template:
    metadata:
      labels:
        app: postgres
    spec:
      containers:
        - name: postgres
          image: postgres:12.10 # Docker image
          imagePullPolicy: "IfNotPresent"
          ports:
            - containerPort: 5432 # Exposing the container port 5432 for PostgreSQL client connections.
          envFrom:
            - configMapRef:
                name: postgres-secret # Using the ConfigMap postgres-secret
          volumeMounts:
            - mountPath: /var/lib/postgresql/data
              name: postgresdata
      volumes:      # datas in k8s
        - name: postgresdata
          persistentVolumeClaim:
            claimName: postgres-volume-claim

---
apiVersion: v1
kind: Service # Create service
metadata:
  name: postgres # Sets the service name
  labels:
    app: postgres # Defines app to create service for
spec:
  type: NodePort # Sets the service type
  ports:
    - port: 5432 # Sets the port to run the postgres application
  selector:
    app: postgres

kubectl apply -f config.yaml

kubectl get all

kebectl logs <pod-name>

Client :
kubectl exec -it pod/postgres-75b8fd84f-2nxf2 -- psql -h localhost -U appuser --password -p 5432 appdb



sonar-qube	- tool which has all the rules
sonar-scanner	- scanner our projects and giving us the report

Install locally





minikube delete 

minikube start



===============Sonar qube

create sonar-qube.yaml

apiVersion: apps/v1
kind: Deployment
metadata:
  name: sonarqube
spec:
  replicas: 1
  selector:
    matchLabels:
      app: sonarqube
  template:
    metadata:
      name: sonarqube
      labels:
        app: sonarqube
    spec:
      containers:
        - image: sonarqube:latest
          args:
            - -Dsonar.web.context=/sonar
          name: sonarqube
          env:
            - name: POSTGRES_URL
              value: jdbc:postgresql:/localhost:5432/appdb
            - name: POSTGRES_DB
              value: appdb
            - name: POSTGRES_USER
              value: appuser
            - name: POSTGRES_PASSWORD
              value: strongpasswordapp

          ports:
            - containerPort: 9000
              name: sonarqube


---
apiVersion: v1
kind: Service
metadata:
  labels:
    name: sonar
  name: sonar
spec:
  type: NodePort
  ports:
    - port: 80
      targetPort: 9000
      name: sonarport
  selector:
    name: sonarqube


-------------------------wait for 2-3 minutes


kubectl edit service/sonar

change iot to load balancer



**check the logs of sonar-pod

** it must not give you any error

kubectl port-forward deployment.apps/sonarqube 9000:9000


localhost:9000/sonar


Use case : We want to scan demo project for code quality using sonarqube
=================================================================

download sonar scanner 	https://docs.sonarqube.org/latest/analysis/scan/sonarscanner/

unzip and goto config folder of sonar scanner and update the below line sonar-scanner.properties

#----- Default SonarQube server
sonar.host.url=http://localhost:9000/sonar
sonar.login=admin
sonar.password=admin123


set path for sonar scanner

PATH = H:\scannerdemo\sonar-scanner-cli-4.7.0.2747-windows\sonar-scanner-4.7.0.2747-windows\bin

Verify 

open new cmd(admin)

sonar-scanner and it should not give error



-------------------------------------configure your project - sonar can be scanned

pom.xml - maven plugin
update this to plugins

			<plugin>
				<groupId>org.sonarsource.scanner.maven</groupId>
				<artifactId>sonar-maven-plugin</artifactId>
				<version>3.4.0.905</version>
			</plugin>


maven update

sonar-project.properties	/root of your project

sonar.projectKey=TufailDemoProject
sonar.projectName=TufailDemoProject
sonar.sourceEncoding=UTF-8
#sonar.sources=src
sonar.exclusion=
sonar.sources=src/main/java/
sonar.language=java
#sonar.java.binaries=**/target/classes
#sonar.java.binaries=bin
#sonar.java.binaries=**/classes/**
sonar.java.binaries=target


Open terminal inside intellij

sonar-scanner

'
Done!!

Refresh your sonar qube and your project should reflect there




p2 presentation : 4:00 PM EST (Tuesday) 21-June -2022


Push your project  - Git - ReadMe.md	


p3 handover - 4:30 PM EST (Monday) -20-June-2022

p3 presentation - 7th July 2022 - Thursday 4:00 PM EST 

=========


EKS

-1) Please select us-west-2 region

0) Please create EC2 keypair , ignore if you have already (optional)

naming convention - revatureEKS


==========EKS


1) Create an AWS IAM service role
You need to create an IAM role that allows Kubernetes to create AWS resources.

Navigate to AWS IAM Console and to “Roles” section and click “Create Role”. Select “AWS services” as the trusted entity and “EKS” as the service type and select “EKS” as the use case.

AWS Service ==> EKS ==> EKS Cluster

Next --> Next > Give a name and save it
revatureEKSRole

Create Role















2) 

Create a VPC to deploy the cluster

Navigate to “AWS CloudFormation” and click on “Create Stack” and give below URL as “Amazon S3 URL”.

** Please check the region

Create Stack --> with new resources(standard)
https://amazon-eks.s3-us-west-2.amazonaws.com/cloudformation/2019-02-11/amazon-eks-vpc-sample.yaml

revatureEKSStack1




===================================

3. Configure kubectl for Amazon EKS

In this point, I assume you have already installed kubectl and aws-cli in your machine. If you don’t install it yet please refer below documents to do so.

Install Kubectl: https://kubernetes.io/docs/tasks/tools/install-kubectl/

Install AWS CLI: https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-configure.html

Once you setup kubectl and AWS-CLI in your machine run below command to configure kubectl for AWS EKS.


===============================================




4. Create AWS EKS Cluster

Navigate to “AWS EKS” service and click “Create cluster”.

Give any name as the “Cluster name” and give the previously created Role name as the “Role name”. Now give the information obtained in step 2 to complete the VPC details as shown below and click “Create cluster”.
revatureEKSCluster

** select the VPS - tuesdayStack1-VPS ( that we created in step2)

Next --> Next --> Create



5. Linking

aws eks --region <region> update-kubeconfig --name <clusterName>


aws eks --region us-west-2 update-kubeconfig --name revatureEKSCluster



=====*** Please check the region before creating the stack
Now we need to create worker nodes to join the Kubernetes cluster. To create them, navigate again to AWS CloudFormation and click on “Create stack”.

Give the below URL as the Amazon S3 URL and click Next.

https://amazon-eks.s3-us-west-2.amazonaws.com/cloudformation/2019-02-11/amazon-eks-nodegroup.yaml

In the next page, you need to fill the required information as below.

Stack name: GIve any unique name to the stack [ revatureEKSWorkerStack1]

ClusterName: Give the previously created Kubernetes cluster name

ClusterControlPlaneSecurityGroup: Give the SecurityGroup value obtained from the outputs in step 2.

NodeGroupName: Give any unique name

NodeAutoScalingGroupMinSize: 1

NodeAutoScalingGroupDesiredCapacity: 3

NodeAutoScalingGroupMaxSize: 4

NodeInstanceType : t3.medium

NodeImageId: Give a suitable Node image ID. Use the below table to choose the correct image-id according to the region you used. Refer the EKS AMI document to find the correct AMI ID. (EX: NodeImageID for 1.16 version Sydney region is ami-09e7454072d169c9b)
https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html

KeyName: An EC2 Key Pair to allow SSH access to the instances.

VpcId: Give the VpcId value obtained from the outputs in step 2.

Subnets: Give the SubnetIds values obtained from the outputs in step 2.

After giving the above-required information, then click on “Create stack” to launch the worker node stack.

After creating the worker node stack, go to stack outputs and copy the “NodeInstanceRole” value.


Now you need to enable worker nodes to join your cluster.

=========================
Goto the below and change the ip to public and save

https://us-west-2.console.aws.amazon.com/vpc/home?region=us-west-2#subnets:
=========================

Create node group

your cluster name	--> compute -->  Add node group

Select your role that you created above.

Select your subnets that you change just now to public
====================================




vim ~/.kube/aws-auth-cm.yaml
Create the above file and fill it with the below content and replace the <ARN of instance role> snippet with the NodeInstanceRole taken from outputs above.

apiVersion: v1
kind: ConfigMap
metadata:
 name: aws-auth
 namespace: kube-system
data:
 mapRoles: |
   - rolearn:  <ARN of instance role>
     username: system:node:{{EC2PrivateDNSName}}
     groups:
       - system:bootstrappers
       - system:nodes
Then run below commands to apply the configurations.

kubectl apply -f aws-auth-cm.yaml
Now your AWS EKS Cluster is ready to create your favorite application on your Kubernetes cluster.

Section Two: Launch your app in Kubernetes
To launch an app in Kubernetes, you need to deploy a deployment file and a service file.

Create a helloworld.yaml file and use the below content in it.

---
apiVersion: apps/v1
kind: Deployment
metadata:
  name: helloworld-deployment
  labels:
    app: helloworld
spec:
  replicas: 1
  selector:
    matchLabels:
      app: helloworld
  template:
    metadata:
      labels:
        app: helloworld
    spec:
      containers:
      - name: helloworld
        image: dockercloud/hello-world
        ports:
        - containerPort: 80
And then create a service file with the name helloworld-service.yaml and use the below content in it.

apiVersion: v1
kind: Service
metadata:
  name: "service-helloworld"
spec:
  selector:
    app: helloworld
  type: LoadBalancer
  ports:
  - protocol: TCP
    port: 80
    targetPort: 80
Then launch the above deployment and the service in your Kubernetes cluster as follows.

kubectl apply -f helloworld.yaml
kubectl apply -f helloworld-service.yaml
Now get the details of the running helloworld service in your cluster.

kubectl get svc service-helloworld -o yaml
It will give the below content,

apiVersion: v1
kind: Service
metadata:
  annotations:
    kubectl.kubernetes.io/last-applied-configuration: |
      {"apiVersion":"v1","kind":"Service","metadata":{"annotations":{},"name":"service-helloworld","namespace":"default"},"spec":{"ports":[{"port":80,"protocol":"TCP","targetPort":80}],"selector":{"app":"helloworld"},"type":"LoadBalancer"}}
  creationTimestamp: 2019-06-14T06:45:24Z
  name: service-helloworld
  namespace: default
  resourceVersion: "10463"
  selfLink: /api/v1/namespaces/default/services/service-helloworld
  uid: fccb03b3-8e6f-11e9-81eb-0216dc268822
spec:
  clusterIP: 10.100.73.199
  externalTrafficPolicy: Cluster
  ports:
  - nodePort: 32322
    port: 80
    protocol: TCP
    targetPort: 80
  selector:
    app: helloworld
  sessionAffinity: None
  type: LoadBalancer
status:
  loadBalancer:
    ingress:
    - hostname: afccb03b38e6f11e981eb0216dc26882-2016688520.us-west-2.elb.amazonaws.com

=====================Please Wait for some time



======================




========================cmd

H:\>cd awseks

H:\awseks>kubectl apply -f aws-auth-cm.yaml
configmap/aws-auth created

H:\awseks>kubectl apply -f helloworld.yaml
deployment.apps/helloworld-deployment created

H:\awseks>kubectl apply -f helloworld-service.yaml
service/service-helloworld created

H:\awseks>
H:\awseks>kubectl get svc service-helloworld -o yaml


----------------------check once this

H:\awseks>kubectl get all
NAME                                         READY   STATUS    RESTARTS   AGE
pod/helloworld-deployment-78dddb8bc4-bm8gs   1/1     Running   0          101m

NAME                         TYPE           CLUSTER-IP     EXTERNAL-IP                                                              PORT(S)        AGE
service/kubernetes           ClusterIP      10.100.0.1     <none>                                                                   443/TCP        166m
service/service-helloworld   LoadBalancer   10.100.107.3   a5c56fdc8850f4b739a21312ed55fd10-493586411.us-west-2.elb.amazonaws.com   80:32712/TCP   101m

NAME                                    READY   UP-TO-DATE   AVAILABLE   AGE
deployment.apps/helloworld-deployment   1/1     1            1           101m

NAME                                               DESIRED   CURRENT   READY   AGE
replicaset.apps/helloworld-deployment-78dddb8bc4   1         1         1       101m


-----------------------------
check the hostname :::

   - hostname: a5c56fdc8850f4b739a21312ed55fd10-493586411.us-west-2.elb.amazonaws.com


-----------------

H:\awseks>kubectl get nodes
NAME                                            STATUS     ROLES    AGE    VERSION
ip-192-168-126-17.us-west-2.compute.internal    NotReady   <none>   114s   v1.22.9-eks-810597c
ip-192-168-166-50.us-west-2.compute.internal    NotReady   <none>   115s   v1.22.9-eks-810597c
ip-192-168-179-186.us-west-2.compute.internal   Ready      <none>   66s    v1.22.9-eks-810597c
ip-192-168-235-103.us-west-2.compute.internal   NotReady   <none>   113s   v1.22.9-eks-810597c
ip-192-168-94-219.us-west-2.compute.internal    Ready      <none>   75s    v1.22.9-eks-810597c


------------------------------
There you can get the hostname as the bolted above. Now you can access the service with that hostname in the browser. Just type this hostname in your favorite browser, it will show your hello world service :) Mohammad Tufail Ahmed


===========================

important dates : 

Cummulative QC : ?? Yet to update 27th or 28th

Cognizant Interview : 30th June and 1st July

p3 showcase : 7th July

Graduation day : 8th July

==============================



How many associates they are planning to hire ?
how soft skills vs technical skills ?


Core Java
---------------
SQL
------
Maven
------
Git

Question :


Abstract class vs Interface 
Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
Multiple implementations: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.



Question :

Why main is static 

The main() method is static so that JVM can invoke it without instantiating the class.
 This also saves the unnecessary wastage of memory which would have been 
used by the object declared only for calling the main() method by the JVM

=====================


What are enumerations (enums)?	A special Java type that defines a collection of constants
	Why are strings immutable in java?	Identical String literals are collected in the "String pool" in an effort to conserve memory. Reference variables will then point to the same String object instance. Changing the object's state in the String pool will make changes to all references to that String object. Instead, when a change to a String is made, the JVM makes a new String object, and the reference variable points to the new String in the String pool.
	What is the difference between `String`, `StringBuilder`, and `StringBuffer`?	Strings are immutable.  Both `StringBuilder` and `StringBuffer` are mutable.  Furthermore, `StringBuffer` is sychronized while `StringBuilder` is not.
	What are annotations?	A type of syntactic metadata added to the code, read by the compiler - use @ syntax
	Explain stack vs heap?	Heap is where objects are stored in memory. Stack is where local variable references are kept - a new stack is created for each method invocation
	What is a POJO? What is a bean?	"POJO - plain old Java object. Any Java object that you create.
Bean - a POJO that has private data members, public getters/setters, and overrides .hashcode, .equals, and .toString methods"
	How can you force garbage collection in Java?	Garbage collection cannot be forced but only requested using `System.gc()`.
	What is the difference between `final`, `.finalize()`, and `finally`?	"a. `final`: final keyword can be used for class, method and variables. A final class cannot be subclassed and it prevents other programmers from subclassing a secure class to invoke insecure methods. A final method can't be overridden. A final variable can't change from its initialized value.
b. `finalize()`: finalize method is used just before an object is destroyed and called just prior to garbage collection.
c. `finally`: finally, a key word used in exception handling, creates a block of code that will be executed after a `try/catch` block has completed and before the code following the `try/catch` block. The `finally` block will execute whether or not an exception is thrown. For example, if a method opens a file upon exit, then you will not want the code that closes the file to be bypassed by the exception-handling mechanism. This finally keyword is designed to address this contingency."
	What is a Marker interface?	A marker interface is an interface which has no methods at all. Example: `Serializable`, `Remote`, `Cloneable`. Generally, they are used to give additional information about the behavior of a class.


	What are the access modifiers in Java? Explain them.	
"public  - can be accessed from any package.
private - only members of the same class can access.
protected - can be accessed by classes inside the package and subclasses anywhere.
default - no access by classes or subclasses outside the package"


	What are the non-access modifiers in Java?	static, final, abstract, default, synchronized, transient, volatile, native, strictfp


What is the difference between static and final variables?	Static variable is a global variable shared by all the instances of objects and it has only single copy.  A final variable is a constant variable and it cannot be changed.
	What are the default values for all data types in Java?	Objects - null. int, short, byte, long, float, double - 0. boolean - false. char - 'u0000' (null character)
	What are the implicit modifiers for interface variables / methods?	methods - public abstract; variables - public static final
	What is a wrapper class?	Wrapper class is a wrapper around a primitive data type. It represents primitive data types in their corresponding class instances e.g. a boolean data type can be represented as a Boolean class instance. All of the primitive wrapper classes in Java are immutable i.e. once assigned a value to a wrapper class instance cannot be changed further.
	What is autoboxing / unboxing?	Auto-boxing is the automatic conversion of primitives to their wrapper classes by the compiler. Useful for adding primitives to collections
	Is Java pass-by-value or pass-by-reference?	Java is strictly pass by value. Even when object references are passed as arguments, it is the value of the reference that is passed
	What is synchronized keyword?	Only allowing one thread access to the method or variable at a time - enforces thread-safety

	What is the difference between `==` and `.equals()`?	"`==` -  tests to see if two reference variables refer to the exact same instance of an object.
`.equals()` - tests to see if the two objects being compared to each other are equivalent, but they need not be the exact same instance of the same object."
	First line of constructor?	The compiler will insert `super()` as the first line - it cannot be used anywhere else in constructor except for the first line

===================================

=============
What is String and what are the different ways of creating string
- String is a class in java belongs to java.lang package
- final and immutable class 
- Strings in Java are Objects that are backed internally by a char array.

what are the different ways of creating string (two ways)
a) String str1 = "Revature"
b) String str2 = new String("Revature");

By string literal : Java String literal is created by using double quotes. For Example: String s=“Welcome”;
By new keyword : Java String is created by using a keyword “new”. For example: String s=new String(“Welcome”);

== 	- checks the reference
equals	- checks the value

List some methods of string
concat, length, substrin, split,indexOf,charAt,compareTo,contains and etc
==============================================================

Difference between overloading and overriding

When two or more methods in the same class have the same name but different parameters, it’s called Overloading.

When the method signature (name and parameters) are the same in the superclass and the child class, it’s called Overriding.

1) Overriding implements Runtime Polymorphism whereas Overloading implements Compile time polymorphism.
2) The method Overriding occurs between superclass and subclass. Overloading occurs between the methods in the same class.
3) Overriding methods have the same signature i.e. same name and method arguments.
 Overloaded method names are the same but the parameters are different.

====================================================================================

When a child class calls a method that both the child & parent share, which one gets executed? (overriding)
Ans : Child

With method loading, can you have an "Add" method with integers as parameters and a second "Add" method with doubles as parameters?
- will this cause a compile time error?
No, overloading

====================================================================================
What is a static variable?
Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution.
 It is a variable which belongs to the class and not to object(instance ). 
Static variables are initialized only once, at the start of the execution.


====================================================================================
Is it legal to change a static variable value?
Yes.. it can be changed. But, what makes static variable unique is static variables belongs to the class instead of a particular object.


Can you access static variables using reference variables without using the class name?
Yes, it will give warning and not errors

What is the difference between default scope vs protected scope? -refering to access modifiers

default - same package
protected - same package + child classes in another packages

========================================================================================
final keyword	- cannot be changed

final class	- cannot be inherited
final method 	- cannot be overridden


Collection vs Collections
----------------------
is a framework in java
it has lots of built in classes and interfaces suited to store data.

Collection			Collections
interface				class
				which has lots of useful static methods like binarySearch


7. What kind of Collections have you used?
List ( can accept duplicate values)

	ArrayList		-dynamic array - not sync and not thread safe	- used for iteration (faster)
	LinkedList	- internally uses Double Linked list - it is used for in the case of frequent adding and removing elements
	Vector		- same like arraylist except it is thread safe - which means only one thread at a time can access the code,

Set (will not accept duplicates)
	HashSet		- no Duplicate, unordered,no order
	LinkedHashSet	-  order as inserted
	TreeSet		- sorted
Key Value
Map	TreeMap		- sorted based on keys
	LinkedHashMap	- order as inserted based on keys
	HashMap		- no Duplicate keys , unordered,no order is guranteed, HashMap is non-synchronized , not thread safe
	HashTable	- HashMap is synchronized and thread safe

	Queue		- FIFO
	Stack		- LIFO



JDBC

DriverManager class - to make a connection with a database driver
DataSource interface - for retrieving connections, an alternative to DriverManager
Connection interface - represents a physical connection with a database
SQLException class - a general exception thrown when something goes wrong when accessing the database
Statement interface - used for executing static SQL statements
PreparedStatement interface - represents pre-compiled SQL statements
CallableStatement interface - used to execute stored procedures
ResultSet interface - represents data returned from the database


boolean 	result = statement.execute	(DDL)	create,alter, drop ,truncate
ResultSet res = statement.executeQuery	(DQL) select
int res = statement.executeUpdate (DML)





======SQL


SQL language and sublanguages
DDL (data definition)
Create, Alter, Drop, Truncate
DML (data manipulation)
insert, delete , update
DQL (data query)
select 
DCL (data control)
grant, revoke
TCL (transaction control)
commit, rollback and savepoint

RDBMS systems and popular vendors
NoSQL
---------
MongoDB


Relational vs non-relational databases
SQL data types
number

Aliases
Joins
Inner
Outer
Left
Right
Cross
Self
Equi / non-equi
Theta
Natural
Set Operations
Union
Union All
Intersect
Minus / Except

select * from employees where employeeId = 100;


INNER JOIN.
The most commonly used type of join, returns rows only if the columns specified in the join clause match.
OUTER JOIN.
The OUTER keyword can be used with LEFT, RIGHT or FULL keywords to obtain rows which some of the join columns are NULL.
However, in Oracle, this word is optional. LEFT, RIGHT or FULL will be automatically OUTER.
LEFT [OUTER] JOIN.
Returns the matching rows plus the ones that where null in the first table.
RIGHT [OUTER] JOIN.
Returns the matching rows plus the ones that where null on the second table.
FULL [OUTER] JOIN.
Returns all rows from both tables specified including the ones which had null values on either side.
CROSS JOIN.
Returns the cartesian product two or more tables.
SELF JOIN.
An INNER JOIN performed matching two columns existing in the same table.
They represent hierarchies.
NATURAL JOIN
Used as a shortcut so that the join predicate is not needed to be specified
The tables are joined on matching column names






Indexes
Views
Aggregate functions
MIN
MAX
AVG
COUNT
Scalar functions
LEN
UPPER
LOWER
TRIM
PL/SQL
Sequences
Triggers
Stored procedures
Cursors
Transactions
Properties of a transaction (ACID)
Atomicity
Consistent
Isolated
Durable
Isolation levels
Read uncommitted
Read committed
Repeatable read
Serializable





=====================

New features in JDK1.8

Lambdas
Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
new Date Time API()
default and static methods in interface

=======================

1)
Difference between Array and ArrayList

1)Array is a fixed length data structure whereas ArrayList is a variable length Collection class. 
2)We cannot change length of array once created in Java but ArrayList can be changed. 
3) We cannot store primitives in ArrayList, it can only store objects. But array can contain both primitives and objects in Java.

2)
Difference between Set and List
1. The List is an ordered sequence.	1. The Set is an unordered sequence.
2. List allows duplicate elements	2. Set doesn’t allow duplicate elements.
2.Multiple null elements can be stored.	3.Null element can store only once.


What is Object class in java ? List some methods of object class?
super class for all the classes in java, toString,equals,hashCode,wait, notify



Difference between Statement,PreparedStatement ?
Statement is used for executing simple SQL Statements 
PreparedStatement is used for executing dynamic and pre-compiled repetitive SQL Statements.	? represents placeholders


What is the use of CallableStatement ?
CallableStatement is used to call stored procedure


=================SQL==============================
what are the sub languages of SQL ?

DML	- insert, delete, update
DDL	- create,alter,drop,truncate
DQL	- select
TCL	- commit, rollback, savepoint
DCL 	- revoke and grant

Joins
differennce between inner and outer join
The biggest difference between an INNER JOIN and an OUTER JOIN is that the inner join will keep only the information from both tables that's related to each other (in the resulting table).
 An Outer Join, on the other hand, will also keep information that is not related to the other table in the resulting table

difference between left and right outer join
left outer - left side all the data would be displayed
right outer - right side all the data would be displayed
full outer - both side , all the data would be displayed

10.
Do you know anything about SQL queries? 
What types of Joins are there? What is the syntax to join two tables?

select * from table1 t1 join table2 t2 on t2.id = t1.fkId

city,country_name

10 minutes

way to remember is aggregate requires more than one value whereas scalar is on one

Aggregate Functions
SUM()
COUNT() 
AVG() 
MIN()
MAX()
FIRST()
LAST() 
Scalar Functions
LCASE()
UCASE() 
LEN()
MID() 
ROUND() 
NOW()
FORMAT()


group by clause
------------------------
part of DQL sub language used with aggregate functions
The GROUP BY statement groups rows that have the same values into summary rows, like "find the number of customers in each country".

The GROUP BY statement is often used with aggregate functions (COUNT(), MAX(), MIN(), SUM(), AVG()) to group the result-set by one or more columns.
Example : group sum of salary of employees based onn departments
select department_id,sum(salary) from employees
group by department_id


** where vs having clause
having can be used with aggregate functions correct

A HAVING clause is like a WHERE clause, but applies only to groups as a whole (that is, to the rows in the result set representing groups), whereas the WHERE clause applies to individual rows.


		employees	departments
WAQ to print first_name,salary,	department_name  of all the employees who reports to 'Alex'

select first_name, salary, department_name
from employee e
join deparment d
on e.department_id = d.department_id
where manager id = (select employee_id where first_name = 'Alex')


select e.first_name, e.salary, d.department_name 
from employees e join departments d on (e.employee_id = d.manager_id)
where e.manager_id = (select e2.employee_id from employees e2 where e2.first_name = 'Alex');


select employees.first_name, employees.salary,department_namme from employee Join department On depart.department_id = employee.employeee_id where employee_name = alex;


WAQ to print the sum of salary based on departments

select department_id, sum(salary) from employees
group by department_id



department_id, sum(salary)

10		98081


WAQ to print the sum of salary based on departments whose sum is > 6000


select department_id, sum(salary) from employees
group by department_id
having sum(salary) > 6000


List out the names and hiring date of all the employees who got hired after davies
select hire_date from employees where first_name like ='Davies'

08-08-2022

select first_name,hire_date from employees where hire_date > '08-08-2022'


Solution :
select first_name,hire_date from employees where hire_date > (select hire_date from employees where first_name like ='Davies')

10 minutes

From Leo Schaffner to Everyone 08:34 PM
select first_name, last_name, hire_date from employees e where hire_date > 
	(select hire_date from employees e2 where first_name = 'Davies')
From Ananda Magar to Everyone 08:38 PM
select first_name, last_name, hire_date from employees where hire_date > (select hire_date from employees where last_name = 'Davies')
From Nicole Pang to Everyone 08:38 PM
select first_name,hire_date from employees e where hire_date = (select hire_date from employees e where first_name = 'Davies');
From Chris Powell to Everyone 08:38 PM
select e.first_name, e.hire_date from employees e
where e.hire_date >
	(select e2.hire_date from employees e2 where lower(e2.first_name) = 'davies');
From Sidi Gassama to Everyone 08:39 PM
select first_name, last_name , hire_date from employees e where e.hire_date > (select hire_date from employees where first_name ="Davies")
From Luis Marquez to Everyone 08:39 PM
select first_name, last_name
from employees
where hire_date > (select hire_date from employees where lower(first_name) = 'davies');
From KirkWade Polasek to Everyone 08:39 PM
SELECT e.first_name, e.last_name, e.hire_date 
FROM employees e 
JOIN employees davies 
ON (davies.last_name = 'davies') 
WHERE davies.hire_date < e.hire_date;
From Xianghe Cheng to Everyone 08:39 PM
select first_name, last_name from employees where employees.hire_date > (select hire_date from employees where last_name = 'Davies');
From Brian Cunningham to Everyone 08:39 PM
select first_name, last_name 
from employees e 
where e.hire_date >=
(select hire_date from employees where employee last_name = "davies")
From Anthony Barone to Everyone 08:39 PM
select first_name, hire_date from employees e where hire_date > (select hire_date from employees e2 where first_name = 'Davies' )
From Zeru Yang to Everyone 08:40 PM
select first_name, last_name
from employee
where hire_date > (select hire_date from employee where lower(first_name) = 'davies');
From Sarina Joshi to Everyone 08:40 PM
Select first_name, last_name, hire_date from employees join employees davies where davies.hire_date < hire_date;

select first_name, last_name  from employees e where hire_date > (select hire_date from employees e2 where last_name = 'davies')



Constraints
We can put integrity constraints on specific columns in our database when defining tables, which allow us to enforce the schema by ensuring consistency and integrity of the data in the table. The different constraints are listed below:

PRIMARY KEY
FOREIGN KEY - Referential Integrity
NOT NULL
UNIQUE
CHECK
DEFAULT
AUTO INCREMENT
A primary key is a constraint that uniquely identifies a record in a table. Often, this constraint will be enforced on some sort of "ID" field, such as "employee_id". A primary key is inherently composed of two other constraints - unique and not null. Thus, a primary key MUST be provided when inserting a record into a table, unless the RDBMS system is generating it automatically behind the scenes.

A foreign key constraint signifies that a column represents a reference to the primary key of another table. This allows us to create relationships between tables. For example, if we are modeling cars and the owners of those cars, we might have a Car table with an owner_id foreign key that references the user_id field in the People table. We can then lookup the owner of any car by fetching the owner_id of the car and finding the matching user_id in the People table.

A not null constraint simply enforces that all records must have a field for the column on which this constraint is applied. For example, we know that every person has a social security number, so we might want to consider placing a not null constraint on that field in our users table (assuming we want to store the social security numbers). This prevents users of the database from leaving the table in an inconsistent or invalid state. The unique constraint works similarly - records cannot be inserted if another record already has the same value for the column on which this is declared.

The check constraint provides a way of performing validation on values before records are entered into the table. For example, we may want to ensure that a bank account can never have a negative balance, so we might set a check constraint (CHECK (balance >= 0)).

A default constraint allows setting default values on columns for records that are inserted into the table.

Finally Auto-increment allows a unique number to be generated automatically when a new record is inserted into a table. Very often the primary key of a table needs to be created automatically, and we define that field as AUTO INCREMENT field. Following is the syntax for creating an AUTO INCREMENT field.



Multiplicity
As mentioned before, table relationships can be defined using foreign key constraints. There are several different kinds of relationships that exist between tables in relational databases:

One to one
One to Many / Many to One
Many to Many
A one-to-one relationship means that each entity in the table only relates to a single entity in the other table. For example, if we are modeling a school, where each classroom has a single projector in it, we would want to make this relationship a one to one between the Classroom and the Projector tables. In our database, we can provide the classroom table a projector_id foreign key and provide the projector table a classroom_id foreign key. To enforce the one to one aspect, we should also apply a unique constraint on the foreign key columns. Otherwise, a user could add another projector record with the same classroom_id as an existing record, and then our one to one relationship would be broken.

A one to many (or vice versa, many to one) relationship is where one entity can belong to, own, or otherwise relate to multiple other entities. In our school modeling example, a Student could have many books, so this would be a one to many relationship. To create this in the database, we add the foreign key only on the many side of the relationship - so a book entity would have a field such as student_id as a foreign key to identify the owning student.

A many-to-many relationship implies a one-to-many relationship in both directions on the entities. For example, a Teacher can have many Students, but a Student could have many Teachers as well. In this case, we cannot provide a direct link between the tables in the database - instead, we need to create what is called a junction table or bridge table to relate the two tables. So, in our student-teacher example, we could create a Class table which contains two foreign keys - one that refers to the Teacher table's primary key and one that refers to the Student table's primary key. This creates a list of unique Teacher-Student mappings that can be used to look up which students a particular teacher teaches, or which teachers a particular student has. An example is shown below.

Class Table
ClassId	TeacherId	StudentId
1	1	1
1	1	2
2	1	3
3	2	1
3	2	3
We can see above that Teacher 1 teaches both Student 1 and 2 in the same class. Teacher 2 teaches Student 1 and 3 in a different class. Teacher 1 also has another class where he just teaches Student 3.

Referential Integrity
When we create table relationships as demonstrated above, it is important that our data remains in a consistent state throughout the database. For example, we never want a record on our class table to be pointing to a record in either the Teacher or the Student table that does not exist. We call enforcing this property as maintaining referential integrity. When we break referential integrity, we will find orphan records in the database - these are records whose foreign keys do not point to an existing record in the other table. One way of preventing this from occuring is by using a setting called CASCADE DELETE - when we enable this, deleting a record in the table will also cascade that operation and delete any records in tables that reference the that record via foreign keys.

Normalization
Normalization refers to an optimization process of structuring a relational database in a way that reduces redundancy of data and improves data integrity and consistency. There are many different normal forms, which relate to the degree to which a database has been normalized. We will look at the first three normal forms, each of which build upon the previous:

1NF - must have a primary key, no repeating groups, and atomic columns
2NF - must already be in 1NF, plus have no partial dependencies
3NF - must already be in 2NF, plus have no transitive dependencies
The first normal form enforces that a table must:

Have a primary key
Each column should be as granular as possible (e.g. "Name" column should be broken up into: "First Name", "Last Name", "Middle Name", etc..)
To be in second normal form, a table must also:

Cannot have columns that are dependent on only one part of the key
If there are no composite primary keys, you are automatically in 2NF
Finally, to get to third normal form, a table must also:

Not have transitive dependencies
This means that if column C relates to column B which relates to column A which is the primary key, this is not in 3NF because C is related to the primary key but indirectly (it is a transitive dependency)
To advance into higher normal forms, we typically "break up" tables into multiple tables and relate them to each other via foreign keys.

A good way of remembering these normal forms in order is to remember the legal proceeding of swearing to tell the truth, the whole truth, and nothing but the truth. In relational databases, we must have the key (1NF), the whole key (2NF), and nothing but the key (3NF).


==================

Stored Procedures
---------------------

database object - which is a set of instructions 
called by exec method





Cummulative QC : Monday (27th June 2022) - 4:00 - 6:00
Today coding challenge (QC)


Spring
============

28.  What is “aspect-oriented programming”? Define an aspect.
    
29.  Give an example of a cross-cutting concern you could use AOP to address
    
30.  Define the following:
    

*  Join point
    
*  Pointcut
    
*  Advice
    

31.  What are the different types of advice? What is special about the @Around advice? How is the ProceedingJoinPoint used?
    
33.  Explain the pointcut expression syntax
    
34.  What visibility must Spring bean methods have to be proxied using Spring AOP?



================

### Spring MVC

15.  Explain the MVC architecture and how HTTP requests are processed in the architecture
    
16.  What is the role of the DispatcherServlet? What about the ViewResolver?
    
17.  List some stereotype annotations. What are the differences between these?
    
18.  How would you declare which HTTP requests you’d like a controller to process?
    
19.  What is the difference between @RequestMapping and @GetMapping?
    
20.  How to declare the data format your controller expects from requests or will create in responses?
    
21.  What annotation would you use to bypass the ViewResolver?
    
22.  How would you extract query and path parameters from a request URL in your controller?
    
23.  What concerns is the controller layer supposed to handle vs the service layer?
    
24.  How would you specify HTTP status codes to return from your controller?
    
25.  How do you handle exceptions thrown in your code from your controller? What happens if you don’t set up any exception handling?
    
26.  How would you consume an external web service using Spring?
    
27.  What are the advantages of using RestTemplate?

RestTemplate : 


===========
What do you mean 
pinpoint




Week9


Cummulative QC - 4:00 - 6:00 PM EST

---------------
Staging Orientation

Tue 6/28/2022 12:00 PM - 1:00 PM EST

Join Zoom Meeting
https://revature.zoom.us/j/86049464756?pwd=c3d5QU9BY3Q0ck5ZSWl4Y2xOYWRBUT09

Agenda

Staging Goal and Objectives      
Staging Description 
Staging Expectations       
Staging Success
Questions 
       

Work on your p3



Client Interviews - Thursday and Friday


--------------------------------------------------------------------------------------------------------------

javalin	- fake 

incident managenent
pinpoint
Recap - Spring, Docker





Download and install JDK11

JAVA_8_HOME		= C:\Program Files\Java\jdk1.8.0_202
JAVA_11_HOME		=C:\Program Files\Java\jdk-11.0.15	


Autowired - search for the matching bean and inject it. (object - which is managed by spring)




Sterotypes annotations

@Component
@Repository
@Controller
@Service


CSS - ID vs Class



The difference between an ID and a class is that an ID is only used to identify one single element in our HTML. IDs are only used when one element on the page should have a particular style applied to it. However, a class can be used to identify more than one HTML element.



@Controller vs 	@RestController

MVC		Rest	
Views		Data
JSP/HTML	JSON/XML
End user		another application
restcontroller marks a class as a request handler


@Controller is used to mark classes as Spring MVC Controller. @RestController annotation is a special controller used in RESTful Web services, and it's the combination of @Controller and @ResponseBody annotation

Docker is a software platform that allows you to build, test, and deploy applications quickly. Docker packages software into standardized units called ...

Container vs images

Images are created with the build command or we can pull the images , and they'll produce a container when started with run.




Docker Compose
================

Compose is a tool for defining and running multi-container Docker applications. 
With Compose, you use a YAML file to configure your application's services.




Core Java
	OOPS
	AC/Interface
	static vs final
	access specifers
SQL
Spring


Devops
Docker
Grafana
Promtheues
k8s
	kubectl
jenkins



Tomo 11: AM EST - p3 checkpoint meeting - Mr. Kenneth Davis


=================================================


11:00 - 11:45 AM - Core Java Q&A session break root 10


2:30 - 3:30 PM SQL Q&A session breakout 10


==================================================

MVC - Design pattern

Spring MVC - DispatcherServlet (Controller)




================================================Common Core Java - Q&A================

1>    What are the 4 Pillars of OOP in Java and can you give me an example of each
Abstraction is a process of hiding implementation details and exposes only the functionality to the user.
 In abstraction, we deal with ideas and not events. 
This means the user will only know “what it does” rather than “how it does”.
By using abstract class


Encapsulation

Encapsulation is the process of wrapping code and data together into a single unit.
In order to achieve encapsulation in java follow certain steps as proposed below:

Declare the variables as private
Declare the setters and getters to set and get the variable values

Inheritance is the process of one class inheriting properties and methods from another class in Java. Inheritance is used when we have is-a relationship between objects.  Inheritance in Java is implemented using extends keyword.

is -a relationship
Real-life Example:

The planet Earth and Mars inherits the super class Solar System and Solar system inherits the Milky Way Galaxy. So Milky Way Galaxy is the top super class for Class Solar System, Earth and Mars.


Polymorphism is the ability to perform many things in many ways. The word Polymorphism is from two different Greek words- poly and morphs. “Poly” means many, and “Morphs” means forms. So polymorphism means many forms. The polymorphism can be present in the case of inheritance also. The functions behave differently based on the actual implementation.

Real-life Example:

A delivery person delivers items to the user. If it’s a postman he will deliver the letters. If it’s a food delivery boy he will deliver the foods to the user. Like this polymorphism implemented different ways for the delivery function.

2) JVM,JDK and JRE

JDK	- JVM and JRE - we can write and execute java programs
JRE	- JVM	- we can only execute java programs 

.class file - bytecode
java Welcome

3) Constructors
	- special method which has the same name as class name
	- it does not have any return type not even void
	- it will called automatically whenever you create an object
	- it is used to intialize instance variables
	- default constructor will be avilable if no constructor is specified


4) Access modifiers
public : any where
private : nobody can access , jus within the class
default : within package 
protected : within package + child classes

5. Can you tell me about some of the non access modifiers in java 

static, final, abstract

6. Scopes of a variable
there are 4 scopes
global,instance,block and local

7. what is the difference between static and final keyword in java ?
static keyword makes the variable/method as class variables
final keywork makes the variable as constant

8. Object class
super class for all the classes in java
list some methods of object class
equals,toString,hashCode, finalize

9. Java	What is JDBC?	
Java database connectivity
with the help of jdbc api by which we can connect our java application with any databases

10. Method overloading & overriding
overloading is a concept by which we can have same method names but signature(parameters) has to be different
overriding is a concept by which child class rewrites the method of the super class
** child might have different implementation of the parent class method

11. String API and list some methods of string 
is immutable 
is group of characters 
length, substring, concat , split

12. StringBuilder and StringBuffer
mutable
StringBuilder	- not sync

13. Wrapper classes
It allows us to convert primitives data types to corresponding object class
Character, Integer,Float,Double,Byte,Boolean


14. Abstract classes
Abstract class is used to provide common method implementation to all the subclasses or to provide default implementation.
We cannot create an object of AC
It can contain abstract as well as non abstract method
extends

15. Interface
It can contain only abstract methods
implements
we can have only final variable

16. new features of jdk1.8
lambada 
functional interface
default and static methods in interface


17. What is an exception ?What is the super class for all the exception in java?
  Types of exception? How you will create user defined exception ?
Event that interrupts of the normal flow of program. 
Checked and Unchecked. extends EXCEPTION/RUNTIME EXCEPTION

What is the super class for all the exception in java - Throwable


18. What is Paired Programming ?


19. What is Singleton pattern ?
Singleton is a design pattern that ensures that a class can only have one object

20. What is Factory design pattern ? 
- comes under creational design pattern
- this deals with creation of an object and states that the object must be created at one place i.e Factory


====================SQL========================
SQL	Are you familiar with SQL? What databases do you know?	
SQL	Gave me a scenario and asked what join I would use (SQL).
Inner join - only macthing from both tables
Outer join - left, right, full join 

self join - same table join -- employees reporting to there manager

	
SQL	SQL query question (select all from one table with the max number).	

use aggregate function - max 
Select first_name, max(salary) from employee 

error : not a group function


group by first_name

Select first_name, max(salary) from employee group by first_name

Select first_name,manager_id, max(salary) from employee group by first_name,manager_id


1) 
sub languages of SQL

DML	- insert, delete and update
DDL	- create, alter,truncate, drop
DQL	- select
DCL	- grant,revoke
TCL	- commit,savepoint,rollback

2) What is Referential Integrity ?
relationship between two tables based on foreign key
we create relationship of parent and child by creating foreign key

3) Sub-queries
query within a query

4) Set Operations

union
union all
intersect
minus

AWS	What is AWS EC2?	
Elastic Cloud Computing
Virtual Servers in the Cloud
Amazon Elastic Compute Cloud (Amazon EC2) provides scalable computing capacity in the Amazon Web Services (AWS) Cloud. Using Amazon EC2 eliminates your need to invest in hardware up front, so you can develop and deploy applications faster. You can use Amazon EC2 to launch as many or as few virtual servers as you need, configure security and networking, and manage storage. 
Amazon EC2 enables you to scale up or down to handle changes in requirements or spikes in popularity, reducing your need to forecast traffic.



AWS	How do you deploy and access an EC2 instance?	-- Ubutntu - We can access it by putty ?


AWS	What is AWS RDS?	
Amazon RDS is a managed relational database service for MySQL, PostgreSQL, MariaDB, Oracle BYOL, or SQL Server.


AWS	What is AWS S3?	
storage service to store our files 
Amazon Simple Storage Service (Amazon S3) is an object storage service offering industry-leading scalability, data availability, security, and performance.


Docker
k8s
Helm
terraform
agile
scrum
grafana
prometheues


spring
Project

=======================================================================================

What is Docker ?
Ans : 
Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers
Docker is an open platform for developing, shipping, and running applications.


What is a container in docker ?
Runnable isolated instance of a set of processes(images) and their dependencies.
A Docker container is built from a Docker image. 

What is an image in docker ?
Blueprint for a container
Docker Image is an executable package of software that includes everything needed to run an application. 
An image is a file that represents a packaged application with all the dependencies needed to run correctly.



What is the command to check the running process
docker ps


What is the command to check all the process 
docker ps -a

DevOps	Have you used Docker?


What is Dockerfile
Dockerfile
Defines everything needed for an image. It outlines the starting point, dependencies and commands that make up all the processes needed for an image and in turn a container.


Give me some keywords that we use in Dockerfile

are FROM,ENTRYPOINT,EXPOSE,RUN

How you create docker image 
docker build -t imagename:tagname .

How you can run docker image
docker run demo:latest -p 8080:8080 -n luisteam


What is the docker compose ?
Docker compose is the tool that makes creating and managing multi-container applications easier.

It's fundamental use is based around the docker-compose file.


What is docker-hub ?
It is a remote repository which stores all the images

Docker Workflow 


=======================================

Grafana	- Grafana is a multi-platform open source analytics and interactive visualization web application. It provides charts, graphs, and alerts for the web when connected to supported data sources

What data sources you have used in Grafana ?

what is Loki and Prometheus
Log aggregation tool - it reads from the log file and give us the metrics

How to integrate loki in grafana ?


------------Long Answer-------



---------------

loki-local-config.yaml

#This is loki-local-config.yaml
auth_enabled: false

server:
  http_listen_port: 3100
  grpc_listen_port: 9096

ingester:
  wal:
    enabled: true
    dir: /tmp/wal
  lifecycler:
    address: 127.0.0.1
    ring:
      kvstore:
        store: inmemory
      replication_factor: 1
    final_sleep: 0s
  chunk_idle_period: 1h       # Any chunk not receiving new logs in this time will be flushed
  max_chunk_age: 1h           # All chunks will be flushed when they hit this age, default is 1h
  chunk_target_size: 1048576  # Loki will attempt to build chunks up to 1.5MB, flushing first if chunk_idle_period or max_chunk_age is reached first
  chunk_retain_period: 30s    # Must be greater than index read cache TTL if using an index cache (Default index read cache TTL is 5m)
  max_transfer_retries: 0     # Chunk transfers disabled

schema_config:
  configs:
    - from: 2020-12-22
      store: boltdb-shipper
      object_store: filesystem
      schema: v11
      index:
        prefix: index_
        period: 24h

storage_config:
  boltdb_shipper:
    active_index_directory: /tmp/loki/boltdb-shipper-active
    cache_location: /tmp/loki/boltdb-shipper-cache
    cache_ttl: 24h         # Can be increased for faster performance over longer query periods, uses more disk space
    shared_store: filesystem
  filesystem:
    directory: /tmp/loki/chunks

compactor:
  working_directory: /tmp/loki/boltdb-shipper-compactor
  shared_store: filesystem

limits_config:
  reject_old_samples: true
  reject_old_samples_max_age: 168h

chunk_store_config:
  max_look_back_period: 0s

table_manager:
  retention_deletes_enabled: false
  retention_period: 0s

ruler:
  storage:
    type: local
    local:
      directory: /tmp/loki/rules
  rule_path: /tmp/loki/rules-temp
  alertmanager_url: http://localhost:9093
  ring:
    kvstore:
      store: inmemory
  enable_api: true


---------------------promtail-local-config.yaml

#This is promtail-local-config.yaml 
server:
  http_listen_port: 9080
  grpc_listen_port: 0

positions:
  filename: /tmp/positions.yaml

clients:
  - url: http://localhost:3100/loki/api/v1/push

scrape_configs:
- job_name: system
  pipeline_stages:
  
  - output:
      source: message
 
      action_on_failure: skip
  static_configs:
  - targets:
      - localhost
    labels:
      job: test
      agent: promtail
      __path__: H:/Grafana/test/*


-------------------------
test.txt Create test.txt inside above folder

2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :.main: *************** RSVP Agent started ***************
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :...locate_configFile: Specified configuration file: /u/user10/rsvpd1.conf
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :.main: Using log level 511
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :..settcpimage: Get TCP images rc - EDC8112I Operation not supported on socket.
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :..settcpimage: Associate with TCP/IP image name = TCPCS
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :..reg_process: registering process with the system
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :..reg_process: attempt OS/390 registration
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :..reg_process: return from registration rc=0
2021-12-26T13:11:05-01:00 11.2.3.85 TRACE  :...read_physical_netif: Home list entries returned = 7
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :...read_physical_netif: index #0, interface VLINK1 has address 129.1.1.1, ifidx 0
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :...read_physical_netif: index #1, interface TR1 has address 9.37.65.139, ifidx 1
2021-12-26T13:11:05-01:00 11.2.3.85 INFO   :...read_physical_netif: index #2, interface 

-------------


Download loki			https://github.com/grafana/loki/releases/download/v2.5.0/loki-windows-amd64.exe.zip
Download promtail			https://github.com/grafana/loki/releases/download/v2.5.0/promtail-windows-amd64.exe.zip
Download nssm.exe		https://nssm.cc/release/nssm-2.24.zip

Run cmd and navigate to the below folder :

H:\nssm-2.24\win64>.\nssm.exe install loki
Service "loki" installed successfully!

H:\nssm-2.24\win64>.\nssm.exe install promtail
Service "promtail" installed successfully!


Verify :

localhost:3100/metrics
http://localhost:9080/


Open grafana : create a data source Loki

http://127.0.0.1:3100


Explore



==========================================================================
Monitoring; what monitoring tools have you used?
Grafana and Promethues - 

Promtail -- read the logs


=============================================================d


How do you setup a cluster deployment? What should you consider about cluster deployment?


What is the structure Kubernetes?



===================
What is Kubernetes :
Kubernetes is a software solution for "Container Orchestration".
 We want to manage containers on a large scale, such as representing groups of containers and as many instances of a single container as we can, as well as track them. 
If they fail, we will want to quickly replace it. 
As well as quickly scale up or down the number of instances. Among many other features.

What is kubectl 
	- command line tool to manage k8s
	- kubectl get all
	 The Kubernetes command-line tool, kubectl, allows you to run commands against Kubernetes clusters. 
	You can use kubectl to deploy applications,create service, create configMap
	We can delete deployments and others as well
	You can use kubectl to deploy applications, inspect and manage cluster resources, and view logs.


What is minikube : 
	allows us to k8s locally
	setsup a single node cluster
	It is a tool that is used to create a k8s cluster with a single node and is used to run the k8s in a local machine

Architecture of minikube 

## How it works

Clusters: A high-level organization unit for Kubernetes. Everything in Kubernetes is performed on a "cluster". A Cluster is a group of servers (each server would be referred to as a "node")
Generally, you might only have 1 cluster per global region.
Or perhaps, you might have a cluster per datacenter.

Master : One of our nodes will run the Kubernetes Control Plane and act as the manager of all of the nodes. 
Worker : The rest will be worker nodes.

## Kubernetes Control Plane

The main processes and it will act with all other processes.
This is our main entrypoint to our cluster.

- Kube-Controller Manager
    - The piece thati s in charge of all controller "objects"
    - These controller objects are in charge of defining a piece of the "desired state"
- Kube-Scheduler
    - Watch all objects and schedules the objects to nodes for them to execute
- Etcd
    - A little database, a key-value store, to store everything that is needed for running the cluster
- Kube-Api-Server
    - A RESTful API Server
    - It has "resources" for all of the different Kubernetes objects that we can create and manipulate
- Kube-dns
    - DNS specifically for locating Kubernetes objects
    - Allows Kubernetes objects (services) to have separate IP Addresses from the node they operate on

Other constainer tools
---------------------------
Docker swarm (lacks advanced features)
Mesos (difficult to setup)


**** Advantages of container orchestrations (k8s)
1) scalable
2) Prevent failure - replication
3) manage containers in large scale
4) This things you can do with simple configuration files


Architecture of k8s
----------------------

API server - acts a front controller for k8s

etcd keystore - distributed key store used by k8s for managing clusters. who is master node and who is the worker node(later)

kubelet - is an agent which runs on every cluster. This is responsible for making sure that the containers are running as expected

Container runtime : are the underlying software used to run containers. In our case  it is docker/vm

Controllers : are the brain behind the orchestration.Responds when the node containers are down.

Scheduler : is responsible for distributing works/containers across multiple nods. It looks for newly created containers and assigns them the nodes


## Kubernetes Objects

- Pods
    - Smallest unit of k8s cluster inside where the container runs
    - An organational unit that consists of 1 to infinity containers
    - Some amount of containers
    - These containers can talk to each other directly, but may not have access externally
    - Basic Pods will have just 1 container
    - Advanced configurations might have 2+ containers
        - 1 for web service
        - 1 for containerized DB
    - Are ephemeral, they will be created and destroyed frequently
        - Anything you put inside a Pod is not guaranteed to exist the next moment
    - Discrete piece of an application
        - What this means in practice depends on the specific application

- Deployment
    - A configuration for the way an application should be deployed (made publically accessible)
    - A controller object
    - Describes how to create a set of pods
        - Rules for replicas
        - Rules to create each pod, and will create identical pods to reach # replicas
    - Will have a name


- Service
    - A controller object
    - An object that wraps all copies of the same pod behind 1 IP address, generally to make them more accessible
    - Static IP Address
        - Not necessarily visible from outside the cluster
        - Kubernetes Clusters follow a similar principle to VPCs in AWS
    - Redirect traffic to an available Pod (load balancing)
        - A software load balancer
        - Client Side Load Balancer
        - Works well, but is not as efficient as a Hardware Load Balancer
            - Server Side Load Balancer
            - Primarily for small amounts of traffic
        - It is possible to configure a Service object with an external load balancer

-*** Volume
    - Permanent data storage that can attach to one or more pods

-*** Namespace
    - Kind of like DB Schema, but for Kubernetes
    - Different objects in different namespaces don't often interact (but they can)
    - Generally it is to achieve multi-tenancy

-*** Ingress
** What is Ingress?
Ingress exposes HTTP and HTTPS routes from outside the cluster to services within the cluster. Traffic routing is controlled by rules defined on the Ingress resource.

    - Another controller object
    - Will act as the entrypoint for all services in our cluster (or namespace)
        - Not load balancing
        - Routing requests to different targets
        - Example
            - Rules for `/my-app1` URIs get redirected to ServiceA
            - Rules for `/my-app2` URIs get redirected to ServiceB
    - API Gateway
    - We wouldn't necessarily have to expose our services to the outside internet, we would only expose an ingress object
        - Would redirect to further inside the cluster
    - Most commonly will use Ngnix as the implementation, which is popular for proxy servers
- There are MANY MANY more Kubernetes objects
    - There is a ton of depth


*** ## Types of Services
- ClusterIP (Default)
    - Will make a service for a set of pods and give them one static ip address, but this address will only be accessible inside the cluster
    - This won't be a _real_ IP address, it is one that only exists through kube-dns
    - There is no external IP Address
    - Can think of it as a private service, so to speak, only visible inside the cluster
- NodePort
    - Will do the same above, but will redirect traffic from one port on the node itself to the clusterIP
    - Accessible from the outside world
    - URL: `node-ip:node-port`
        - If your nodes are EC2s, then this could something like:
        - `ec2-52-90-106-95.compute-1.amazonaws.com:31225`
- LoadBalancer
    - Generally uses cloud providers (AWS, GCP, Azure) technology to build a load balancer
    - A physical load balancer
    - Generally supported by Kubernetes Clusters created through these cloud providers
    - Creates a separate static IP Address for the load balancer, and that traffic will redirect to the clusterIP
    - Load Balancers are very expensive
        - $15 a month for a bare minimum load balancer
        - Even if you barely use it

----------------SDLC-Agile-Scrum-----------------------------------

<br/>

SDLC ?
What is SDLC ?
SDLC is a disciplined and systematic approach that divides the software development process into various phases, such as requirements, design, and coding. 
The phase-wise software development process helps you track schedule, cost, and quality 


What are the different phases of SDLC ?
There are six phases of SDLC:
Feasibility analysis 
Requirement analysis and specification
Design 
Coding 
Testing 
Maintenance


Waterfall approach : Describes the software development process in a linear sequential flow. 
Is the earliest approach used for software development.


What is Agile ?
# SDLC = Software Development LifeCycle
Process for planning, creating, testing, and displaying information systems.

## General Steps
1. Requirements Phase
    - Existing system is evaluated so that the existing flaws can be determined
    - Performed by Business Analysts (BAs)
    - Could be as simple as saying "The current flaw is that it doesn't exist"
        - Move on to outline what is needed
2. Analysis Phase
    - The new system requirements are defined. In particular, deficiencies are addressed with proposal for improvement
    - BAs + Senior members of the team
3. Design Phase
    - The proposed system is actually designed
    - No coding is done yet, the product features are planned out
    - Architects and Senior Devs
4. Development Phase
    - Software is built
    - Code for the product is actually written
    - Junior & Senior Devs, etc
5. Testing Phase
    - Software is tested to ensure it functions as intended
    - Devs & Testers
6. Deployment & Maintenance Phase
    - Product is delivered/deployed to the customer
    - Maintenence is rigorously kept up
    - Operations Team / DevOps Engineers / SREs

This is a high level description of what steps we take during the SDLC. The specific details will often vary, depending on which implementation you use to follow the SDLC.

## Waterfall Method

Is a traditional way of following the SDLC
The idea is that you completely finish one phase of the before moving on to the next
You do not return to any previous phase at any point (until the cycle is complete)

- Progress is seen as only going "downwards"
- Best suited for smaller, short term projects or where project requirements do not change (such as Government Projects)
- Generally considered not as efficient money-wise
- Cannot go back up the waterfall
    - Considered inflexible
- The benefits are that you get a full outline of the plan before you start
    - This can really help in terms of organization

## Agile Method

- Another method for following the SDLC
- An approach to Software Development based on iterative development where requirements and solutions evolve through the collaboration of cross-functional teams
- Agile is more of a mentality or a philosophy
    - It is not "a thing that you do", but more of a mindset or an approach to software development
- Four core values to Agile (From Agile Manifesto)
    1. Individuals and Interactions over processes and tools
    2. Working software over comprehensive documentation
        - We are not "abandoning documentation"
        - Documentation is still incredibly important
    3. Customer Collaboration over contract negotation
    4. Responding to change over following a plan

- There are Agile methods (often called frameworks), which are comprehensive approaches to the SDLC
    - "Scrum" is the most common Agile Framework
        - Not the only one
        - (SAFe = Scaled Agile Framework)
- Agile practices (listed below) are closely tied to DevOps
    - CI/CD or CI/CD/CD
    - Continuous Integration (CI)
        - The idea or process or practice of continuously merging multiple developer's code (usually in a repository) *frequently*
        - This should be MULTIPLE times a day. It is meant to prevent large errors from accumulating. The sooner you find them, the sooner they will be fixed
    - Continuous Delivery (CD)
        - Automate the testing of your code, and the process we use to prepare our code so that we can deploy the code "at the push of a button"
        - Generally, we have a big "release day"
    - Continuous Deployment (CD)
        - Every change that passes all stages of the product pipeline (various tests, quality checks, etc) is released to the customer immediately. There is no "release day".
        - This is particularly valuable because it speeds up feedback from the customer

## Agile Scrum Methodology
- In a "Scrum", the project is divided into what are called "sprints"
- Sprint
    - A specified timeline (generally 2 weeks, but could be 1 - 4 weeks)
    - Timeline is agreed upon during a "Sprint Planning Meeting"
- User Story
    - Informal, natural language sentence/description of one or more features
    - It is usually written from the perspective of a user
        - "As a User, when on on the login page, I can enter a valid username and password, and be redirected to my profile page"
    - These are agreed upon and split during the Sprint Planning Meeting
- Epic
    - A large body or collection of user stories that can be broken down further

### Roles
- Scrum Master
    - Facilitator for the Scrum devleopment team
    - Clarifies questions and organize the team and focuses on the return on investment
- Product Owner
    - Usually the client and they will act as a point of contact from the client side
    - Prioritize the product backlog and when the scrum team should finish and release
- Scrum Dev Team: Devs & QA
    - This is the team that decides "effort estimation" to complete a product backlog item
    - Often uses "User Story Points" or just "Story Points" to describe an amount of effort for a user story
- Scrum Team
    - Product Owner + BAs + Devs + QA + Scrum Master
    - Recommended Size is 5 - 9

### Artifacts
- Product Backlog
    - This is a repository where the items that product owner wants to accomplish are kept
    - Trello, Asana, JIRA, etc
        - Some Kanban Board
- Sprint Backlog
    - A subset of the product backlog that contains the items to be completed during the current sprint
- Burndown Chart (Burnup chart)
    - Graph that shows how many user stories (or story points) are left to complete during the sprint
        - Burnup chart would be how many are completed so far
    - Often use this to calculate the overall "velocity" for a sprint
    - Velocity is the number of story points completed over time
        - Could be total story points completed per 2 week sprint

### Meetings
- Sprint Planning Meeting
    - Plan for what you will accomplish during that sprint
    - Can be several hours in some cases
- Daily Standup Meeting
    - Short meeting (like 15 minutes at most) that happens once a day for the scrum team
    - You talk about what you did yesterday, what you plan to do today, and if you have any "blockers"
        - A particular person or group who you are waiting on
    - Generally led by the Scrum Master
- Sprint Review Meeting
    - Happens at the end of a sprint
    - You basically showcase the features that were accomplished during the sprint
    - Decide if the product is complete or if it needs more work
- Sprint Retrospective Meeting
    - The scrum team meets and talks about what went well and what went poorly
    - What can be done to improve?
    - What did you learn?
    - etc


Jenkins
Terraform
Helm
What are common commands in Helm?

What is Terraform?
What are Terraform values?

IAC
configure code as infrastructure



terraform init
terraform plan
terraform apply
terrform show

Jenkins 
============

What is jenkins ?
Jenkins in an Open-Source Automation Server. It helps automate the building, testing, and deployment of an application for continuous integration and delivery.

It supports the development of CI/CD or DevOps "Pipelines".

What problem jenkins solve ?
It automates the processes


How you create pipeline in jenkins ?


'How to make a CI/CD pipeline. 


Spring	What is dependency injection

Linux	Asked if I knew what Linux was. 
Linux	Asked if I knew the bash/Linux command to switch user. 


<h2>

---------Monday 7/11 Lab details --------




Access Key ID: AKIA4OK5FKIY6RSF25GJ
Secret Access Key: 
aws configure --profile sre-lab
aws eks --region us-east-1 update-kubeconfig --name sre-lab --profile sre-lab
kubectl create namespace <name>
lowercase-snake-case
kubectl get deployments -n <name>
metadata:
  name: my-deployment
  namespace: <name>




kubectl config get-contexts
kubectl config use-context <context-name>
kubectl config rename-context <original-name> <new-name>




Please find below a fresh link for the introduction call.  A one-hour call has been requested for Monday, July 11th, 2022, at 8 am EST.    


Link - https://teams.microsoft.com/l/meetup-join/19%3ameeting_YmUxZDA1MDgtYzEzMy00Y2NhLTk0YjItNDg2M2Q2ZDEwNzdl%40thread.v2/0?context=%7b%22Tid%22%3a%226b63e28a-a8f9-47b5-aa40-97e231215164%22%2c%22Oid%22%3a%22ac2e489d-944a-4829-9398-47f6c863c39d%22%7d



Link to LAB assessment –  https://teams.microsoft.com/l/meetup-join/19%3ameeting_NzU2ODA4MTMtN2IzNi00MGZkLTgwZGUtOWY1NzM5ZWQwMjc1%40thread.v2/0?context=%7b%22Tid%22%3a%226b63e28a-a8f9-47b5-aa40-97e231215164%22%2c%22Oid%22%3a%22ac2e489d-944a-4829-9398-47f6c863c39d%22%7d
 

Links to Interview Slots – It has already been sent to your email address, individual emails

Staging link : https://revature.zoom.us/j/92149219227?pwd=WjloS2lQNWtOb2ljdHpmdUVEZHJqZz09#success


Few Points : 
Please keep an eye of your AWS billing. 



+91-8867205331
mohammad.tufail@revature.com


+91-9371075863
dinesh.vasudevan@revature.com