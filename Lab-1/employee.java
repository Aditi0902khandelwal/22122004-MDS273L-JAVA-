import java.util.*;   //importing package util for i/o operations

import javax.xml.transform.Source;
public class employee{
    public static void main(String[] args) {
      System.out.println("-----Employee Portal-----");
      System.out.println("Enter the employee's details: ");
      Scanner sc=new Scanner(System.in); //object sc created of Scanner class
      System.out.println("Name: ");
      
      String name=sc.nextLine();  //to input name of the employee
      System.out.println("State: ");
      String state=sc.nextLine();  //to input state of the employee
      System.out.println("Gender: ");
      char gender=sc.nextLine().charAt(0);  //to input gender in character format
      
      System.out.println("Work: ");
      String mnc=sc.nextLine(); //to input work
      System.out.println("Age: ");
      int age=Integer.parseInt(sc.nextLine()); //to input age 
      
      System.out.println("Employee details :- ");
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);

      if(mnc.equalsIgnoreCase("Facebook")||mnc.equalsIgnoreCase("Google")||mnc.equalsIgnoreCase("Microsoft")||mnc.equalsIgnoreCase("Samsung")||mnc.equalsIgnoreCase("IBM")||mnc.equalsIgnoreCase("Apple"))
      { //to check for top MNCs
        System.out.println("The employee is working in Top MNC Companies");
      }
      System.out.println("Work: "+mnc);
      if(gender=='M'||gender=='m'){ //to check if gender is male or female
        System.out.println("Gender: Male");
      }
      else if(gender=='F'||gender=='f'){
        System.out.println("Gender: Female");
      }


      
      switch(state){ //to check in which region does the employee belong
        case "Rajasthan":
        case "Uttar Pradesh":
        case "Himachal Pradesh":
        case "Uttarakhand":
        case "Punjab":
        case "Haryana":
        case "Jammu and Kashmir":
        case "Delhi":
        case "Chandigarh":
             System.out.println("The Employee is from the northern states of India; Preferable work location is in "+state);
             break;
        case "Maharashtra":
        case "Gujarat":
        case "Goa":
             System.out.println("The Employee is from the western states of India; Preferable work location is in "+state);
             break;
        case "Karnataka":
        case "Andhra Pradesh":
        case "Tamil Nadu":
        case "Telangana":
        case "Kerala":
             System.out.println("The Employee is from the southern states of India; Preferable work location is in "+state);
             break;
        case "Odisha":
        case "Bihar":
        case "West Bengal":
        case "Arunachal Pradesh":
        case "Assam":
        case "Meghalaya":
        case "Manipur":
        case "Mizoram" :
        case "Nagaland":
        case "Tripura":
        case "Sikkim":
              System.out.println("The Employee is from the eastern states of India; Preferable work location is in "+state);
              break;
        case "Madhya Pradesh":
        case "Chattisgarh":
              System.out.println("The Employee is from the central states of India; Preferable work location is in "+state);  
              break;    



        default:
             System.out.println("The Employee is from the Union Territories of India; Preferable work location is in "+state);
             break;
      }
      System.out.println("----Thankyou for visiting-------");



    }
}