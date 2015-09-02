public class Head {

    final byte COUNT_HEAD = 1;
    final byte COUNT_EARS = 2;
    final byte COUNT_EYES = 2;

    String form;
    SizeHead sizeHead;
    int volume;

    public Head (String form, SizeHead sizeHead, int volume){
        this.form = form;
        this.sizeHead = sizeHead;
        this.volume = volume;
    }

    public String getForm() {
        return form;
    }

    public SizeHead getSizeHead() {
        return sizeHead;
    }

    public int getVolume() {
        return volume;
    }
}
