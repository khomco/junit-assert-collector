package com.ctlts.it.qa.junit.rules;

import org.hamcrest.core.StringStartsWith;
import org.hamcrest.text.IsEmptyString;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by CenturyLink Technology Solutions.
 *
 * @author Keith.Homco
 */
public class AssertCollectorTest {

    @Rule
    public AssertCollector assertCollector = new AssertCollector();
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    /**
     * Assert True Tests
     */

    @Test
     public void testAssertTrueThatSucceedsWithoutMessage() {
        assertCollector.assertTrue(true == true);
    }

    @Test
    public void testAssertTrueThatSucceedsWithMessage() {
        assertCollector.assertTrue("Assertion Message", true == true);
    }

    @Test
    public void testAssertTrueThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(IsEmptyString.isEmptyOrNullString());

        assertCollector.assertTrue(false == true);
    }

    @Test
    public void testAssertTrueThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        assertCollector.assertTrue("Assertion Message", false == true);
    }

    /**
     * Assert False Tests
     */

    @Test
    public void testAssertFalseThatSucceedsWithoutMessage() {
        assertCollector.assertFalse(false == true);
    }

    @Test
    public void testAssertFalseThatSucceedsWithMessage() {
        assertCollector.assertFalse("Assertion Message", false == true);
    }

    @Test
    public void testAssertFalseThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(IsEmptyString.isEmptyOrNullString());

        assertCollector.assertFalse(true == true);
    }

    @Test
    public void testAssertFalseThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        assertCollector.assertFalse("Assertion Message", true == true);
    }

    /**
     * Assert Equals Tests
     */

    @Test
     public void testAssertEqualsThatSucceedsWithoutMessage() {
        assertCollector.assertEquals(true, true);
    }

    @Test
    public void testAssertEqualsThatSucceedsWithMessage() {
        assertCollector.assertEquals("Assertion Message", true, true);
    }

    @Test
    public void testAssertEqualsThatFailWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage("expected:<false> but was:<true>");

        assertCollector.assertEquals(false, true);
    }

    @Test
    public void testAssertEqualsThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        assertCollector.assertEquals("Assertion Message", false, true);
    }

    /**
     * Assert Not Equals Tests
     */

    @Test
    public void testAssertNotEqualsThatSucceedsWithoutMessage() {
        assertCollector.assertNotEquals(false, true);
    }

    @Test
    public void testAssertNotEqualsThatSucceedsWithMessage() {
        assertCollector.assertNotEquals("Assertion Message", false, true);
    }

    @Test
    public void testAssertNotEqualsThatFailWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage("Values should be different. Actual: true");

        assertCollector.assertNotEquals(true, true);
    }

    @Test
    public void testAssertNotEqualsThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        assertCollector.assertNotEquals("Assertion Message", true, true);
    }

    /**
     * Assert Null Tests
     */

    @Test
    public void testAssertNullThatSucceedsWithoutMessage() {
        assertCollector.assertNull(null);
    }

    @Test
    public void testAssertNullThatSucceedsWithMessage() {
        assertCollector.assertNull("Assertion Message", null);
    }

    @Test
    public void testAssertNullThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("expected null, but was:"));

        assertCollector.assertNull(new Object());
    }

    @Test
    public void testAssertNullThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        assertCollector.assertNull("Assertion Message", new Object());
    }

    /**
     * Assert Not Null Tests
     */

    @Test
    public void testAssertNotNullThatSucceedsWithoutMessage() {
        assertCollector.assertNotNull(new Object());
    }

    @Test
    public void testAssertNotNullThatSucceedsWithMessage() {
        assertCollector.assertNotNull("Assertion Message", new Object());
    }

    @Test
    public void testAssertNotNullThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(IsEmptyString.isEmptyOrNullString());

        assertCollector.assertNotNull(null);
    }

    @Test
    public void testAssertNotNullThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        assertCollector.assertNotNull("Assertion Message", null);
    }
}
