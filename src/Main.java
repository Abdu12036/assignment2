import modules.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(new Student("Ringo","Starr",2.55));
        payables.add(new Student("Paul","McCartney",3.55));
        payables.add(new Employee("John","Lennon","Senior Lecturer",50000.12));
        payables.add(new Employee("George","Harrison","Assistent",27025.36));

        Collections.sort(payables, new Comparator<Payable>() {
            @Override
            public int compare(Payable o1, Payable o2) {
                if (o1.getPaymentAmount() > o2.getPaymentAmount()) {
                    return 1;
                }
                else if(o1.getPaymentAmount() < o2.getPaymentAmount()) {
                    return -1;
                }
                return 0;
            }
        });

        printData(payables);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }


}