package utility;

import java.util.Base64;

public class TextManager {
    public String DecodeText(String text){
        if(text == "" || text == null){
            return " ";
        }
        byte[] actualByte = Base64.getDecoder().decode(text);
        String actualString = new String(actualByte);
        return actualString;
    }
}
