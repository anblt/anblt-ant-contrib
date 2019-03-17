package anblt.ant.contrib;
import static java.lang.System.out;
import junit.framework.TestCase;
import org.apache.tools.ant.BuildFileRule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.apache.tools.ant.AntAssert;
import org.apache.tools.ant.BuildException;
public class ChecksumSelectorTest extends TestCase {
    @Rule
    public final BuildFileRule buildRule = new BuildFileRule();
    @Before
    public void setUp() {
        buildRule.configureProject("build.xml");
    }
    @Test
    public void testVerify_Chksum1() {
        buildRule.executeTarget("verify_checksum1");
        assert(buildRule.getLog().matches("OK: .*/BA96F4EF673F1B372B99F9635C28CDDE49B7CC7B.html"));
        assert(buildRule.getLog().matches("OK: .*/DF4FE1F12FA617310671AFA491B3574BC52F57FD.html"));
        assert(buildRule.getLog().matches("OK: .*/F6EE6F37B37796C6F263328965F1B2843CB7CE83.html"));
    }
}
