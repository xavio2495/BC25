package slandererinf;

public class Main {

    final static int MAX = 1000;

    static class Calculator{

        int f(double x){
            return 50*((int)((x + 1.5*x*Math.exp(-0.001*x))/50.0));
        }

        void run(){
            int cont = 0;
            for (int i = 0; i < 6000; ++i){
                int a = f(i) - i;
                if (a > cont) {
                    cont = a;
                    //System.out.println(i + ",");
                }
            }
        }



    }




    public static void main(String[] args){
        Calculator c = new Calculator();
        c.run();
    }



}
