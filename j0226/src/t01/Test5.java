package t01;

public class Test5 {
	public static void main(String[] args) {
		int su=30;
		System.out.printf("숫자 : %d\n", su);
		
		int su2=50; //su2은 변수, 내가 선언한 50은 상수
		System.out.println("숫자2 : " + su2);
		
		int su3= 40, su4=4; //예약어는 변수로 사용할 수 없다. ex)public
		System.out.println("su="+su3+", su4"+su4);
		
		int su10 =555, su11=7; //사용하지 않는 병수는 선언 X
		System.out.println("su10 = "+ su10);
	}
}
