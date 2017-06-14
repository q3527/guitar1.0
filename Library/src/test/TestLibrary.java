package test;

import bookMaster.Book;
import bookMaster.Loan;
import bookMaster.Member;

public class TestLibrary {

	public static void main(String[] args) {

		System.out.println("操作成功");
		Member stu = new Member("1","Liyiran");
		Book book1 = new Book("1","001", "语文");
		Loan loan1 = stu.loan(book1);
		
		stu.Return(book1);

		
		System.out.println("操作成功");
		Book book2 = new Book("2","002", "数学");
		Loan loan2 = stu.loan(book2);
		
		
		Book book5 = new Book("2","002", "数学");
		Loan loan5 = stu.loan(book5);
		
		
		System.out.println("操作成功");
		
		Book book3 = new Book("3","003", "英语");
		Loan loan3 = stu.loan(book3);

		
		Book book4 = new Book("4","004", "高数");
		Loan loan4 = stu.loan(book4);
	}

}
