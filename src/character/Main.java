package character;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    //속성

    //생성자

    //기능
    public static void main(String[] args) {

        // JVM 메모리 영역 3가지
        // 1. Stack
        // 2. Heap
        // 3. Method Area(static)
        // 클래스 -> 객체(인스턴스): 객체화(인스턴스화)

        // 객체 생성


      Character character = new Character();
      Character characterA = new Character("se",1,"마법사");
      Character characterB = new Character("gygim");
      Character characterC = new Character("se","해리포터");
      Scanner scanner = new Scanner(System.in);
        // <기능 활용>

        // HEAP 의 상황...
        /// ---character-----
        // - name =
        // - level =
        // - jod =
        /// ---characterA-----
        // - name = "se"
        // - level = 1
        // - jod = "마법사"
        /// ---characterB-----
        // - name = "gygim"
        // - level = 1
        // - jod = "볼드모트"
        /// ------------------
        /// ---characterC-----
        // - name = "se"
        // - level = 2
        // - jod = "해리포터"
        /// ------------------

        //1. 기능 활용

        //1) 캐락터A가 attack = "이/가 마법을 씁니다." 라는 문구가 메인에 출력 되어 나옴
        String attack = characterA.playingMagicA("se");
        System.out.println("attack = " + attack);

        //2) 캐락터A가 리턴 값 없이 "se이/가 마법을 씁니다." 라는 문구가 나옴
        characterA.playingMagicB();


        //1-2. 기능 활용_{세터(setter) 활용}

        characterA.setLevel(8);





        //1-3. 기능 활용_{게터(getter) 베이직}

  }
}
