# Part 08 — `for` loops and nested loops

**We start this together in class · due before the next lecture · No AI**

Part 07's `while` loop keeps going until something changes. The `for` loop is for
when you know **how many times** to repeat. Then you put one loop **inside** another, and
use it to draw shapes.

**What you learn:**

- the **`for` loop** and its three parts: where to start, when to stop, and how to count
- counting **up**, counting **down**, and counting **by 2**
- **nested loops**: a loop inside another loop, for rows and columns

> **Before you start:** open any `.java` file. Click inside it. Type `Sys` and wait two
> seconds. If a list pops up, **stop.** Autocomplete is back on. Do
> [Part 00, step 4](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai) again
> before you type anything else.

---

## How this part works

**In class, together:** we start Section A (follow along), and we do the **in-class
exercise** together.

**On your own:** you finish whatever we did not get to, then do Sections B, C and D.

## How this part is graded

This part has **four graded sections**. Each one is worth **25 points**.

| Section | File | Points | Your commit message |
|---|---|---|---|
| **A · Follow along** | `ForLoops.java`, `NestedLoops.java` | 25 | `part08 follow-along: for loops and nested loops` |
| **B · Comments** | `ForLoops.java`, `NestedLoops.java` | 25 | `part08 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part08 stretch: prediction, liftoff, evens, and times table` |
| **D · Challenge** | `Challenge.java` | 25 | `part08 challenge: repeatWord and triangle` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part07/Stretch.java`. Look at your **Stretch B1** for **30 seconds**.
2. Close it.
3. Open `part08/Warmup.java`. **Without looking back**, type Stretch B1 again, from memory.
   You have to type `main` yourself too.
4. Run it with the **green ▶** next to `main`. Does it print the same thing as last time?
5. If it does not match, try to fix it yourself first. Look back at `part07/Stretch.java`
   only if you are really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part has **two** pieces of the video. Each one goes in its own file.

| Video piece | Starts | Stops | Your file |
|---|---|---|---|
| `for` loops | **1:32:37** | about **1:36:20** | `ForLoops.java` |
| Nested loops | **1:37:16** | about **1:42:48** | `NestedLoops.java` |

**▶ [Open the video at 1:32:37 (`for` loops)](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5557s)**
**▶ [Open the video at 1:37:16 (nested loops)](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

That is about 10 minutes of video. It will take you about 20 minutes, because you keep
pausing to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **`for` loops start** when he says *"let's talk about for loops."*
>   **Stop** when he says *"so that's what a for loop is."*
> - **Nested loops start** when he says *"a nested loop is really just a loop inside of
>   another loop."* **Stop** when he says *"well ladies and gentlemen, that is one example
>   of how a nested loop could be useful."*
> - Skip the "like and subscribe" part between them.

### His screen looks different from yours

He uses a program called **Eclipse**. You use **IntelliJ**. The Java code is exactly the
same. Here is what to do when they don't match:

**He makes a new project for each video. You don't.** Your two files already exist:
`ForLoops.java` and `NestedLoops.java`. Type the `for` loop video in the first one and the
nested loop video in the second one.

**His class is called `Main`. Yours are called `ForLoops` and `NestedLoops`.** Leave the
`package part08;` line and the `public class ...` line alone. Type everything else, starting
with `main`.

**He changes the same loop over and over.** In the `for` loop video, he writes one loop,
then changes it to count down, then to count by 2. **Change your loop along with him.** At
the end, your file only has his last version. That's fine.

**He types `import java.util.Scanner;` himself.** In IntelliJ, you can type it yourself, or
click the red word `Scanner` and press `⌥ Enter` (Mac) or `Alt Enter` (Windows) →
**Import class**. Either way, the import goes **below** `package part08;`.

**He types the user's answers into Eclipse's Console.** You type them in IntelliJ's **Run**
window. Click inside the Run window first, then type, then press Enter.

**He copies and pastes the "rows" lines to make the "columns" lines.** **You type them.**

### Check your output as you go

**Check 1 (about 1:33:30): count up.** The first loop prints the numbers **0 to 10**, one per
line. That is **11** numbers, because it starts at 0.

**Check 2 (about 1:35:00): count down.** Now it prints **10 down to 0**, then:

```
Happy New Year!
```

**Check 3 (about 1:35:33): count down by 2.** With `i -= 2`:

```
10
8
6
4
2
0
Happy New Year!
```

**Check 4 (about 1:35:47): move `i -= 2` into the loop's body.** The output is **exactly
the same** as Check 3.

**Check 5 (about 1:40:56): the rectangle.** Run `NestedLoops`. Type `4`, `5`, and `$`:

```
Enter number of rows:
4
Enter number of columns:
5
Enter symbol to use:
$

