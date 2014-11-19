Programming Proficiency Test
=========

November 19, 2014

## Question 1: Find the Fibonacci Numbers

Given an array of integers, find the elements in the array that are also Fibonacci numbers and return all such numbers as a list sorted in ascending order. If the array containts duplicates that are also Fibonacci numbers then the list returned should have only one entry (i.e., the list should not contain duplicates).

## Question 2: Fully Parenthesized Expressions

Let us define an expression to be any String. `Expression` is therefore a datatype with a String as its internal representation. A fully parenthesized expression is one where every opening parenthesis, '(', has a matching closing parenthesis, ')'. An expression that contains no parentheses is, trivially, a fully parenthesized expression. The datatype `FPExpression` is a subtype of `Expression` (and also has recursive structure). Implement two key methods for `FPExpression`:

1. A constructor that takes an `Expression` as an argument and builds an `FPExpression` if the given `Expression` is a fully parenthesized expression. This constructor should use a `static` method of the class `FPExpression` that tests if a given String is fully parenthesized.

2. A method `subExpression()` that takes an integer as an argument, where the integer represents the position of an opening parenthesis, '(', and returns that subexpression (of type `FPExpression`) that is enclosed by the indicated opening parenthesis and its matching closing parenthesis. For this method, we will assume that the first position of an `Expression` is indexed by 0 and the last position by the length of the `Expression` less 1.