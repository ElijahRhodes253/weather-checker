import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
//import java.io.File;
//import java.io.FileNotFoundException;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        
        //Scanner for the file, List for the values in the file
        Scanner scan = new Scanner(System.in);
        List<Double> wList = new ArrayList<>();
        
        //Add all values of the file to the list
        while(scan.hasNextDouble())
        {
            wList.add(scan.nextDouble());
        }

        //Sorted the list of weather values, print off the max/min
        Collections.sort(wList);
        System.out.println(wList.get(0) + "\n" + wList.get(wList.size() - 1));
        
        //For testing
        /*
        for(Double x : wList)
        {
            System.out.println(x);
        }
        */
    }
}
