package bookMaster;

import java.util.List;


public class LoanOnlyOneSpecification implements Specification {
		private Book wantBook;
		
		public LoanOnlyOneSpecification(Book wantBook) {
			super();
			this.wantBook = wantBook;
		}

		@Override
		public Boolean isSatisfied(Member member) {
			List<Loan> loans = member.getLoans();
			if(loans != null){
			 for(Loan loan: loans){
				if(loan.hasNotBeenReturn() && loan.getBook().getISBN().equals(wantBook.getISBN())){
					return false;				
				}
			 }
			}
			return true;
		}

		public Book getWantBook() {
			return wantBook;
		}

		public void setWantBook(Book wantBook) {
			this.wantBook = wantBook;
		}

}
