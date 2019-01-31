# Arch Unit

[Arch Unit](https://www.archunit.org) is a library which allows you to write rules as unit tests for checking the architecture of your Java code. It also allows enforcing good coding practices and Java community standards. This helps onboarding new members to team and company, maintaining and evolving the architecture of your code. 

# Training

This is an Arch Unit training using a simple REST API as an example where we guide you through several questionable (and often common) architectural decisions. 

Similar to some tutorials out there, there are several git tags which you can you use to advance to certain points of the training.

For example, the basic project starts with some architecture problems (tag basic-project). Then we add Arch Unit as a dependency (tag add-arch-unit-junit4). And in the next step we add a simple package check rule (tag add-controller-package-rule)

This tutorial is largely based on the following resources:
* [ArchUnit User Guide](https://www.archunit.org/userguide/html/000_Index.html#_introduction)
* [ArchUnit Examples](https://github.com/TNG/ArchUnit)

We have the training step-by-step descriptions and the tags in brackets below. 

For example: [awesome-tag] Awesome description

# Step by Step Tags

1. [basic-project] Basic project

2. [add-arch-unit-junit4] Adding Arch Unit (jUnit 4) as a dependency

3. Adding simple package checks
* [add-controller-package-rule] Controllers
* [add-service-package-rule] Services
* [add-repository-package-rule] Repositories

4. Using Built-in rules
* [standard-streams-rule] Standard streams
* [generic-exceptions-rule] Generic Exceptions
* [logging-rule] java.util.logging

5. Simple access check
* [services-access-rule] Services should only be accessed by controllers and services

6. Simple naming standards and interfaces tests
* [services-suffix-rule] Services should be suffixed
* [interfaces-name-rule] Interfaces should not be named interfaces
* [interfaces-package-rule] Interfaces should not be in the impl package

7. Deprecating classes
* [deprecating-classes-rule]  No new classes should implement some deprecated interface

8. Package containment (domain)
* [user-domain-rule]   Classes of the User domain should be in its package

9. Inheritance
* [concrete-repositories-rule]  Concrete classes that implement the CrudRepository interface should be suffixed Repository

10. Dependency
* [user-dependency-rule] Class User should only be used by User-related classes (UserController, UserService, UserRepository, and so on)

# Contact

I hope you enjoy it!

Any feedbacks are welcome!

fernando.afb@gmail.com