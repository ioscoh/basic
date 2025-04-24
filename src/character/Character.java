package character;

public class Character {
    //속성
    private String name;
    private int level;
    private String jod;
    //생성자
    public Character(String name, int level,String jod) {
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
    //기능

}
