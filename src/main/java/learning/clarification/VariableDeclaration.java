package learning.clarification;

public class VariableDeclaration {
    static int c;
    static Integer d;
    int a;
    Integer b;

    public static void main(String[] args) {
        int e;
        Integer f;
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        System.out.println("int :" + variableDeclaration.a);
        System.out.println("Integer :" + variableDeclaration.b);

        System.out.println("static int :" + VariableDeclaration.c);
        System.out.println("static Integer :" + VariableDeclaration.d);

//         Gives compilation error
//        System.out.println("Inside method int :"+ e);
//        System.out.println("Inside method Integer :"+ f);
    }
}
