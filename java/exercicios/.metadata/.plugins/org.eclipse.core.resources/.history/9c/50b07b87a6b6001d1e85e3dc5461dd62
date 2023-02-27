import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = input.nextLine();
        input.close();

        String strInvertida = inverteString(str);

        System.out.println("String invertida: " + strInvertida);
    }

    public static String inverteString(String str) {
        char[] chars = str.toCharArray();
        int tamanho = chars.length;

        for (int i = 0; i < tamanho/2; i++) {
            char temp = chars[i];
            chars[i] = chars[tamanho - i - 1];
            chars[tamanho - i - 1] = temp;
        }

        return new String(chars);
    }
}