package com.questetra.qlang;

import org.graalvm.polyglot.Context;
import org.junit.Assert;
import org.junit.Test;

public class WATextLangTest {
    @Test
    public void test1() {
        final String TEST = """
                (module
                  (func $main
                    (result i32)
                    i32.const 1
                  )
                )
                """;
        Context context = Context.create();
        Assert.assertEquals(1, context.eval("wat", TEST).asInt());
    }

    @Test
    public void test2() {
        final String TEST = """
                (module
                  (func $main
                    (result i32)
                    i32.const 123
                  )
                )
                """;
        Context context = Context.create();
        Assert.assertEquals(123, context.eval("wat", TEST).asInt());
    }
}