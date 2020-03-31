import com.codecool.FileManipulators.*;

public class Main {
    public static void main(String[] args) {
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.setup("src/main/resources/data/test_file.txt", 1, 7);

        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
        System.out.println("=^..^=   =^..^=   =^..^=    ORDERED    =^..^=    =^..^=    =^..^=");
        System.out.println();
        for (Object item : fileWordAnalyzer.wordsByABC()) {
            System.out.print(item + " ");
        }
        System.out.println("\n");
        System.out.println("=^..^=   =^..^=   =^..^=    SUBSTRINGS    =^..^=    =^..^=    =^..^=");
        System.out.println();
        for (Object item : fileWordAnalyzer.wordsContainingSubString("a")) {
            System.out.println(item);
        }
        System.out.println("=^..^=   =^..^=   =^..^=    PALINDROMES    =^..^=    =^..^=    =^..^=");
        System.out.println();
        for (Object item : fileWordAnalyzer.wordsArePalindrome()) {
            System.out.println(item);
        }
        System.out.println("=^..^=   =^..^=   =^..^=    =^..^=    =^..^=    =^..^=    =^..^=");
    }
}
