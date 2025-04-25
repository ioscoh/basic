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
    //기능
    //접근 제어자 > 반환 타입(필요시 작성) >기능의 이름 >필요시 매개변수
    // 어울리는 기능 만들기(void, 반환데이터 존재하는것- return, 매개변수 활용)
    //1)멤버이름이 출력
//    public String mN(String memberName) {
//        String result = "se";
//        return result;
//    }

   public String changeA(String w) {
        this.memberName = w;
        return this.memberName;
   }
    public String changeB() {
        this.memberName = "b";
        return this.memberName;
    }
    public String changeC() {
        this.memberName = "C";
        return this.memberName;
    }



    public String nm() {
        this.memberName = "v";
      String nm = memberName;
      return memberName;
   }

    public String getMemberName() {
        return memberName;
    }



    //1. 기능 활용

    //1-2. 기능 활용_{세터(setter) 활용}

    // 1-3. 기능 활용_{게터(getter) 베이직}


}
