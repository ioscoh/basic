package art;

public class Art {
    //속
    private String memberName;
    private String toolName;
    private long  price;

    //생
    public Art(String memberName, String toolName, long  Price){
        this.memberName = memberName;
        this.toolName = toolName;
        this.price = price;
    }
    public Art(String memberName, String toolName){
        this.memberName = memberName;
        this.toolName = toolName;
        this.price = 15000;
    }
    //기

}
