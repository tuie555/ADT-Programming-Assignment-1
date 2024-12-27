import java.io.*;
import java.util.*;


public class sortbyID  {
    String firstpath;
    private Vector<Student> student = new Vector<Student>();
    public sortbyID(String path){
        this.firstpath = path;
    }
    public void readCSV() throws FileNotFoundException, IOException {
        File file = new File(firstpath);
        
        
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
        try (Scanner input = new Scanner(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
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
                StringTokenizer stu = new StringTokenizer(dataLine.trim(), ",");
                stu.nextToken(); // Skip the first token (if necessary)
                student.addElement(new Student(stu.nextToken(), stu.nextToken(), stu.nextToken()));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    



    //Display results
    public void DisandSort() {
        long startTime = System.nanoTime();
        boolean swapped;
        int n = student.size();
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset the swapped flag for each pass
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (student.get(j).getSID().compareTo(student.get(j+1).getSID()) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    Student temp = student.get(j);
                    student.set(j, student.get(j+1));
                    student.set(j+1, temp);
                    swapped = true; // Set the flag to true if a swap occurred
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!swapped) {
                break; // Exit the loop early if the array is sorted
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime/1000000;
        //Display sortlist
        for (Student s : student) {
            System.out.println(s);
            
        }
    }
}