import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        
        List<String> argsList = Arrays.asList(args);
        Collections.shuffle(argsList);

        System.out.println("Using stream");
        argsList.stream().forEach(a->System.out.format(a+" "));

        System.out.println("\nUsing enhanced for loop");
        for (String a: argsList) {
            System.out.format(a+" ");
        }
    }
}