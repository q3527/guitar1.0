package bookMaster;

import java.util.List;



public class HasReachMaxSpecification implements Specification {

	@Override
	public Boolean isSatisfied(Member member) {
		List<Loan> loans = member.getLoans();
		int i = 0;
		if(loans != null){
			for(Loan loan: loans){
				if(loan.hasNotBeenReturn()){
					i++;
				}
			}		
		}else{
			return true;
		}
		if( i >= 3){
			return false;
		}else{
			return true;
		}
	}
	
}
