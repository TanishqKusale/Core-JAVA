package code;
import exception.Duplicate_Customer;
import exception.RegAmtMismatch;
public class ValidationRules {

	//service plan validity
	public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException
	{
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	//val reg amount with plan
	
	public static void validatePlanAmount(ServicePlan plan,double regamt)throws IllegalArgumentException, RegAmtMismatch {
		
		if(plan.getRegAmt()!=regamt) {
			throw new RegAmtMismatch("Reg amount doesn't match");
		}
	}
	
		
	public static Customer validateAllInputs(String first_name, String last_name, String email, String password,
			double registrationAmount, String dob, String plan) throws RegAmtMismatch {
		
		ServicePlan p= parseAndValidatePlan(plan.toUpperCase());
		validatePlanAmount(p,registrationAmount);
		
		return new Customer(first_name,last_name,email,password,registrationAmount,dob,plan);
	}
	
}
