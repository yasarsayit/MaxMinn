package java101;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {

		int[] valueList = { 13, 22, -4, 0, 25, 1, 3, 80, -32 };
		Scanner input = new Scanner(System.in);

		System.out.println("Dizi : " + Arrays.toString(valueList));

		System.out.print("Bir Sayı Giriniz : ");
		int number = input.nextInt();
		int min = number;
		int max = number;
		// Dizimizi küçükten büyüğe sıralıyoruz
		Arrays.sort(valueList);
		System.out.println("Sıralı : " + Arrays.toString(valueList));
		// En yakın büyük sayıyı bulma
		for (int item : valueList) {
			if (item > number) {
				max = item;
				break;
			}
		}
		// En yakın küçük sayıyı bulma
		for (int i = valueList.length - 1; i >= 0; --i) {
			if (valueList[i] < number) {
				min = valueList[i];
				break;
			}
		}

		System.out.println("En yakın büyük : " + max);
		System.out.println("En yakın küçük : " + min);
	}
}
