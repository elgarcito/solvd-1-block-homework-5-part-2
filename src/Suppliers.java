public class Suppliers {
    private String productSupplied;//What kind of product supplies
    private int supplierAge;

    //Constructor

    public Suppliers(String productSupplied) {
        this.productSupplied = productSupplied;
    }

    //end constructor

    //Getter and setter

    public String getProductSupplied() {
        return productSupplied;
    }

    public void setProductSupplied(String productSupplied) {
        this.productSupplied = productSupplied;
    }

    public int getSupplierAge() {
        return supplierAge;
    }

    public void setSupplierAge(int supplierAge) {
        this.supplierAge = supplierAge;
    }

    //end getter and setter


}
