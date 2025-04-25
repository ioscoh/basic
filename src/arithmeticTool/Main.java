package arithmeticTool;

public class Main {
    //속성

    //생성자

    //기능
    public static void main(String[]args){
        ArithmeticTool arithmeticTool = new ArithmeticTool(1,2,"op");
        ArithmeticTool arithmeticToolA = new ArithmeticTool();

    //1. 기능 활용
        System.out.println("a와 b를 더합니다.");
        arithmeticTool.sum(5,5);//매개변수에 인트값을 하나만 넣으니,
                                 // 위에 정의 된 int 값이 내려와 더해짐
        arithmeticTool.sud(10);

        arithmeticTool.mul();

        System.out.println("a와 b를 나눕니다.");
        arithmeticTool.div(10,5);
    //1-2. 기능 활용_{세터(setter) 활용}
        arithmeticTool.setA(11);
        arithmeticTool.setB("+");

    // 1-3. 기능 활용_{게터(getter) 베이직}
        arithmeticTool.getA();
        System.out.println(arithmeticTool.getA());

        arithmeticTool.getC();
        System.out.println(arithmeticTool.getC());
        //031110이 출력이 안됐던 이유는
        //앞에 0이 붙으면 8진수라는 수학젹 계념이 작동돼서
        //031110의 8진수인 12872이 작동 됐던것!
        //즉 인트에서도 사실 오류난 것이 아니라 잘 계산된거였음
        //이를 해결하기 위해서 스트링을 쓰면 문제 해결됨.
        arithmeticTool.getD();
        System.out.println(arithmeticTool.getD());
    }
}
