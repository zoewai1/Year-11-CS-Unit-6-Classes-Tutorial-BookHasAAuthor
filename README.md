# Year-11-CS-Unit-6-Classes-Tutorial-BookHasAAuthor

Tutorial - A Book “has-a” Author

Your job is to create two classes.

One class will be called Author.
One class will be called Book.

You should pass all of the tests in the BookAuthorTester class (provided).

Objectives

Write classes in accordance with class specification
Create objects from classes
Become familiar with UML (unified modeling language)
Define a class that is composed of an already existing class

Composition

Composition means to design a class that is composed of already defined classes. This creates a relationship referred to as a “has-a” relationship, where one class contains a reference to another. An example would be if we defined two classes: Person and Address. A Person “has-a” Address. In the Person class we would include a property called address of type Address.

public class Person {

            private String name;
            private int age;
	    private Address address;
            …

} 

public class Address {

        private String country;
        private String province;
        private String city;
        …

}



UML

Unified Modeling Language is not a programming language that we use to write code, such as Java, but a standardized way to visualize the design of a system. In OOP, we build objects from classes. Objects interact with other objects and thus, have relationships with other objects. UML is a great tool for the design stage, allowing us to rationalize what a class will look like and how it will be related to other classes. Take a look at the example below.

![image](https://user-images.githubusercontent.com/57818506/213328428-b695ded1-6dc1-4746-b396-45f2d1d1ffcd.png)

There are two classes: Line and Point. 

First, let’s focus on the Line class.
The Line “box” has three rows (or subdivisions) within it. 

Row 1
Contains the name of the class - Line. 

Row 2
Contains the properties (instance variables) of the Line class.
Both the names of the properties (begin and end) and the types of the properties (Point and Point) are included here. 
The name of and the type of the property are separated by a colon ( : )
You might be wondering what the minus sign ( - ), before the name of the property represents. The minus sign indicates that the property will have private visibility. 

Row 3
Contains the constructors and the behaviors (methods) of the Line class.
The Line class contains two constructors. Note that the names and types of any parameters are included.
The methods also include the names and types of any parameters, and the return type of the method.

Let’s move our attention to the Point class. 

The Point class consists of two private properties called x and y. 
The Point class does not have any behavior (methods).
What’s important to note here is that there is a line with a diamond extending from the Point class to the Line class. This indicates that there is a relationship between the two classes. The inclusion and direction of the diamond indicate that any Line object created will contain a Point object as a property. We typically phrase this as a “has-a” relationship. A Line has a Point. Or, perhaps more correctly, a Line has two Points! This makes sense because the begin and end properties in the Line class are both of type Point. In this situation, Line can be referred to as the aggregate and Point can be referred to as the component.
You might be interested in knowing what the significance of the two numbers (1 and 2) is. The number 2 indicates that any object of type Line is associated with 2 objects of type Point. The number 1 indicates that any object of type Point is associated with 1 object of type Line. It’s also a one-way relationship, meaning that any Line object will know of the Point objects which it is associated with but the Point object will not know of the Line object which it is associated with. 


Part 1

Let’s start with the Author class.

![image](https://user-images.githubusercontent.com/57818506/213328519-fb7d4af4-643f-4e99-9402-66989360d50e.png)

Write a class called Author. The Author class must conform to the above UML description.

Part 2

Let's write the Book class.

![image](https://user-images.githubusercontent.com/57818506/213328594-c926aff6-1197-4629-b274-01ece0d6d90e.png)

Write a class called Book. The Book class must conform to the above UML description.

