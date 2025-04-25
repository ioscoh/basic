package calculator;

import java.util.Scanner;

public class Main {
    //속

    //생

    //기
    public static void main(String[]args){
        Calculator calculatorA = new Calculator(1,2,"op");
        Calculator calculatorB = new Calculator();
        Scanner scanner = new Scanner(System.in);

        int sum = calculatorA.sum(1,2);
        System.out.println("sum = " + sum);
        
        int sub = calculatorA.sub();
        System.out.println("sub = " + sub);
//터마널에서 정수 두개를 곱
        //1)터미널에서 입력값을 받게
        //2)
        //출력
        System.out.println("첫번째 숫자를 입력하세요.");
        int mul = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int mul2 = scanner.nextInt();
        int result = calculatorA.mul(mul,mul2);//계산기 클래스에 곱하기 기능을 실현
        System.out.println("result = " + result);


//        int mul = calculatorA.mul(5,5);
//        System.out.println("mul = " + mul);




    //setter
//        calculatorA.setA(10);
//
//        calculatorA.setA("계산을 완료");
//        calculatorA.setA("계산 Ver.2를 완료2");
//        calculatorA.setA("계산 Ver.3를 완료3");
//        calculatorA.setA("계산 Ver.4를 완료4");//호출 여러번 해줘야 함
//
//    //getter
//        calculatorA.getA();
//        System.out.println(calculatorA.getA());
//
//        calculatorB.getB();
//        System.out.println(calculatorA.getB());//왜 1이 반한?

    }


    }


