
// �������� ��������, ����� ��������� ����� ����� �� ���� �������� �� ����.
//������������ ������ �� ������ ������ ����� � ��������a[1;9]. 
//��� ������� �� � ��������� [1;3], �������� �� �� 5. 
//��� ������� �� � ��������� [4;6], �������� �� �� 10. 
//��� ������� �� � ��������� [7;9], �������� �� �� 50. 
//���������� �������� �� ������.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("�������� �� ������?:");
		int number = in.nextInt();

		if (1 <= number && number <= 3) {
			int result = number * 5;
			System.out.println("����� �����:" + result);

		}
		if (4 <= number && number <= 6) {
			int result = number * 10;
			System.out.println("����� �����:" + result);
	}
		if (7 <= number && number <= 9) {
			int result = number * 50;
			System.out.println("����� �����:" + result);
}
		if (1 < number && number >9){
			System.out.println("�������� �������� � �������� �� 1 �� 9!");
			
		}
}
}