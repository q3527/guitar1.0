package test;

import bookMaster.Book;
import bookMaster.Loan;
import bookMaster.Member;

public class TestLibrary {

	public static void main(String[] args) {

		System.out.println("�����ɹ�");
		Member stu = new Member("1","Liyiran");
		Book book1 = new Book("1","001", "����");
		Loan loan1 = stu.loan(book1);
		
		stu.Return(book1);

		
		System.out.println("�����ɹ�");
		Book book2 = new Book("2","002", "��ѧ");
		Loan loan2 = stu.loan(book2);
		
		
		Book book5 = new Book("2","002", "��ѧ");
		Loan loan5 = stu.loan(book5);
		
		
		System.out.println("�����ɹ�");
		
		Book book3 = new Book("3","003", "Ӣ��");
		Loan loan3 = stu.loan(book3);

		
		Book book4 = new Book("4","004", "����");
		Loan loan4 = stu.loan(book4);
	}

}
