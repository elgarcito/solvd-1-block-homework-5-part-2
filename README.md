# hardware store
Progressive exercises of QA automation training, using maven and git.

## Project description:
In this project, we have a hardware store that sells different products.

<p align="center">
<img src="https://t4.ftcdn.net/jpg/03/39/67/57/360_F_339675724_zKIsiEcSss6x2KOXUfHMfBrK9b0qbYCQ.jpg" alt="Image of a hardware store" width="300" height="200">
</p>

We represent this product using classes.
We can see the classes and some examples of products that they are going to content:
1. products.ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
   10 kg of sand.
2. products.ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3. products.HandTool: hammer, hand saw, etc.
4. products.GardenProduct:shovel, plant pot, etc.
5. products.HouseholdItem: kettle, broom, brush, etc.
6. products.WaterProduct:water filter, water pump, etc.
7. products.GasProduct: gas valve, etc.

Besides that, we have the persons that interact with the store these are:
1. person.Employee: these are the employees of the store and could be: seller, deposit or owner
2. person.Supplier: the one that sells us the products
3. person.BigClient: at the moment, the store only works with big clients that are an small amount and are registered.

## Exercises and references:

### 09/11/2023 Part-2

Extend your previous homework with next features:
* Add 5 collections to the hierarchy.
* Create custom LinkedList with generic.

### Solution

The custom_linkedlist package was created and contains the CustomLinkedList.java
class.This class use generics and mimics the LinkedList<> of java.util.LinkedList in the followings
methods:
* printAllData(): Print every element in the list
* addEndNode(T data): Method to add an element to the linked list
* addFirstNode(T data): Add an element in the first node
* deleteFirstNode(): Method to delete the first node
* deleteMiddleNode(T data): With this method you delete a desired Middle Node
* deleteLastNode(): Delete the last node of the list
* deleteCustomLinkedList(): Delete the whole Customlinkedlist

To be clear in the output, all previous responses have been deleted.
The implementation of all these methods could be seen in the main method.