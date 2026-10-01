# Part 09 — Checkpoint: build a guessing game

**Checkpoint · we do this in class · due before the next lecture · No AI**

**There is no video in this part.** You find out what you can build **on your own**. You
write a whole program from an empty class: a number guessing game. Everything you need, you
already learned on parts 03 to 07.

This is supposed to feel harder than following along. That's the point. When you get
stuck, look back at the part that covered it. That is not cheating. That is how programmers
work.

**What you use:**

- `Scanner` to read what the user types (part 03)
- `Random` to pick a secret number (part 05)
- `if` / `else if` to say "too high" or "too low" (part 06)
- a `while` loop to keep asking until they get it (part 07)

> **Before you start:** open any `.java` file. Click inside it. Type `Sys` and wait two
> seconds. If a list pops up, **stop.** Autocomplete is back on. Do
> [Part 00, step 4](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai) again
> before you type anything else.

---

## How this part works

**In class, together:** we start Section A (build), and we do the **in-class
exercise** together.

**On your own:** you finish whatever we did not get to, then do Sections B, C and D.

## How this part is graded

This part has **four graded sections**. Each one is worth **25 points**.

| Section | File | Points | Your commit message |
|---|---|---|---|
| **A · Build** | `GuessingGame.java` | 25 | `part09 build: guessing game from an empty file` |
| **B · Comments** | `GuessingGame.java` | 25 | `part09 comments: explained every line of the build` |
| **C · Stretch** | `Stretch.java` | 25 | `part09 stretch: prediction, sum, pick a number, and dice` |
| **D · Challenge** | `Challenge.java` | 25 | `part09 challenge: ticketPrice and letterGrade` |

Section A is called **Build** instead of Follow along, because there is nothing to
follow. Notice its commit message starts with `part09 build:`.

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part08/Stretch.java`. Look at your **Stretch B1 (Liftoff)** for **30 seconds**.
2. Close it.
3. Open `part09/Warmup.java`. **Without looking back**, type it again, from memory. You have
   to type `main` yourself too.
4. Run it with the **green ▶** next to `main`. It should print:

```
5
4
3
2
1
Liftoff!
```

5. If it does not match, try to fix it yourself first. Look back at `part08/Stretch.java`
   only if you are really stuck.

---

## In-class exercise — plan the game (together, not graded)

We do this one together in class, in `InClass.java`, **before** anyone writes the game.
Everyone types their own copy.

### Step 1 — Plan it in plain English

Do not write any code yet. Under the `STEP 1` comment, write the **steps of the guessing
game** as numbered `//` comments, in order, in plain English.

Read **What the game does** and the **sample run** in Section A below. Then answer these
questions together. Each answer becomes one or more steps in your plan:

- What does the computer need to **remember** the whole time? (Those become variables.)
- What happens **only once**, at the start?
- What happens **again and again**? (That goes inside a loop.)
- When does the repeating **stop**?
- What happens **once**, at the very end?

When your plan is done, you have a map for Section A. You will copy it into
`GuessingGame.java` and write the code under each step.

### Step 2 — Fix the bugs

> **Different from before:** some of these bugs are more than one line long, so this time
> each bug has its **own** `/* ... */`. Instead of moving a line, you delete the `/*` and
> `*/` around **one** bug.

Under `STEP 2` there are three bugs. Each one is inside its own `/* ... */` comment, so it
does not stop your program from running. One at a time:

1. Pick **one** bug. Delete its `/*` line and its `*/` line. Now Java can see it.
2. Read the **red error**, or run it and watch what happens.
3. Fix it. Run the program.
4. Do the next bug.

| The bug | What happens |
|---|---|
| `Random random = new Random;` | Red error: `'(' or '[' expected` |
| `int guess = scanner.nextint();` | Red error: `cannot find symbol` … `symbol: method nextint()` |
| A `while (count <= 3)` loop that never changes `count` | **No red error.** It prints `Guess number 1` forever. Stop it with the red **■ Stop** button in the Run window |

**About the last one:** the loop keeps going while `count <= 3`. Nothing inside the loop
ever changes `count`, so it is **always** 1. A loop needs something inside it that moves it
toward stopping. Add `count++;` inside the loop.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part09 in-class: plan the game and fix the bugs"
```

---

## Section A — Build the guessing game (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

Open `GuessingGame.java`. It is an empty class. You write everything, including `main`.

### What the game does

1. The computer picks a **secret number** from 1 to 100. The player can't see it.
2. The player types a guess.
3. If the guess is too big, the game says `Too high!`. If it's too small, `Too low!`.
4. Steps 2 and 3 repeat until the player gets it right.
5. Then the game says how many guesses it took.

### Here is a sample run

The numbers after `Your guess:` are what the **player** typed. The secret number was 37.

```
I'm thinking of a number between 1 and 100.
Your guess: 50
Too high!
Your guess: 25
Too low!
Your guess: 37
Correct! You got it in 3 guesses.
```

Your game should print **exactly** these messages, word for word. The numbers will be
different every time, because the secret number is random.

### The rules: your program must do all of these

Check each one off as you finish it.

- [ ] 1. Import `Scanner` **and** `Random`. Both lines go **below** `package part09;`.
- [ ] 2. Make a `Scanner` (part 03) and a `Random` (part 05) inside `main`.
- [ ] 3. Pick the secret number with `random.nextInt(100) + 1`. Save it in an `int`
      variable.
- [ ] 4. Make an `int` variable for the guess, and one to **count** the guesses. Start
      both at `0`.
- [ ] 5. Print `I'm thinking of a number between 1 and 100.`
- [ ] 6. Use a **`while` loop** (part 07) that keeps going **as long as the guess is not
      equal to the secret number**.
