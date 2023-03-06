import java.util.*; //importing scanner for I/O 

class lab5 {

    static String encrypt(String s) { //to create a function for encrypting
        String temp = ""; //null string to store a new string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); //extracting each character
            if (ch == ' ') { //if character = whitespace, remain same
                temp = temp + ch;

            } else {
                int a = (int) ch; //converting character to its ascii value
                if (a <= 67) { //for characters A-C
                    a = (a - 2) + 25;
                } else {
                    a = a - 3; //REMAINING CHARACTERS D-Z
                }
                temp = temp + (char) (a); //converting ascii value to character and then storing it in a string
            }

        }

        return temp; //returns new string
    }

    static String decrypt(String s) { //function to decrypt the code
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                temp = temp + ch;

            } else {
                int a = (int) ch; //converting character to its ascii value
                if (a >= 88) { //for characters X-Z
                    a = a - 23;
                } else {
                    a = a + 3; //REMAINING CHARACTERS A-W
                }
                temp = temp + (char) (a); //converting ascii value to character and then storing it in a string
            }

        }

        return temp;
    }

    public static void main(String[] args) { //main function
        Scanner sc = new Scanner(System.in);
        int n;
        boolean flag = false; //initialize boolean value to false
        do { //run the do while loop
            System.out.println("1.Encrypt a message");
            System.out.println("2.Decrypt a message");
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            n = Integer.parseInt(sc.nextLine());
            if (n == 1) { //call the encryption function
                flag = true;
                System.out.println("Enter a string: ");
                String s = sc.nextLine();
                System.out.println("------------------");
                String str = encrypt(s);
                System.out.println("ENCRYPTED STRING: " + str);

            }else if (n == 2) { //call the decryption function
                flag = true;
                System.out.println("Enter a string: ");
                String s = sc.nextLine();
                System.out.println("------------------");
                String str = decrypt(s);
                System.out.println("DECRYPTED STRING: " + str);
            }else{
                flag=false;
                System.out.println("Program will now exit!");
            }

        } while (flag == true);
    }
}
