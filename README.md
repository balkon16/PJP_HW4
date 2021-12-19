# Introduction

This is the fourth homework in Programming Languages Practice course which is dedicated to learning Groovy. Other repositories you may be interested in:
* [Homework no. 1](https://github.com/balkon16/PJP_HW1)
* [Homework no. 2](https://github.com/balkon16/PJP_HW2)
* [Homework no. 3](https://github.com/balkon16/PJP_HW3)

# Exercise no. 1

A Groovy script which solves the exercise no. 1 is located in the `src/zad1` package. The script is supposed to download
a list of words. For each word a list of anagrams should be produced. The final output has to be sorted by the number of anagrams
or if two words have the same number of anagrams, in alphabetical order. The script should be concise and use methods from GDK.

# Exercise no. 2

The aim of this exercise is to print the input data to the console. The data is provided as a `customers.txt` text file. Each line contains one entry: 

`<clientId>;<last name> <first name>;<product>;<quantity>;<unit price>`

The input data is printed in various ways:
* The excerpt preceded by *Nazwiska* (Polish for last names) contains data sorted by the last name (in ascending order). If two last names
are the same, the order is decided by the client ID (in ascending order as well).
* The excerpt preceded by *Koszty* (Polish for costs) contains data sorted by the total cost in a line (in descending order). In a case
of a conflict the order is decided by the client ID (in ascending order).
* The excerpt preceded by "Klient c00001" (Polish *Klient* stands for Client) contains all items bought by the client with ID *c00001*.
* The excerpt preceded by "Klient c00002" contains all items bought by the client with ID *c00002*.