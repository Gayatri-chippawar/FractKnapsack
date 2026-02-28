# 📦 Fractional Knapsack Problem (Greedy Approach)
## 📌 Overview

This project implements the Fractional Knapsack problem using a Greedy Algorithm in Java.

In this approach:

I stored value, weight, and value/weight ratio inside a 2D array.

If the array was not sorted in descending order of ratio, I handled it using a reverse loop traversal to ensure higher ratios are selected first.

## 🧠 Problem Statement

Given:

n items, each with a value and weight

A knapsack with limited capacity W

Goal:

Maximize total value in the knapsack

You are allowed to take fractions of items

## ⚙️ Approach Used
1️⃣ Store Data in 2D Array

Each row stores:

[ value , weight , value/weight ratio ]
2️⃣ Calculate Ratio

For each item:

ratio = value / weight
3️⃣ Sorting Logic

Sort items based on ratio

If not sorted in descending order:

Traverse using a reverse loop

Pick items from highest ratio to lowest

4️⃣ Greedy Selection

If item weight ≤ capacity → take full item

Else → take fractional part

Reduce remaining capacity accordingly

## 🔢 Algorithm Steps

Input values and weights

Create 2D array to store value, weight, ratio

Sort by ratio

Traverse from highest ratio

Add full or fractional item

Stop when capacity becomes 0

## 🧮 Time Complexity

Sorting: O(n log n)

Traversal: O(n)

Overall: O(n log n)

💡 Why Greedy Works Here?

Fractional Knapsack satisfies the Greedy Choice Property:

Always picking the highest ratio item gives optimal solution.

## 📊 Example
Value	Weight	Ratio
60	10	6.0
100	20	5.0
120	30	4.0

Capacity = 50

Solution:

Take full 60

Take full 100

Take 2/3 of 120

Maximum Value = 240

## 🚀 Learning Outcome

Understood Greedy strategy deeply

Practiced working with 2D arrays

Improved sorting logic handling

Learned how reverse traversal can correct order logic
