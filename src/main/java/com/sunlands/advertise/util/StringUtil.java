package com.sunlands.advertise.util;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class StringUtil {
    public static void main(String[] args) {
        System.out.println(getAllCommonWord("我是中国人","是鸟国人"));
    }

    public static String  getAllCommonWord(String targetText, String comparedText) {
        String commonWords = "";
        for (int i = 0; i < targetText.length(); i++) {
            if (comparedText.contains(targetText.charAt(i) + "")) {
                commonWords += (targetText.charAt(i) + "");
            }
        }
        return commonWords;
    }
}
