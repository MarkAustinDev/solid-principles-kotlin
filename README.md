# solid-principles-kotlin

- **S**ingle Responsibility 
- **O**pen Closed
- **L**iskov Substitution
- **I**nterface Segregation
- **D**ependency Inversion

SOLID principles are a good way for developers to manage code complexity. Following these principles leads to more maintainable and extensible code.

**NOTE:** SOLID principles are a guide, they don't apply to all scenarios. The principles have some level of overlap and applying one of the principles will lead to adopting another.

Object Oriented code that doesn't follow SOLID principles can lead to: 

- **Rigidity**: Implementing even a small change can prove to be difficult as one change will translate into a cascade of changes.
    
- **Fragility**: Any change tends to break the application in many places, even areas not conceptually related to the change.

- **Immobility**: We're unable to reuse modules from other projects or within the same projects as these modules have lots of dependencies. 

- **Viscosity**: When code changes are needed, developers will choose the easier route for the change even if this breaks the existing design of the software.

The essence of SOLID is managing dependencies. This is done via interfaces and abstractions. Modules and classes should not be tightly coupled.

## Single Responsibility Principle (SRP)

- Each class should have only 1 responsibility. 

- Each class should only have one reason to change. 

NOTE: A bug fix or refactor does not count as a change as this is impacted by the code itself and not the user.

For example, a Car class can start or stop itself but the task of washing it belongs to the CarWash class. 

When SRP is followed, testing is easier. With a single responsibility, the class will have fewer test cases. Less functionality also means less dependencies to other modules or classes. It leads to better code organization since smaller and well-purposed classes are easier to search.


## Open Closed (OCP)

- A software module (class or method) should be open for extension but closed for modification. 

This means that functions or base class methods should not get polluted with details of subclasses. 
For example, a Car class might have methods AccelerateAudi, AccelerateBMW, and so on. This is a violation of OCP. Instead, we should have an Car interface with method Accelerate. Each car subclass can implement this interface.

OCP is important since classes may come to us via third-party libraries. We should be able to extend those classes without worrying if those base classes can support our extensions. But inheritance can lead to subclasses depending on base class implementation. To avoid this, use of interfaces is recommended. This additional abstraction leads to loose coupling.