package tugas3;

public class node19 {
    String mataKuliah;
    node19 next;

    node19(String mataKuliah, node19 next) {
    this.mataKuliah = mataKuliah;
    this.next = next;
  }

    node19(String mataKuliah) {
    this.mataKuliah = mataKuliah;
    this.next = null;
  }
}
