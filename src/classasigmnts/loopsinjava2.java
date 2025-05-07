package classasigmnts;

public class loopsinjava2 {
    int marks = 0;
    public void forloop () {
        for (int i = 0; i < 10; i++ ){
            marks = marks +10;
            System.out.println(marks);

        }
    }
    public void main (String[] args){
        loopsinjava obj = new loopsinjava();
        obj.forloop();
}
