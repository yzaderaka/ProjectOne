package Class13;

public class Task3 {
    /*
    Write a program that reads two people's first
    names and if they expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? boy
    Suggested baby name: DANRY

    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? girl
    Suggested baby name: MAIEL
     */
    public static void main(String[] args) {
        String dadsName="Daniel";
        String momsName="Mary";
        String expectation="Boy";
        String firstHalf="";
        String secondHalf="";

        if (expectation.equalsIgnoreCase("boy")){
            dadsName.substring(0,dadsName.length()/2);
            momsName.substring(momsName.length()/2);
        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);
    }
}
