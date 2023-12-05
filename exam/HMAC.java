import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.util.Base64;
import java.util.Scanner;

public class HMAC {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your secret key: ");
            String secretKey = scanner.nextLine();

            System.out.print("Enter your message: ");
            String message = scanner.nextLine();

            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(), "HmacSHA512");

            Mac hmacSha256 = Mac.getInstance("HmacSHA256");
            hmacSha256.init(secretKeySpec);
            byte[] hmacBytes = hmacSha256.doFinal(message.getBytes());
            String hmacBase64 = Base64.getEncoder().encodeToString(hmacBytes);

            System.out.println("Message: " + message);
            System.out.println("HMAC (Base64): " + hmacBase64);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
