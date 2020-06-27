/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitact;

import java.util.StringTokenizer;

/**
 *
 * @author Charlton
 */
public class SplitAct {
public static String addLinebreaks(String input, int maxLineLength) {
    StringTokenizer tok = new StringTokenizer(input, " ");
    StringBuilder output = new StringBuilder(input.length());
    int lineLen = 0;
    while (tok.hasMoreTokens()) {
        String word = tok.nextToken()+" ";

        if (lineLen + word.length() > maxLineLength) {
            output.append("\n");
            lineLen = 0;
        }
        output.append(word);
        lineLen += word.length();
    }
    return output.toString();
}
    public static void main(String[] args) {
        String Txt="The country is about be openned soon. Just keep calm so that we can flatten the coronavirus curve man.";
        int mL=40;
        System.out.println(addLinebreaks(Txt, mL));
    }
    
}
