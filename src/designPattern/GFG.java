package designPattern;

public class GFG {
        // private instance, so that it can be
        // accessed by only by getInstance() method
        private static GFG instance;

        private GFG()
        {
            // private constructor
        }

        //synchronized method to control simultaneous access
        synchronized public static GFG getInstance()
        {
            if (instance == null)
            {
                // if instance is null, initialize
                instance = new GFG();
            }
            return instance;
    }
//
//    public static void main(String[] args) {
//        GFG gfg = new GFG();
//        GFG gfg1 = new GFG();
//        System.out.println(gfg);
//        System.out.println(gfg1);
//    }
}
