import scmp.SCmp;


public class Main {
    public static void
    main(String[] args) {
        /*
        String testRegex
            = "(\\s|~|\\(|\\)|\\.|\\,|\\-|\\\\|\\*|\\&|\\||\\^|\\%|\\$|\\#|\\@|\\!|\\`|\\'|\\\"|\\?|\\/|\\>|\\<|\\_|\\+|\\=|\\[|\\]|\\{|\\})+";

        for (String is : rs)
            System.out.println(is);
        */

        String s0 = "김광석 그날들";
        String s1 = "그날들 - 김광석";
        float sim;
        SCmp scmp = new SCmp();
        scmp.setCmpParameter(s0, true, null);

        sim = scmp.similarity(s1);
        System.out.println("[" + sim + "]");
    }
}
