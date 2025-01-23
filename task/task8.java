import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentance... ");
        String sentance = sc.nextLine();

        int charCount = 0;
        int digitCount = 0;
        int symbolCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int noRepeatedCount = 0;
        int repeatedCount = 0;
        int uppercaseCount = 0;
        int lowercaseCount = 0;

        String vowel = "AEIOUaeiou";
        String charStore = " ";
        String vowelStore = " ";
        String consonantStore = " ";
        String digitStore = " ";
        String symbolStore = " ";
        String noRepeatedCh = " ";
        String repeatedCh = " ";
        String reverse = " ";
        String uppercase = " ";
        String lowercase = " ";

        for (int i = 0; i < sentance.length(); i++) {
            char ch = sentance.charAt(i);
            // leeters chk krne k lie
            if (Character.isLetter(ch)) {
                charCount++;
                charStore += ch + " ";
                // vowels chk krne k lie
                if (vowel.indexOf(ch) != -1) { // is ye hoga k vowels k index me ye ch k dekhega agr wo match hua to ++
                                               // hojaega
                    vowelCount++;
                    vowelStore += ch + " ";
                } else {
                    consonantCount++;
                    consonantStore += ch + " ";
                }

                if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                    uppercase += ch + " ";
                }
                if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                    lowercase += ch + " ";
                }

            } else if (Character.isDigit(ch)) {
                digitCount++;
                digitStore += ch + " ";
            } else {
                symbolCount++;
                symbolStore += ch + " ";
            }

            // ab repeat or nonrepeat ko dekheinge
            if (sentance.indexOf(ch) == sentance.lastIndexOf(ch)) {
                noRepeatedCh += ch + " ";
                noRepeatedCount++;

            } else if (!repeatedCh.contains(String.valueOf(ch))) {
                repeatedCh += ch + " ";
                repeatedCount++;

            }

        }

        for (int i = 0; i < sentance.length(); i++) {
            reverse = sentance.charAt(i) + reverse;
        }

        System.out.println("Total Number of  Characters: " + charCount + " Total Characters: " + charStore);
        System.out.println("Total Number of  Vowels: " + vowelCount + " Total Vowels: " + vowelStore);
        System.out.println("Total Number of  Consonants: " + consonantCount + " Total Consonants: " + consonantStore);
        System.out
                .println("Total Number of  Uppercase Letters: " + uppercaseCount + " Total Uppercase Letters: "
                        + uppercase);
        System.out
                .println("Total Number of  Lowercase Letters: " + lowercaseCount + " Total Lowercase Letters: "
                        + lowercase);
        System.out.println("Total Number of Digits: " + digitCount + " Total Digits: " + digitStore);
        System.out.println("Total Number of Symbols: " + symbolCount + " Total Symbols: " + symbolStore);
        System.out.println("Total Number of Non Repeat Character: " + noRepeatedCount + " Total Non Repeat Character:: "
                + noRepeatedCh);
        System.out.println(
                "Total Number of Repeat Character: " + repeatedCount + " Total Repeat Character: " + repeatedCh);
        System.out.println("Original String: " + sentance);
        System.out.println("Reverse String: " + reverse);

    }
}
