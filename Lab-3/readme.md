# Lab-3
## Question
Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}

You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.

Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.

You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have
Four functions inside your lab program class including your main class
One static String array storing the names (note the program can store up to 1024 students)
One two-dimensional string array storing the details of up to 1024 students
A menu-driven main method implementing the functions and functionality
Plan your program with a flow chart before starting with coding.
Since you are using functions, plan what should be the returning values and how to implement them.

Mandatory NOTE: your readme.md file should also contain a new task which is to draw a detailed flow chart of the program that you are doing. The flow chart can be drawn using https://www.diagrams.net/. To know more about flow charts you can refer https://asq.org/quality-resources/flowchart or https://www.lucidchart.com/pages/what-is-a-flowchart-tutorial.


##  Output
- --------Welcome to Student Portal------
- 1- Entering the student details
- 2-Displaying the details
- 3-Searching the student's details
- 4-Exit
- Your choice: 1
- Enter the details of the student: 
- Name: Aditi
- Roll No: 4
- Email: akhandelwal
- Program: msc
- Course: ds
- --------Welcome to Student Portal------
- 1- Entering the student details
- 2-Displaying the details
- 3-Searching the student's details
- 4-Exit
- Your choice: 1
- Enter the details of the student: 
- Name: kapil
- Roll No: 5
- Email: kapill
- Program: mscc
- Course: ds
- --------Welcome to Student Portal------
- 1- Entering the student details
- 2-Displaying the details
- 3-Searching the student's details
- 4-Exit
- Your choice: 1
- Enter the details of the student: 
- Name: tushar
- Roll No: 56
- Email: tunnu
- Program: mds
- Course: cs
- --------Welcome to Student Portal------
- 1- Entering the student details
- 2-Displaying the details
- 3-Searching the student's details
- 4-Exit
- Your choice: 2
- Enter the name of the student whose details you want: 
- tushar
- Name;Rollno;Email;Program;Course
- tushar
- 56
- tunnu
- mds
- cs
- --------Welcome to Student Portal------
- 1- Entering the student details
- 2-Displaying the details
- 3-Searching the student's details
- 4-Exit
-Your choice: 3
- Whose details do you want? 
- kapil
- Name is found at position 2
- The details of kapil are:
- kapil
- 5
- kapill
- mscc
- ds
- --------Welcome to Student Portal------
- 1- Entering the student details
- 2-Displaying the details
- 3-Searching the student's details
- 4-Exit
- Your choice: 4
- Program exit!
