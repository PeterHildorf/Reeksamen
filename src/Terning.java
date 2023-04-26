public class Terning  {
    private int antalSider;

    public Terning (int antalSider){
        this.antalSider = antalSider;
    }
    public int rul(){

        return (int) (Math.random() * antalSider)+1;
    }

}
