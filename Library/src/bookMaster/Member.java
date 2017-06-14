package bookMaster;

import java.util.ArrayList;

public class Member {
	public String id;
	public String name;
	public ArrayList<Loan> loans = new ArrayList<Loan>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Loan> getLoans() {
		return loans;
	}
	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}
	public Loan findCurrentLoanFor(Book book){
		for(Loan loan:getLoans()){
			if(loan.getBook().getISBN().equals(book.getISBN())){
				return loan;
			}
		}
		return null;
			
	}
	public void Return(Book book){
		Loan loan=findCurrentLoanFor(book);
		if(loan!=null){
			loan.markAsReturned();
			book.setLoanTo(null);
			System.out.println("ΩË È≥…π¶");
		}
	}
	
   public  boolean canLoan(Book book){
	   return book.getLoanTo()==null;
   }
   public Loan loan(Book book){
	   Loan loan=null;
	   if(canLoan(book)){
		   loan=LoanFactory.creatLoan(book,this);
		   getLoans().add(loan);
	   }
	   return loan;
   }
public Member(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
   
}
