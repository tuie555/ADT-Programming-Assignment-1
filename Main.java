import java.io.*;
public class Main {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Error: Insufficient arguments. Please provide an input file and a command.");
            return;
        }
        String command = args[0];
        String inputFile = args[1];
        String traget = args.length == 3 ? args[2] : null;
        Sort sort = new Sort(inputFile);
                switch (command) {
                    case "-n":
                        try {
                            sort.readCSV();
                            sort.SortID();
                        } catch (IOException e) {
                            System.out.println("Error: The file was not found. Please check the path and try again.");
                        }
                        break;
                    case "-f":
                        try {
                            sort.readCSV();
                            sort.Sortfirst();
                        } catch (IOException e) {
                            System.out.println("Error: The file was not found. Please check the path and try again.");
                        }
                        break;
                    case "-l":
                        try {
                            sort.readCSV();
                            sort.Sortlast();
                        } catch (IOException e) {
                            System.out.println("Error: The file was not found. Please check the path and try again.");
                        }
                        break;
                    case "-s":
                    if (traget == null) {
                        System.out.println("Error: No search term provided. Please provide a search term.");
                        return;
                    }
                    try {
                        search search = new search(inputFile, traget);
                        search.readCSV();
                        search.display();
                    } catch (FileNotFoundException e) {
                        System.out.println("Error: The file was not found. Please check the path and try again.");
                    }
                    break;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }
            }
        }