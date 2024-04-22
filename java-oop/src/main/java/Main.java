import java.util.Arrays;
import logic.BubbleSort;
import logic.JavaSort;
import logic.Sort;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }
}
