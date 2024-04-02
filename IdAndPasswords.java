import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class IdAndPasswords{
    HashMap<String,String> logininfo = new HashMap<>();
    IdAndPasswords(){
        logininfo.put("Artur","kot123");
        logininfo.put("Ola","PASSWORD");
        logininfo.put("Ula","abc123");
        logininfo.put("admin","root");
    }
   protected HashMap getLoginInfo(){
        return logininfo;
    }
}
