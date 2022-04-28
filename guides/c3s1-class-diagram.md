:beginner: _**uml : class diagram**_  

- The Unified Modeling Language (UML)
  -  is a general-purpose, developmental, modeling language in the field of software engineering
  -  intended to provide a standard way to visualize the design of a system

:book: **class diagram**  

- static structure diagram that describes the structure of a system
- by showing the system's classes, their attributes, operations (or methods), and the relationships among objects.

:computer: **class diagram**  
- class diagram of a product in EzeeShop App
https://apps.microsoft.com/store/detail/drawio-diagrams/9MVVSZK43QQW?hl=en-us&gl=US

:computer: **Converting Class Diagram to Java Code**  



:one: _Model the classes in Java._  
:two: _Model the attributes for each class._  
:three: _Model the behaviour for each class._  
```java
package com.demo.oops;

public class UMLBook {
	public String titleString;
	public String authorString;
	public String languageString;
	public float price;
	public boolean available;
   

	public void open() {
	}

	public void read() {
	}

	public void bookmark(int page) {
	}

	public int getCurrentPage() {
		return 0;
	}

	public int close() {
		return 0;
	}

}

```
:four: _Implement the methods to calculate the discount on a certain genre of books._  
```java
	public void calculateDiscount(String genreString) {
		if(genreString.equals("fiction"))
			System.err.println("10%");
		else {
			System.err.println("20%");
		}
	}
```

:five: _Create constructors for each class._  
```java
	public UMLBook( String titleString, String authorString) {
		this.titleString = titleString;
		this.authorString = authorString;
	}
```
:six: _In an implementation class create objects for the classes._  
:seven: _Initialize constructors with parameters to set values to the attributes of the classes._  
```java
package com.demo.oops;

public class UMLBookImpl {
	public static void main(String[] args) {
		UMLBook umlBook = new UMLBook("Sww", "Simon");
		System.err.println(umlBook.titleString);
		System.err.println(umlBook.authorString);
	}
}

```

