import java.util.*;

class ListModifier{
    static void trimStrings(List<String> list) {
        for (ListIterator<String> trimmedList = list.listIterator(); trimmedList.hasNext(); ) {
            trimmedList.set(trimmedList.next().trim());
        }
    }
}

public class Q3 {

    public static void main(String[] args) {
        List<String> listValues = Arrays.asList(" value 1 ", " value 2 ", " value 3 ", " value 4", "value 5  ");
        ListModifier.trimStrings(listValues);
        for (String val : listValues) {
            System.out.format("\""+val+"\"\t");
        }
    }
}