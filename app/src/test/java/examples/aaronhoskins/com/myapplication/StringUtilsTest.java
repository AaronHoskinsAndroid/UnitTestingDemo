package examples.aaronhoskins.com.myapplication;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StringUtilsTest {
    StringUtils stringUtils;
    Person mockPerson;

    @Before
    public void setup() {
        stringUtils = new StringUtils();
        mockPerson = mock(Person.class);
    }

    @Test
    public void testConcatTwoStrings() {
        final String testStringOne = "test1";
        final String testStringTwo = "test2";
        final String expectedResult = "test1test2";
        Assert.assertEquals(expectedResult, stringUtils.concatTwoStrings(testStringOne, testStringTwo));
    }

    @Test
    public void testStringProperLengthIsTrue() {
        final String testString = "Aaron";
        Assert.assertTrue(stringUtils.stringProperLength(testString));
    }

    @Test
    public void testStringProperLengthIsFalse() {
        final String testString = "Aa";
        Assert.assertFalse(stringUtils.stringProperLength(testString));
    }

    @Test
    public void testgetFullName() {
        final String firstName = "Aaron";
        final String lastName = "Hoskins";
        final String expectedResult = "Aaron Hoskins";

        when(mockPerson.getFirstName()).thenReturn(firstName);
        when(mockPerson.getLastName()).thenReturn(lastName);

        Assert.assertEquals(expectedResult, stringUtils.getFullName(mockPerson));
    }
}
