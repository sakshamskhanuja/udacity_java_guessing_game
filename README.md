## Guessing Game

### About

In the game we will get to use the input ```Scanner``` to build a guessing game where the computer will generate a random number between 1-100, and the user gets 10 guesses to find out what that number is.

When the game first starts it prints a few sentences explaining what's going on:

```
I have randomly chosen a number between [1, 100]
Try to guess it.
You have 10 guess(es) left.
```

Then asks the user to guess the number. Once the user types in a number and hits enter, the game will compare that guessed number with the random number it had generated and tell the user if it's smaller or larger, then they get to guess again.

```
I have randomly chosen a number between [1, 100]
Try to guess it.
You have 10 guess(es) left.
50
It's smaller than 50. Choose again.
You have 9 guess(es) left:
```

If the user manages to guess the number before they run out of guesses they win. Otherwise they lose!

```
You have 9 guess(es) left:
25
It's smaller than 25. Choose again.
You have 8 guess(es) left:
12
It's smaller than 12. Choose again.
You have 7 guess(es) left:
6
It's smaller than 6. Choose again.
You have 6 guess(es) left:
3
CORRECT ... YOU WIN!
```