- [ ] 7. Inside the loop: print `Your guess: ` with **`print`**, not `println`, so the
      player types on the same line. Then read the guess with `scanner.nextInt()`.
- [ ] 8. Inside the loop: add 1 to the guess counter.
- [ ] 9. Inside the loop: use `if` / `else if` (part 06) to print `Too high!` or `Too low!`.
- [ ] 10. **After** the loop: print `Correct! You got it in ` + the count + ` guesses.`

### Plan before you type

Many programmers write the steps in plain English first, as comments. Then they write code
under each comment. **You wrote a plan like this in class** (the in-class exercise above).
Copy your plan into `main` in `GuessingGame.java`. **Missed class?** Use this one:

```java
        // make a Scanner and a Random

        // pick the secret number from 1 to 100

        // make variables for the guess and the count

        // say hello

        // loop while the guess is wrong:
        //     ask for a guess
        //     count it
        //     say too high or too low

        // say they got it, and how many guesses
```

Now write the code for each step **under** its comment. You can delete these planning
comments at the end, or keep them. (You will add your own line-by-line comments in Section B.)

### Where to look when you're stuck

| You need to... | Look at |
|---|---|
| read a number the user types | part 03, user input |
| pick a random number | part 05, random numbers. **Why `+ 1`?** `random.nextInt(100)` gives 0 to 99. Adding 1 makes it 1 to 100 |
| choose between "too high" and "too low" | part 06, `if` statements |
| repeat until they get it right | part 07, `while` loops |

### How to test a random game

The secret number changes every time, so it's hard to check that "Too high" and "Too low"
are right. Here's the trick programmers use:

1. **For testing only**, add this line right after you pick the secret number:

```java
        System.out.println("(secret: " + secret + ")");
```

2. Run it. Now you can see the secret. Guess too high, then too low, then right. Check that
   each message is correct and that the count is right.
3. **Delete that line before you commit.** A real game does not show the answer.

### Stuck? Check these first

These are real error messages you might see:

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` and `symbol: class Random` (or `class Scanner`) | The import is missing. Click the red word, press `⌥ Enter` (Mac) / `Alt Enter` (Windows) → **Import class** |
| `variable guess might not have been initialized` | You wrote `int guess;` with no value. The loop checks `guess` before the player has typed anything. Start it at `0`: `int guess = 0;` |
| `incompatible types: int cannot be converted to boolean` on an `if` line | You used **one** `=` (which **sets** a value). To **compare**, use `==`, or `>` / `<` |
| The game never says `Correct!` | Check your `while` condition. It should keep going while `guess != secret` |
| The game asks once and then ends | Your "ask for a guess" lines are **outside** the loop's `{ }`. Move them inside |
| The count is always `0` or always `1` | `guesses++` must be **inside** the loop, and the variable must be made **before** the loop |
| `Exception in thread "main" java.util.InputMismatchException` | You typed a word instead of a number. Run it again and type a whole number |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When your game works, and the "secret" testing line is deleted, type this in the terminal:

```bash
git add -A
git commit -m "part09 build: guessing game from an empty file"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In `GuessingGame.java`, put a `//` comment **above every line of
code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes both `import` lines,
  `public class GuessingGame`, `public static void main(...)`, every variable, the `while`
  line, every `if` / `else if`, and every `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// random number` | `// nextInt(100) gives 0 to 99, so I add 1 to get a secret number from 1 to 100` |
| `// while loop` | `// keep asking for guesses until the player types the secret number` |
| `// guesses++` | `// add 1 to the count every time the player guesses, so I can tell them the total at the end` |
| `// print` | `// print (not println) so the player types their guess on the same line` |
| `// if` | `// if the guess is bigger than the secret, tell them to go lower` |

**Rules:**

1. **Your own words.** I want to know what **you** think each line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run it again when you're done.** Comments must not change how the game works.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part09 comments: explained every line of the build"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.** Put all
of the stretch code in the same `main`, one part under the other. B2 and B3 need imports:
add them below `package part09;`.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
int count = 0;
int n = 1;
while (n < 20) {
    n = n * 2;
    count++;
}
System.out.println(n + " " + count);

int x = 7;
while (x > 0) {
    if (x % 2 == 0) {
        System.out.println(x + " is even");
    } else {
        System.out.println(x + " is odd");
    }
    x -= 3;
}
```

2. **Above that code**, write what you think it will print. Put your guess inside a
   comment:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
32 5
7 is odd
4 is even
1 is odd
```

