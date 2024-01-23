
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

public class Main {
    public static void main(String[] args) {
        //Instantiations of the different implemented classes

        //humans or companies
        BigClient bigClient=new BigClient("Sand");
        Employee johnSmith= new Employee("abc123",10,"seller");
        Suppliers rinoMax= new Suppliers("sand");

        //Products
        ConstructionProduct sand = new ConstructionProduct(1,false,0);
        ElectricProduct cable1= new ElectricProduct(220,1,"01");
        GardenProduct gardenProduct=new GardenProduct(false,"g01");
        GasProduct gasRecipent=new GasProduct("natural gas",18,"g01");
        HandTool handSaw=new HandTool(true,true,false);
        HouseholdItem broom =new HouseholdItem(false);
        WaterProduct pump1=new WaterProduct(20);
    }
}
