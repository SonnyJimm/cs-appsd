package org.example;

import java.util.ArrayList;
import java.util.List;

class ProductMgmtApp{
    List<Product> productList;
    public ProductMgmtApp() {
        productList = new ArrayList<>();
        productList.add(new Product(3128874119l,"Banana", "2023-01-24",124,0.55));
        productList.add(new Product(2927458265l,"Apple", "2022-12-09",18,1.09));
        productList.add(new Product(9189927460l,"Carrot", "2023-03-31",89,2.99));
    }
    public void printProducts(PrintTypes type){
        switch (type){
            case JSON ->{
                System.out.println("Printed in JSON Format");
                System.out.println("[");
            }
            case XML -> {
                System.out.println("Printed in XML Format");
                System.out.println("<?xml version=\"1.0\"?>");
                System.out.println("<products>");
            }
            case CSV -> System.out.println("Printed in CSV Format");
        }
        productList.stream().map(a -> {
            try {
                return "    "+a.toString(type);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }).forEach(System.out::println);
        switch (type){
            case JSON ->{
                System.out.println("]");
            }
            case XML -> {
                System.out.println("</products>");
            }
        }
    }
}
