Programming Proficiency Test
=========

November 19, 2014

## General Instructions

+ There are only two questions that you need to complete.
+ You have 135 minutes (2h 15m) to complete the tasks.
+ We will start cloning repositories at **7:22 p.m.** so you should have committed all your work to BitBucket by that time (see submission instructions below).
+ Take your time to read the questions. 
+ Skeleton code can be obtained by cloning this repository. Add JUnit to your build path in Eclipse.
+ Best of luck!

## Question 1: Find the Fibonacci Numbers

Given an array of integers, find the elements in the array that are also Fibonacci numbers and return all such numbers as a list sorted in ascending order. If the array containts duplicates that are also Fibonacci numbers then the list returned should have only one entry for such numbers (i.e., the list should not contain duplicates).

The Fibonacci sequence is 1, 1, 2, 3, 5, 8, ... (0 is not part of the Fibonacci sequence.)

## Question 2: Fully Parenthesized Expressions

Let us define an expression to be any String. `Expression` is therefore a datatype with a String as its internal representation. A fully parenthesized expression is one where every opening parenthesis, '(', has a matching closing parenthesis, ')'. An expression that contains no parentheses is, trivially, a fully parenthesized expression. The datatype `FPExpression` is a subtype of `Expression` (and also has recursive structure). Implement the key methods for `FPExpression`.

Note that your implementation should support these different types of brackets/parentheses: `()`, `[]`, `{}`. The usual rules apply: `{` is closed by `}`, etc.

Responses to potential doubts:
+ Whitespace can be ignored irrespective of where it occurs.
+ An empty String "" is not a valid expression and hence not a valid fully parenthesized expression as well.

## What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes.
+ You can use additional standard Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.

## Submission Instructions

+ Create a BitBucket repository called `PPT-Nov19`. You should commit all your work to this repository. 
+ Make sure you provide read+write access to user id `gsathish`.
+ Do not wait until the last minute to push your work to BitBucket. It is a good idea to push your work at intermediate points as well.