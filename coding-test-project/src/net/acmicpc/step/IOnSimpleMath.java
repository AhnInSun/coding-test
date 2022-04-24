package net.acmicpc.step;

public class IOnSimpleMath {

    public static String getCat() {
        /*

        "\    /\"
        " )  ( ')"
        "(  /  )"
        " \(__)|"
        */

        StringBuilder cat = new StringBuilder();
        cat.append("\\    /\\\n");
        cat.append(" )  ( ')\n");
        cat.append("(  /  )\n");
        cat.append(" \\(__)|\n");
        return cat.toString();
    }
}
