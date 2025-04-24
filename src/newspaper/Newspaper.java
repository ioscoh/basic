package newspaper;

public class Newspaper {
    //속성
    private int page;
    private String title;
    private   String headline;
    private   String content;
    //생성자
    public Newspaper(int page, String title){
        this.page = page;
        this.title = title;
        this.headline = headline;
    }
    public Newspaper(String headline){
        this.headline = headline;
    }
    public Newspaper(){
        this.content = "최대 초속 27m의 강한 바람에 의해 만들어진 이번 괴물 산불은 이상기후와 무관치 않다. " +
                "기후 지표를 종합해 산출하는 산불기상지수가 커지고 있는 만큼 산불 발생 확률은 더 높아지고 있다." +
                "        기후 지표를 종합해 산출하는 산불기상지수가 커지고 있는 만큼 산불 발생 확률은 더 높아지고 있다. "
               ;
    }
    //기능
}
