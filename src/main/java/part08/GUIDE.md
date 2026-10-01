# Part 08 Guide — `for` loops and nested loops

**The video, written out step by step.**

This page teaches the same thing as two pieces of the video:

- **`for` loops:** from **1:32:37** to about **1:36:20** → you type in `ForLoops.java`
- **Nested loops:** from **1:37:16** to about **1:42:48** → you type in `NestedLoops.java`

You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 1:33:11)**, if you want to see him do it.

---

# Part A — `for` loops (`ForLoops.java`)

## Step 1 — What is a `for` loop? (video 1:32:37)

A **loop** runs the same code again and again. On part 07 you learned the `while` loop. A
`while` loop keeps going as long as its condition is true. It might run forever.

A **`for` loop** is a little different. You usually know **ahead of time** how many times
it will run. "Count from 0 to 10" is a perfect job for a `for` loop.

Open `part08/ForLoops.java`. Type `public static void main(String[] args) { }` inside the
class, like every time. Everything below goes inside `main`.

---

## Step 2 — Count from 0 to 10 (video 1:33:11)

Type this inside `main`:

```java
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
```

A `for` loop has **three parts** inside its parentheses. They are separated by
**semicolons** `;`, not commas.

| Part | Code | What it means |
|---|---|---|
| 1. Start | `int i = 0` | Make a counter called `i`. Start it at 0. This happens **once**, before the loop starts |
| 2. Keep going while | `i <= 10` | Before each trip through the loop, check this. If it is true, run the code inside. If it is false, stop |
| 3. After each trip | `i++` | Add 1 to `i` |

`i` is short for **index**. You could call it anything, but almost everyone uses `i`.

The code inside the `{ }` is called the **body** of the loop. Here the body prints `i`.

**Before you run it:** how many numbers will it print? (Careful. It starts at 0.)

**Run it.** Output:

```
0
1
2
3
4
5
6
7
8
9
10
```

**11 numbers**, not 10. It counts 0 too.

---

## Step 3 — Count down, then "Happy New Year!" (video 1:34:54)

Now count **backwards**, from 10 down to 0. Change your loop so it looks like this, and add
one line **after** the loop's `}`:

```java
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy New Year!");
```

Three things changed:

1. `i` starts at **10**.
2. Keep going while `i` is **greater than or equal to** 0: `i >= 0`.
3. `i--` **subtracts 1** each time.

The `println` for "Happy New Year!" is **outside** the loop, after its `}`. So it runs
**once**, after the loop is done.

**Run it.** Output:

```
10
9
8
7
6
5
4
3
2
1
0
Happy New Year!
```

---

## Step 4 — Count down by 2 (video 1:35:33)

Change the third part from `i--` to `i -= 2`:

```java
        for (int i = 10; i >= 0; i -= 2) {
```

`i -= 2` means "take 2 away from `i`." It is the same as `i = i - 2`.

**Before you run it:** how many numbers will print?

**Run it.** Output:

```
10
8
6
4
2
0
Happy New Year!
```

Six numbers.

---

## Step 5 — Another way to write it (video 1:35:47)

He shows that you can **move the third part into the body**. Leave the `;` after the second
part, and leave the space after it empty:

```java
        for (int i = 10; i >= 0;) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println("Happy New Year!");
```

**Run it.** The output is **exactly the same** as Step 4.

He says this way is **optional**. Most people write it the Step 4 way.

> ⚠️ **Watch out:** if you move `i -= 2` out of the parentheses and forget to put it in the
> body, `i` never changes. The loop prints `10` forever. If your program will not stop,
> click the **red square (Stop)** button in the Run window. Then fix the loop.

---

# Part B — Nested loops (`NestedLoops.java`)

## Step 6 — What is a nested loop? (video 1:37:16)

A **nested loop** is a loop **inside** another loop.

He uses one to draw a **rectangle** out of a symbol. The user picks how many rows, how
many columns, and which symbol.

Open `part08/NestedLoops.java`. Type `main` inside the class.

---

## Step 7 — Get the Scanner ready (video 1:37:34)

