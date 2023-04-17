# PcLabb
HW notes....

Do use inheritance when one class is a  more specific type of a superclass. 
Consider inheritance when you have behaviour (implemented code) that should be shared among multiple classes of the same general type. 
Not to use inheritance just so that you can reuse code from another class. If the relationship between the superclass and subclass violate either of the above two rules.
Not to use inheritance if the subclass and superclass do not pass the IS-A test. 


Making a class abstract is easy, put the keyword Abstract before the class declaration ---- Abstract class means that nobody can ever make a new instance of that class, but you can still use that abstract class as a declared reference type, for a purpose of polymorphism. 
Abstract class has virtually, no use, no value, no purpose in life unless it is extended. An abstract method means the method must be overridden. (public abstract void eat(); )..... No method body, end it with a semicolon. 
If the method is abstract , the class must be abstract too. 
Abstract methods don’t have any body, they exist solely for POLYMORPHISM. The first concrete class in the inheritance tree must implement all abstract methods. 
A class that is not abstract is called a concrete class. 
To define an interface -- use the keyword “interface” instead of “class”
To implement an interface-- use the keyword “implements” followed by the interface name. Note that when you implement an interface to still get to extend a class. 
A CONSTRUCTOR has the code that runs when you instantiate an object. In other words, the code that runs when you say new on a class type. Every class has a constructor, even if we don’t write it ourselves. The compiler writes for ur.               For example, 
Duck myduck = new Duck();  ………. Here, it’s not calling a method named Duck(), they are calling a constructor. 
If you have more than one constructor in a class, the constructors must have different argument lists. 
Four things about the constructor, 
-A constructor is the code that runs when somebody says on a class type
-Must have the same name as the class, and no return type.
-If you don’t put a constructor in your class, the compiler puts in a default constructor. the default constructor is always a no arg constructor.
-You can have more than one constructor in your class, as long as the argument list is different, having more than one constructor in class means you have overloaded constructors. 
