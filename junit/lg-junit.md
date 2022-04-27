:books: **JUNIT**  

:book: _**Getting Started**_  

- JUnit is a unit testing framework for the Java programming language.
- unit testing is a software testing method by which individual units of source code are tested to determine whether they are fit for use.

:book: **Maven**  

- Maven is a build automation tool used primarily for Java projects.
- compiles, packages, tests and runs your java application.
- handles dependencies (libraries for your project)
- download the junit libraries
- A Maven Java Project = Maven Tools + Java Project.
- pom.xml contains dependencies

:keyboard: **Demo**
:writing_hand: **_create maven project_**  

- create maven project  File - New - Maven Project -  create a simple archetype
- GroupId : com.demo
- Artifact Id : ld-junit-gs

:writing_hand: **_configure java 11 - pom.xml_**  

```xml
	<properties>
		<maven.compiler.source>11</maven.compiler.source>
		<maven.compiler.target>11</maven.compiler.target>
	</properties>
```

:writing_hand: **_add junit dependency - pom.xml_**  

```xml
	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.7.0</version>
		</dependency>
	</dependencies>
```

:writing_hand: **_write app code_**  

```java
package com.demo;

public class App {
	public static void main(String[] args) {
		App app = new App();
		app.testAdd();
		app.testSubtract();
	}
	//testing individual unit of code
	public void testAdd() {
		Calculator calculator;
		calculator= new Calculator();
		int result = calculator.add(2, 4);
		System.err.println(result == 6 ? "Pass" : "Fail");
	}

	public void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(2, 4);
		System.err.println(result == -2 ? "Pass" : "Fail");
	}
}

```
:writing_hand: **_write junit tests_**  


