**This repository contains code from a proficiency test created by Sathish Gopalakrishnan in November 2014, graded on a pass/fail basis. I received a pass for my work done.**


November 19, 2014

## Question 1: Find the Fibonacci Numbers

Given an array of integers, find the elements in the array that are also Fibonacci numbers and return all such numbers as a list sorted in ascending order. If the array containts duplicates that are also Fibonacci numbers then the list returned should have only one entry for such numbers (i.e., the list should not contain duplicates).

The Fibonacci sequence is 1, 1, 2, 3, 5, 8, ... (0 is not part of the Fibonacci sequence.)

## Question 2: Fully Parenthesized Expressions

Let us define an expression to be any String. `Expression` is therefore a datatype with a String as its internal representation. A fully parenthesized expression is one where every opening parenthesis, '(', has a matching closing parenthesis, ')'. An expression that contains no parentheses is, trivially, a fully parenthesized expression. The datatype `FPExpression` is a subtype of `Expression` (and also has recursive structure). Implement the key methods for `FPExpression`.

Note that your implementation should support these different types of brackets/parentheses: `()`, `[]`, `{}`. The usual rules apply: `{` is closed by `}`, etc.

Responses to potential doubts:
+ Whitespace can be ignored irrespective of where it occurs.
+ An empty String "" is not a valid expression and hence not a valid fully parenthesized expression as well.
