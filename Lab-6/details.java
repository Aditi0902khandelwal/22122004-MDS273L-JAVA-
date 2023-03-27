import java.io.File;
import java.util.*;

import javax.lang.model.element.Name;

import java.io.*;

class Student{
    String Regno;
    String name;
    String email;
    String phone;
    String sclass;
    String dept;

    Student(String Regno,String name,String email,String phone,String sclass,String dept){
        this.Regno=Regno;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.sclass=sclass;
        this.dept=dept;
    }

    void details(){
        System.out.println("----------------");
        System.out.print("Name: "+this.name);
        System.out.print("Reg. No: "+this.Regno);
        System.out.print("Email: "+this.email);
        System.out.print("Phone: "+this.phone);
        System.out.print("Class: "+this.sclass);
        System.out.print("Department: "+this.dept);

    }

    String toString(){
        String atts=this.name+" "+this.Regno+" "+this.email+" "+this.phone+" "+this.sclass+" "+this.dept;
        

        
    
            try{
                
                // read from file
                File file=new File("student.txt");
                FileWriter write = new FileWriter(file); //file writer class object to write the content to the file
                write.write(atts); //obj[write].function[write]("content")
                write.close();
    
             

                    
                    
                
    
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
    
          return atts;

    }

}

public class details {
    public static void main(String[] args) {

        Student obj=new Student(null, null, null, null, null, null);

        String[] st=new String[100];
        int c=0;
        Scanner sc=new Scanner(System.in);

        boolean flag=false;
        do{
            System.out.println("1- Add a Student");
            System.out.println("2-Search for a Student");
            System.out.println("3-Update the details of a Student");
            System.out.println("4-Display the details of all students");
            int ch=Integer.parseInt(sc.nextLine());
            if(ch==1){
                flag=true;
                Student 
            }
        }while(flag==true);

    }
    
}
