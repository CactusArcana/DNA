public class DNA {
  public static void main(String[] args) {
    // this program checks to see if a DNA strand contains a protein

    // sequences to test
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    // variable to test dna stands
    String dna = dna1;

    // find and print length of dna String
    System.out.println("The length of the DNA strand is: " + dna.length());

    // find the first codon
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);

    // find the end codon
    int end = dna.indexOf("TGA");
    System.out.println("End: " + end);

    // see if the 3 conditions for a protein are met
    if (start != -1 && end != -1 && (end - start) % 3 == 0) {
      System.out.println("All conditions are satisfied.");

      // find the protein, store as a variable, then print
      String protein = dna.substring(start, end + 3);
      System.out.println("The protein sequence is: " + protein);
      } else {
      // print no protein if conditions are not met
      System.out.println("No protein in strand.");
    }
  }
}