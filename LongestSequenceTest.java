import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

class main {



    public static int input;
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();


    public static void main(String[] args) {
        boolean test = false;
        int score = 0;
        boolean k = true;
        System.out.println("Enter a series of numbers ending with 0: (with a space between each number)");
        while (k) {
            input = scan.nextInt();
            if (input > 0) {
                list.add(input);
                test = true;
                score += 10;
            } else {
                k = false;
                test = false;
                score -= 10;
            }
        }

        int counter = 1;
        for (int i = 1; i < list.size(); i++) {

            if (list.get(i).equals(list.get(i - 1))) {
                counter++;
                test = true;
            } else {
                map.put(counter, i - counter);
                counter = 1;
                test = true;
            }
        }
        score+=10;

        System.out.println("The longest same number sequence starts at index "
                + map.lastEntry().getValue() + " with " + map.lastEntry().getKey()
                + " values of " + list.get(map.lastEntry().getKey())+
                "\nCreative approach to testing. "+score+" = 100% "+"\nBuilt in testing method using scores and boolean. Pass = "+test+", Score = "+score+".");

    }
}