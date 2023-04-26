public class LoadedDie extends Terning {
    private double chancen = 0;

    public LoadedDie(double chancen) {
        super(6);
        this.chancen = 0;

    }

    @Override
    public int rul() {
        double tilfældighed = Math.random();
        if (tilfældighed < chancen){
            return 6;
        }else{
            return (int) (Math.random() * 5) +1;
        }


    }
 }
