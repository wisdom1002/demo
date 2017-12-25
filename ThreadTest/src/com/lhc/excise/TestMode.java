package com.lhc.excise;

/**
 * Created by DELL on 2017/3/4.
 */
public class TestMode {

    public static void main(String[] args) {
        String  str = "1234";
        changeStr(str);
        TestMode mode = new TestMode();
        mode.doSomeThing();
        Order o = new Order();
        mode.testFinal(o);

        int a=0,c=0;
        /*do {
            c--;
            a=a-1;
            System.out.println("A:"+ a + " -- C:" + c);
        }while(a>0);*/

    }
    public static void changeStr(String str){
        str = "Waaa";
        //TestMode.doSomeThing();
    }

    public void testFinal(final Order o){
        o.i++;
        System.out.print("Order.i = " + o.i);
    }

    public String doSomeThing(){return "doSomeThing...";}

}

class Order{
    int i;
}
