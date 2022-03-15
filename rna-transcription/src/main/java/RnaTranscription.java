import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        Map<Character, Character> complement = new HashMap<>();
        complement.put('G', 'C');
        complement.put('C', 'G');
        complement.put('T', 'A');
        complement.put('A', 'U');
        String rnaStrand = "";
        char[] nucleotides = dnaStrand.toCharArray();
        for (char nucleotide : nucleotides) {
            rnaStrand += complement.get(nucleotide);
        }
        return rnaStrand;
    }

}
