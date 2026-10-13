package Learnings.Java;

import java.util.Arrays;
import java.util.List;

public class Langages {
    public static void main(String[] args) {
        List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript");
        for (String nomDUnLangage : nomsDesLangages) {
            System.out.println(nomDUnLangage);
        }
    }
}