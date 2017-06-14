package bookMaster;

public class Book {
	public String id;
	public String ISBN;
	public String title;
	public Member LoanTo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Member getLoanTo() {
		return LoanTo;
	}
	public void setLoanTo(Member loanTo) {
		LoanTo = loanTo;
	}
	public Book(String id, String iSBN, String title) {
		super();
		this.id = id;
		ISBN = iSBN;
		this.title = title;
	}
	

}
