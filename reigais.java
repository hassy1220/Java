public class reigais {
    public static void main(String[] args) {
        
        System.out.println("Hello World");

        try {
            int number = Integer.parseInt(args[0]);
            int answer = 100 / number;
            System.out.println(answer);
        } catch (NumberFormatException e) {
            System.err.println("文字列を数値に変換できません。");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.err.println("0では割り算できません。");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("例外を補足しました");
            e.printStackTrace();
        } finally {
            System.out.println("Hello Java");
        }
    }
}
