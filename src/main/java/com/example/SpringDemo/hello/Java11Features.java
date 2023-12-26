package com.example.SpringDemo.hello;

public class Java11Features {
    static int inty = 5;
    public static void main(String[] args) {
//       localLambdaVar();
//        strMethods();
//        strLines();
        strRepeat();
    }

    private static void strRepeat() {
        String str = "Hello ";
        System.out.println(str.repeat(5));
    }

    private static void strLines() {
      String str = """
                           Including a resume\s
                in a job posting.  
              Carefully read the        
              """;
        str.lines().forEach(System.out::println);
        str.lines().forEach(t->System.out.println(t.strip()));


    }

    private static void strMethods() {
        String emptyStr= "";  String str= "Hello";
        System.out.println(str.isBlank() +" "+str.isEmpty()); //false false
        System.out.println(emptyStr.isBlank() +" "+emptyStr.isEmpty()); //true true
        emptyStr= " ";
        System.out.println(emptyStr.isBlank() +" "+emptyStr.isEmpty()); //true false
    }

    public static void localLambdaVar(){
        var str="Hello";
        var localVar= 56;
        System.out.println(str);
        System.out.println(localVar);
        MyInterface add = (int x, int y) -> x+localVar;
        MyInterface sub = (var x, var y) -> x-inty;
        System.out.println(add.operate(4, 5));
        System.out.println(sub.operate(6 , 2));
    }
    public interface MyInterface {
        int operate(int a, int b);
    }
}