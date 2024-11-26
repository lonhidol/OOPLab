import java.util.Scanner;

public class DayMonthYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input Month: ");
            String Month = scanner.nextLine();
            System.out.print("Input Year: ");
            int Year = scanner.nextInt();
            scanner.nextLine();
            int Day = 0;
            
            if (Month.equals("1") || Month.equalsIgnoreCase("January") || Month.equalsIgnoreCase("Jan.") || Month.equalsIgnoreCase("Jan")) {
                Day = 31;
                Month = "January";
            } else if (Month.equals("3") || Month.equalsIgnoreCase("March") || Month.equalsIgnoreCase("Mar.") || Month.equalsIgnoreCase("Mar")) {
                Day = 31;
                Month = "March";
            } else if (Month.equals("5") || Month.equalsIgnoreCase("May")) {
                Day = 31;
                Month = "May";
            } else if (Month.equals("7") || Month.equalsIgnoreCase("July") || Month.equalsIgnoreCase("Jul")) {
                Day = 31;
                Month = "July";
            } else if (Month.equals("8") || Month.equalsIgnoreCase("August") || Month.equalsIgnoreCase("Aug.") || Month.equalsIgnoreCase("Aug")) {
                Day = 31;
                Month = "August";
            } else if (Month.equals("10") || Month.equalsIgnoreCase("October") || Month.equalsIgnoreCase("Oct.") || Month.equalsIgnoreCase("Oct")) {
                Day = 31;
                Month = "October";
            } else if (Month.equals("12") || Month.equalsIgnoreCase("December") || Month.equalsIgnoreCase("Dec.") || Month.equalsIgnoreCase("Dec")) {
                Day = 31;
                Month = "December";
            } else if (Month.equals("4") || Month.equalsIgnoreCase("April") || Month.equalsIgnoreCase("Apr.") || Month.equalsIgnoreCase("Apr")) {
                Day = 30;
                Month = "April";
            } else if (Month.equals("6") || Month.equalsIgnoreCase("June") || Month.equalsIgnoreCase("Jun")) {
                Day = 30;
                Month = "June";
            } else if (Month.equals("9") || Month.equalsIgnoreCase("September") || Month.equalsIgnoreCase("Sept.") || Month.equalsIgnoreCase("Sep")) {
                Day = 30;
                Month = "September";
            } else if (Month.equals("11") || Month.equalsIgnoreCase("November") || Month.equalsIgnoreCase("Nov.") || Month.equalsIgnoreCase("Nov")) {
                Day = 30;
                Month = "November";
            } else if (Month.equals("2") || Month.equalsIgnoreCase("February") || Month.equalsIgnoreCase("Feb.") || Month.equalsIgnoreCase("Feb")) {
                Month = "February";
                if (Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0)) {
                    Day = 29;
                } else {
                    Day = 28;
                }
            } else {
                System.out.println("Invalid! Try Again!");
                continue;
            }

            System.out.println(Month + " " + Year + " has " + Day + " days.");
            scanner.close();
            break;
        }
    }
}
