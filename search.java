
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class search {
    private final String newpath;
    private final String traget;
    private final Vector<Student> student = new Vector<Student>();

    public search(String newpath, String traget) {
        this.newpath = newpath;
        this.traget = traget;
    }
    public void readCSV() throws FileNotFoundException{
        File file = new File(newpath);
        // Check if the file exists
        if (!file.exists()) {
            System.out.println("Error: The file does not exist at the specified path.");
            return; // Exit if the file does not exist
        }
        
        // Check if the file is empty
        if (file.length() == 0) {
            System.out.println("Error: The input file is empty.");
            return; // Exit if the file is empty
        }

        // Use InputStreamReader with UTF-8 encoding
        Scanner input = new Scanner(file, "UTF-8");
            // Skip the first 7 lines
            for (int i = 0; i < 7; i++) {
                if (input.hasNextLine()) {
                    input.nextLine();
                } else {
                    System.out.println("Warning: Less than 7 lines in the file.");
                    break; // Exit if there are fewer than 7 lines
                }
            }

            // Read the CSV file line by line
            while (input.hasNextLine()) {
                String dataLine = input.nextLine();
                StringTokenizer stu = new StringTokenizer(dataLine.trim(),",");
                stu.nextToken(); // Skip the first token (if necessary)
                student.addElement(new Student(stu.nextToken().trim(), stu.nextToken().trim(), stu.nextToken().trim()));
            }
        input.close();
        }
    public void display() {
        String result = linearSearch();
        System.out.println(result);
    }
    public String linearSearch() {
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getFirstName().equalsIgnoreCase(traget)) {
                return "Element is present at index " + (i + 1) + ": "+student.get(i).getSID()+" "+ student.get(i).getFirstName() + " " + student.get(i).getLastname(); // Target found
            }
        }

    // Target was not found
    return "Target was not found";
    }
}
