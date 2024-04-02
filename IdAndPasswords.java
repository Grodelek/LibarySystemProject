import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class IdAndPasswords{
    HashMap<String,String> logininfo = new HashMap<>();
    IdAndPasswords(){
        logininfo.put("Artur","koty123");
        logininfo.put("Kacper","PASSWORD");
        logininfo.put("Ula","abc123");
    }
   protected HashMap getLoginInfo(){
        return logininfo;
    }

}
