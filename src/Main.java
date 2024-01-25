
/*
Hardware store
In this project, we have a hardware store that sells different products.
We represent this product using classes.
Now we can se the classes and some examples of the kind of product that they are going to content:
1-ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
10 kg of sand
2-ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3-HandTool: hammer, hand saw
4-GardenProduct:shovel, plant pot
5-HouseholdItem: kettle, broom, brush
6-WaterProduct:water filter, water pump
7-GasProduct: gas valve,etc

Also, we have:
Employee: the employee of the store.
Supplier: the one that sells the product.
Client: the one that buys the product.
 */

import abstractClasses.Product;
import customLinkedList.CustomLinkedList;
import exceptions.AutoCloseableNoResource;
import finalClasess.PayingRates;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        //Trying the CustomLinkedList With generics
        CustomLinkedList<String> myList = new CustomLinkedList<>();
        myList.addEndNode("1");
        myList.addEndNode("2");
        myList.addEndNode("5");
        myList.addEndNode("6");
        //Printing all the data
        myList.printAllData();
        System.out.println();
        //Deleting the firstNode
        myList.deleteFirstNode();
        System.out.println();
        myList.printAllData();
        System.out.println();
        //Deleting an element in the middle of the Customlinked list
        myList.deleteMiddleNode("5");
        //Adding a firstNode
        myList.addFirstNode("7");
        System.out.println();
        myList.printAllData();
        System.out.println();
        //deleting the lastNode of the last part
        myList.deleteLastNode();
        myList.deleteLastNode();
        myList.deleteFirstNode();
        System.out.println();
        myList.printAllData();
        //Delete the whole list
        myList.addEndNode("1");
        myList.addEndNode("2");
        myList.addEndNode("5");
        myList.addEndNode("6");
        System.out.println();
        myList.printAllData();
        myList.deleteCustomLinkedList();
        myList.printAllData();

        // END Interacting with the CustomLinkedList
        // Interacting with CustomLinkedList using an object
        CustomLinkedList<ElectricProduct> electricProductCustomLinkedList= new CustomLinkedList<>();
        ElectricProduct lightBulb3=new ElectricProduct("Light bulb3","led light bulb");
        ElectricProduct lightBulb4=new ElectricProduct("Light bulb4","led light bulb");
        ElectricProduct lightBulb5=new ElectricProduct("Light bulb4","led light bulb");
        ElectricProduct lightBulb6=new ElectricProduct("Light bulb6","led light bulb");
        ElectricProduct lightBulb7=new ElectricProduct("Light bulb7","led light bulb");
        electricProductCustomLinkedList.addFirstNode(lightBulb3);
        electricProductCustomLinkedList.addEndNode(lightBulb4);
        electricProductCustomLinkedList.addEndNode(lightBulb5);
        electricProductCustomLinkedList.addEndNode(lightBulb6);
        electricProductCustomLinkedList.addEndNode(lightBulb7);
        electricProductCustomLinkedList.deleteFirstNode();
        electricProductCustomLinkedList.deleteMiddleNode(lightBulb5);
        electricProductCustomLinkedList.printAllData();

    }
}
