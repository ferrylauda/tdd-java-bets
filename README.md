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

- We use Hamcrest as assertion library. If you don't know the syntax, you can look it up here: https://wiki.wdf.sap.corp/wiki/download/attachments/1588440504/JAVA_Hamcrest_cheatsheet.pdf