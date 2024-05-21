Have a look at the class HowItLooks


Theoretical Inputs:

Imperative Programming vs Declarative Programming

The imperative approach defines a program as a sequence of statements that change the program’s state until it reaches the final state.

In contrast, the declarative approach expresses the logic of a computation without describing its control flow in terms of a sequence of statements.

(https://www.baeldung.com/java-functional-programming)

Streams are part of the declarative programming, more specifically
functional programming:
Functional programming deals with certain key concepts such as pure function, immutable state, assignment-less programming etc.
(https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/)



Important to know:
Functional Interfaces: Have a look at IFunctionalInterface

What do we get from a functional Interface?
Look at ImplementationOfIFunctionalInterface

If an Interface has only one interface, the compiler "knows" which method is
referenced - since there is only one! this enables us to only write the logic,
and we can cut down a lot of syntax


What do we get from that?
Java actually has a lot of functional Interfaces!
Important to know in the beginning:

Consumer
Function
Predicate
Supplier

why? first have a look at StreamExample, then use the
_Consumer
_Function
_Predicate
_Supplier
as reference