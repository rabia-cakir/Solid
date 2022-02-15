public interface IMenu {

    //The Interface Segregation Principle (ISP) states that clients should not be forced to depend upon interface members they do not use.
    // In other words, do not force any client to implement an interface that is irrelevant to them.

    public void meat();
    public void vegetable();
}
