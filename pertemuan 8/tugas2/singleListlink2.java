package tugas2;

public class singleListlink2 {
    node19 head;
    node19 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            node19 temp = head;
            System.out.print("Isi Linked List : \t");
                while (temp != null) {
                    System.out.print(temp.data+"\t");
                    temp = temp.next;
                }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(char value) {
        node19 input = new node19(value);
        if(isEmpty()) {
            head = input;
            tail = input;
        } else {
            input.next = head;
            head = input;
        }
    }

    public void addLast(char value) {
        node19 input = new node19(value);
        if (isEmpty()) {
            head = input;
            tail = input;
          } else {
            tail.next = input;
            tail = input;
          }
    }

    public void insertBefore(char key, char input) {
        node19 ndInput = new node19(input);
        node19 current = head;
        node19 temp = head;
            while(current != null) {
                if (current.data == key) {
                    if (current == head) {
                      addFirst(input);
                    } else {
                      ndInput.next = current;
                      temp.next = ndInput;
                      break;
                    }
                  }
                  temp = current;
                  current = current.next;
            }
    }
    
    public void insertAfter(char key, char value) {
        node19 current = head;
        while (current != null) {
            if (current.data == key) {
                node19 input = new node19(value);
                input.next = current.next;
                current.next = input;
                break;
            }
        }
    }

    void insertAt(int index, char value) {
        if (index < 0) {
          System.out.println("Index salah");
        } else if (index == 0) {
          addFirst(value);
        } else {
          node19 curr = head;
          for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
          }
          curr.next = new node19(value, curr.next);
          if (curr.next.next == null) {
            tail = curr.next;
          }
        }
      }
    
      char getData(int index) {
        node19 curr = head;
        for (int i = 0; i < index; i++) {
          curr = curr.next;
        }
        return curr.data;
      }
    
      int indexOf(char key) {
        node19 curr = head;
        int index = 0;
        while (curr != null && curr.data != key) {
          curr = curr.next;
          index++;
        }
        int result = (curr == null ? -1 : index);
        return result;
      }
    
      void removeFirst() {
        if (isEmpty()) {
          System.out.println("Linked List masih kosong");
        } else if (head == tail) {
          head = tail = null;
        } else {
          head = head.next;
        }
      }
    
      void removeLast() {
        if (isEmpty()) {
          System.out.println("Linked List masih kosong");
        } else if (head == tail) {
          head = tail = null;
        } else {
          node19 curr = head;
          while (curr.next != tail) {
            curr = curr.next;
          }
          curr.next = null;
          tail = curr;
        }
      }
    
      void remove(char key) {
        if (isEmpty()) {
          System.out.println("Linked List masih kosong");
        } else {
          node19 curr = head;
          while (curr != null) {
            if ((curr.data == key) && (curr == head)) {
              this.removeFirst();
              break;
            } else if (curr.next.data == key) {
              curr.next = curr.next.next;
              if (curr.next == null) {
                tail = curr;
              }
              break;
            }
            curr = curr.next;
          }
        }
      }
    
      void removeAt(int index) {
        if (index == 0) {
          removeFirst();
        } else {
          node19 curr = head;
          for (int i = 0; i < index; i++) {
            curr = curr.next;
          }
          curr.next = curr.next.next;
          if (curr.next == null) {
            tail = curr;
          }
        }
    }

}
