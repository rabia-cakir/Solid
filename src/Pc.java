public class Pc {
    IProcessor processor;

    public Pc(IProcessor processor)
    {
        this.processor=processor;
    }

    public void start()
    {
        processor.printProcessor();
    }
}
