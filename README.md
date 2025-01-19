# Spring AOP

In Spring Framework, an Aspect is a key part of Aspect-Oriented Programming (AOP). It enables the separation of cross-cutting concerns (such as logging, security, and transaction management) from the business logic. This helps make the code more modular, reusable, and easier to maintain.

## Key Concepts in Spring AOP

- Aspect: A modular unit of cross-cutting behavior. It is implemented using an annotated class or an XML configuration.


- Advice: The action taken by an aspect. It defines what and when the cross-cutting code will execute. Types of advice include:

        Before Advice: Runs before the target method.

        After Returning Advice: Runs after the target method returns successfully.

        After Throwing Advice: Runs if the target method throws an exception.

        After (Finally) Advice: Runs after the target method executes (whether it succeeds or fails).

        Around Advice: Runs before and after the target method.

- Join Point: A specific point during the execution of a program, such as the execution of a method or handling of an exception, where advice can be applied.

- Pointcut: A predicate or expression used to match join points. It defines where the advice should be applied.

- Weaving: The process of linking aspects with the target objects. In Spring, weaving is done at runtime using proxies.

## Use Cases for Spring AOP:- 

- Logging: Automatically log method calls and execution times.

- Security: Check permissions before accessing sensitive resources.

- Transaction Management: Start, commit, or roll back transactions automatically.

- Caching: Cache method results based on inputs.
