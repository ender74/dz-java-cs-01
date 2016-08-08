# DZone Java Code Challenge: Chemical Symbol Naming-Part One
## Introduction

This is my contribution to the DZone Java Code Challenge: Chemical Symbol Naming-Part One. See their
[Website] (https://dzone.com/articles/java-code-challenge-chemical-symbol-naming-part-on) for the rules of this
code challenge. The project can be build using [Apache Maven](https://maven.apache.org/). The Unit Tests are
implemented with help of [JUnit 4](http://junit.org/junit4/). There are no other dependencies.

## Primary Challenge: Validator

The Validator Implementation can be found in the class
[de.ender74.dzcode.ch01.SymbolValidator](src/main/java/de/ender74/dzcode/ch01/SymbolValidator.java).
The Unit Tests are implemented in the class
[de.ender74.dzcode.ch01.test.SymbolValidatorTest](src/test/java/de/ender74/dzcode/ch01/test/SymbolValidatorTest.java).
The Testcases are taken from the description of the challenge. There is one test per rule example.

The implementation can be found in the validate method. First the input is normalized (trimmed & changed to
lowercase). Then the characters of the symbol are iterated (for-each) and then matched against the elementName.
For each character, the first possible matching index in the elementName is used. The matching starts at the matched
index for the previous char +1. If no match can be found for one char, the symbol is invalid and false returned. If
all chars can be matched, the symbol is valid.

## Bonus Challenge 1: Find Symbol that is first in alphabetical order
This Challenge is implemented in the class [de.ender74.dzcode.ch01.SymbolCreatorFirstAlph](src/main/java/de/ender74/dzcode/ch01/SymbolCreatorFirstAlph.java)
and tested in the class
[de.ender74.dzcode.ch01.test.SymbolCreatorFirstAlphTest](src/test/java/de/ender74/dzcode/ch01/test/SymbolCreatorFirstAlphTest.java).

The implementation does use the helper function indexOfLowestChar. This helper function finds the first index of the
character which is the first in alphabetical order within a given range [start, end] of a string.

This helper function is used by the main method createSymbol. The implementation consists of a loop with n-iterations
(n being the length of the symbol, e.g. two for this challenge). For each iteration the indexOfLowestChar function is
called to find the alphabetically lowest char in the remaining elementName string. each index must be strictly greater
than the found index for the previous iteration. Further the index must be less than the length of the elementName minus
the number of left iterations.