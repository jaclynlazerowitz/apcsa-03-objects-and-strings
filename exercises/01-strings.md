# Exercise 3 — Concatenation Predictions

Predict every result **before** running anything. Be exact — include spaces.

Assume: `int a = 5;  int b = 3;  String s = "Score";  char c = 'A';`

| # | Expression | Predicted | Actual | Right? |
|---|---|---|---|---|
| 1 | `s + a` | `s  5` | s5 | No |
| 2 | `s + a + b` | `s  5  3`| s53 | No |
| 3 | `s + (a + b)` | `s  8`| s8 | No |
| 4 | `a + b + s` | `5  3  s`| 8s | No |
| 5 | `a + (b + s)` | `5  (3  s)` | 3s | No |
| 6 | `"" + a + b` | `  5  3`| 53 | No |
| 7 | `c + 1` | `A  1` | 66 | No |
| 8 | `"" + c + 1` | ` A 1` | A1 | No |
| 9 | `(char)(c + 1)` | ``A` 1``| B | No |
| 10 | `s + c` | `s + c`| sA | No |

---

## Follow-up

**1. Compare #2 and #4. Same three values, opposite order, and the results are structurally different. Explain the rule.**

Order matters so in one, the integers got added first and then the constant and in the other the integers did not add because the constant was added first with no parenthesis around the integer values.

**2. Why does #7 give `66` instead of `A1`?**

The char value 'A' has an auto-value of 65 and when you add plus 1 it becomes 6

**3. Why does #8 give `A1` when #7 gives `66`? What did the empty string change?**

Because the quotations made the char 'A' a string and added on a 1.

**4. Write a single line that prints exactly `The total of 5 and 3 is 8` using the variables `a` and `b`.**

```java
    System.out.println("The total of " + a + " and " + b + " is " + (a + b));
```

---

## Immutability check

Run this:
```java
String word = "hello";
word.toUpperCase();
System.out.println(word);

word = word.toUpperCase();
System.out.println(word);
```

**1. What did each line print?**

1. hello
2. HELLO

**2. In your own words: what does it mean that Strings are immutable?**

Maybe it's that you can't redefine a variable and after you create it it has a permanent output of that specific variable.

**3. Why is it easy to write `word.toUpperCase();` and think you've changed something? What kind of error is this — syntax, runtime, or logic?**

This is a logic error because you may think that if you just type it into your code, the output changes, but you need to chnage it and call the function specifically with the varibale to change the output.
