package salary;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				  Scanner sc = new Scanner(System.in);
			        int[] hw = new int[7];
			        for (int i = 0; i < 7; i++) {
			            hw[i] = sc.nextInt();
			        }
			        int hr = 100;
			        int dhl = 8;
			        int whl = 40;
			        int salary = 0;
			        for (int i = 0; i < 7; i++) {
			            int ds = hw[i] * hr;
			            if (hw[i] > dhl) {
			                int extraHours = hw[i] - dhl;
			                ds += extraHours * 15;

			            }
			            salary += ds;
			        }
			        int totalhours = calculateTotalHours(hw);
			        if (totalhours > whl) {
			            int extraHours = totalhours - whl;
			            salary += extraHours * 25;
			        }
			        salary += calculateweekendBonus(hw);
			        System.out.print(salary);
			    }
			    private static int calculateTotalHours(int[] hw){
			        int totalhours=0;
			        for(int i=0;i<7;i++){
			            totalhours+=hw[i];
			        }
			        return totalhours;
			    }
			    private static int calculateweekendBonus(int[] hw){
			        int sh=hw[6];
			        int sunhours=hw[6];
			        int weekendBonus=0;
			        weekendBonus+=sh*0.25*100;
			        weekendBonus+=sunhours*0.5*100;
			        return   weekendBonus;
			    }
			
			




	}


