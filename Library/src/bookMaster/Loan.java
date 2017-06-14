package bookMaster;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Loan {
	public String id;
	public java.time.LocalDateTime  loanDate;
	public java.time.LocalDateTime  dateForReturn;
	public String  returnDate;
	public Book book;
	public Member member;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public java.time.LocalDateTime getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(java.time.LocalDateTime loanDate) {
		this.loanDate = loanDate;
	}
	public java.time.LocalDateTime getDateForReturn() {
		return dateForReturn;
	}
	public void setDateForReturn(java.time.LocalDateTime dateForReturn) {
		this.dateForReturn = dateForReturn;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public boolean hasNotBeenReturn(){
		return returnDate==null;
	} 
	public void markAsReturned(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		returnDate=df.format(new Date());
	}
}
