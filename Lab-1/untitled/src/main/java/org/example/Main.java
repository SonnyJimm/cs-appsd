package org.example;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
            ProductMgmtApp p = new ProductMgmtApp();
            p.printProducts(PrintTypes.XML);
        p.printProducts(PrintTypes.JSON);
        p.printProducts(PrintTypes.CSV);
    }
}