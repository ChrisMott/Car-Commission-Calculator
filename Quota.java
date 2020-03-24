public class Quota {

    double quotaBucket;

    double quotaNewCars;

    double quotaUsedCars;

    double quotaTotalCars = quotaNewCars + quotaUsedCars;

    double daysWorkingCurrentMonth;

    double daysLeftToWork;

    //double workingDaysLeft = daysWorkingCurrentMonth - daysWorked;

    public Quota(double quotaNewCarsInput, double quotaUsedCarsInput,  double quotaBucketInput){

        this.quotaNewCars = quotaNewCarsInput;
        this.quotaUsedCars = quotaUsedCarsInput;
        this.quotaTotalCars = quotaNewCarsInput+quotaUsedCarsInput;
        this.quotaBucket = quotaBucketInput;
        //this.daysLeftToWork = daysLeftToWorkInput;





    }


    public void averageMetricsPerDay(double currentNewCarsSold, double currentUsedCarsSold, double currentBucket, double newWorkingDaysLeft, double multiplierDesired){



        System.out.println("The target to hit for each metric daily for the rest of the month with " + newWorkingDaysLeft + " working days left to hit a " + multiplierDesired + " is: ");
        double avgNewCars = ((quotaNewCars*multiplierDesired)-currentNewCarsSold)/newWorkingDaysLeft;
        double avgUsedCars = ((quotaUsedCars*multiplierDesired)-currentUsedCarsSold)/newWorkingDaysLeft;
        double avgTotalCars = ((quotaTotalCars*multiplierDesired)-currentNewCarsSold-currentUsedCarsSold)/newWorkingDaysLeft;
        double avgBucket = ((quotaBucket*multiplierDesired)-currentBucket)/newWorkingDaysLeft;

        System.out.println("This is the average new cars per day to hit quota " + avgNewCars);
        System.out.println("This is the average used cars per day to hit quota " + avgUsedCars);
        System.out.println("This is the average total cars per day to hit quota " + avgTotalCars);
        System.out.println("This is the average bucket per day to hit quota $" + avgBucket);


    }




}
