package wedsite;

public class Wedsite {
    //속성
    private String wsName;
    private String mbName;
    private String mbContent;
    //생성자
    public Wedsite( String wsName,String mbName){
        this.wsName = wsName;
        this.mbName = mbName;
    }
    public Wedsite(){
        this.mbContent = "재밌어요.";
    }
    //기능
}
