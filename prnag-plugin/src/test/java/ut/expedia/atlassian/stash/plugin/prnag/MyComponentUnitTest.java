package ut.expedia.atlassian.stash.plugin.prnag;

import org.junit.Test;
import expedia.atlassian.stash.plugin.prnag.api.MyPluginComponent;
import expedia.atlassian.stash.plugin.prnag.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}