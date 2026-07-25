package franca.java;

import franca.java.expected.Runtime;

public class TranspilableClass {

  private long id = 0L;

  public TranspilableClass() {
    id = Runtime.getId();
  }

  public long getId() {
    return id;
  }
}
