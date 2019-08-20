public class Main {
    public final static String A = "Значение глобальной константы метода";
    public final static String b = "Значенние локальной константы метода";
    public static void main(String[] args) {
        final String B = "Значенние локальной константы метода";
        String c = "Значение локальной переменной метода";
        System.out.println(A);
        System.out.println(b);
        System.out.println(B);
        System.out.println(c);        
    }
}
