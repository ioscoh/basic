package arithmeticTool;

public class ArithmeticTool {
    //속성
    private int a;
    private int b;
    private long c;
    private String d;
    private String op;
    //생성자
    public ArithmeticTool(int a,int b,String op){
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public ArithmeticTool(){

    }
    //기능
    //접근 제어자 > 반환 타입(필요시 작성) >기능의 이름 >필요시 매개변수
    // 어울리는 기능 만들기(void, 반환데이터 존재하는것- return, 매개변수 활용)

    // 1. 기능 활용
    //1)a,b가 더해짐
    public int sum(int a,int b) {
       int  result = a + b;
        System.out.println("result = " + result);
       return result;
    }
    //1)a,b가 void 로 뺴짐
    public void sud(int a) {
        this.a = a;
        this.b = 5;
        int sud = a - b;
        System.out.println("a와 b를 뺍니다.");
        System.out.println("result = " + sud);
    }
    //1)a,b가 void 로 곱해짐
    public void mul() {
        this.a = 5;
        this.b = 5;
        int mul = a * b;
        System.out.println("a와 b를 곱합니다.");
        System.out.println("mul = " + mul);
    }
    //1)a,b가 나누어짐
    public int div(int a,int b) {
        this.a = a;
        this.b = b;
        int result = a /b;
        System.out.println("result = " + result);
        return result;
    }

    //1-2. 기능 활용_{세터(setter) 활용}
    public void setA(int a) {
        if (a > 10) {
            System.out.println("10보다 큰 정수는 입력할 수 없습니다.");
        }
    }
    public void setB(String op) {
        this.op = "/";
        if (op.equals("/")) {
            System.out.println("나눗셈 기호입니다.");
        } else {
            System.out.println("나눗셈 기호가 아닙니다.");
        }
    }

    //1-3. 기능 활용_{게터(getter) 베이직}
    public int getA() {
        this.a = 031110;
        return this.a;
    }
    public long getC() {
        this.c = 031110;
        return this.c;
    }
    public String getD() {
        this.d = "031110";
        return this.d;
    }
}
