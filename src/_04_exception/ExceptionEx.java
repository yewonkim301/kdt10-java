package _04_exception;

// 예외
// - 일반 예외 (Exception) : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
// - 실행 예외 (Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

// => Java 는 예외가 발생하면 예외 클래스로부터 객체 생성하며, 해당 갞체는 예외 처리시 사용됨
// 예외 발생 시 프로그램의 갑작스런 종료를 막고 정상 실행할 수 있도록 처리하는 코드를 예외 처리 코드라고 함
// try-catch-finally 블록으로 처리

import java.util.InputMismatchException;
import java.util.Scanner;

// try 블록에서 작성한 코드가 예외없이 정상 실행 -> catch 실행 x, finally 실행 o
// try 블록에서 작성한 코드에서 예외 발생 -> catch 실행 o, finally 실행 o
// 심지어 try, catch 블록에서 return 문을 사용해도 finally 실행됨 (생략 가능)
public class ExceptionEx {
    public static String divide(int x, int y) {
        return x + "/" + y + " = " + (x/y);
    }
    public static int getLength(String str) { return str.length(); }
    public static int getValueByIdx(int[] arr, int idx) { return arr[idx]; }
    public static void main(String[] args) {
        // case 1. 예외 발생 코드
        // System.out.println(divide(6, 0)); // java.lang.ArithmeticException

        // case 1. 예외 처리 코드
        try {
            System.out.println("*** 연산 시작 ***");
            System.out.println(divide(6, 0));
        } catch (ArithmeticException e) {
            // 예외 출력 방법
            // 방법 1 : 예외 발생한 이유만 보여줌
            System.out.println("나누기 중 에러 발생 >> " + e.getMessage()); // / by zero

            // 방법 2 : 예외 종류 리턴
            System.out.println("나누기 중 에러 발생 >> " + e.toString()); // java.lang.ArithmeticException: / by zero

            // 방법 3 : 예외가 어디서 발생했는지 추적한 내용 출력
            // e.printStackTrace();
            /*
             java.lang.ArithmeticException: / by zero
	         at _04_exception.ExceptionEx.divide(ExceptionEx.java:16)
	         at _04_exception.ExceptionEx.main(ExceptionEx.java:25)
            */
        } finally {
            System.out.println("*** 연산 종료 ***");
        }

        ////////////////////////////////////
        // case 2. 예외 발생 코드
        // System.out.println("단어 길이: " + getLength(null)); // java.lang.NullPointerException

        // case 2. 예외 처리 코드
        try {
            System.out.println("단어 길이: " + getLength(null));
        } catch (NullPointerException e) {
            System.out.println("단어 길이 연산 중 에러 발생 >> " + e.toString());
            // java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        }

        //////////////////////////////////////////
        // case 3. 예외 발생 코드
        int[] numbers = {10, 20, 30, 40, 50};
        // System.out.println(getValueByIdx(numbers, numbers.length)); // java.lang.ArrayIndexOutOfBoundsException

        // case 3. 예외 처리 코드
        try {
            System.out.println(getValueByIdx(numbers, numbers.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱싱 중 에러 발생 >> " + e.toString());
            // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }

        ///////////////////////////////////////////
        // case 4
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("정수를 입력하세요 : ");
        int number = scanner.nextInt();
        System.out.println("입력한 정수 : " + number);
        */
        // 사용자가 정수가 아닌 문자를 입력했을 떼
        // -> java.util.InputMismatchException 예러 발생

        try {
            System.out.println("정수를 입력하세요 : ");
            int number = scanner.nextInt();
            System.out.println("입력한 정수 : " + number);
        } catch (InputMismatchException e) {
            // 정수 이외의 값이 입력되면 에러 발생
            System.out.println("InputMismatchException 발생 : " + e.toString());
        }

    }
}
