package adapter;

import java.util.Iterator;
import java.util.StringTokenizer;

public class Client {

    public static void main(String[] args) {
        printWordsLineByLine("This is a wonderful day");
    }

    private static void printWordsLineByLine(String input) {

        StringTokenizer tokenizer = new StringTokenizer(input);

        Iterator<String> iterator = new TokenizerToIteratorAdapter(tokenizer);

        String output = CollectionLibrary.elementsToMultilineString(iterator);
        System.out.println(output);
    }

}
