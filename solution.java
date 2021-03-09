import java.io.*;
import static java.lang.Character.*;

public class JadenCase {

  public String toJadenCase(String phrase) {
    // TODO put your code below this comment
    
    if(phrase == null || phrase.isEmpty()){
      return null;
    }
    
    char[] c = phrase.toCharArray();
    c[0] = toUpperCase(c[0]);
    
    for (int i = 0; i < c.length; i++) {
      if (i != 0 && c[i-1] == ' ') {
        c[i] = toUpperCase(c[i]);
      }
    }
    phrase = new String(c);
    return phrase;
  }
}
