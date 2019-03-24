package convertminutestoyears;

import java.util.Scanner;

public class ConvertMinutesToYears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes:\t");

        long minutes = input.nextLong();

        //Every year is 525600 minutes.
        //1440 is short for: 60(minutes is equal to an hour) / 24(hours is equal to 1 day).
        System.out.printf("\n%d minutes is approximately %d years and %d days.\n\n", minutes, minutes / 525600, minutes % 525600 / 1440);

    }

}
