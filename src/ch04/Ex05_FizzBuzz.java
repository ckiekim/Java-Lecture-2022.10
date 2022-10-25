package ch04;

import java.util.Random;

/*
 * FizzBuzz 문제
 * 
 * 3의 배수 - Fizz 출력
 * 5의 배수 - Buzz 출력
 * 3과 5의 배수 - FizzBuzz 출력
 * 아니면 - 숫자 출력
 */
public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		// 임의의 정수값을 생성
		Random ran = new Random();
		int number = ran.nextInt(100) + 1;	// 1 ~ 100 까지 임의의 정수값 생성
		
		if (number % 15 == 0)
			System.out.println(number + ", FizzBuzz");
		else if (number % 3 == 0)
			System.out.println(number + ", Fizz");
		else if (number % 5 == 0)
			System.out.println(number + ", Buzz");
		else
			System.out.println(number + ", " + number);
	}

}
