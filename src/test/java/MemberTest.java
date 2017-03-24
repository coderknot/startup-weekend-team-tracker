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

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member testMember1 = new Member("Chris");
    Member testMember2 = new Member("Jason");
    assertTrue(Member.all().contains(testMember1));
    assertTrue(Member.all().contains(testMember2));
  }
}
