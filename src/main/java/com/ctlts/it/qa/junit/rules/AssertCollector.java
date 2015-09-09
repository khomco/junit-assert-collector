package com.ctlts.it.qa.junit.rules;

import org.junit.Assert;
import org.junit.rules.ErrorCollector;

import java.util.concurrent.Callable;

/**
 * Created by CenturyLink Technology Solutions.
 *
 * <p>
 * This is an extension of the {@link org.junit.rules.ErrorCollector}.  This class
 * contains a majority of the {@link org.junit.Assert} class methods. It is intended to provide cleaner
 * code when it is desired to conditionally collect AssertionErrors.  If an error is incurred when calling
 * methods on this class, the AssertionError will be collected and all errors will be reported at once.
 *
 * @author Keith.Homco
 */
public final class AssertCollector extends ErrorCollector {

    /**
     * Performs {@link Assert#assertTrue(String, boolean)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertTrue(String, boolean)
     */
    public void assertTrue(final String message, final boolean condition) {
        checkSucceeds(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Assert.assertTrue(message, condition);
                return message;
            }
        });
    }

    /**
     * Performs {@link Assert#assertTrue(boolean)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertTrue(boolean)
     */
    public void assertTrue(final boolean condition) {
        assertTrue(null, condition);
    }

    /**
     * Performs {@link Assert#assertFalse(String, boolean)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertFalse(String, boolean)
     */
    public void assertFalse(final String message, final boolean condition) {
        checkSucceeds(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Assert.assertFalse(message, condition);
                return message;
            }
        });
    }

    /**
     * Performs {@link Assert#assertFalse(boolean)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertFalse(boolean)
     */
    public void assertFalse(final boolean condition) {
        assertFalse(null, condition);
    }

    /**
     * Performs {@link Assert#assertEquals(String, Object, Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertEquals(String, Object, Object)
     */
    public void assertEquals(final String message, final Object expected, final Object actual) {
        checkSucceeds(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Assert.assertEquals(message, expected, actual);
                return message;
            }
        });
    }

    /**
     * Performs {@link Assert#assertEquals(Object, Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertEquals(Object, Object)
     */
    public void assertEquals(final Object expected, final Object actual) {
        assertEquals(null, expected, actual);
    }

    /**
     * Performs {@link Assert#assertNotEquals(String, Object, Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertNotEquals(String, Object, Object)
     */
    public void assertNotEquals(final String message, final Object first, final Object second) {
        checkSucceeds(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Assert.assertNotEquals(message, first, second);
                return message;
            }
        });
    }

    /**
     * Performs {@link Assert#assertNotEquals(Object, Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertNotEquals(Object, Object)
     */
    public void assertNotEquals(final Object first, final Object second) {
        assertNotEquals(null, first, second);
    }

    /**
     * Performs {@link Assert#assertNull(String, Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertNull(String, Object)
     */
    public void assertNull(final String message, final Object object) {
        checkSucceeds(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Assert.assertNull(message, object);
                return message;
            }
        });
    }

    /**
     * Performs {@link Assert#assertNull(Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertNull(Object)
     */
    public void assertNull(final Object object) {
        assertNull(null, object);
    }

    /**
     * Performs {@link Assert#assertNotNull(String, Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertNotNull(String, Object)
     */
    public void assertNotNull(final String message, final Object object) {
        checkSucceeds(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Assert.assertNotNull(message, object);
                return message;
            }
        });
    }

    /**
     * Performs {@link Assert#assertNotNull(Object)} and if it fails,
     * the error will be collected and test execution will continue.
     *
     * @see Assert#assertNotNull(Object)
     */
    public void assertNotNull(final Object object) {
        assertNotNull(null, object);
    }
}
