
import javafx.util.Pair;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Integer sizeArrayList;
        InputReader in = new InputReader(System.in);
        sizeArrayList = in.nextInt();

        ArrayList<Pair<Integer, Integer>> positiveSequence = new ArrayList<>();
        ArrayList<Pair<Integer, Integer>> negativeSequence = new ArrayList<>();


        Integer positiveSum = new Integer(0);
        Integer negativeSum = new Integer(0);


        for (int iterator = 1; iterator < sizeArrayList + 1; iterator++) {

            int chislo = in.nextInt();

            if (chislo < 0) {
                negativeSequence.add(new Pair<>(iterator, chislo));
                negativeSum += chislo;
            } else if (chislo > 0) {
                positiveSequence.add(new Pair<>(iterator, chislo));
                positiveSum += chislo;
            } else {
                positiveSequence.add(new Pair<>(iterator, chislo));
                negativeSequence.add(new Pair<>(iterator, chislo));
            }
        }

        if (Math.abs(negativeSum) > positiveSum) {
            System.out.println(negativeSequence.size());
            for (Pair<Integer, Integer> pair : negativeSequence)
                System.out.print(pair.getKey() + " ");

        } else {
            System.out.println(positiveSequence.size());
            for (Pair<Integer, Integer> pair : positiveSequence)
                System.out.print(pair.getKey() + " ");

        }
    }

}





class InputReader {


    public BufferedReader reader;
    public StringTokenizer tokenizer;


    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}