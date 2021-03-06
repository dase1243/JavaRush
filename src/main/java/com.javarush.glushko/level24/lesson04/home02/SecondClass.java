package com.javarush.glushko.level24.lesson04.home02;

public class SecondClass implements Action {   //second implementation
    public static String SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM = "\nSpecific action for anonymous SecondClass, param = ";

    private static String SECOND_CLASS_METHOD_STRING = "class SecondClass, method someAction";
    protected StringBuilder sb = new StringBuilder(SECOND_CLASS_METHOD_STRING);

    public SecondClass() {
        Solution.countActionObjects++;
    }

    public void someAction() {
        System.out.println(sb.toString());
    }
}
