import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        // **** DO NOT EDIT ANYTHING HERE ****
        ArrayList<String> fileData = getFileData("src/data");
        int partOneAnswer = 0;
        for (String batteries : fileData) {
            int voltage = getLargestCombination(batteries);
            partOneAnswer += voltage;
        }

        System.out.println("Part one answer: " + partOneAnswer);
    }

    // COMPLETE THIS METHOD!
    public static int getLargestCombination(String batteries) {
        int largestCombo = 0;

        for (int i = 0; i < batteries.length(); i++) {
            String firstNum = String.valueOf(batteries.charAt(i));

            for (int j = i + 1; j < batteries.length(); j++) {
                String secondNum = String.valueOf(batteries.charAt(j));

                String joltage = firstNum + secondNum;
                int joltageNum = Integer.parseInt(joltage);

                if (joltageNum > largestCombo) {
                    largestCombo = joltageNum;
                }
            }
        }

        return largestCombo;
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}