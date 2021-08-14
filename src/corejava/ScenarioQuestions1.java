package corejava;

public class ScenarioQuestions1 {

    String str;

    public ScenarioQuestions1(String str) {
        this.str = str;
    }

    public static void test(Integer a){
        System.out.println("inside string");
        System.out.println(a);
    }
    public static void test(Object o){
        System.out.println("inside object");
        System.out.println(o);
    }
    public static void passByValue(int x){
        x=x*10;
    }
    public static void passByReference(ScenarioQuestions1 s){
        s.str="yashu";
    }
    public static void main(String[] args) {
        test(null);
       int x=10;
       passByValue(x);
        System.out.println(x);
        ScenarioQuestions1 scenarioQuestions1 = new ScenarioQuestions1("aakash");
        passByReference(scenarioQuestions1);
        System.out.println(scenarioQuestions1.str
        );
    }
}
