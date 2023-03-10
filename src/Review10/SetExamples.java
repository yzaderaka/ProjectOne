package Review10;


import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<String> qaJobs = new HashSet<>();
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");
        System.out.println("HashSet "+qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Removed element "+qaJobs);
        qaJobs.add("API Tester");
        // creating an object and passing as a parameter to invoke parametrized constructor
        Set lset = new LinkedHashSet<>(qaJobs);
        System.out.println("linkesHashSet "+lset);

        Set<String> tset = new TreeSet<>();
        tset.addAll(qaJobs);
        System.out.println("TreeSdet "+tset);



    }
}
