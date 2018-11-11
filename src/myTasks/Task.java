package myTasks;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("asbdqw++qweads-SADdad*dsad");
		
		System.out.println("Начальная строка: " + str);
		
		char[] newCharStr = str.toCharArray();
		int counter = 0;

		for (int i = 0; i < newCharStr.length; i++) {
			if (newCharStr[i] == '+' || newCharStr[i] == '-' || newCharStr[i] == '*') {
				newCharStr[i] = ' ';
				counter++;
			}
		}

		String newStr = new String(newCharStr);
		newStr = newStr.replaceAll("\\s", "");

		System.out.println("Вариант 1:\nКол-во симолов в строке = " + counter);
		System.out.println("Строка: " + newStr);

		counter = 0;

		StringBuffer sb = new StringBuffer("asbdqw++qweads-SADdad*dsad");

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '+' || sb.charAt(i) == '-' || sb.charAt(i) == '*') {
				sb.deleteCharAt(i);
				counter++;
				i--;
			}
		}
		System.out.println("Вариант 2: \nКол-во символов в строке = " + counter);
		System.out.println("Строка: " + sb);
	}

}
