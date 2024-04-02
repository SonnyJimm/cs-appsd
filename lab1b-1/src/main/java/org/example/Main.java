package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    List<Employee> list;
    public Main(){
        list = new ArrayList<>();
        list.add(new Employee(1L,"Daniel","Agar", LocalDate.parse("2018-01-17"),105945.50, new PensionPlan("EX1089", LocalDate.parse("2023-01-17"),100.00) ));
        list.add(new Employee(2L,"Benard","Shaw", LocalDate.parse("2019-04-03"),197750.00, null));
        list.add(new Employee(3L,"Carly","Agar", LocalDate.parse("2014-05-16"),842000.75, new PensionPlan("SM2307", LocalDate.parse("2019-11-04"),1555.50) ));
        list.add(new Employee(4L,"Wesley","Schneider", LocalDate.parse("2019-05-02"),74500.00, null));
    }
    public void printList(){
        list.stream().sorted(Comparator.comparing(Employee::lastName).reversed().thenComparing(Employee::yearlySalary).reversed()).forEach(System.out::println);
    }
    public void printListEligible(){
//        System.out.println(list.get(1).isEligiblePension());
//        System.out.println(list.get(1).plan());
        list.stream().filter(Employee::isEligiblePension).sorted(Comparator.comparing(Employee::employementDate)).forEach(System.out::println);
    }
    public static void main(String[] args) {
        var m = new Main();
        m.printListEligible();
//        m.printList();
    }
}