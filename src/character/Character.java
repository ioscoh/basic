package character;

import java.util.Scanner;

public class Character {
    // 속성 = 변수로 표현할 수 있다.
    // 이름 "Steve", "John"
    // int: 정수(숫자)
    // String: 문자열
    // boolean: 논리(true, false)
    private String name;
    private int level;
    private String jod;
    private char op;
    //생성자 - 조립설명서
    // 1. 클래스 이름과 동일하다.
    // 2. 반환 데이터 타입이 존재하지 않는다.
    // 3. 여러개 존재할 수 있다.
    // 기본생성자
    public Character(){

    }

    public Character(String name, int level, String jod) {
        // 접근할 수 있는 변수의 개수는 몇개? 6
        this.name = name;
        this.level = level;
        this.jod = jod;
    }
    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.jod = "볼드모트";

    }
    public Character(String name, String jod) {
        this.name = name;
        this.level = 2;
        this.jod = jod;

    }
    //기능 - method
    //접근 제어자 > 반환 타입(필요시 작성) >기능의 이름 >필요시 매개변수

    //1. 기능 활용
    //1) 캐락터A: attack = "이/가 마법을 씁니다." 라는 문구가 메인에 출력 되어 나옴
    public String playingMagicA(String attack) {
        return attack + "이/가 마법을 쏩니다.";
    }
    //2) 캐락터A: 리턴 값 없이 "se이/가 마법을 씁니다." 라는 문구가 나옴
    public void playingMagicB() {
        String name = this.name;
        System.out.println(name + "이/가 마법을 쏩니다." );
    }
    //1-2. 기능 활용_{세터(setter) 활용}
    //1) 캐락터A: level이 5level이하면
    //          "(se)의 level이 5level이하면 다음으로 갈 수 없습니다."
    //           level이 5level이상이면
    //           "6 level 이상만 갈 수 있는 챕터로 이동합니다." 라는 문자열이 출력됨

    public void setLevel(int level) {

             if (level < 6) {
                 System.out.println("level 이 6 level 이하면 다음으로 갈 수 없습니다.");
             } else {
                 System.out.println("6 level 이상만 갈 수 있는 챕터로 이동합니다.");
                 this.level = level;
             }
         }




    //1-3. 기능 활용_{게터(getter) 베이직}
    public int getName() {
        return this.level;
    }

}
