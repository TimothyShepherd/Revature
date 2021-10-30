package Day6;

abstract class Marks{

    abstract void getPercentage();
}

class A extends Marks{

    int getM1, getM2, getM3;

    A(int getM1, int getM2, int getM3){

        this.getM1 = getM1;
        this.getM2 = getM2;
        this.getM3 = getM3;
    }
    public void getPercentage(){
        float returnTotal = ((getM1 + getM2 + getM3) / 300f) * 100;

        System.out.println(returnTotal);
    }
}

class B extends Marks{

    int getM1, getM2, getM3, getM4;

    B(int getM1, int getM2, int getM3, int getM4){

        this.getM1 = getM1;
        this.getM2 = getM2;
        this.getM3 = getM3;
        this.getM4 = getM4;
    }
    public void getPercentage(){
        float returnTotal = ((getM1 + getM2 + getM3 + getM4) / 400f) * 100;

        System.out.println(returnTotal);
    }
}


public class PercentageMarks{
    public static void main(String[] args){

        Marks calculator1 = new A(62, 79, 94);

        calculator1.getPercentage();

        Marks calculator2 = new B(60, 75, 90, 82);

        calculator2.getPercentage();
    }
}
