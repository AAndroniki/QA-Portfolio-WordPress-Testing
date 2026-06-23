import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorld {

  @BeforeEach
  public void setup () {
      System.out.println("run before");
  }

  @Test

public void hello (){
        System.out.println("hello");
    }

@AfterEach
    public void tearDown() {
    System.out.println("run after test");
}
}