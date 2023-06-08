package com.shopping.chocomart.Misc.lamdas;

import java.util.Date;
import java.util.Random;
import java.util.function.*;
import java.util.function.Predicate;

public class PredicateAndFunction {

    public static void main(String Args[]){

       /* Pre defined Functional INTERFACE
         1. Predicate => one argument that indicates input==> only conditional check==>boolean return type.
         2. Function => 2 arguments->1  indicates input,other is output==> perform operation
         3. Consumer => one argument that indicates input==>  perform operstion and return void
         4. Supplier  ==>1 arg=>  no input value ===> interface Supplier <R>{}   =>>>>R is RETURN TYPE (as no input accepted)
         useCase----> systemDate ||| OTP generation   ==>only has get() method
         4. biPredicate
         5. biFunction
         6. *****BiSupplierr -->does NOT EXIST---> as it only has get() method & wont take any args
         *****ALL above are for wrapper object types(integer) and NOT primitive(int)==> when processing--
         definitely conversions are required ==>nanos ---performance issues
              Use PRIMITIVE VERSION OF FUNCTIONAL INTERFACE to avoid above issue
              Predicate<Integer> ===> replace with "IntPredicate"
              AutoBoxing (int to Integer conversion |||)
              Unboxing --> "integer to int


          7.UnaryOperator =>Function<Integer,Integer> ==> i.e input and output type are same==>use unary operator

           */

        System.out.println("PredicateUsage limited to COnditional check-> only true or flase" +
                "**** Remember that Predicate is Pre-Defined Lamda Function****");
        Predicate<Integer> p= i-> i%2==0;
        System.out.println("Given number is even"+p.test(10)); //use predicate.test() method


            //Function: second pre defined lamda function
        System.out.println("function helps perform operations ");
        /*find square of given number*/
        Function<Integer,Integer> f= i->i*i;
        System.out.println("Square of given number is:"+  f.apply(25)); //use function.apply() method

        //determine length of string using Function
        Function<String,Integer> stringLengthFunction= s->s.length();
        System.out.println("Length of given string is:"+stringLengthFunction.apply("Akirah"));
        //chaining
        Function<Integer,Integer> f2= i->i+i;
        System.out.println("andThen usage=> first function, then second:"+  f.andThen(f2).apply(2));
        System.out.println("compose usage=> second function, then first:"+  f.compose(f2).apply(2));


        System.out.println("consumer will perform operations and always return void-->" +
                " like object manipulation & storing to db");
        Consumer<String> c = s-> System.out.println(s);
        c.accept("ConsumerTest1");
        c.accept("ConsumerTest2");
        //can also be chained
        Consumer<String> c2 = s-> System.out.println(s+"i am second consumer");
        Consumer<String> cc= c.andThen(c2);
        cc.accept("ConsumerChainingTest");

        //1. Sysdate
        Supplier<Date> sysDate= ()-> new Date();
        System.out.println("Supplier=> pre defined functional interface eg1: "+sysDate.get());

        //2. do OTP generation Algorithm here
        Supplier<Integer> otpSupplier= ()->{
            Random rand=new Random();
            int i= rand.nextInt(900000)+100000;
            System.out.println(i);
            return i;
        };
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();
        otpSupplier.get();


        // BiPredicate
        //BiFunction




    }
}


