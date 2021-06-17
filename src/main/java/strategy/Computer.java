package strategy;

public class Computer {
    private ComputerStrategy strategy;

    public Computer(ComputerStrategy strategy){
        this.strategy = strategy;
    }

    public void setNewTask(ComputerStrategy strategy){
        this.strategy = strategy;
    }

    public void runTask() {
        this.strategy.execute();
    }
}