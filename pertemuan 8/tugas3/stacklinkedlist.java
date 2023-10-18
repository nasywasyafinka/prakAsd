package tugas3;

public class stacklinkedlist {
    node19 top;
  int size;

  stacklinkedlist() {
    this.top = null;
    this.size = 0;
  }

  boolean isEmpty() {
    return top == null;
  }

  void push(String value) {
    node19 input = new node19(value);
    input.next = top;
    top = input;
    size++;
  }

  void pop() {
    if (!isEmpty()) {
      String temp = top.mataKuliah;
      top = top.next;
      size--;
      System.out.println("Data yang keluar: " + temp);
    } else {
      System.out.println("Stack masih kosong");
    }
  }

  void peek() {
    if (!isEmpty()) {
      String temp = top.mataKuliah;
      System.out.println("Data teratas adalah " + temp);
    }
  }

  void print() {
    if (!isEmpty()) {
      node19 temp = top;
      System.out.println("Jumlah Stack:\t" + size);
      System.out.println("Isi Stack:\t");
      while (temp != null) {
        System.out.println(temp.mataKuliah + "\t");
        temp = temp.next;
      }
      System.out.println("");
    } else {
      System.out.println("Stack masih kosong");
    }
  }

  void clear(){
    if (!isEmpty()) {
      size = 0;
      top = null;
    } else {
      System.out.println("Stack masih kosong");
    }
  }
}
