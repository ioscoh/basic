package sport;

public class Sport {
    //속성
    private int a;
    public int b;
    private String nameA;
    private String nameB;
    private String eventA;
    private String eventB;
    //생성자
    public Sport(int a, String nameA, String eventA){
        this.a = a;
        this.nameA = nameA;
        this.eventA = eventA;
    }
    public Sport(int b, String nameB){
        this.b = b;
        this.nameB = nameB;
        this.eventB= "볼링";
    }
    //기능 a의 속성을 반환.
    //접근 제어자 > 반환 타입 >기능의 이름 >필요시 매개변수
    public int getA(){
       return a;
    }
}
