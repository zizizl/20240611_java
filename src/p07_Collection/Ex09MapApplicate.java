package p07_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex09MapApplicate {
  private static Map phoneBook = new HashMap();

  public static void main(String[] args) {
    addPhone("친구", "김수한", "010-0000-0000");
    addPhone("친구", "김수둘", "010-1111-1111");
    addPhone("친구", "김수셋", "010-2222-2222");
    addPhone("친구", "김수넷", "010-3333-3333");
    addPhone("마트", "010-4444-4444");
    printBook(phoneBook);
    System.out.println(phoneBook);
  }

  private static void addPhone(String group, String name, String tel) {
    if (!phoneBook.containsKey(group)) {
      phoneBook.put(group, new HashMap<>());
    }
    HashMap book = (HashMap) phoneBook.get(group);
    book.put(name, tel);
  }

  private static void addPhone(String name, String tel) {
    addPhone("기타", name, tel);
  }

  private static void printBook(Map map) {
    Iterator it = phoneBook.keySet().iterator();
    while (it.hasNext()) {
      String group = (String) it.next();
      HashMap book = (HashMap) phoneBook.get(group);
      System.out.printf("[ %s ]  %d 개 \n", group, book.size());
      Iterator subIt = book.entrySet().iterator();
      while (subIt.hasNext()) {
        Map.Entry entry = (Map.Entry) subIt.next();
        System.out.printf(
            "이름: %s, 번호: %s \n",
            entry.getKey(),
            entry.getValue());
      }
    }

  }
}

