import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testItemCreated() {
    Item item = new Item(800, 0.10);
    
    assertEquals(800.0, item.price);
    assertEquals(0.10, item.discount);
  }
  
  public void testChangeNoDiscount() {
    Item item = new Item(800, 0.10);
    
    assertEquals(800.0, item.salePrice1000());
  }
  
  public void testChangeDiscount() {
    Item item = new Item(1500, 0.10);
    
    assertEquals(1350.0, item.salePrice1000());
  }
  
  public void testComputeSalePrice() {
    Item item = new Item(800, 0.10);
    
    assertEquals(720.0, item.computeSalePrice());
  }
  
  public void testSalePrice1000() {
    Item item = new Item(1500, 0.10);
    Item item2 = new Item(1000, 0.10);
    
    assertEquals(1350.0, item.salePrice1000());
    assertEquals(1000.0, item2.salePrice1000());
  }
}