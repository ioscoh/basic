package calculator;

public class Calculator {
    //속
    private int a;
    private int b;
    private String op;

    //생
    public Calculator(int a,int b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;

}
    public Calculator() {

    }
    //기
    //1) 1,2를 더하는 기능
    public int sum(int a, int b) {
       int result = a + b;
       return result;
    }
    //2) 2,1를 빼는 기능
    public int sub() {
        this.a = 2;
        this.b = 1;
        int result = a - b;
        return result;
    }
    public int mul(int c,int d) {
        int result = c * d;
        return result;
    }
//    this.a = 3;
//        this.b = 3;//이 값을 주거나 메인()을 수정하거나
//    int mul = a * b;
//        System.out.println(  "a와 b를 곱합니다.");
//        System.out.println("mul = " + mul); //soutv 중복 가능
    //setter 활용
    public void setA(int a) {
        if(a>9) {
            System.out.println("9 이상의 숫자 금지");
        } else {
            this.a = a;
        }
    }

    public void setA(String op) {
        this.op = op;
        switch (op) {
            case "계산을 완료" :
                System.out.println("계산을 완료했습니다.");
                break;
            case "계산 Ver.2를 완료2" :
                System.out.println("계산Ver.2 를 완료했습니다.");
                break;
            case "계산 Ver.3를 완료3" :
                System.out.println("계산Ver.3 를 완료했습니다.");
                break;
            default:
                System.out.println("세번 이상의 한도를 초과");

        }
    }

    //getter

    public int getA() {
        return this.a;
    }
    public int getB() {
        return  this.b;
    }
    public String getOp() {
        return this.op;
    }
}
