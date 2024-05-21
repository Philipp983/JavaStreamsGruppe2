<img src="https://external-preview.redd.it/-e4LjDmFhVTFl7Snu7kaYy6k53R2m6_1B-zc0TsnYRQ.jpg?auto=webp&s=fb3749a2f0cdc0cf83c870f2338f9f3d4181f4d3" alt="Description" width="500" height="auto">

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

Was ist Predicate ?

Ein Predicate ist ein funktionales Interface aus dem Paket java.util.function,
die eine einzelne abstrakte Methode "test" definiert.

Diese Methode nimmt ein Argument und gibt einen boolean zurück.

Ein Predicate wird typischerweise verwendet, um eine Bedingung oder ein Prädikat zu definieren, das auf ein Objekt angewendet werden kann.
Die häufigste Methode ist die Verwendung einer LambdaAusdrucks oder einer Methode, die ein Predicate implementiert. "filter"
*******************

Was is Supplier?
Ein Supplier ist ein funktionales Interface aus dem Paket java.util.function, die eine einzelne Methode "get" definiert.

Diese Methode nimmt keine Argumente an und gibt einen Wert zurück.
Ein Supplier wird typischerweise verwendet, um Werte zu erzeugen oder zu liefern, ohne dass ein Argument übergeben werden muss.

In der Java Stream API gibt es keine Methode, die direkt als Supplier betrachtet werden kann.
Dies liegt daran, dass Supplier nur einen Wert liefert, während die Methoden in der Stream API hauptsächlich darauf abzielen, Elemente zu verarbeiten und Ergebnisse zu liefern.

Streams

🚩Erschienen mit Java 8 (2014)

▶️ Stream API ist eine Erweiterung des Collection-Frameworks <br> ▶️ wird durch das java.util.stream.Stream Interface beschrieben.

Traditionell erfolgt der Zugriff auf die Elemente einer Collection in einer Schleife mithilfe eines Iterators (oder einer for-each-Schleife, die intern einen Iterator verwendet). Hier ist ein Beispiel:

List<String> words = ...

for (String s : words) {
if (s.length() > 0)  
System.out.println(s);  
}
❌ Nachteil ist, dass sich die Schleifen nicht parallelisieren lassen

Als Stream sieht das ganze so aus:

List<String> words = ...;

words.forEach(s -> {
if (s.length() > 0)
System.out.println(s);
});
▶️ Der Benutzer gibt über die Lambda-Funktion an, was mit den Elementen gemacht werden soll. <br> ▶️ Nützliche Streams-Operationen sind filter, count, sorted, ...

Folgende Operationen mit einer Liste von Ganzzahlen werden hier durchgeführt: 1. Filtert gerade Zahlen heraus und behält nur ungerade Zahlen. 2. Sortiert die verbleibenden Zahlen. 3. Verdoppelt jede Zahl. 4. Gibt jeden resultierenden Wert aus.
```java
public class Demo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7);

        nums.stream()
            .filter(n -> n % 2 == 1)
            .sorted()
            .map(n -> n * 2)
            .forEach(n -> System.out.println(n));
    }
}
```
Filtern nach Namen:
```java
public class StreamExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

		// Filter names that start with 'A'
		List<String> filteredNames = names.stream()
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println("Names starting with 'A': " + filteredNames);
	}
}
```
Verwendung von map() und reduce():
```java
public class AnotherStreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Square each number and then sum them
        int sumOfSquares = numbers.stream()
                                  .map(n -> n * n)
                                  .reduce(0, Integer::sum);

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
```
📝 Aufgabe: Ändere das Beispiel so, dass es das Produkt der Zahlen berechnet anstatt die Summe der Quadrate. Informiere dich (z.B. über die Java Dokumentation) über map() und reduce().

Lösung:
```java
import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
public static void main(String[] args) {
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Berechne das Produkt der Zahlen
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);

        System.out.println("Produkt der Zahlen: " + product);
    }
}
```
