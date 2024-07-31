import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JenkinsTest {
    public static void main(String[] args) {
        System.out.println("hey there");
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(list);
        System.out.println("hey again");
        System.out.println("lets go");
        List<String> list1 = list.stream().filter(i -> i.startsWith("A")).collect(Collectors.toList());
        System.out.println(" Element starting with A");
        System.out.println(list1);

    }
}