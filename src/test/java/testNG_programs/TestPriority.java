package testNG_programs;
import org.testng.annotations.Test;

public class TestPriority {
  @Test(priority=1)
  public void b_method() {
	  System.out.println("This is a B method");
  }
  @Test(priority=2)
  public void a_method() {
	  System.out.println("This is a A method");
  }
  @Test
  public void c_method() {
	  System.out.println("This is a C method");
  }
  @Test
  public void d_method() {
	  System.out.println("This is a D method");
  }
}
