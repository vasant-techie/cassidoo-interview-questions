# cassidoo-interview-questions
interview coding questions &amp; solutions to the cassidy weekly newsletter
***
***2024, August 12***

Given an array of logs and variable assignments, return a list of all unused variables.

Examples:

> findUnused(["a = 1", "b = a", "c = 2", "log(b)"]);
> ["c"]

> findUnused(["a = 1", "b = a", "c = 2", "log(c)"]);
> ["a", "b"]

***
***2024, July 29***

Write a function that converts between metric and imperial units. Break up the units into millimeters, centimeters, and meters for metric, and into inches and feet for imperial, up to 2 decimal places.

Example:

> convertUnits(7, "ft")
> "2m 13cm 3.6mm"

> convertUnits(44, "cm")
> "1ft 5.32in"

***
***2024, June 17***

Write a function that takes a list of names and returns the names sorted by the number of vowels in each name in descending order. If two names have the same number of vowels, sort them alphabetically.

Example:

> sortNames(["Goku", "Vegeta", "Piccolo", "Gohan"])
> ["Piccolo", "Vegeta", "Gohan", "Goku"]

> sortNames(["Edward", "Alphonse", "Roy", "Winry"])
> ["Alphonse", "Edward", "Winry", "Roy"]

