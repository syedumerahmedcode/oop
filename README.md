# oop

## Table of content
- [Introduction](#introduction)
- [Out Of Scope](#out-of-scope)
- [Explanation OOP](#explanation-oop)
- [Explanation Abstraction](#explanation-abstraction)
- [Explanation Encapsulation](#explanation-encapsulation)
- [Explanation Polymorphism](#explanation-polymorphism)
- [Explanation Inheritance](#explanation-inheritance)
- [Explanation Association](#explanation-association)
- [Explanation Aggregation](#explanation-aggregation)
- [Explanation Composition](#explanation-composition)
- [Technologies Used](#technologies-used)
- [Prerequisities](#prerequisities)
- [Commands](#commands)
- [Contribution](#contribution)
- [References](#references)
- [Contact Information](#contact-information)


## Introduction

The main of this project is to explain the core concepts of Object Oriented Programming(OOP) along with a code example such that the reader can follow along and understand each concept with a simple example.

The project is organized across topics based packages. Each package has a sub-package called _usage_ in which the classes are instantiated and called in the main method. 

## Out Of Scope

Since the core purpose of this project is to understand the coding part, tests are out of scope for this project.

## Explanation OOP

OOP languages are built around the concept of objects. OOP improves code readability and reusability. The core concepts are:

- Encapsulation,
- Inheritance, and 
- Polymorphism.

Other concepts explored in this project are:

- Abstraction
- Association
- Aggregation, and
- Composition.

## Explanation Abstraction

Abstraction allows us to write a mixture of abstract and concrete methods in a class which are implemented in a derived class. One can have abstract methods which specify some general action which are later implemented in sub-classes. 

For example, Animal is an abstract class as it has _move()_ and _eat()_ abstract methods. These are implemented in _Bird_ and _Fish_ classes and then used in the main method by initialization as follows.

```java

Animal myBird = new Bird();

```

## Explanation Encapsulation

Encapsulation allows information hiding, which means it prevents the internal variables of the class from system wide access.

In the project, we have an Animal class and it is used in main() method in which both getters and setters are called. One practical use case could be that a class only provides getters which delivers results based on internal logic of other sub classes but not setters.

## Explanation Polymorphism

Polymorphism means many forms and in terms of OOP, it means to perform a certain action in different ways. The two ways of polymorphism explored in this project are _static polymorphism_ and _dynamic polymorphism_.

**static polymorphism:** This is also known as method overloading meaning methods exists which have the same name but different number of parameters. In our case, _fly()_ method is overloaded in _Bird_ class and in the usage package, various methods of _fly()_ are called in the main method.

**dynamic polymorphism:** This is also known as method overriding meaning that the derived class overrides the method of the base class. In the Animal(base) class, _eat()_ method is present which is overridden in Bird(derived) class. In the main method, _eat()_ method is first called from _Animal_ class

```java

Animal testAnimal=new Animal();
		testAnimal.eat();
		
```

and then later from the _Bird_ class.

```java

Bird testBird=new Bird();
		testBird.eat();
		
```

## Explanation Inheritance

Inheritance demonstrates parent child relationship and uses _entends_ keyword. Inheritance makes it possible to create a child class that inherits the fields and methods of the parent class. The _Bird_ class contains variables and two methods: _flyingUp()_ and _flyingDown()_ whereas in derived class contains additional variables. In the main method, we are creating an _Eagle_ class object but due to inheritance, we can call _flyingUp()_ and _flyingDown()_ methods.

## Explanation Association

Association means that the objects of different classes know about one another but It has no “has-a” relationship meaning  none of the objects are parts or members of another.

## Explanation Aggregation

## Explanation Composition

## Technologies Used

- Java 11

## Prerequisities

None

## Commands

Since there are multiple classes containing main() method, each of which is targeted at highlighting one specific feature of functional programming in Java, one needs to navigate to the specific main() method and run it in an IDE. 

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## References

- [1](https://raygun.com/blog/oop-concepts-java/): 6 OOP Concepts in Java with examples
- [2](https://stackoverflow.com/questions/885937/what-is-the-difference-between-association-aggregation-and-composition): What is the difference between association, aggregation and composition? **(Stack Overflow)** 
- [3](https://stackify.com/oop-concepts-composition/): OOP Concepts for Beginners: What is Composition?
- [4](https://www.baeldung.com/java-composition-aggregation-association): Composition, Aggregation, and Association in Java
- [5](https://www.scientecheasy.com/2021/03/aggregation-in-java.html/): Aggregation in Java OOPs | Example Program

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=%5BGitHub%5D%20Hello%20from%20Github). Additionally, you can reach me via [Linkedin](https://www.linkedin.com/in/syed-umer-ahmed-a346a746/) or at [Xing](https://www.xing.com/profile/SyedUmer_Ahmed/cv)