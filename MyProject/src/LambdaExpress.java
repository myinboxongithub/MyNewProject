import java.lang.*;
public class LambdaExpress {

    public static void main(String[] args) {

        MyInterface myLambda=()->System.out.print("Hello World, I am lambda function");
        myLambda.display();
        AddTwoNumbers addTwo=(x,y)->x+y;
        int res=addTwo.add(5,6);
        System.out.print("Hello World="+ res);

        AddTwoNumbers addTwoValues= new AddTwoNumbers(){
                public int add(int a,int b)
                    {
                    return a+b;
                    }
          };

        System.out.print("Hello World="+ addTwoValues.add(12,13));
    }
}
