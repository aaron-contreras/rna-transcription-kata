import java.util.HashMap;
public class RnaTranscription {

    public String transcribe(String dna) {
        if (dna.isEmpty()) return dna;

        HashMap<Character, Character> rna = new HashMap<Character, Character>();
        
        rna.put('C', 'G');
        rna.put('G', 'C');
        rna.put('T', 'A');
        rna.put('A', 'U');

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            builder.append(rna.get(dna.charAt(i)));
        }
        return builder.toString();
    }

}