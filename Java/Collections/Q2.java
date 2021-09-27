import java.util.*;

public class Q2 {

    static final Comparator<String> CASE_INSENSITIVE = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> sorted = new TreeSet<String>(CASE_INSENSITIVE);
        for (String a : args) {
            sorted.add(a);
        }
        System.out.println(sorted);
    }
}