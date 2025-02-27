# Binary Search Tree Application

## Table of Contents
1. [Description](#description)
2. [Classes and Features](#classes-and-features)
   - [MenuItem](#1-class-menuitem)
   - [BSTNode](#2-class-bstnode)
   - [Order](#3-class-order)
   - [RestaurantDriver](#4-class-restaurantdriver)
3. [Getting Started](#getting-started)

## Description

This project implements a Java application that can be utilized in a restaraunt to record/search customer orders & their correlated menu items. The program makes use of Node Classes to form a Binary Tree that can return values such as the contents of Menu Items in preorder/inorder/postorder, the size of the tree, the price total of items, taxes, tips, and many more.

## Classes and Features

### 1. Class MenuItem
- **Functionality**: A MenuItem represents one item ordered from a menu. Contains data such as name, price, and quantity for a food item. Additionally, this class has the ability to return a string contatining the amount of menu items purchased. It can also compare to other Menu items depending if they both contain the same name.

### 2. Class BSTNode
- **Functionality**: This class represents a node in a binary search tree, containing Menu Items and/or child nodes. It's utilized to structure the entire Binary Search Tree and retrieve data stored in specific Nodes.

### 3. Class Order
- **Functionality**: A collection class of MenuItems using the binary search tree. The data is stored in order according to the binary search tree principles (using a linked implementation). It uses methods such as insert() to add existing (or new) Menu Items into the tree in the correct position. It does not insert duplicate instances of the same item for proper clarity.


### 4. Class RestaurantDriver
- **Functionality**: A driver class used to test the functionality and correspondence of the Binary Tree. Hard coded values for the different methods' inputs. This test class tests on factors such as:
  - Creating Two Orders
  - Creating 15 menu items.
  - Adding the 15 menu items to each order but with a different order of insertion to test different tree topologies.
  - Method calls to test all the methods of the collection class.
  - Clearly displaying the results of each operation after they are performed.
  - Printing both orders in a nicely formatted output.


## Getting Started

To get started with the project, follow these steps:

1. **Clone the Repository**: 
   ```bash
   git clone https://github.com/Ali-Ouakhchachi/BinarySearchTreeApplication.git

2. **Set Up the Development Environment**:
    Eclipse is typically reccomended to run this code properly.

3. **Explore the Code:**:
    Refer to the README sections below for guidance on where to find and understand the code changes.

4. **Run the Application**:
 Use the included instructions in the user-guide.md to run and interact with the application.

## Example Images

![Preorder](https://github.com/Ali-Ouakhchachi/BinarySearchTreeApplication/blob/76c9dd4ef72a8b6301e843a958551faf17bb5c40/preorder_example.PNG)
![Inorder](https://github.com/Ali-Ouakhchachi/BinarySearchTreeApplication/blob/76c9dd4ef72a8b6301e843a958551faf17bb5c40/inorder_example.PNG)
![Postorder](https://github.com/Ali-Ouakhchachi/BinarySearchTreeApplication/blob/76c9dd4ef72a8b6301e843a958551faf17bb5c40/postorder_example.PNG)
![StringTable](https://github.com/Ali-Ouakhchachi/BinarySearchTreeApplication/blob/76c9dd4ef72a8b6301e843a958551faf17bb5c40/table_example.PNG)