You learned `Scanner` on part 03. It reads what the user types. Inside `main`, type:

```java
        Scanner scanner = new Scanner(System.in);
```

`Scanner` turns **red**. That means Java does not know where `Scanner` comes from yet.

**Fix it in IntelliJ:** click on the red word `Scanner`. Press `⌥ Enter` (Mac) or
`Alt Enter` (Windows). Choose **Import class**. IntelliJ adds this line near the top of
your file, **under** `package part08;`:

```java
import java.util.Scanner;
```

(He types the import himself. You can type it yourself too. It must go **below** the
`package` line and **above** `public class`.)

Now make three variables, under the scanner line:

```java
        int rows;
        int columns;
        String symbol = "";
```

- `rows` and `columns` will hold whole numbers.
- `symbol` will hold text. `""` is an **empty String**, text with nothing in it.

> You might see a **yellow** warning about the scanner. Yellow is a suggestion, not an
> error. Your code still runs.

---

## Step 8 — Ask the user three questions (video 1:37:34)

Under the variables, type:

```java
        System.out.println("Enter number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use:");
        symbol = scanner.next();
```

- `scanner.nextInt()` waits for the user to type a **whole number** and press Enter.
- `scanner.next()` waits for the user to type **one word** (anything up to a space or
  Enter).

**He copies and pastes the rows lines to make the columns lines. You type them.**

---

## Step 9 — The outer loop: one trip per row (video 1:38:52)

Under the questions, type the **outer** loop:

```java
        for (int i = 1; i <= rows; i++) {
            System.out.println();
        }
```

This loop runs once **for each row**. Right now it only prints an empty line each time.
`System.out.println()` with nothing inside just **moves down to the next line**.

Notice `i` starts at **1** this time, and goes up to `rows`. So if `rows` is 4, it runs 4
times: `i` is 1, 2, 3, 4.

---

## Step 10 — The inner loop: one trip per column (video 1:38:52)

Now put a second loop **inside** the first one, right after the `println()`:

```java
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
```

- The inner loop needs its **own** counter. You can't reuse `i`, because the outer loop is
  still using it. People usually pick **`j`**, because it comes after `i`.
- The inner loop runs once **for each column**. Each time, it prints the symbol.
- It uses **`print`**, not `println`. That keeps the symbols **side by side** on one line.

**Run it.** Click inside the **Run** window and type the answers. Press Enter after each
one. Type `4`, then `5`, then `$`:

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

Four rows, five columns. 🎉

**Why is there an empty line above the rectangle?** The outer loop does `println()`
**first**, before the inner loop prints any symbols. So it moves down a line before the
first row too.

---

## Step 11 — How it works, step by step (video 1:40:56)

He explains what happens. Here it is for 4 rows and 5 columns:

1. The outer loop starts. `i` is 1.
2. `println()` moves down to a new line.
3. The inner loop runs **all 5 times**: `j` is 1, 2, 3, 4, 5. That prints `$$$$$`.
4. The inner loop is done. Back to the outer loop: `i` becomes 2.
5. `println()` moves down. The inner loop starts **over**: `j` goes back to 1. Another
   `$$$$$`.
6. This repeats until `i` is bigger than 4. Then the outer loop stops, and the program ends.

**The big idea:** the inner loop finishes **all** of its trips every time the outer loop
takes **one** trip. Outer loop = rows. Inner loop = columns.

He also says the two loops don't have to be `for` loops. You can put a `while` loop inside
a `for` loop, or any mix.

---

## Your finished programs

Your files should look something like these now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare ForLoops.java</summary>

He changes the same loop step by step, so your final file only has the last version:

```java
package part08;

// (the comments at the top of your file)

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 10; i >= 0;) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println("Happy New Year!");
    }
}
```

Output:

```
10
8
6
4
2
0
Happy New Year!
```

</details>

<details>
<summary>Click to compare NestedLoops.java</summary>

```java
package part08;

import java.util.Scanner;

// (the comments at the top of your file)

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use:");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line, **in your own words**. Do not copy the explanations from
this guide.
