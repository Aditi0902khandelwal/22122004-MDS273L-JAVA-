import java.util.*; //to input various values

class lab3 {
    String name[] = new String[1024]; //declaring a String array of names
    Scanner sc = new Scanner(System.in); //creating sc object 

    int c = 0; //counter to store no of values

    void details(String arr[][]) { //function to enter the details of the student
        System.out.println("Enter the details of the student: ");
        System.out.print("Name: ");
        String nm = sc.nextLine();
        System.out.print("Roll No: ");
        String roll = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Program: ");
        String prog = sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();

        for (int i = 0; i < name.length; i++) {
            if (nm.equalsIgnoreCase(name[i])) { //to check if the name is already stored in the array
                System.out.println("Name already exists.");
            }

            else {
                name[c] = nm;
                int j = 0;

                arr[c][j] = nm;
                arr[c][j + 1] = roll;
                arr[c][j + 2] = email;
                arr[c][j + 3] = prog;
                arr[c][j + 4] = course;
                c = c + 1; //updating the value of the counter
                break;
            }

        }

    }

    void Student(String arr[][]) { //function to display the details of the student
        System.out.println("Enter the name of the student whose details you want: ");
        String snm = sc.nextLine(); //inputting the name of the student
        for (int i = 0; i < name.length; i++) {
            if (snm.equalsIgnoreCase(name[i])) {
                System.out.println("Name;Rollno;Email;Program;Course");
                for (int j = 0; j < 5; j++) {
                    System.out.println(arr[i][j]); //printing the details
                }
                break;
            }

        }

    }

    void Search(String arr[][]) { //function to search the details of the student
        System.out.println("Whose details do you want? ");
        String dnm = sc.nextLine(); //name you want to search for
        for (int i = 0; i < name.length; i++) {
            if (dnm.equalsIgnoreCase(name[i])) {
                System.out.println("Name is found at position " + (i + 1)); //displaying the position
                System.out.println("The details of "+name[i]+" are: ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(arr[i][j]);

                }
            }

        }

    }

    public static void main(String[] args) { //main function
        String arr[][] = new String[1024][5]; //declaring an array string to store details of the student
        lab3 obj = new lab3(); //creating an object
        boolean flag = false; 
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("--------Welcome to Student Portal------");
            System.out.println("1- Entering the student details");
            System.out.println("2-Displaying the details");
            System.out.println("3-Searching the student's details");
            System.out.println("4-Exit");
            System.out.print("Your choice: ");
            int ch = Integer.parseInt(scan.nextLine());
            if (ch == 1) {
                flag = true;
                obj.details(arr);

            } else if (ch == 2) {
                flag = true;
                obj.Student(arr);

            } else if (ch == 3) {
                flag = true;
                obj.Search(arr);
            } else if (ch == 4) {
                flag = false;
                System.out.println("Program exit!");

            }

        } while (flag);//updating the value of flag to true

    }

}