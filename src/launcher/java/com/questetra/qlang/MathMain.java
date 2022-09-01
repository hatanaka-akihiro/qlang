package com.questetra.qlang;

import org.graalvm.polyglot.Context;

public class MathMain {
    public static void main(String[] args) {
        String exp = "12+34+aa";
        Context cont = Context.create("mathlang");
        System.out.println(cont.eval("mathlang", exp));
    }
}