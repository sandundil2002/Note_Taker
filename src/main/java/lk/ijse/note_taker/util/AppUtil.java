package lk.ijse.note_taker.util;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.UUID;

public class AppUtil {

    public static String generateNoteID() {
        return "Note-"+UUID.randomUUID();
    }

    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    public static String generateUserID() {
        return "User-"+UUID.randomUUID();
    }

    public static String toBase64ProfilePic(byte[] profilePic) {
        return Base64.getEncoder().encodeToString(profilePic);
    }

}
