class WaitingLine {
  int e[];
  int index;
  boolean started;

  WaitingLine(int n) {
    e = new int[n];
    index = 0;
    started = false;
  }

  public boolean isEmpty() {
    return (index == 0 && !started) | index <= 0;
  }

  public void enqueue(int x){
    if (index == e.length) {
      throw new RuntimeException("Full");
    }
    started = true;
    e[index] = x;
    index++;
  }

  public int dequeue(){
    if (isEmpty())
      throw new RuntimeException("Empty");
    int x = e[0];
    for (int i = 0; i < index - 1; i++) {
      e[i] = e[i + 1];
    }
    index--;
    return x;
  }

  public static void main(String[] args){
    WaitingLine w = new WaitingLine(5);
    w.enqueue(2);
    w.enqueue(3);
    System.out.println(w.dequeue());
    System.out.println(w.dequeue());
    System.out.println(w.dequeue());
    System.out.println(w.dequeue());
  }
}
