package eg.edu.alexu.csd.datastructure.linkedList.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;
import eg.edu.alexu.csd.datastructure.linkedList.cs25.SingleLinkedList;
import eg.edu.alexu.csd.datastructure.linkedList.cs25.SingleNode;

import org.junit.Test;

/**
 * Assignment 4 : Test SingleLinkedList.
 * @author Bishoy Nader
 */
public class TestSingle {

  /**
   * Constant.
   */
  private static final int CONST_4 = 4;
  /**
   * Constant.
   */
  private static final int CONST_3 = 3;

  /**
   * Basic test.
   */
  @Test
  public void testEmpty() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    assertEquals(0, emptyNode.size());
    SingleLinkedList oneElement = new SingleLinkedList();
    SingleNode node = new SingleNode("test");
    oneElement.add(node);
    assertEquals(1, oneElement.size());
    oneElement.clear();
    assertEquals(0, oneElement.size());
    oneElement.add(node);
    oneElement.remove(0);
    assertEquals(0, oneElement.size());
  }

  /**
   * Basic test.
   */
  @Test
  public void testAddGet() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    emptyNode.add("test1");
    emptyNode.add("test3");
    emptyNode.add(1, "test2");
    Object o1 = emptyNode.get(0);
    assertEquals(CONST_3, emptyNode.size());
    assertEquals("test1", o1);
    assertEquals("test2", emptyNode.get(1));
    assertEquals("test3", emptyNode.get(2));
  }

  /**
   * Basic test.
   */
  @Test
  public void testGet() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    emptyNode.add("test1");
    emptyNode.add("test2");
    emptyNode.add("test3");
    emptyNode.add("test4");
    emptyNode.add("test5");
    emptyNode.add("test6");
    assertEquals("test1", emptyNode.get(0));
    assertEquals("test2", emptyNode.get(1));
    SingleLinkedList shortNode = new SingleLinkedList();
    shortNode.add(0);
    shortNode.add(1);
    shortNode.add(CONST_4);
    assertEquals(0, shortNode.get(0));
  }

  /**
   * Basic test.
   */
  @Test
  public void testSet() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    emptyNode.add("test1");
    emptyNode.add("test3");
    emptyNode.add(1, "test2");
    emptyNode.set(1, "newTest2");
    assertEquals("newTest2", emptyNode.get(1));
  }

  /**
   * Basic test.
   */
  @Test
  public void testRemove() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    emptyNode.add("test1");
    emptyNode.add("test3");
    emptyNode.add(1, "test2");
    emptyNode.remove(2);
    assertEquals("test1", emptyNode.get(0));
    assertEquals("test2", emptyNode.get(1));
    assertEquals(2, emptyNode.size());
    emptyNode.clear();
    emptyNode.add("test1");
    emptyNode.add("test3");
    emptyNode.add(1, "test2");
    emptyNode.remove(0);
    assertEquals("test2", emptyNode.get(0));
    assertEquals("test3", emptyNode.get(1));
    assertEquals(2, emptyNode.size());
  }

  /**
   * Basic test.
   */
  @Test
  public void testClear() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    emptyNode.add("test1");
    emptyNode.add("test3");
    emptyNode.add(1, "test2");
    emptyNode.clear();
    assertEquals(0, emptyNode.size());
    assertNull(emptyNode.head.next);
  }

  /**
   * Basic test.
   */
  @Test
  public void testSubList() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    emptyNode.add("test1");
    emptyNode.add("test2");
    emptyNode.add("test3");
    emptyNode.add("test4");
    emptyNode.add("test5");
    emptyNode.add("test6");
    ILinkedList newList = emptyNode.sublist(1, CONST_4);
    assertEquals(CONST_4, newList.size());
    assertEquals("test2", newList.get(0));
    assertEquals("test3", newList.get(1));
    assertEquals("test4", newList.get(2));
    assertEquals("test5", newList.get(CONST_3));
  }

  /**
   * Basic test.
   */
  @Test
  public void testContains() {
    SingleLinkedList emptyNode = new SingleLinkedList();
    emptyNode.add("test1");
    emptyNode.add("test3");
    emptyNode.add(1, "test2");
    assertEquals(true, emptyNode.contains("test2"));
    assertEquals(false, emptyNode.contains("test5"));
    assertEquals(false, emptyNode.contains(null));
  }
}
