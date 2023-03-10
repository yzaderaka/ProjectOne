package Review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {
    public static void main(String[] args) {

        Set<String> qaJobs = new LinkedHashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        qaJobs.add("Database Tester");

        // how to get all values from a Set

        for (String jobs: qaJobs){
            System.out.print(jobs+" ");
        }
        System.out.println();
        // Iterator
        // iterator interface has 3 methods: hasNext(); next(); remove();

        Iterator<String> iterator =qaJobs.iterator();

        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.print(s+" ");
        }


    }
}
