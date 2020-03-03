import java.util.stream.Collectors;
public class RnaTranscription {
    public static void main(String[] args) {
        System.out.println("u".chars().map(c -> c = (char) c).collect(Collectors.joining()));
    }
}