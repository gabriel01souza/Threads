package Module02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskSearchByText implements Runnable {

    private final String namePerson;
    private final String fileName;

    public TaskSearchByText(String namePerson, String fileName) {
        this.namePerson = namePerson;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(fileName));

            int lineNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.toLowerCase().contains(namePerson.toLowerCase())) {
                    System.out.println("No arquivo: " + fileName + " - Line:" + lineNumber);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
