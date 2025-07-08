public class MailService {
    public static String send(String email){
        return "Book sending to "+email.substring(0, email.indexOf("@"));
    }
}
