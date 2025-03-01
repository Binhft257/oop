package Bai4;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0, year = 0;


        while (true) {
            System.out.print("Enter month (e.g., 1, Jan, Jan., January): ");
            String inputMonth = sc.nextLine().trim();

            month = parseMonth(inputMonth);
            if (month == -1) {
                System.out.println("Invalid month. Please re-enter.\n");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Enter year (non-negative integer, e.g., 1999): ");
            String inputYear = sc.nextLine().trim();

            if (!isValidYearInput(inputYear)) {
                System.out.println("Invalid year. Please re-enter.\n");
                continue;
            }

            year = Integer.parseInt(inputYear);
            if (year < 0) {

                System.out.println("Year must be non-negative. Please re-enter.\n");
            } else {
                break;
            }
        }

       
        int days = getDaysInMonth(month, year);

     
        String monthName = getFullMonthName(month);
        System.out.println(monthName + " " + year + " has " + days + " days.");
        sc.close();
    }

    private static int parseMonth(String input) {
        input = input.toLowerCase();

        switch (input) {
            case "1": case "jan": case "jan.": case "january":
                return 1;
            case "2": case "feb": case "feb.": case "february":
                return 2;
            case "3": case "mar": case "mar.": case "march":
                return 3;
            case "4": case "apr": case "apr.": case "april":
                return 4;
            case "5": case "may":
                return 5;
            case "6": case "jun": case "jun.": case "june":
                return 6;
            case "7": case "jul": case "jul.": case "july":
                return 7;
            case "8": case "aug": case "aug.": case "august":
                return 8;
            case "9": case "sep": case "sep.": case "sept": 
            case "sept.": case "september":
                return 9;
            case "10": case "oct": case "oct.": case "october":
                return 10;
            case "11": case "nov": case "nov.": case "november":
                return 11;
            case "12": case "dec": case "dec.": case "december":
                return 12;
            default:
                return -1;
        }
    }


    private static boolean isValidYearInput(String s) {
    
        if (s.isEmpty()) return false;
    
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }


    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static String getFullMonthName(int month) {
        switch (month) {
            case 1:  return "January";
            case 2:  return "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid";
        }
    }
}
