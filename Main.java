import java.io.*;
public class Main {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Error: Insufficient arguments. Please provide an input file and a command.");
            return;
        }
        String inputFile = args[0];
        String command = args[1];
        String target = args.length == 3 ? args[2] : null;
                switch (command) {
                    case "-n":
                        sortbyID sortID = new sortbyID(inputFile);
                        try {
                            sortID.readCSV();
                            sortID.DisandSort();
                        } catch (IOException e) {
                            System.out.println("Error: The file was not found. Please check the path and try again.");
                        }
                        break;
                    case "-f":
                        sortFirst sortFirst = new sortFirst(inputFile);
                        try {
                            sortFirst.readCSV();
                            sortFirst.DisandSort();
                        } catch (IOException e) {
                            System.out.println("Error: The file was not found. Please check the path and try again.");
                        }
                        break;
                    case "-l":
                        Sortlast sortlast = new Sortlast(inputFile);
                        try {
                            sortlast.readCSV();
                            sortlast.DisandSort();
                        } catch (IOException e) {
                            System.out.println("Error: The file was not found. Please check the path and try again.");
                        }
                        break;
                    case "-s":
                    if (target == null) {
                        System.out.println("Error: No search term provided. Please provide a search term.");
                        return;
                    }
                    try {
                        search search = new search(inputFile, target);
                        search.readCSV();
                        search.display();
                    } catch (IOException e) {
                        System.out.println("Error: The file was not found. Please check the path and try again.");
                    }
                    break;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }
            }
        }