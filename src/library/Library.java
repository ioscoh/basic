package library;

public class Library {
    //속성
    private String bookname;
    private int booknum1;
    private int booknum2;
    private int booknum3;
    private char op;
    //생성자
    public Library(String bookname){
        this.bookname = bookname;
    }
    public Library(){
        this.bookname = "양파 공동체";
    }
    public Library(int booknum1,int booknum2, int booknum3){
        this.booknum1 = booknum1;
        this.booknum2 = booknum2;
        this.booknum3 = booknum3;
    }
    public Library(int booknum1,int booknum2){
        this.booknum1 = booknum1;
        this.booknum2 = booknum2;
        this.booknum3 = 3;
    }
    public Library(char op){
        this.op = op;
    }
    //기능
}
