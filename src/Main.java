public class Main {

    public static void main (String[] args){


        SizeHead sizeHeadObj = new SizeHead (10, 10, 10);
        Head headObj = new Head ( "Round", sizeHeadObj, 1000);
        Feet feetObj = new Feet ( "Great", "Cylinder", 20, 5);
        Tail tailObj = new Tail ( "Banana", 7, 5, 2);
        Body dogObj = new Body ( 1, "Dachshund", "Ruperth", 7, 15, 5, tailObj, feetObj, headObj);

        dogObj.food();
        dogObj.setDogInfo();

    }
}
