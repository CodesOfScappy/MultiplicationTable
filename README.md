# Little Multiplication Table Generator

A Java class to generate and display the multiplication table in a tabular format. The multiplication table consists of products of multiplications from 1 up to the specified width and height values. The table is displayed on the screen.

## Table of Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [Method](#method)
- [Author](#author)
- [Version](#version)

## Introduction

This Java class, `LittleMultiplicationTable`, is designed to generate and display the multiplication table known as the "small multiplication table" in a tabular format. The small multiplication table is a grid containing products of multiplication operations from 1 to the specified width and height values. The table is then printed on the screen.

## Usage

To use this class, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/your-repository.git`
2. Navigate to the project directory: `cd your-repository`
3. Compile the Java source file: `javac de/multi/LittleMultiplicationTable.java`
4. Run the compiled class: `java de.multi.LittleMultiplicationTable`

The default behavior of the program generates and displays a small multiplication table with a width of 10 columns and a height of 10 rows. You can modify the dimensions of the table by changing the arguments of the `printMultiplicationTable` method.

## Method

### `public static void main(String[] args)`

The main method of the program. It displays a header and then calls the `printMultiplicationTable` method with default dimensions.

### `public static void printMultiplicationTable(int width, int height)`

Generates the multiplication table and prints it in a tabular format.

- `width`: The number of columns (width) of the table.
- `height`: The number of rows (height) of the table.

The method generates the products of multiplication operations for each cell in the table and prints the entire table on the screen.

## Author

This program was written by David Maurin.

## Version

Version: 1.0
Date: [19/08/2023]
