package coffee;

public class Coffee {
    //속성
    private String cpName;
    private String cpType;
    //생성자
    public Coffee(String cpName,String cpType){
        this.cpName = cpName;
        this.cpType = cpType;
    }
    public Coffee(){
        this.cpName = "아메리카노";
        this.cpType = "ice";

    }
    //기능
}
