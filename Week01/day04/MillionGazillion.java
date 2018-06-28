
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;

import static org.junit.Assert.*;

public class Solution {

    // implement a trie and use it to efficiently store string
    

    static class Trie {
        
        public ArrayList<String> al=new ArrayList<String>();
        
        public boolean addWord(String word) {
            
            if(al.contains(word))
                return false;
            else{
                al.add(word);
            }
            return true;
                
        }
    }


    // tests

    @Test
    public void trieTest() {
        final Trie trie = new Trie();

        boolean result = trie.addWord("catch");
        assertTrue(result);

        result = trie.addWord("cakes");
        assertTrue(result);

        result = trie.addWord("cake");
        assertTrue(result);

        result = trie.addWord("cake");
        assertFalse(result);

        result = trie.addWord("caked");
        assertTrue(result);

        result = trie.addWord("catch");
        assertFalse(result);

        result = trie.addWord("");
        assertTrue(result);

        result = trie.addWord("");
        assertFalse(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
