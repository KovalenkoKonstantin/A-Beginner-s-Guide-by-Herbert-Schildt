package chapter5_Операторы.Tasks;

// An improved XOR cipher.
class Encode_v2 {
    public static void main(String args[]) {
        String msg = "Тестовое сообщение";
        String encmsg = "";
        String decmsg = "";
        String key = "что-то написанное";

        System.out.print("Оригинальное сообщение: ");
        System.out.println(msg);

        int j = 1;
        for(int i=0; i < msg.length(); i++) {
            encmsg += (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==key.length()) j = 1;
        }
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        j = 1;
        for(int i=0; i < msg.length(); i++) {
            decmsg += (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==key.length()) j = 1;
        }
        System.out.print("Расшифрованнное сообщение: ");
        System.out.println(decmsg);
    }
}
