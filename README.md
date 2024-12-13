[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/skz11JU0)
# CS230X-lab1-F24
# Java Review

In this lab, you will gain practice with testing and approaching problem solving, you will also practice using important and useful Java classes.

Goals:
- [ ] Practice with testing and pseudocode
- [ ] Review useful Java Classes: String, Random, Scanner
- [ ] Review conditionals and loops
- [ ] Review method definition and invocation

## Task 1: To Vote or not to Vote

You will write a program to decide whether a user is eligible for voting, based only on their age (i.e., other factors are not considered here).
Assume that users who have turned 18 years old by November of the current year are considered eligible for voting. 

### Steps to Follow:

1. **Start by thinking about test cases**

In this problem, start with producing the testing cases first. It is good practice to first consider test cases and edge cases, to come up with a testing plan before writing any code. This work will give us insight about which steps we need to take to solve the problem, i.e., coming up with an algorithm. Let's assume that you are given the current year and a user's birth year and birth month. Which testing cases will you choose to test your voting program on? First we want to test cases that would produce clearly false (e.g., 2020) or true (e.g., 2000). But we want to also test edge, what values would these be? 

2. **Then write pseudocode on paper and run by hand**

Another good practice is to use pen and paper (or marker and whiteboard) to start your thinking process. Start solving a problem by writing out your plan in pseudocode first. This way, once you get to coding, the only thing left to do is translate the carefully written pseudocode in the correct syntax (which is an easier part of programming). Start on your paper notebook using pseudocode (a mix of English and a computer programming language) write a plan (algorithm) to outline the steps towards a solution to this problem.

Make sure you verify your plan is correct by "running it by hand" on the inputs you decided in the previous step. For each testing case, predict the result your plan should produce. Then, "walk" through your pseudocode, step by step, to see what answer it will produce for each testing case. Do the two agree?

4. **Now write the Java code**

At this point you should be able to write your code in BlueJ, compile and run it. Clone this repository to your CS230X/Labs folder to create a new Lab1-Java-Review folder. In this folder, open the BlueJ project and, inside, open Voting.java. 

Voting.java contains a predicate method that should determine whether the user is eligible to vote or not. It takes 3 parameters: currentYear, birthYear, and birthMonth (in case it is needed).

To complete this task, you should:

1) Use your pseudocode to complete the logic of `isEligibleToVote(int currentYear, int birthYear, int birthMonth)`
2) Create a `main()` to test your program

> **Note:** For this task, you should "hard-wire" the arguments for isEligibleToVote()
```
isEligibleToVote(2024, 2000, 3); // hard-wired arugments
```

## Task 2: Produce Usernames

### Steps to Follow:

1. **Start with pseudocode**

Write pseudocode to describe your plan to produce a username based on a user's first and last name (consider those given), and a random 2-digit integer (that you will produce).

A username consists of:
- the user's first name initial, like "c", followed by
- the first 5 letters of their last name, like "delco" (You can assume that the user's last name has length at least 5), followed by
- a random two-digit integer in the range [10-99], like 23
- all usernames produced only contain lowercase letters
- make sure to consider the fact that some people may not have a first name or last name, or that they might be fewer than 5 characters in a last name 

> **Tip 1:** You can start with any design you can come up with. But at the end, try to have the following methods :
```
public static String produceFirstPart() //like: cdelco
public static int produceSecondPart() //like: 32
public static String produceOneUserName() //this method calls produceFirstPart() and produceSecondPart()
```

Now produce three testing cases for this program and hand-execute your pseudocode on the two testing cases.

2. **Produce One User Name**

Now you can write the Java code to produce one user name, based on your pseudocode.

1) Open the class UserNames from Lab1 in BlueJ and complete the TODOs in the class based on your pseudocode.
2) For produceFirstPart(), you will need to work with the [Java String class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html).
3) For produceSecondPart(), you will need to generate a random number. Use the [Java Random class](https://docs.oracle.com/javase/7/docs/api/java/util/Random.html) for this.
4) Add a main() method to test your code. For now, hard-wire values for the first and last name as arguments.

