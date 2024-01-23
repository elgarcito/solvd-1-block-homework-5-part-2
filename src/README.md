# hardware store
Progresive exercises of QA automation training, using maven and git.

## Project description:
In this project, we have a hardware store that sells different products.

<p align="center">
<img src="https://t4.ftcdn.net/jpg/03/39/67/57/360_F_339675724_zKIsiEcSss6x2KOXUfHMfBrK9b0qbYCQ.jpg" alt="Image of a hardware store" width="300" height="200">
</p>

We represent this product using classes.
We can see the classes and some examples of the kind of product that they are going to content:
1. ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
   10 kg of sand.
2. ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3. HandTool: hammer, hand saw, etc.
4. GardenProduct:shovel, plant pot, etc.
5. HouseholdItem: kettle, broom, brush, etc.
6. WaterProduct:water filter, water pump, etc.
7. GasProduct: gas valve, etc.

Besides that, we have the persons that interact with the store these are:
1. Employee: these are the employees of the store and could be: seller, deposit or owner
2. Supplier: the one that sells us the products
3. BigCLient: at the moment, the store only works with big clients that are an small amount and are registered.

## Exercises and references:
### 26/10/2023

Create a class hierarchy. Topic for your hierarchy will be provided by your mentors.
Requirements:
* At least 10 classes
* All classes must contain properties (minimum 1)
* At least 5 private properties (in total, in any classes)
* All private variables must have getters and setters.
* All classes should have at least one custom constructor
* Create separate class with main() which will instantiate objects of implemented classes.

### Solution
The created classes were:
* Products: ElectricProduct, GardenProduct, GasProduct, ConstructionProduct, HandTool,
  HouseholdItem, WaterProduct
* Human beings: Employee, Supplier, BigClient

All classes created have the requirements needed.
In the Main class, we can se an implementation for each class
using the custom constructor.
