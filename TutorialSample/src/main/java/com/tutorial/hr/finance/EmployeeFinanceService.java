/**
 * 
 */
package com.tutorial.hr.finance;

/**
 * @author HP
 *
 */
public class EmployeeFinanceService {

	public Object getPF(int grossSalary) {
		double basicPay;
		double PF;
		
		if(grossSalary <= 0){ return 0.0;}
		
		if (grossSalary>10000){
			basicPay=grossSalary*0.4;
		}else {
			basicPay=grossSalary*0.2;
		}
		PF=0.12*basicPay;
		System.out.println("Implementation : calculated PF is checking"+PF);
		return PF;
	}

}
