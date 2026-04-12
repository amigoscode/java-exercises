# Amigoscode Java Exercises

Guided hands-on exercises for the Java learning path on
[Amigoscode Academy](https://skool.com/amigoscode-academy).

## Tech Stack

- Java 25
- Maven
- JUnit 5, AssertJ & Mockito (for testing exercises)

## Branches

| Branch | Description |
|--------|-------------|
| `main` | Base setup |
| `exercises` | All exercises with TODOs |
| `solutions` | Completed solutions |

## How to Use

1. Checkout the exercises branch:
   ```bash
   git checkout exercises
   ```
2. Open the project in IntelliJ IDEA
3. Follow the exercises below in order - each course is a package
4. Use the **TODO tool window** (`View > Tool Windows > TODO`) to jump to exercise locations in the code
5. Stuck? Check the solutions branch:
   ```bash
   git checkout solutions
   ```

## Prerequisites

**Java 25 is required.** This project will not compile with older Java versions. Make sure you have Java 25 installed before starting.

You can check your Java version with:
```bash
java -version
```

## Course Order

The exercises follow the Java roadmap in this recommended order:

| # | Package | Course(s) | Exercises |
|---|---------|-----------|-----------|
| 1 | `beginners` | Java For Beginners | 69 |
| 2 | `developers` | Java For Developers | 130 |
| 3 | `oop` | Object Oriented Programming | 95 |
| 4 | `datastructures` | Data Structures | 99 |
| 5 | `generics` | Generics | 70 |
| 6 | `functionalinterfaces` | Functional Interfaces | 76 |
| 7 | `streams` | Streams Essentials + Java Streams | 152 |
| 8 | `testing` | Unit Testing Essentials + Unit Testing + Mockito | 126 |
| **Total** | | **11 courses** | **817** |

## Exercise Breakdown

<details>
<summary><strong>Java For Beginners (69 exercises)</strong></summary>

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `beginners/thebasics/Variables.java` | 7 | Variable declaration and data types |
| 02 | `beginners/thebasics/TypeCasting.java` | 6 | Implicit/explicit casting and type conversion |
| 03 | `beginners/thebasics/Operators.java` | 7 | Arithmetic, comparison, logical, and ternary operators |
| 04 | `beginners/thebasics/StringExercises.java` | 8 | String methods (length, substring, split, equals) |
| 05 | `beginners/thebasics/ArrayExercises.java` | 7 | Array declaration, access, iteration, and summing |
| 06 | `beginners/thebasics/ConditionalStatements.java` | 7 | if/else, switch statements, switch expressions |
| 07 | `beginners/thebasics/LoopExercises.java` | 8 | for, while, do-while, enhanced for, nested loops |
| 08 | `beginners/thebasics/MethodExercises.java` | 7 | Method creation, return types, overloading |
| 09 | `beginners/thebasics/ScannerExercises.java` | 6 | Reading user input with Scanner |
| 10 | `beginners/thebasics/MiniProject.java` | 6 | Simple calculator combining all concepts |

</details>

<details>
<summary><strong>Java For Developers (130 exercises)</strong></summary>

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `developers/loops/LoopExercises.java` | 7 | Nested loops, break/continue, patterns |
| 02 | `developers/conditionals/IfStatements.java` | 6 | Ternary, complex conditions, switch expressions |
| 03 | `developers/packages/PackageDemo.java` | 5 | Imports, static imports, fully qualified names |
| 04 | `developers/accessmodifiers/AccessModifiers.java` | 6 | public, private, protected, default |
| 05 | `developers/accessmodifiers/AccessDemo.java` | 5 | Accessing modifiers from another class |
| 06 | `developers/methods/MethodOverloading.java` | 7 | Method overloading with different parameters |
| 07 | `developers/methods/VarArgs.java` | 6 | Variable-length arguments |
| 08 | `developers/strings/StringMethods.java` | 8 | equals, compareTo, contains, replace, split |
| 09 | `developers/strings/StringBuilderExercises.java` | 6 | StringBuilder operations |
| 10 | `developers/dates/DateExercises.java` | 7 | LocalDate, LocalDateTime, formatting, parsing |
| 11 | `developers/bigdecimal/BigDecimalExercises.java` | 6 | BigDecimal arithmetic and comparisons |
| 12 | `developers/userinput/UserInputExercises.java` | 6 | Scanner with validation |
| 13 | `developers/exceptions/TryCatch.java` | 7 | try-catch-finally, multi-catch, try-with-resources |
| 14 | `developers/exceptions/CustomException.java` | 6 | Custom checked and unchecked exceptions |
| 15 | `developers/files/FileReading.java` | 6 | Reading files with Files and BufferedReader |
| 16 | `developers/files/FileWriting.java` | 6 | Writing files with Files and BufferedWriter |
| 17 | `developers/classes/ClassesAndObjects.java` | 7 | Classes, constructors, toString, equals |
| 18 | `developers/classes/EnumExercises.java` | 6 | Enums with fields, constructors, methods |
| 19 | `developers/staticmembers/StaticExercises.java` | 6 | Static fields, methods, factory methods |
| 20 | `developers/nullhandling/OptionalExercises.java` | 7 | Optional.of, ofNullable, map, flatMap |

</details>

<details>
<summary><strong>Object Oriented Programming (95 exercises)</strong></summary>

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `oop/encapsulation/BankAccount.java` | 7 | Private fields, getters/setters, validation |
| 02 | `oop/encapsulation/ImmutablePerson.java` | 6 | Immutable class with final fields |
| 03 | `oop/inheritance/Animal.java` | 5 | Base class with fields and methods |
| 04 | `oop/inheritance/Dog.java` | 6 | Extending, super(), overriding methods |
| 05 | `oop/inheritance/Vehicle.java` | 5 | Base class for vehicle hierarchy |
| 06 | `oop/inheritance/ElectricCar.java` | 6 | Extending, constructor chaining, override |
| 07 | `oop/abstractclasses/Shape.java` | 5 | Abstract class and abstract methods |
| 08 | `oop/abstractclasses/Circle.java` | 5 | Implementing abstract methods |
| 09 | `oop/abstractclasses/Rectangle.java` | 5 | Implementing abstract methods |
| 10 | `oop/abstractclasses/Employee.java` | 7 | Abstract hierarchy with polymorphism |
| 11 | `oop/polymorphism/PaymentProcessor.java` | 7 | Interface, multiple implementations |
| 12 | `oop/polymorphism/ShapeCalculator.java` | 6 | Polymorphic methods, instanceof |
| 13 | `oop/dependencyinjection/NotificationService.java` | 7 | Constructor injection pattern |
| 14 | `oop/dependencyinjection/OrderProcessor.java` | 6 | Depend on abstractions |
| 15 | `oop/solid/SolidExercises.java` | 8 | All 5 SOLID principles |

</details>

<details>
<summary><strong>Data Structures (99 exercises)</strong></summary>

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `datastructures/arrays/ArrayBasics.java` | 7 | Create, fill, search, sort arrays |
| 02 | `datastructures/arrays/TwoDArrays.java` | 6 | 2D array traversal (matrix) |
| 03 | `datastructures/arraylist/ArrayListBasics.java` | 7 | Add, remove, contains, iterate |
| 04 | `datastructures/arraylist/ArrayListOperations.java` | 7 | Sort, reverse, max, subList, toArray |
| 05 | `datastructures/stacks/StackExercises.java` | 7 | Push, pop, peek, balanced brackets |
| 06 | `datastructures/queues/QueueExercises.java` | 7 | Queue, PriorityQueue operations |
| 07 | `datastructures/linkedlists/LinkedListExercises.java` | 7 | addFirst, addLast, Iterator |
| 08 | `datastructures/linkedlists/LinkedListVsArrayList.java` | 5 | Performance comparison |
| 09 | `datastructures/sets/HashSetExercises.java` | 7 | Add, contains, remove duplicates |
| 10 | `datastructures/sets/TreeSetExercises.java` | 6 | Sorted set, subSet, headSet |
| 11 | `datastructures/maps/HashMapExercises.java` | 8 | put, get, containsKey, iterate |
| 12 | `datastructures/maps/HashMapWordCount.java` | 6 | Word frequency counter |
| 13 | `datastructures/maps/TreeMapExercises.java` | 6 | Sorted map operations |
| 14 | `datastructures/maps/MapAdvanced.java` | 6 | computeIfAbsent, merge, Map.of |
| 15 | `datastructures/challenge/DataStructureChallenge.java` | 7 | Mini project with multiple structures |

</details>

<details>
<summary><strong>Generics (70 exercises)</strong></summary>

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `generics/classcastexception/ClassCastProblem.java` | 5 | Why generics are needed |
| 02 | `generics/typeparameters/TypeParameterBasics.java` | 6 | Generic class Container&lt;T&gt; |
| 03 | `generics/genericclasses/Box.java` | 6 | Generic Box&lt;T&gt; class |
| 04 | `generics/genericclasses/Pair.java` | 7 | Two type parameters Pair&lt;K,V&gt; |
| 05 | `generics/genericmethods/GenericMethods.java` | 7 | Generic static methods |
| 06 | `generics/genericmethods/GenericSwap.java` | 5 | Generic swap and reverse |
| 07 | `generics/boundedtypes/UpperBound.java` | 7 | &lt;T extends Number&gt; |
| 08 | `generics/boundedtypes/MultipleBounds.java` | 5 | Multiple type bounds |
| 09 | `generics/wildcards/UnboundedWildcard.java` | 5 | List&lt;?&gt; |
| 10 | `generics/wildcards/UpperBoundedWildcard.java` | 6 | &lt;? extends Number&gt; |
| 11 | `generics/wildcards/LowerBoundedWildcard.java` | 6 | &lt;? super Integer&gt; |
| 12 | `generics/typeerasure/TypeErasureDemo.java` | 5 | Type erasure behavior |

</details>

<details>
<summary><strong>Functional Interfaces (76 exercises)</strong></summary>

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `functionalinterfaces/gettingstarted/FunctionalInterfaceBasics.java` | 6 | @FunctionalInterface and lambdas |
| 02 | `functionalinterfaces/gettingstarted/LambdaExpressions.java` | 7 | Lambda syntax and usage |
| 03 | `functionalinterfaces/gettingstarted/MethodReferences.java` | 6 | Static, instance, constructor refs |
| 04 | `functionalinterfaces/functionalinterfaces/FunctionExercise.java` | 7 | Function, andThen, compose |
| 05 | `functionalinterfaces/functionalinterfaces/BiFunctionExercise.java` | 5 | BiFunction |
| 06 | `functionalinterfaces/functionalinterfaces/ConsumerExercise.java` | 7 | Consumer, BiConsumer |
| 07 | `functionalinterfaces/functionalinterfaces/PredicateExercise.java` | 7 | Predicate, and/or/negate |
| 08 | `functionalinterfaces/functionalinterfaces/SupplierExercise.java` | 6 | Supplier for lazy creation |
| 09 | `functionalinterfaces/extending/ExtendingInterfaces.java` | 6 | Extending functional interfaces |
| 10 | `functionalinterfaces/extending/CombinatorPattern.java` | 7 | Validation combinator pattern |
| 11 | `functionalinterfaces/callbacks/CallbackExercise.java` | 6 | Callback pattern with Consumer |
| 12 | `functionalinterfaces/callbacks/EventProcessor.java` | 6 | Event-driven processing |

</details>

<details>
<summary><strong>Java Streams (152 exercises)</strong></summary>

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `streams/basics/CreatingStreams.java` | 6 | Stream.of, Arrays.stream, generate |
| 02 | `streams/basics/FilterBasics.java` | 6 | Filtering lists |
| 03 | `streams/basics/MapBasics.java` | 6 | Mapping/transforming elements |
| 04 | `streams/basics/ForEachAndCollect.java` | 6 | forEach, collect to List/Set |
| 05 | `streams/basics/ReduceBasics.java` | 6 | Reduce operations |
| 06 | `streams/intstreams/IntStreamBasics.java` | 6 | IntStream.range, sum, average |
| 07 | `streams/intstreams/IntStreamIterate.java` | 5 | IntStream.iterate, LongStream |
| 08 | `streams/minmax/MinMax.java` | 6 | Finding min/max with Comparator |
| 09 | `streams/duplicates/DistinctExercise.java` | 6 | distinct(), collect to Set |
| 10 | `streams/filtering/FilterExercise.java` | 7 | Complex filter conditions |
| 11 | `streams/filtering/TakeWhileDropWhile.java` | 6 | takeWhile, dropWhile |
| 12 | `streams/filtering/FindAndMatch.java` | 7 | findFirst, anyMatch, allMatch |
| 13 | `streams/transformations/MapExercise.java` | 6 | Map objects to different types |
| 14 | `streams/transformations/FlatMapExercise.java` | 7 | Flatten nested structures |
| 15 | `streams/transformations/ReduceExercise.java` | 6 | Custom reduce operations |
| 16 | `streams/statistics/CountMinMax.java` | 6 | count, min, max on objects |
| 17 | `streams/statistics/AverageAndSum.java` | 6 | mapToInt, average, sum |
| 18 | `streams/statistics/SummaryStatistics.java` | 5 | IntSummaryStatistics |
| 19 | `streams/statistics/GroupingBy.java` | 7 | Collectors.groupingBy |
| 20 | `streams/statistics/GroupingAndCounting.java` | 6 | groupingBy + counting |
| 21 | `streams/sorting/SortingExercise.java` | 7 | sorted() with Comparator |
| 22 | `streams/joiningstrings/JoiningExercise.java` | 5 | Collectors.joining |
| 23 | `streams/collectors/CollectorsExercise.java` | 7 | toMap, partitioningBy, teeing |
| 24 | `streams/understanding/LazyStreams.java` | 5 | Lazy evaluation, short-circuiting |
| 25 | `streams/challenge/StreamsChallenge.java` | 8 | Full pipeline challenge |

</details>

<details>
<summary><strong>Unit Testing + Mockito (126 exercises)</strong></summary>

**Source classes** (in `src/main/java`):

| File | Description |
|------|-------------|
| `testing/firsttest/Calculator.java` | Calculator (add, subtract, multiply, divide) |
| `testing/assertions/StringUtils.java` | String utilities (palindrome, reverse, capitalize) |
| `testing/scenarios/GradeCalculator.java` | Grade calculator (score to letter grade) |
| `testing/assertj/Person.java` | Person class for AssertJ exercises |
| `testing/parameterized/EmailValidator.java` | Email validation |
| `testing/exceptions/BankAccount.java` | Bank account with exception handling |
| `testing/tdd/PasswordValidator.java` | Empty - implement via TDD |
| `testing/tdd/ShippingCostCalculator.java` | Empty - implement via TDD |
| `testing/mocking/*.java` | Interfaces and classes for mocking exercises |

**Test classes** (in `src/test/java`):

| # | File | TODOs | Topic |
|---|------|-------|-------|
| 01 | `testing/firsttest/CalculatorTest.java` | 7 | First unit test, assertEquals |
| 02 | `testing/assertions/StringUtilsTest.java` | 7 | assertTrue, assertFalse, assertAll |
| 03 | `testing/assertions/AssertThrowsTest.java` | 6 | assertThrows, exception messages |
| 04 | `testing/scenarios/GradeCalculatorTest.java` | 8 | Test scenarios and boundaries |
| 05 | `testing/junitfeatures/JunitFeaturesTest.java` | 8 | BeforeEach, Nested, Repeated, Tags |
| 06 | `testing/assertj/PersonTest.java` | 8 | AssertJ fluent assertions |
| 07 | `testing/parameterized/EmailValidatorTest.java` | 6 | @ParameterizedTest, @ValueSource |
| 08 | `testing/parameterized/CsvSourceTest.java` | 5 | @CsvSource, @CsvFileSource |
| 09 | `testing/exceptions/BankAccountTest.java` | 7 | assertThatThrownBy |
| 10 | `testing/tdd/PasswordValidatorTest.java` | 8 | TDD - write tests first |
| 11 | `testing/tdd/ShippingCostCalculatorTest.java` | 6 | TDD exercise |
| 12 | `testing/mocking/FirstMockTest.java` | 6 | @Mock, when/thenReturn, verify |
| 13 | `testing/mocking/MatchersTest.java` | 6 | any(), argThat(), eq() |
| 14 | `testing/mocking/VerifyInteractionsTest.java` | 7 | verifyNoInteractions, times, never |
| 15 | `testing/mocking/ArgumentCaptorTest.java` | 6 | ArgumentCaptor, @Captor |
| 16 | `testing/mocking/BDDMockitoTest.java` | 6 | given/willReturn, then/should |
| 17 | `testing/mocking/AdvancedMockingTest.java` | 7 | Answer, InOrder, spy, timeout |
| 18 | `testing/mocking/ClockMockingTest.java` | 6 | Mock Clock for time-dependent logic |
| 19 | `testing/mocking/ProductServiceTest.java` | 7 | Full mocking exercise |

</details>

## Community

Join the [Amigoscode Academy](https://skool.com/amigoscode) to get help,
share your progress, and connect with other learners.
