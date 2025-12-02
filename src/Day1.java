import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        // get a list of Strings from the data file we created
        ArrayList<String> fileData = getFileData("src/data");

        //Part 1 answer
        int num = 50;
        int numOfZero = 0;

        for (int i = 0; i < fileData.size(); i++) {
            String current = fileData.get(i);
            int dataNum = Integer.parseInt(current.substring(1));

            if (current.charAt(0) == 'L'){
                num = num + dataNum;

                while (num > 99) {
                    num = num - 100;
                }
            }

            if (current.charAt(0) == 'R') {
                num = num - dataNum;

                while (num < 0) {
                    num = num + 100;
                }
            }

            if (num == 0) {
                numOfZero++;
            }
        }
        System.out.println("Part 1 answer: " + numOfZero);


        //Part 2 answer
        num = 50;
        numOfZero = 0;

        for (int i = 0; i < fileData.size(); i++) {
            String current = fileData.get(i);
            int dataNum = Integer.parseInt(current.substring(1));

            if (current.charAt(0) == 'L'){
                while (dataNum > 0) {
                    num++;

                    if  (num > 99) {
                        num = num - 100;
                    }

                    if (num == 0) {
                        numOfZero++;
                    }

                    dataNum--;
                }
            }

            if (current.charAt(0) == 'R') {
                while (dataNum > 0) {
                    num--;

                    if  (num < 0) {
                        num = num + 100;
                    }

                    if (num == 0) {
                        numOfZero++;
                    }

                    dataNum--;
                }
            }
        }
        System.out.println("Part 2 answer: " + numOfZero);
    }


    //Part of the beginning code that was given
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
