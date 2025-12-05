import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventAssessment {
    public static void main(String[] args) {
        // **** DO NOT EDIT CODE HERE ****
        ArrayList<String> fileData = getFileData("src/data");
        int answer = 0;
        for (String fileDatum : fileData) {
            answer += getWage(fileDatum);
        }
        System.out.println("Answer: " + answer);
    }

    // *** COMPLETE THIS METHOD
    // This method should return the wage owed to this elf
    // given a workday String (represented by "data")
    // For example:
    // if data is "057810019412"
    // this method should return 296
    public static int getWage(String data) {
        int wage = 0;

        // 0 to 11 (0-1 and 10-11 are overtime hours)
        for (int i = 0; i < data.length(); i++) {
            if (i != 0 && i != 1 && i != 10 && i != 11) {
                wage += 20;
            }

            if (i == 0 || i == 1 || i == 10 || i == 11) {
                int gifts = Integer.parseInt(String.valueOf(data.charAt(i)));

                if (gifts > 0) {
                    wage += 40;
                    for (int j = 0; j < gifts; j++) {
                        wage += 2;
                    }
                }
            }
        }

        return wage;
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
        } catch (FileNotFoundException e) {
            return fileData;
        }
    }
}
