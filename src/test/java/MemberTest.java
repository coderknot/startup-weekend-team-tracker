import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Before
  public void tearDown() {
    Member.clear();
  }

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

  @Test
  public void clear_emptiesAllMembersFromList_0() {
    Member testMember = new Member("Chris");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_getsMemberId_1() {
    Member testMember = new Member("Chris");
    assertEquals(1, testMember.getId());
  }

  @Test
  public void find_returnsMembersWithSameId_testMember2() {
    Member testMember1 = new Member("Chris");
    Member testMember2 = new Member("Jason");
    assertEquals(testMember2, Member.find(testMember2.getId()));
  }
}
