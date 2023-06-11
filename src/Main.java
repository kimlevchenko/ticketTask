public class Main {
    public static void main(String[] args) {

        String s = "Hello!";
        if (s.isEmpty()) {
            System.out.println("В строке нет данных!");
        } else if (s.length() % 2 != 0) {
            System.out.println("Строку нельзя разделить ровно пополам - количество символов нечетное!");
        } else {
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2, s.length());
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}