$$$$$
$$$$$
$$$$$
$$$$$
```

The empty line above the rectangle is normal. The outer loop prints a new line **before**
each row, including the first one.

**Try a different size.** Run it again with `2`, `8`, and `#`. You should get 2 rows of 8
`#` each.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `error: ';' expected` and `illegal start of expression` on the `for` line | You used **commas** between the three parts. Use **semicolons**: `for (int i = 0; i <= 10; i++)` |
| `cannot find symbol` and `symbol: variable i` | You used `i` **after** the loop's `}`. The loop's `i` only exists **inside** the loop |
| `cannot find symbol` and `symbol: class Scanner` | The import is missing. Click `Scanner`, press `⌥ Enter` / `Alt Enter` → **Import class** |
| The program prints the same number forever and never stops | The counter never changes, or it goes the wrong way (like `i++` when counting down). Click the **red square (Stop)** in the Run window, then fix the third part of the loop |
| `Exception in thread "main" java.util.InputMismatchException` | You typed a word when the program wanted a number. Run it again and type a whole number, like `4` |
| Every `$` is on its own line | The inner loop uses `println`. It should be `print` |
| The rectangle is the wrong size | Check that the outer loop uses `rows` and the inner loop uses `columns` |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When both files match the checks, type this in the terminal:

```bash
git add -A
git commit -m "part08 follow-along: for loops and nested loops"
```

---

## In-class exercise — sensor sweep and parking map (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — A sweep, then a map

Inside `main`, under the `STEP 1` comment, make the program print this:

```
=== SENSOR SWEEP ===
Scanning at 0 degrees
Scanning at 45 degrees
Scanning at 90 degrees
Scanning at 135 degrees
Scanning at 180 degrees
=== PARKING MAP ===
Row 1: [ ][ ][ ][ ][ ]
Row 2: [ ][ ][ ][ ][ ]
Row 3: [ ][ ][ ][ ][ ]
```

Things to figure out together:

- The sweep is **one** `for` loop. Where does it start? When does it stop? It does not
  count by 1. What goes in the third part of the `for`?
- The map is a loop **inside** a loop. The **outer** loop does the rows. The **inner**
  loop prints the 5 boxes `[ ]`.
- The boxes in a row use `print`, so they stay on one line. What goes **after** the inner
  loop, so the next row starts on a new line?

### Step 2 — Fix the bugs

> **Different from before:** some of these bugs are more than one line long, so this time
> each bug has its **own** `/* ... */`. Instead of moving a line, you delete the `/*` and
> `*/` around **one** bug.

Under `STEP 2` there are three bugs. Each one is inside its own `/* ... */` comment, so it
does not stop your program from running. One at a time:

1. Pick **one** bug. Delete its `/*` line and its `*/` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix it. Run the program.
4. Do the next bug.

| The bug | The error Java gives you |
|---|---|
| `for (int i = 1, i <= 5, i++)` | `';' expected` (and two more errors on the same line) |
| An inner loop that also uses `int i` | `variable i is already defined in method main(String[])` |
| `for (int angle = 0; angle <= 180; angle += 45); {` | `cannot find symbol` … `symbol: variable angle` |

**About the last one:** the `;` right after the `)` **ends the loop**. The loop runs with
nothing inside it. Then the `{ }` block runs once, by itself, and `angle` does not exist
there anymore. Delete that `;`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part08 in-class: sensor sweep and parking map"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** `ForLoops.java` and `NestedLoops.java`, put a `//`
comment **above every line of code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes the `import` line,
  `public class ...`, `public static void main(...)`, every variable, every `for` line, and
  every `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English. For a `for` line, say where it starts, when it stops, and how it counts.

| ❌ Not enough | ✅ Good |
|---|---|
| `// for loop` | `// start i at 10, keep going while i is 0 or more, and take 2 off i after each trip` |
| `// print i` | `// show the counter on its own line, so I can see each number the loop goes through` |
| `// inner loop` | `// for every row, this runs once per column, so it prints one whole row of symbols` |
| `// print symbol` | `// print, not println, so all the symbols in a row stay side by side on one line` |
| `// println` | `// move down to a new line before each row starts` |

Here is what a commented line looks like in your file:

```java
        // keep looping while i is 10 or less, and add 1 to i after each time through
        for (int i = 0; i <= 10; i++) {
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run both files again when you're done.** Comments must not change the output. If it
   changed, a comment is missing its `//`.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part08 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.** Put all
