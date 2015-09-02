public class Feet {

    final int COUNT_FEET = 4;

    String grooming;
    String form;

    int height;
    int softness;

    public Feet(String grooming, String form, int height, int softness) {
        this.grooming = grooming;
        this.form = form;
        this.height = height;
        this.softness = softness;
    }

    public String getGrooming() {
        return grooming;
    }

    public String getForm() {
        return form;
    }

    public int getHeight() {
        return height;
    }

    public int getSoftness() {
        return softness;
    }
}
