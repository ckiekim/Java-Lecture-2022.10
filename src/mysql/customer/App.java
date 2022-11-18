package mysql.customer;

import java.util.Scanner;

public class App {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.고객목록 | 2.고객등록 | 3.정보수정 | 4.고객탈퇴 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				listCustomers(); break;
			case 2:
				registerCustomer(); break;
			case 3:
				updateCustomer(); break;
			case 4:
				deleteCustomer(); break;
			case 5:
				run = false; break;
			default:
				System.out.println("Warning: 1에서 5까지의 숫자만 입력하세요.");
			}
		}
	}

	public static void listCustomers() {
		
	}
	public static void registerCustomer() {
		
	}
	public static void updateCustomer() {
		
	}
	public static void deleteCustomer() {
		
	}
}
