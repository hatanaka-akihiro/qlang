package com.questetra.qlang;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.PolyglotException;
import org.junit.Assert;
import org.junit.Test;

public class AddNodeTest {
    @Test public void testExit() {
        try (Context context = Context.create()) {
            Assert.assertEquals("46", context.eval("mathlang", "12+34"));
        } catch (PolyglotException pe) {
            Assert.assertTrue(pe.isExit());
            Assert.assertEquals(5, pe.getExitStatus());
        }
    }
}
