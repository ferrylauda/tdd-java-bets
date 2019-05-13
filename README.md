# Exercise: Test-Driven Development (Java)

- Implement in Pair Programming
- Switch roles after each TDD cycle

### Scenario: Implement a Bets class

- The Bets class represents the bets on a poker table
- When I want to place a bet, the "bet" method is called with my bet amount
- We can call method "areEven" which returns true if every player has bet the same amount
  - This information can e.g. be used to decide whether the players now have to show their cards (showdown)
- There is a table limit that I am not allowed to exceed for my bet, i.e. I am not allowed to bet more than 100 USD
- If there are less than 2 players and areEven gets called, this is an illegal state (throw an exception)

### Hints

- JUnit documentation: https://junit.org/junit4/
- By design, JUnit, does not specify the execution order of test method invocations. And of course, well-written test code would **not assume any order**
- If you want to use Hamcrest as assertion library to have assertions reading more fluently, find the documentation here: https://code.google.com/p/hamcrest/wiki/Tutorial
- Use `@Before` for setup work before each test case, and `@BeforeClass` for setup work once before all test cases
- Use `@Ignore` to temporary disable tests (works on method _and_ class level). This is better than just commenting out since you can see in the report if there are disabled tests. See also [JUnit: ignoring tests](https://github.com/junit-team/junit4/wiki/Ignoring-tests).
