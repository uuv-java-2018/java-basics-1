# java-basics-1

## Rule
* Avoid `Spelling Errors` while writing the code.
* Always concentrate on 5 things: `Class`, `Method`,`Method Parameters`,`Method Return Type`, `Variables`,`Object`.
* Avoid using `notepad`. Use `notepad++` or `IDE` (`eclipse` or `intellij`).
* Every Java KeyWord is in lowercase only.
* Love to read the exceptions and errors in the source code.

Simple Java `Hello World`
------------------------
* Go to `D drive` and create a folder `java-code`.
* With this we will have a folder `D://java-code/`
* Open `notepad++` and write the below `java source code` .

```java
public class Simple
{
  public static void main(String[] args)
  {
    System.out.println("Hello World");
  }
}
```

Save above file as `Simple.java` under `D://java-code`. 

Compile
-------
Java source code need to be compiled using the tool `javac` and the result of compilation is `bytecode` containing in a `.class` file. We always compile java source code file(not java class). Use the below steps to compile the `java source code` written in `Simple.java`.

* Open explorer `WINDOW+E`. 
* Go to `D://java-code/`. This is the place where we saved `Simple.java` file containing `java source code`.
* In the `address bar` type `cmd` .
* To `compile` the `java source code` from the cmd we type the command `javac Simple.java` .
* Once the above command executed successfully, we can see a class file with name `Simple.class` has been generated.
* Everytime you change the content in `java source code` file, you have to `compile` to generate the `bytecode` containing your changes.

Execute
-------
To run the `.class` file generated in the above step, we have to use the below command.
* java Simple
* You will see the output as `Hello World`

Compilation and Execute Using Package
---------------------------------
Suppose a class is declared with a package as shown below.

```java 
package com.java;
public class Simple
{
  public static void main(String[] args)
  {
    System.out.println("Hello World");
  }
}
```

* compile : `javac -d . Simple.java`
* execute: `java com.java.Simple`
