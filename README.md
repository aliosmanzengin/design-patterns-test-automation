# [Popular design patterns in test automation](https://www.browserstack.com/guide/design-patterns-in-automation-framework)

* Page Object Model Pattern
    * Page Object Model design pattern enhances test maintenance, reduces code duplication, and increases code readability and reusability. It is an object-oriented class that serves as an interface to a page of the Application Under Test (AUT). Page objects encapsulate web elements, or other class members and provide access to wrapper methods that hide all the logic.

* Factory Design Pattern
    * Factory Design Pattern is one of the most used creational patterns as it provides one of the best ways to create  an object. The term factory here means that there should be a class with a factory method which deals with all the creational stuff. 
    * In this pattern, there is a superclass with multiple subclasses and based on the user input at test class level, it returns one of the subclasses. In other words, it is used to create an object from one of the possible classes that extends a common parent class/ implements an interface. The instantiation logic would be the responsibility of the class that is extending the parent class thereby it hides the complex code at test level. As a user, we just need to create an object of this class and use it in the test class to call the appropriate method holding the business logic.
    * You can use Factory Design Pattern when you need to encapsulate the complexity of creating an object. This pattern is easily extendable without altering existing code. This pattern serves one of the best ways to create an object where object creation logic is hidden from the client/user.

* Facade Pattern
    * Facade design pattern comes under structural design patterns. It provides a simple interface to deal with complex code. In this pattern we create a facade class which has methods that combine actions executed on different pages. This is an extension to the Page Object Model pattern. Following example can help you under Facade in a layman sense.
    * When we visit any restaurant to order our favourite food, we are not aware of what cuisine the restaurant serves unless we see the menu card or ask the waiter about it. We are just interested in ordering the food by using a waiter/menu card as the interface(facade) and do not worry about how it is actually being prepared in the kitchen. 
    * This way you do not have to create page classes objects individually in the test class and call the associated methods. Instead, you can create only facade class objects and call the facade method, thereby reducing complexity in the test script. Also, in future if there is any new business logic in between place order flow, you just need to update the facade class.


* Singleton Pattern
    * Singleton Design Pattern is one of the easiest and straightforward patterns to be implemented in an automation framework. This design is used when we need to use the same object of a class across the automation framework. It restricts the instantiation of a class to a single instance.  Steps to follow to create singleton class:
    * Declare the constructor of the class as ‘private’ so that no one can instantiate the class outside of it
    * Declare a static reference variable of class
    * Declare a static method with return type as an object of this singleton class which should check if the class is already instantiated once.
    * Singleton Pattern can be used for creating classes which need to restrict duplicate class object instances. This pattern improves performance and memory utilisation. This pattern is mostly used for Logger, Database connections, or External Resources.  



* Fluent Page Object Model
    * Implementing OOPs concept in any automation framework involves dealing with lots of page classes and objects. Most of the time, the test code required to implement these objects and methods becomes very complex. This complexity can be minimised by using Fluent Interface and Method Chaining. 
    * Page Object Model is the most popular and widely used design pattern as it helps in code readability and maintainability. And it can be more simplified and readable by using Fluent Page Object Model as it uses method chaining.
    * In this design pattern, every action method in the page class returns this to implement chaining methods for the business logic. This does not mean you cannot return other page class objects. You can either return this (same class) or another page class too.
    * The fluent page objects significantly improve the readability of tests. Also, it is quite easy to write tests with Fluent style. 
