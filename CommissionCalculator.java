import java.awt.*;
import java.util.*;
import java.time.*;



//Calculator works with user inputs, uses constructor from quota with user input. Only needs exception handling and maybe a breakable loop to be complete.

//Before uploading to GitHub or anywhere, may want to replace specific terms like "phone adds" with a generic name like "new Items" and "replaced items" for upgrades.

public class CommissionCalculator {

    public static void main (String[] args){



        int quotaBucket = 8000;

        int quotaNewCars = 19;

        int quotaUpCars = 52;

        int quotaTotalCars = quotaNewCars + quotaUpCars;

        int daysWorkingCurrentMonth = 21;

        int daysWorked = 5;

        int workingDaysLeft = daysWorkingCurrentMonth - daysWorked;


        System.out.println("The current quota for the month is: ");
        System.out.println(quotaNewCars + " for new cars ");
        System.out.println(quotaUpCars + " for used cars ");
        System.out.println(quotaTotalCars + " for total cars ");
        System.out.println("and " + quotaBucket + " for bucket ");


        System.out.println("=====================================");

        System.out.println("With " + daysWorked + " days worked this month, the remaining average per day for each metric to hit a 1.0 multiplier is: ");
        System.out.println("$" + quotaBucket/(daysWorkingCurrentMonth-daysWorked) + " for bucket");
        System.out.println(quotaNewCars/(daysWorkingCurrentMonth-daysWorked) + " for new cars");
        System.out.println(quotaUpCars/(daysWorkingCurrentMonth-daysWorked) + " for used cars");
        System.out.println(quotaTotalCars/(daysWorkingCurrentMonth-daysWorked) + " for total cars");

        System.out.println("=====================================");

        System.out.println();

        System.out.println("Creating with constructor and user input ");

        System.out.println();

        System.out.println("=====================================");

        System.out.println();

        System.out.println("Please enter the Quota value for new cars. ");

        Scanner userInputNPI = new Scanner(System.in);

        double qNCI = userInputNPI.nextInt();



        System.out.println();

        System.out.println("Please enter the Quota value for used cars. ");

        Scanner userInputPUI = new Scanner(System.in);

        double qUCI = userInputPUI.nextInt();




        double qTC = qNCI + qUCI;



        System.out.println();

        System.out.println("Please enter the Quota value for Sales Dollars. ");

        Scanner userInputBI = new Scanner(System.in);

        double qBI = userInputBI.nextInt();


        System.out.println();

        System.out.println("Please enter how many days you expect to work this month. ");

        Scanner userInputDSTW = new Scanner(System.in);

        double dSTW = userInputDSTW.nextInt();


        //Quota February = new Quota(24, 60, 10000);
        Quota February = new Quota(qNCI, qUCI, qBI);

        System.out.println("This is February's new car quota " + February.quotaNewCars);
        System.out.println("This is February's used car quota " + February.quotaUsedCars);
        System.out.println("This is February's total cars quota " + February.quotaTotalCars);
        System.out.println("This is February's bucket quota $" + February.quotaBucket);

        System.out.println();

        System.out.println("=====================================");

        System.out.println();

        February.averageMetricsPerDay(0,0,0,dSTW, 1.0);


        //System.out.println("With " + February.daysLeftToWork + " work days remaining this month, these are the average metrics to hit " +
          //      "per day in order to reach a 1.0");

        System.out.println();

        System.out.println("=====================================");

        System.out.println();

        System.out.println("Testing updated average with hard coded numbers versus scanner ");

        System.out.println();

        February.averageMetricsPerDay(12,24,4500,10, 1.0);

        System.out.println();

        System.out.println("=====================================");

        System.out.println();

        System.out.println("For an updated average metric per day, please enter the updated information below: ");

        System.out.println();

        System.out.println();

        System.out.println("Please enter the current accrued value for new cars sold. ");

        Scanner userInputCPA = new Scanner(System.in);

        double cNC = userInputCPA.nextInt();



        System.out.println();

        System.out.println("Please enter the accrued value for used cars sold. ");

        Scanner userInputCPU = new Scanner(System.in);

        double cUC = userInputCPU.nextInt();




        double aTP = cNC + cUC;



        System.out.println();

        System.out.println("Please enter the accrued value for Sales Dollars. ");

        Scanner userInputABI = new Scanner(System.in);

        double aBI = userInputABI.nextInt();


        System.out.println();


        System.out.println("Please enter how many days remaining you expect to work this month. ");

        Scanner userInputDRTW = new Scanner(System.in);

        double dRTW = userInputDRTW.nextInt();

        System.out.println();


        System.out.println("Please enter the multiplier you want to hit this month. ");

        Scanner userInputMW = new Scanner(System.in);

        double mW = userInputMW.nextDouble();



        February.averageMetricsPerDay(cNC,cUC,aBI,dRTW, mW);

        System.out.println();

        System.out.println("=====================================");



    }



}
