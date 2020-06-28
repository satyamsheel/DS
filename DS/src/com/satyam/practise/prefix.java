import java.util.Stack;
class prefix{
  public static int prec(char c){
    switch(c)
         {
         case '+':
         case '-':
             return 1;

         case '*':
         case '/':
             return 2;

         case '^':
             return 3;
         }
         return -1;
    }

  public static String infixToPostfix(String exp){
    String s=new String("");
    Stack<Character> stack=new Stack<>();

    for(int i=0;i<exp.length();i++){
      char c=exp.charAt(i);

      if(Character.isLetterOrDigit(c)){
        s=s+c;
      }
      else if(c=='('){
        stack.push(c);
      }
      else if(c==')'){
        while(!stack.isEmpty() && stack.peek()!='(')
          s=s+stack.pop();
          if(!stack.isEmpty() && stack.peek()!='('){
            return "Invalid";
          }else{
            stack.pop();
          }
      }
      else{
      while(!stack.isEmpty() && prec(c)<=prec(stack.peek())){
        if(stack.peek()=='(')
          return "Invalid";
          s=s+stack.pop();
      }
      stack.push(c);
    }
  }
    while(!stack.isEmpty()){
      if(stack.peek()=='(')
        return "invalid";
        s+=stack.pop();
    }
    return s;
}


  public static void main(String args[]){
    String exp = "a+b*(c^d-e)^(f+g*h)-i";
    System.out.println(infixToPostfix(exp));
  }
}
