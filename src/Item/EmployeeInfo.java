package Item;

import java.util.Scanner;
import java.util.regex.*;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptID;



  public EmployeeInfo() {
    Pattern p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    Scanner scan = new Scanner(System.in);
    setName(scan);
    setId(scan,p);
    createEmployeeCode(name);
    scan.close();
  }

  public StringBuilder getName() {
    return name;
  }
  public String getId(Scanner scan){
    System.out.print("Please enter the department ID:");
    String id = scan.next();

    return id;
  }
  public String getCode() {
    return code;
  }

  private void setName(Scanner scan) {
    String nameString = inputName(scan);
    name = new StringBuilder(nameString);

  }
  private void setId(Scanner scan, Pattern p){
    String iDString = getId(scan);
    if(validId(iDString,p)){
      deptID = iDString;
    }else{deptID="None01";
    }

  }

  private String inputName(Scanner scan) {
    String nameString;
    System.out.print("Please enter your first and last name: ");
    nameString = scan.nextLine();
    return nameString;
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) {//valid ,include space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1, name.length());
    } else //invalid or no space
    {
      code = "guest";
    }
  }
  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {//valid
      return true;
    } else {
      return false;
    }
  }
  private boolean validId(String id, Pattern p){
    Matcher m = p.matcher(id);
    boolean b = m.matches();
    return b;

  }
  @Override
  public String toString(){
    return
            "Employee Code : "+ code+ "\n"+
                    "Department Number : "+ deptID;

  }
}



