import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}
public class LambdaExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "orange");
        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted list: " + words);
        StringProcessor processor = String::toUpperCase;
        List<String> uppercaseWords = new ArrayList<>();
        for (String word : words) {
            uppercaseWords.add(processor.process(word));
        }
        System.out.println("Uppercase list: " + uppercaseWords);
    }
}
