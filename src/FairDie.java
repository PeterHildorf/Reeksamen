public class FairDie extends Terning{
    public FairDie(){
        super(6);

    }
    public int rul() {
        return (int) (Math.random() * 5) + 1;
    }
}
