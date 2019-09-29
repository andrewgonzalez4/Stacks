package UPRM.EDU.ICOM4035;

public class main {

    public static void main(String[] args){
        ArrayStack Arithmetic = new ArrayStack<String>(10);
        String operation = "(9+x)";
        for (int i = 0; i < operation.length() ; i++) {
         if(operation.charAt(i) == '(') Arithmetic.push("(");
         else if(operation.charAt(i) == ')') Arithmetic.pop();
        }
        System.out.println(Arithmetic.isEmpty());
    }
}
