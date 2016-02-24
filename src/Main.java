
// Напишете програма, която изчислява бонус точки на база резултат от игра.
//Потребителят трябва да въведе своите точки в интервалa[1;9]. 
//Ако точките са в интервала [1;3], умножете ги по 5. 
//Ако точките са в интервала [4;6], умножете ги по 10. 
//Ако точките са в интервала [7;9], умножете ги по 50. 
//Резултатът изведете на екрана.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Резултат от играта?:");
		int number = in.nextInt();

		if (1 <= number && number <= 3) {
			int result = number * 5;
			System.out.println("Бонус точки:" + result);

		}
		if (4 <= number && number <= 6) {
			int result = number * 10;
			System.out.println("Бонус точки:" + result);
	}
		if (7 <= number && number <= 9) {
			int result = number * 50;
			System.out.println("Бонус точки:" + result);
}
		if (1 < number && number >9){
			System.out.println("Въведете резултат в интервал от 1 до 9!");
			
		}
}
}