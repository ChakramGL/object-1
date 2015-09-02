public class Body {

    String dogBreed;
    String dogFood;
    String dogName;
    Tail dogTail;
    Feet dogFeet;
    Head dogHead;
    int dogAge;
    int dogSpeed;
    int dogPower;
    int dogNumber;

    public Body(int dogNumber, String dogBreed, String dogName, int dogAge, int dogSpeed,
                int dogPower, Tail dogTail, Feet dogFeet, Head dogHead){
        this.dogNumber = dogNumber;
        this.dogBreed = dogBreed;
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogSpeed = dogSpeed;
        this.dogPower = dogPower;
        this.dogTail = dogTail;
        this.dogFeet = dogFeet;
        this.dogHead = dogHead;
    }

//    public void show(){
//        System.out.println(dogNumber + dogBreed + dogName + dogAge + dogSpeed + dogPower + dogTail + dogFeet + dogHead);
//    }

    public int getDogNumber () {
        return dogNumber; }

    public String getDogName () {
        return dogName; }

    public String getDogBreed () {
        return dogBreed; }

    public int getDogAge() {
        return dogAge;
    }

    public int getDogSpeed() {
        return dogSpeed;
    }

    public int getDogPower() {
        return dogPower;
    }

    public void food (){
        dogFood = null;
        if (dogNumber == 1) {
            System.out.println("This dog requires dry food");
        }
        else {
            System.out.println("Today, all the dogs will eat meat");
        }
    }

    public void setDogInfo (){
        System.out.println(" Dog number: " + dogNumber + "\n Dog Name: "+ dogName + "\n Dog breed: " + dogBreed + "\n Dog age: " + dogAge);
        System.out.println(" Dog speed: " + dogSpeed + "\n Dog power: " + dogPower + "\n Dog tail: " + dogTail  + "\n Dog feet: " + dogFeet);
        System.out.println(" Dog head: " + dogHead);
    }
}