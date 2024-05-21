TODO: Paketnamen umbennen: a b c... (sortieren)



# 1. Have a look at the class HowItLooks


# 2. Theoretical Inputs:

## Imperative Programming vs Declarative Programming

2.1.
The imperative approach defines a program as a sequence of statements that change the program’s state until it reaches the final state.

In contrast, the declarative approach expresses the logic of a computation without describing its control flow in terms of a sequence of statements.

[Quelle Baeldung, wer mehr Theorie lesen möchte 📖](https://www.baeldung.com/java-functional-programming)

Streams are part of the declarative programming, more specifically
functional programming:
Functional programming deals with certain key concepts such as pure function, immutable state, assignment-less programming etc.

[Quelle GeeksforGeeks, wer noch mehr Theorie lesen möchte 🤓🧾](https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/)

2.2.
Important to know:
Functional Interfaces: 
## Have a look at IFunctionalInterface
If an Interface has only one interface, the compiler "knows" which method is
referenced - since there is only one! this enables us to only write the logic,
and we can cut down a lot of syntax

2.3.
What do we get from a functional Interface?
## Look at ImplementationOfIFunctionalInterface
Enables us to write with lambda syntax, compiler takes care of the surrounding syntax for us 🧑‍🏭♥️
Advantage: code is more concise, we only have to care about the logic and can create wonderful oneliners ;)

!<img src="https://programmerhumor.io/wp-content/uploads/2023/03/programmerhumor-io-programming-memes-7c93137a11a127f-758x1025.jpg" alt="Funny programmer meme" width="400" height="500">



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