of the stretch code in the same `main`, one part under the other.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
for (int i = 1; i <= 3; i++) {
    System.out.print(i + " ");
}
System.out.println();
for (int i = 5; i > 0; i -= 2) {
    System.out.println("i is " + i);
}
for (int i = 1; i <= 2; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

2. **Above that code**, write what you think it will print. Put your guess inside a
   comment, like this:

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
1 2 3 
i is 5
i is 3
i is 1
***
***
```

- The first loop uses `print`, so `1 2 3` stay on one line. The empty `println()` after it
  moves down.
- The second loop starts at 5 and takes away 2 each time: 5, 3, 1. Then `i` would be -1,
  which is not `> 0`, so it stops.
- The nested loop: 2 rows (outer), 3 stars in each row (inner). The `println()` is inside
  the outer loop but **after** the inner loop, so it ends each row.

</details>

### Stretch B — three loops of your own

**B1. Liftoff.** Use a `for` loop to count down from 5 to 1. After the loop, print
`Liftoff!`:

```
5
4
3
2
1
Liftoff!
```

Keep it short, about 4 lines. **The next part's warm-up is B1, from memory.**

**B2. Even numbers.** Use **one** `for` loop to print the even numbers from 2 to 20, all on
one line, with a space after each:

```
2 4 6 8 10 12 14 16 18 20 
```

**Hint:** start at 2, and count **by 2**, like the video's `i -= 2` but going up.

**B3. Times table.** Use **nested loops** to print a 5 × 5 times table. Put a tab `\t`
after each number so the columns line up:

```
1	2	3	4	5	
2	4	6	8	10	
3	6	9	12	15	
4	8	12	16	20	
5	10	15	20	25	
```

**Hints:**

- Outer loop: `row` from 1 to 5. Inner loop: `col` from 1 to 5.
- Each number is `row * col`.
- Print with `System.out.print(row * col + "\t");`
- After the inner loop finishes, use `System.out.println();` to end the row.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part08 stretch: prediction, liftoff, evens, and times table"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two methods** for you to finish. A **test** checks your
answers.

### How the methods work

You started these on part 06. A quick reminder:

- The **top line** of each method is already written. Don't change it.
- The method's **inputs** are inside the parentheses. For example, in
  `repeatWord(String word, int n)`, the inputs are `word` and `n`. They already have values
  when your code runs.
- Your answer goes after the word **`return`**. Replace the line marked `// YOUR CODE`.
- These methods **return** a String. They do **not** print anything.

### The two problems

**1. `repeatWord(String word, int n)`** — return `word` repeated `n` times, stuck together.

| Call | Returns |
|---|---|
| `repeatWord("hi", 3)` | `"hihihi"` |
| `repeatWord("Go", 1)` | `"Go"` |
| `repeatWord("abc", 0)` | `""` |

**Hint:** start with an empty String, `String result = "";`. Use a `for` loop that runs `n`
times. Each time, add `word` onto the end: `result = result + word;`. After the loop,
`return result;`.

**2. `triangle(int rows)`** — return a triangle of stars. Row 1 has 1 star, row 2 has 2
stars, and so on. **Every row ends with `\n`.**

| Call | Returns | Which prints as |
|---|---|---|
| `triangle(3)` | `"*\n**\n***\n"` | `*`<br>`**`<br>`***` |
| `triangle(1)` | `"*\n"` | `*` |
| `triangle(0)` | `""` | *(nothing)* |

**Hint:** this is a nested loop, like the rectangle. The outer loop counts rows. The inner
loop adds stars. The difference: the inner loop runs **as many times as the row number**,
so its condition uses the outer counter: `j <= i`. After the inner loop, add `"\n"`.

### Run the test

1. In `Challenge.java`, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This opens
   `ChallengeTest.java`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run 'ChallengeTest'**.
3. **Red ✗** means that answer is wrong. Click it and read **expected** (the right answer)
   and **but was** (what your code gave).
4. Fix your code. Run the test again. Keep going until **every test is green ✔**.

A couple of tests may be green before you start (like `triangle(0)` returning `""`). That's
because the starting code happens to be right for those. **All of them must be green at the
end.**

**Never change `ChallengeTest.java`.** Only change `Challenge.java`.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part08 challenge: repeatWord and triangle"
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
a1b2c3d part08 challenge: repeatWord and triangle
e4f5a6b part08 stretch: prediction, liftoff, evens, and times table
c7d8e9f part08 comments: explained every line of the follow-along code
9d8c7b6 part08 in-class: sensor sweep and parking map
0a1b2c3 part08 follow-along: for loops and nested loops
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part08 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part08 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong2-ControlFlow`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 (Liftoff) again, from memory.

**Finished early? Start Part 09.** You don't have to wait for class.

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

- **Think Java** (free online book): [Chapter 6 — Loops and Strings](https://books.trinket.io/thinkjava2/chapter6.html).
  Read the part about `for` loops.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
