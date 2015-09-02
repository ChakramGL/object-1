public class Tail {

    String view;
    int woolliness;
    int length;
    int countWobbleps;

        public Tail ( String view, int woolliness, int length, int countWobbleps) {

            this.view = view;
            this.woolliness = woolliness;
            this.length = length;
            this.countWobbleps = countWobbleps;

        }

    public String getView() {
        return view;
    }

    public int getWoolliness() {
        return woolliness;
    }

    public int getLength() {
        return length;
    }

    public void setCountWobbleps(int countWobbleps) {
        this.countWobbleps = countWobbleps;
    }

    /*public void tailVerify(){
        if ( view !=null && woolliness !=null && length != null && countWobbleps != null){

        }*/
}

