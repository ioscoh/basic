package library;

public class Main {
    //속성

    //생성자

    //기능
    public static void main(String[]args){
        Library library = new Library("사실은 이것도 디자인 입니다.");
        Library library1 = new Library();
        Library libraryB = new Library(1,2,3);
        Library libraryC = new Library(1,2);
        Library libraryD = new Library('1');
    }
}
