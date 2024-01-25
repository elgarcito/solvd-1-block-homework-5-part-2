
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
    private static final Logger LOGGER= LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        //Instantiations of the different implemented classes after the implementation of abstract

        LOGGER.info("Hello and welcome to hardware store!! \n");
        //classes
        //humans or companies
        BigClient bigClient=new BigClient("Edward Cullen","Edward@gmail.com","+224586634");
        LOGGER.info(bigClient.toString()+"\n");
        Supplier rinoMax= new Supplier("Jason Krueger","jason@gmail.com","+12812516","sand");
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        Employee joseAntonio = new Employee("Jose Antonio", "123@gmail.com", "12345678", "seller");

        //Products
        ConstructionProduct sand = new ConstructionProduct("Sand", "White sand", "Tn");

        //Creating the first Electric product
        ElectricProduct lightBulb = new ElectricProduct("Light bulb 2", "led light bulb");
        //Getting the product name
        LOGGER.info(lightBulb.toString());
        //setting the power field
        lightBulb.setPower(10);
        //getting the power field
        LOGGER.info("The lightBulb power is: "+lightBulb.getPower()+"kW\n");
        //Creating the second Electric product
        ElectricProduct lightBulb2 = new ElectricProduct("Light bulb 1", "led light bulb");
        //getting the lightBulb2 id that used hashCode override to create a unique id
        LOGGER.info(lightBulb2.toString()+"\n");
        //Checking if lightBulb is equal to lightBulb2 to implement hashCode and equals override
        LOGGER.info("Electric products are equals?: "+lightBulb.equals(lightBulb2)+"\n");


        GardenProduct gardenScissors = new GardenProduct("Big scissors", "Big size scissors to cut grass", false);
        GardenProduct gardenScissors1 = new GardenProduct("Medium scissors", "Medium size scissors to cut grass", false);
        GardenProduct gardenScissors2 = new GardenProduct("Small scissors", "Small size scissors to cut grass", false);

        //Creating a new gas Product
        GasProduct gasBurner = new GasProduct("Gas Burner", "Gas kitchen burner");
        LOGGER.info(gasBurner.toString()+"\n");
        GasProduct gasBurner2 = new GasProduct("Gas Burner", "Gas kitchen burner");
        gasBurner2.setStock(8);
        LOGGER.info("Gas burner stock is: "+gasBurner2.getStock());

        HandTool handSaw=new HandTool("Hand saw","Small hand saw");
        HouseholdItem broom =new HouseholdItem("Big broom","Industrial boom");
        HouseholdItem broom1 =new HouseholdItem("Small broom","House boom");
        WaterProduct pump1=new WaterProduct("Excelsior pump","20 hp power pump");

        //Polymorphism with Person abstract class in BigClient, Employee and Supplier classes example
        rinoMax.setSupplierAge(21);
        bigClient.setBigClientAge(60);
        carlosRusso.setEmployeeAge(30);
        rinoMax.checkAge();
        System.out.println();
        bigClient.checkAge();
        System.out.println();
        carlosRusso.checkAge();
        System.out.println();
        System.out.println();

        //Polymorphism with Available, Costable, Priceable, Sellable, Stockable and TransactionDateable interfaces
        //implemented in classes ElectricProduct and GasProduct
        lightBulb.setStock(20);
        gasBurner.setStock(10);
        //Available interface
        lightBulb.checkAvailability(10);
        gasBurner.checkAvailability(5);
        //Costable interface
        double lightBulbCost= lightBulb.defineCost(10.0,1,1);
        double gasBurnerCost= gasBurner.defineCost(10.0,1,1);
        //Priceable interface
        lightBulb.definePrice(lightBulbCost,10);
        gasBurner.definePrice(gasBurnerCost,10);
        //Sellable interface
        lightBulb.removeStockDueSell(5);
        gasBurner.removeStockDueSell(1);
        //TransactionDateable.java
        lightBulb.transactionDate();
        gasBurner.transactionDate();

        //Create final class, method, variable
        //Final Class
        PayingRates payingRates=new PayingRates();
        //Final method
        payingRates.showRates();
        //Final variables
        payingRates.getOwnerRate();
        payingRates.getSellerRate();
        payingRates.getDepositRate();

        //Create a static block, method, variable
        //Static block in ElectricProduct class
        //Static method
        ElectricProduct.showAmountOfElectricProducts();
        //Static variable
        int electricProductCounter = ElectricProduct.electricProductCounter;


        //Try-catch handled in two ways and checking each exception
        //Created an employee with all wrong data to throw all exceptions
        Employee jackLalein=new Employee("jack 123 my name is too long","jack@gmail.com","12345678","seller");
        jackLalein.checkEmployeeData();
        jackLalein.setPersonName("jack lalein1");
        System.out.println();
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPersonName("jack lalein");
        jackLalein.setPersonEmail("jack@momo");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPersonEmail("jack@gmail.com");
        jackLalein.setPhoneNumber("123456789");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setPhoneNumber("12345678");
        jackLalein.setSpeciality("cleaner");
        jackLalein.checkEmployeeData();
        System.out.println();
        jackLalein.setSpeciality("seller");
        //All Employee correct data result
        jackLalein.checkEmployeeData();
        System.out.println();
        //Try-catch with resource example
        try (AutoCloseable ac = new AutoCloseableNoResource()) {
            LOGGER.info("Inside try block to test Try catch with exception");
        } catch (Exception e) {
            LOGGER.error("An error occurred: " + e);
        }
        System.out.println();

        //Collection examples
        //ArrayList<Employees>
        Employee.addEmployeeToArrayList(jackLalein);
        Employee.addEmployeeToArrayList(joseAntonio);
        ArrayList<Employee> employeeList=Employee.getCopyOfEmployeeArrayList();
        LOGGER.info(employeeList.get(1).toString());
        //HashSet<GardenProducts>
        GardenProduct.addGardenProductToHashSetList(gardenScissors);
        GardenProduct.addGardenProductToHashSetList(gardenScissors1);
        HashSet<GardenProduct> gardenProductsListCopy=GardenProduct.getCopyOfGardenProductHashSetList();
        LOGGER.info(gardenProductsListCopy.contains(gardenScissors));
        //ArrayList<ElectricProducts>
        ElectricProduct.addElectricProductToArrayList(lightBulb);
        ElectricProduct.addElectricProductToArrayList(lightBulb2);
        ArrayList<ElectricProduct>electricProductArrayList=ElectricProduct.getCopyOfElectricProductArrayList();
        //ArrayList<HouseholdItem>
        HouseholdItem.addHouseholdItemToArrayList(broom);
        HouseholdItem.addHouseholdItemToArrayList(broom1);
        ArrayList<HouseholdItem>householdItemsList=HouseholdItem.getCopyOfHouseholdItemArrayList();
        //ArrayList<String> in Employee class
        HashSet<String> employeesResumeInformation=Employee.getEmployeeResumeList();
        Iterator<String> iterator=employeesResumeInformation.iterator();
       while (iterator.hasNext()){
           LOGGER.info(iterator.next()+"\n");
       }


    }
}
