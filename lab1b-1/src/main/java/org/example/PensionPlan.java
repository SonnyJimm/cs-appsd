package org.example;

import java.time.LocalDate;
import java.util.Optional;

public record PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, Double monthlyContribution) {
    public String toString(){
        return "{"+  "\n" +
                "       \"planReferenceNumber\":\"" + planReferenceNumber + "\"\n" +
                "       \"monthlyContribution\":\"" + monthlyContribution + "\"\n" +
                "       \"enrollmentDate\":" + enrollmentDate + "\n"
                + "     }";
    }
}
