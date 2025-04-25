package art;

import org.w3c.dom.ls.LSOutput;

public class Main {
    //속

    //생

    //기능

    public static void main(String[] args) {
        Art artA = new Art("gygim", "paint", 20000);
        Art artB = new Art("se", "brush");
        Art artC = new Art("dh","abc");

      
        //1. 기능 활용
        String nm = artA.nm();
        System.out.println("nm = " + nm);
        //아트 에이의 이름을 에이로 바꿈
        nm = artA.changeA("se");
        System.out.println("nm = " + nm);
        //아트 에이의 이름을 비로 바꿈
        nm = artA.changeA("dh");
        System.out.println("nm = " + nm);
        //아트 에이의 이름을 씨로 바꿈
        nm = artA.changeA("gygim");
        System.out.println("nm = " + nm);
        
        String artCmn = artC.getMemberName();

        //String mN = artA.mN(artA.mN());


        //1-2. 기능 활용_{세터(setter) 활용}

        // 1-3. 기능 활용_{게터(getter) 베이직}

    }
}
