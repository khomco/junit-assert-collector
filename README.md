### junit-assert-collector

Java library I wrote to compliment a testing framework I developed while at Savvis/CenturyLink as primarily a tester.

This library essentially extends the JUnit library's ```org.junit.rules.ErrorCollector``` class and provides most, if not all of the 
JUnit ```assert``` methods.  Failures occurred during the use of this collector, while calling assertions, will result in the errors
being added to the underlying collector and not thrown until the test is complete. The use of this class cleans up your code tremendously.

Instead of:
```Java
@Rule
public ErrorCollector collector= new ErrorCollector();

if(someValue == false) {
  errorCollector.addError(new Throwable("someValue was false, expected true"));
}
```

You can do this:
```Java
@Rule
public AssertCollector assertCollector = new AssertCollector();

assertCollector.assertTrue(someValue);
```
