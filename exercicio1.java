package br.univali.poo.exercicio1;
public class Invoice{
    private String name;
    private int item_number, quantity;
    private double price;

    public Invoice(int item_num, String nm, int quan, double pri)
    {
        item_number = item_num;
        name = nm;
        if(quan>0) quantity = quan;
        if(pri>0) price = pri;
    }
    public int getitem_number()
    {
        return item_number;
    }
    public String getname()
    {
        return name;
    }
    public int getquantity()
    {
        return quantity;
    }
    public double getprice()
    {
        return price;
    }
    public double getInvoiceAmount()
    {
        return getprice()*getquantity();
    }

    public void setitem_number( int item_n)
    {
        item_number = item_n;
    }
    public void setname(String n)
    {
        name = n;
    }
    public void setquantity(int quan)
    {
        if(quan>0) quantity = quan;
    }
    public void setprice(double pri)
    {
        if(pri>0) price = pri;
    }
    public void displayLine()
    {
        System.out.println("Item Number: "+item_number);
        System.out.println("Name: "+name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
        System.out.println("Total Cost: "+getInvoiceAmount());
    }
}

package br.univali.poo.exercicio1;
public class InvoiceDriver {

    public static void main(String[] args) {

        Invoice chk1 = new Invoice(112, "Book", 3, 125.98);
        Invoice chk2 = new Invoice(0, "", 0, 0);

        chk1.displayLine();
        chk2.displayLine();
    }
}
