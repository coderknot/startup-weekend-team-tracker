import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member testMember = new Member("Chris");
    assertTrue(testMember instanceof Member);
  }

  @Test
  public void getName_getsMemberName_Chris() {
    Member testMember = new Member("Chris");
    assertEquals("Chris", testMember.getName());
  }
}
