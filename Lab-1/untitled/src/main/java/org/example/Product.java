package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public record Product(long productID, String name, String dateSupplied, int quantityInStock, double unitPrice){
    String toString(PrintTypes type) throws IllegalAccessException {
        var data =new StringBuilder();
        switch (type){
            case JSON -> data.append("{");
            case XML -> data.append("<product");
            case CSV -> data.append("");
        }
        var d = this.getClass();
        var fields = d.getDeclaredFields();
        Object o = this;
        for (int i=0; i<fields.length; i++){
            switch (type){
                case JSON -> data.append(" ").append(fields[i].getName()).append(" : ").append(fields[i].get(o).toString());
                case XML -> data.append(" ").append(fields[i].getName()).append(" =\"").append(fields[i].get(o).toString()).append("\"");
                case CSV -> data.append(" ").append(fields[i].get(o).toString());
            }
            if (i+1 != fields.length){
                switch (type){
                    case JSON -> data.append(",");
                    case CSV -> data.append(",");
                }
            }
        }
        switch (type){
            case JSON -> data.append(" }");
            case XML -> data.append("/>");
            case CSV -> data.append("");
        }
        return  data.toString();
    }
}