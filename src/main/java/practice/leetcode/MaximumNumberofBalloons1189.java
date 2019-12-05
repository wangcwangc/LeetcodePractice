package practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumberofBalloons1189 {


    public int maxNumberOfBalloons(String text) {
        char[] defaultBalloon = new char[]{'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        ArrayList<Character> balloon = new ArrayList<>();
        int size = text.toCharArray().length;
        for (char c : text.toCharArray()) {
            balloon.add(c);
        }
        boolean jump = false;
        while (!jump) {
            for (char c : defaultBalloon) {
                if (balloon.contains(c)) {
                    balloon.remove(new Character(c));
                } else {
                    jump = true;
                    break;
                }
            }
        }
        return (size - balloon.size()) / 7;
    }

    public static void main(String[] args) {
        MaximumNumberofBalloons1189 maximumNumberofBalloons1189 = new MaximumNumberofBalloons1189();
        System.out.println(maximumNumberofBalloons1189.maxNumberOfBalloons("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"));
    }
}
