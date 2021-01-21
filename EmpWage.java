public class EmpWage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAY = 20;
	public static final int MAX_HRS_IN_MONTH = 100;
	public static void main(String args[]) {
		System.out.println("Welcome to Employee With wage Computaion");
				//Veriables
		int empHrs = 0;
		int totalEmpHrs=0;
		int totalWorkingDays = 0;
		while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAY){
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
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("total Emp Wage" +totalEmpWage);
	}
}
