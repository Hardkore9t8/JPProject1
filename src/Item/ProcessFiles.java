/**
 * @Author Naldo Ash
 * OraclProduction Ltd now wants to store the results of the tests and who carried out that test to a file for
 * archiving purposes. To achieve this create a new class named ProcessFiles that will create a directory
 * and file structure by combining the path and file name. It will have to save both the products and the
 * employee information to file so create two methods that override each other that accept either the
 * employee object or products arraylist.
 * The directory and file should be created when the object is created.The class will have three fields:
 *  private Path p;
 *  private Path p2;
 *  private Path p3;
 * The following new methods have to be defined:
 *  private void CreateDirectory()
 *  public void WriteFile(EmployeeInfo emp) throws IOException
 *  public void WriteFile(ArrayList<Product> products) throws IOException
 * For both the file and directory if they do not exist then create them. The directory should be created at
 * the root of the C drive and be named LineTests(p). The file should be named TestResults.txt(p2) and
 * should be created within the LineTests directory. The p3 field should be used to store the resolved path
 * combining p and p2.
 * Update the TestProductionLine class to use the WriteFile() methods to save the product information to
 * file followed by the employee information. This information should be appended so that no historical
 * information is lost in this process.
 * Test the file output to ensure that it is formatted the same as the console output.
 */
package Item;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {

    private Path p;
    private Path p2;
    private Path p3;

    public ProcessFiles() {
        p = Paths.get("C:\\LineTests");
        p2 = Paths.get("TestResults.txt");
        p3 = p.resolve(p2);

        CreateDirectory();
    }
    //create CreateDirectory method

    private void CreateDirectory() {
        if (Files.notExists(p)) {
            try {
                Files.createDirectory(p);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error while creating directory");
            }
        }
    }

    //create WriteFile method
    private void WriterFile(EmployeeInfo emp) throws IOException {
        FileWriter writer = new FileWriter(p3.toString(), true);
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.print(emp);
        printWriter.close();
    }

    //create    WriterFile ArrayList method to hold product list
    private void WriteFile(ArrayList<Product> products) throws IOException {
        FileWriter writer = new FileWriter(p3.toString(), true);
        PrintWriter printWriter = new PrintWriter(writer);

        for (Product items : products) {
            printWriter.print(items);
        }
    }
}