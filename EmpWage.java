public class EmpWage {
   public static final int IS_FULL_TIME = 1;
   public static final int IS_PART_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 20;
   public static final int NUM_OF_WORKING_DAY = 2;
   public static final int MAX_HRS_IN_MONTH = 10;

public static int ComputeEmpWage(String company, int empRate, int numOfDays, int maxHrs) {

      //System.out.println("Welcome to Employee With wage Computaion");
            //Veriables
      int empHrs = 0;
      int totalEmpHrs=0;
      int totalWorkingDays = 0;

      while(totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays ){

         totalWorkingDays++;

         int empCheck = (int) Math.floor(Math.random() * 10) %3;

            switch (empCheck){
            case IS_FULL_TIME:
               empHrs = 8;
               break;
            case IS_PART_TIME:
               empHrs = 4;
               break;
            default :
               empHrs = 0;
         }

         totalEmpHrs += empHrs;
         System.out.println("Day#" + totalWorkingDays + "Emp Hr: " +empHrs);
      }
      int totalEmpWage = totalEmpHrs * empRate;
      System.out.println("total Emp Wage for Company " +company+ " is "   +totalEmpWage);
      return totalEmpWage;
      }
      public static void main(String args[]) {
         ComputeEmpWage("TCS", 20, 2, 10);
			ComputeEmpWage("Accenture", 25, 4, 20); 
			ComputeEmpWage("BridgeLabz", 15, 8, 15);

   }
}