- `n` doubles each time: 1 → 2 → 4 → 8 → 16 → 32. It stops when `n` is 32, because 32 is
  not less than 20. That took **5** trips through the loop.
- `x` goes 7 → 4 → 1 → -2. It stops at -2, because -2 is not greater than 0. `%` gives the
  remainder: `x % 2 == 0` is true for even numbers.

</details>

### Stretch B — three small loops

**B1. Add up 1 to 10.** Use a `while` loop to add up the numbers from 1 to 10. Then print
the total:

```
Sum: 55
```

**Hints:** make `int sum = 0;` and `int i = 1;`. In the loop, add `i` to `sum`, then add 1
to `i`. Keep it short, about 6 lines. **The next part's warm-up is B1, from memory.**

**B2. Pick a number.** Use a `Scanner`. Keep asking `Pick a number from 1 to 10: ` until the
user types a number **from 1 to 10**. Then thank them. Sample run (the user typed 0, then
15, then 7):

```
Pick a number from 1 to 10: 0
Pick a number from 1 to 10: 15
Pick a number from 1 to 10: 7
Thanks! You picked 7.
```

**Hint:** start your variable at `0`, so the loop runs at least once. Keep looping while
the number is less than 1 **or** greater than 10: `while (pick < 1 || pick > 10)`.

**B3. Roll until six.** Use a `Random`. Roll a die (`random.nextInt(6) + 1`) and print each
roll. Stop when you roll a 6. Then say how many rolls it took. Sample run (yours will be
different, because it's random):

```
Rolled a 3
Rolled a 1
Rolled a 6
It took 3 rolls to get a 6.
```

### ✅ Commit Section C

```bash
git add -A
git commit -m "part09 stretch: prediction, sum, pick a number, and dice"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two methods** for you to finish. A **test** checks your
answers.

### How the methods work

- The **top line** of each method is already written. Don't change it.
- The **inputs** are inside the parentheses. In `ticketPrice(int age, boolean student)`, the
  inputs are `age` and `student`. They already have values when your code runs.
- Your answer goes after **`return`**. Replace the line marked `// YOUR CODE`.
- You can have **more than one** `return`. When Java reaches a `return`, the method stops
  right there and gives back that value.

### The two problems

**1. `ticketPrice(int age, boolean student)`** — return the price of a movie ticket, in
dollars:

| Who | Price |
|---|---|
| younger than 5 | `0` |
| 65 or older | `5` |
| a student (any other age) | `7` |
| everyone else | `10` |

**The age rules come first.** A 70-year-old student pays `5`, not `7`.

| Call | Returns |
|---|---|
| `ticketPrice(3, false)` | `0` |
| `ticketPrice(70, true)` | `5` |
| `ticketPrice(19, true)` | `7` |
| `ticketPrice(30, false)` | `10` |

**2. `letterGrade(int score)`** — return the letter grade as a String:

| Score | Returns |
|---|---|
| 90 or more | `"A"` |
| 80 or more | `"B"` |
| 70 or more | `"C"` |
| 60 or more | `"D"` |
| anything lower | `"F"` |

**Hint for both:** use `if` / `else if` / `else`, and check in the right **order**. For
grades, check 90 first. If you check 60 first, a 95 would get a `"D"`, because 95 is also 60
or more.

### Run the test

1. In `Challenge.java`, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This opens
   `ChallengeTest.java`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run 'ChallengeTest'**.
3. **Red ✗** means that answer is wrong. Click it and read **expected** (the right answer)
   and **but was** (what your code gave).
4. Fix your code. Run the test again. Keep going until **every test is green ✔**.

A couple of tests may be green before you start. That's because the starting code happens
to be right for those. **All of them must be green at the end.**

**Never change `ChallengeTest.java`.** Only change `Challenge.java`.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part09 challenge: ticketPrice and letterGrade"
```

---

## Hand it in: push before the next lecture

### 1. Fill in your log

At the bottom of this page, fill in the three lines under **My log**.

### 2. Check your commits

In the terminal, type:

```bash
git log --oneline
```

Near the top of the list, you should see **your commits for this part**, newest first:

```
a1b2c3d part09 challenge: ticketPrice and letterGrade
e4f5a6b part09 stretch: prediction, sum, pick a number, and dice
c7d8e9f part09 comments: explained every line of the build
9d8c7b6 part09 in-class: plan the game and fix the bugs
0a1b2c3 part09 build: guessing game from an empty file
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part09 comments: explained every line of the build"
```

### 3. Push

```bash
git add -A
git commit -m "part09 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong2-ControlFlow`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 (Sum: 55) again, from memory.

**Finished early? Start Part 10.** It is in the **next repo, FollowAlong3-DataAndMethods**. Its README
shows you how to set it up (about 5 minutes). You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started:
Finished:
The line that took me the longest:
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 5 — Conditionals and Logic](https://books.trinket.io/thinkjava2/chapter5.html)
  for `if`, and [Chapter 6 — Loops and Strings](https://books.trinket.io/thinkjava2/chapter6.html)
  for `while` loops.
- **Tutoring:** bring your laptop and this page. A guessing game that almost works is a
  great thing to bring.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
