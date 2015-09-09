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
public class ValidatorCollectorTest {

    @Rule
    public ValidatorCollector validatorCollector = new ValidatorCollector();
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    /**
     * Assert True Tests
     */

    @Test
     public void testAssertTrueThatSucceedsWithoutMessage() {
        validatorCollector.assertTrue(true == true);
    }

    @Test
    public void testAssertTrueThatSucceedsWithMessage() {
        validatorCollector.assertTrue("Assertion Message", true == true);
    }

    @Test
    public void testAssertTrueThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(IsEmptyString.isEmptyOrNullString());

        validatorCollector.assertTrue(false == true);
    }

    @Test
    public void testAssertTrueThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        validatorCollector.assertTrue("Assertion Message", false == true);
    }

    /**
     * Assert False Tests
     */

    @Test
    public void testAssertFalseThatSucceedsWithoutMessage() {
        validatorCollector.assertFalse(false == true);
    }

    @Test
    public void testAssertFalseThatSucceedsWithMessage() {
        validatorCollector.assertFalse("Assertion Message", false == true);
    }

    @Test
    public void testAssertFalseThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(IsEmptyString.isEmptyOrNullString());

        validatorCollector.assertFalse(true == true);
    }

    @Test
    public void testAssertFalseThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        validatorCollector.assertFalse("Assertion Message", true == true);
    }

    /**
     * Assert Equals Tests
     */

    @Test
     public void testAssertEqualsThatSucceedsWithoutMessage() {
        validatorCollector.assertEquals(true, true);
    }

    @Test
    public void testAssertEqualsThatSucceedsWithMessage() {
        validatorCollector.assertEquals("Assertion Message", true, true);
    }

    @Test
    public void testAssertEqualsThatFailWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage("expected:<false> but was:<true>");

        validatorCollector.assertEquals(false, true);
    }

    @Test
    public void testAssertEqualsThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        validatorCollector.assertEquals("Assertion Message", false, true);
    }

    /**
     * Assert Not Equals Tests
     */

    @Test
    public void testAssertNotEqualsThatSucceedsWithoutMessage() {
        validatorCollector.assertNotEquals(false, true);
    }

    @Test
    public void testAssertNotEqualsThatSucceedsWithMessage() {
        validatorCollector.assertNotEquals("Assertion Message", false, true);
    }

    @Test
    public void testAssertNotEqualsThatFailWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage("Values should be different. Actual: true");

        validatorCollector.assertNotEquals(true, true);
    }

    @Test
    public void testAssertNotEqualsThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        validatorCollector.assertNotEquals("Assertion Message", true, true);
    }

    /**
     * Assert Null Tests
     */

    @Test
    public void testAssertNullThatSucceedsWithoutMessage() {
        validatorCollector.assertNull(null);
    }

    @Test
    public void testAssertNullThatSucceedsWithMessage() {
        validatorCollector.assertNull("Assertion Message", null);
    }

    @Test
    public void testAssertNullThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("expected null, but was:"));

        validatorCollector.assertNull(new Object());
    }

    @Test
    public void testAssertNullThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        validatorCollector.assertNull("Assertion Message", new Object());
    }

    /**
     * Assert Not Null Tests
     */

    @Test
    public void testAssertNotNullThatSucceedsWithoutMessage() {
        validatorCollector.assertNotNull(new Object());
    }

    @Test
    public void testAssertNotNullThatSucceedsWithMessage() {
        validatorCollector.assertNotNull("Assertion Message", new Object());
    }

    @Test
    public void testAssertNotNullThatFailsWithoutMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(IsEmptyString.isEmptyOrNullString());

        validatorCollector.assertNotNull(null);
    }

    @Test
    public void testAssertNotNullThatFailsWithMessage() {
        thrown.handleAssertionErrors();
        thrown.expect(AssertionError.class);
        thrown.expectMessage(StringStartsWith.startsWith("Assertion Message"));

        validatorCollector.assertNotNull("Assertion Message", null);
    }
}
