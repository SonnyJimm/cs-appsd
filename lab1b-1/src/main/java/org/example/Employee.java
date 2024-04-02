package org.example;

import java.time.LocalDate;
import java.util.Optional;

public record Employee(Long employeeId, String firstName, String lastName, LocalDate employementDate, Double yearlySalary, PensionPlan plan) {
    public boolean isEligiblePension(){
        if(plan != null ){
            return false;
        }
        var eligibleDate = employementDate.plusYears(5l);
        var nextMonth = LocalDate.now().plusMonths(1l);
        return eligibleDate.isBefore(nextMonth);
    }
    public String toString(){
        Optional<PensionPlan> p = Optional.ofNullable(plan);
        return "{"+  "\n" +
                "   \"employeeId\":" + employeeId + "\n" +
                "   \"firstName\":\"" + firstName + "\"\n" +
                "   \"lastName\":\"" + lastName + "\"\n" +
                "   \"employementDate\":" + employementDate + "\n" +
                "   \"yearlySalary\":$" + yearlySalary + "\n" +
                (p.isPresent() ? "   \"plan\":" + plan + "\n" : "" )
                + "}";
    }
}
