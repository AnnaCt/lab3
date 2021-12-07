import java.util.Scanner;

public class labb3 {
    public static void main(String[] args) {
        System.out.print("Enter the date in the format dd/mm/yyyy");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();

        if (date.matches("([012]\\d|3[01])/(0[1-9]|1[0-2])/(1[6-9]\\d{2}|[2-9]\\d{3})")) {

            System.out.println("True");
        } else {
            System.out.println("False");
        }

        in.close();
    }
}


