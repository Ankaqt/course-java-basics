package com.rakovets.course.javabasics.practice.strings;

public class StringUtil {
    public String getConcat(String str1, String str2) {
        return str1.concat(str2);
    }

    public int getIndex(String str1, String str2) {
        return str1.indexOf(str2);
    }

    public boolean getEquals(String str1, String str2) {

        return str1.equals(str2);
    }

    public String getUpperAndTrim(String str1) {

        return str1.trim().toUpperCase();
    }

    public String getReplace(String str1) {

        return str1.replace(":(", ":)");
    }

    public String getSubstring(String str1) {
        if (str1.length() < 10) {
            return "<10";
        }
        String str2 = str1.substring(10);
        if (str2.length() > 23) {
            String str3 = str2.substring(0, 23);
            return str3;
        } else {
            return str2;
        }
    }

    public boolean getStartEnd(String string, String word) {
        if (string.startsWith(word) && string.endsWith(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int getCountVowels(String str1) {
        int count = 0;
        char array[] = new char[str1.length()];
        str1.getChars(0, array.length, array, 0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u' || array[i] == 'A' || array[i] == 'E' || array[i] == 'I' || array[i] == 'O' || array[i] == 'U')
                count++;
        }
        return count;
    }

    public int getCountSigns(String str1) {
        int count = 0;
        char array[] = new char[str1.length()];
        str1.getChars(0, array.length, array, 0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '.' || array[i] == ',' || array[i] == '!' )
                count++;
        }
        return count;
    }

    public String getRevers(String str1) {
        StringBuilder str2 = new StringBuilder(str1);
        return str2.reverse().toString();

    }

    public int getCountWords(String str1) {
        int count = 0;
        String[] words = str1.trim().replaceAll(" +", " ").split(" +");
        for (String word : words) {
            count++;
        }
        return count;
    }

    public String getFullName(String str1) {
        String[] array = str1.split(" +");
        String result = "";
        for (String str2 : array) {
            result += str2.charAt(0) + ".";
        }
        return result.toUpperCase();
    }
    public String getStringOfNumbers (String str1) {
            char[] array = str1.toCharArray();
            String result = "";
            for (char text : array) {
                if (Character.isDigit(text))
                    result += text;
            }
            return result;
    }
}


