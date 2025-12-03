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
        System.out.println(batteries);
        System.out.println(batteries.length());

        String joltage = "";

        for (int i = 0; i < batteries.length(); i++) {
            int currentNum = batteries.charAt(i);

            if (joltage.length() < 3) {
                if (currentNum == 9) {
                    joltage = joltage + "9";
                } if (currentNum == 8) {
                    joltage = joltage + "8";
                } if (currentNum == 7) {
                    joltage = joltage + "7";
                } if (currentNum == 6) {
                    joltage = joltage + "6";
                } if (currentNum == 5) {
                    joltage = joltage + "5";
                } if (currentNum == 4) {
                    joltage = joltage + "4";
                } if (currentNum == 3) {
                    joltage = joltage + "3";
                } if (currentNum == 2) {
                    joltage = joltage + "2";
                } if (currentNum == 1) {
                    joltage = joltage + "1";
                } else {
                    joltage = joltage + "0";
                }
            }
        }
        int output = Integer.parseInt(joltage);

        return output;
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


////Code that I wrote but doesn't really make sense
//public static int getLargestCombination(String batteries) {
//    String joltage = "";
//
//    for (int i = 0; i < batteries.length(); i++) {
//        int currentNum = batteries.charAt(i);
//
//        if (joltage.length() < 3) {
//            if (currentNum == 9) {
//                joltage = joltage + "9";
//            } if (currentNum == 8) {
//                joltage = joltage + "8";
//            } if (currentNum == 7) {
//                joltage = joltage + "7";
//            } if (currentNum == 6) {
//                joltage = joltage + "6";
//            } if (currentNum == 5) {
//                joltage = joltage + "5";
//            } if (currentNum == 4) {
//                joltage = joltage + "4";
//            } if (currentNum == 3) {
//                joltage = joltage + "3";
//            } if (currentNum == 2) {
//                joltage = joltage + "2";
//            } if (currentNum == 1) {
//                joltage = joltage + "1";
//            } else {
//                joltage = joltage + "0";
//            }
//        }
//    }
//    int output = Integer.parseInt(joltage);
//
//    return output;
//}