The Random class, provides methods for generating pseudorandom values. Follow these steps to incorporate use the Random class in your UserNames program. Create a Random object, by adding the following statement in your `produceSecondPart()` method:

```
//declare and initialize the variable 'rand' to be of type Random
Random rand = new Random();
```
Compile the UserNames class.

> [!CAUTION]
> This will generate an error, specifically, a syntax error that will say something like this: "cannot find symbol: class Random". This is BlueJ's way of telling you that it doesn't know what the Random class is. How can we fix this problem? In the Java documentation, you will see that the Random class belongs to the java.util package. This means that in order to tell BlueJ about the Random class, we have to **import** that package into our program.

Here is how to import a package: Place this line at the very top (first line) of your file.

```
import java.util.Random;
```

Now, your class will compile. Then, look at the methods available in the [Java Random class](https://docs.oracle.com/javase/7/docs/api/java/util/Random.html) for generating a random `int`. There are two such methods: `nextInt()` and `nextInt(int bound)`. Decide which one would be better suited for this program, and continue to implement 

3. **Get input from the user**

Now, you will improve your program by getting input from the user. Instead of hard-wiring values for the first and last names, you will now ask the user for this information. For this, you will use a Scanner to read user input into your program. This task will guide you about how to use the Scanner, also review the [Java documentation on Scanner](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html).

This program should need a rather small number of changes from the previous version! 

Similar to how you needed to import the Random class, also import Scanner from java.util. Then, create a Scanner object by adding the following statement to the top of your `main()` method:

```
//declare and initialize the variable 'scan' to be of type Scanner on the standard input (keyboard)
Scanner scan = new Scanner(System.in);
```

Now we are (almost) ready to run our program and have it ask the user for information. After prompting the user for the information, use the `nextLine()` method of the Scanner class to read a line of text into your program, like this:

```
System.out.print("Enter your first name:");
firstname = scan.nextLine();
```

Now you are ready to prompt for the rest of the information. At the end, when you no longer need to use the scanner, don't forget to close your scanner with `scan.close()`!

4. **Produce Many User Names - Use a Loop**

Update the main() in Usernames so that it can ask multiple times for user input. Your program should start by asking the user for their first and then their last name. Then it goes ahead and produces their username. At that point it should ask the user if they want to continue. Depending on the user's answer, the process continues or just stops. Here is what the output should look like:

```
What is your first name? Wes
What is your last name? Ellesworth
Your username is: welles92

Do you want to continue? (y/n)
```

You will need to employ a loop here. Think about what kind of loop is more suitable in this case. When you have a reasonable level of assurance that your plan is a good one, go ahead to write the java code.

## Task 3: Working with Strings

Review the [Java String class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html). You will need to use some of its methods here. Instead of trying to remember details of the language - which would be a rather impossible task, you should become comfortable with using the online Java documentation, known as java API. Although the String class is used so frequently that becoming familiar with its capabilities will be useful.

Write a new program named PlayingWithWords, that, given a word, it prints each character of the word in upper case and on a separate line.

If the given word is "Wellesley", it should print: 

W\
E\
L\
L\
E\
S\
L\
E\
Y

Then, it also prints the word in reverse, like "yelselleW" in our example.

Define two methods, one named `writeLetterPerLine()` and one named `writeInReverse()` to perform each of the tasks. You need to decide whether each method needs an input, and what its returned type should be. The String API will be helpful here. 

> **Tip 1:** Since they will be called from the static main() they will have to also be defined as static methods.

> **Tip 2:** There is less guidance on this Task than the previous two others, take what you learned about pseudocode and testing and apply them to this task.


## Task 4: (Optional) User generated input

Augment Voting.java and PlayingWithWords.java by asking the user for their input using the Scanner. Make sure to update this in the main() of both programs.

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files Voting.java, UserNames.java, and PlayingWithWords.java to your Gradescope account for Lab1. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 



