package seminar03;
/* Даны следующие строки:
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String ("hello");
String s6 = new String (new char[]{'h','e','l','l','o'});
Сравнить их с помощью == и метода equals() класса Object
 */
public class task01 {
    public static void main(String[] args) {
        ex0();
    }
    static void ex0(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String ("hello");
        String s6 = new String (new char[]{'h','e','l','l','o'});
        System.out.print(s1 == s2); System.out.print(" -> "); System.out.println(s1.equals(s2));
        System.out.print(s1 == s3); System.out.print(" -> "); System.out.println(s1.equals(s3));
        System.out.print(s1 == s4); System.out.print(" -> "); System.out.println(s1.equals(s4));
        System.out.print(s1 == s5); System.out.print(" -> "); System.out.println(s1.equals(s5));
        System.out.print(s1 == s6); System.out.print(" -> "); System.out.println(s1.equals(s6));
    }
}