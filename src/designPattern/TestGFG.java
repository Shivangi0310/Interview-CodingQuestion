package designPattern;

public class TestGFG {
    public static void main(String[] args) {
        GFG gfg1 = GFG.getInstance();
        GFG gfg2 = GFG.getInstance();
        System.out.println(gfg1);
        System.out.println(gfg2);
    }
}
