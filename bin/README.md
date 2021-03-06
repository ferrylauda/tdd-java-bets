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
- By design the test runner does not guarantee the execution order of the tests - and of course, well-written test code should also not rely on it
- If you want to use Hamcrest as assertion library to have assertions reading more fluently: http://hamcrest.org/JavaHamcrest/
- Use `@Before` for setup work before each test case, and `@BeforeClass` for setup work once before all test cases
  - [JUnit rules](https://github.com/junit-team/junit4/wiki/Rules) provide even more flexibility for setup work
- Use `@Ignore` to temporary disable tests (works on method _and_ class level). This is better than just commenting out since you can see in the report if there are disabled tests. See also [JUnit: ignoring tests](https://github.com/junit-team/junit4/wiki/Ignoring-tests).

## Test support tools
- To continuously execute your tests you can use [Infinitest](http://infinitest.github.io/) which has plugins for Eclipse and IntelliJ
- To get code coverage statistics you can use:
	- IntelliJ's built-in [code coverage runner](https://www.jetbrains.com/help/idea/code-coverage.html)
	- [EclEmma](https://www.eclemma.org/) plugin for Eclipse
- Mutation tests are available using the PIT maven plugin.
	- Simply run `mvn org.pitest:pitest-maven:mutationCoverage` the report will be available at **target/pit-reports/{timestamp}/index.html**
	- NOTE: If pitest reports any problems you can try to run `mvn install` and then retry.