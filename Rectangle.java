public class Rectangle{
    float length;
    float breadth;
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
            r1.length = 10.0f;

            modify(r1);
            System.out.println(r1.length);
    }
    public static void modify(Rectangle r2){
        r2.length = 40;
        System.out.println(r2.length);
    }
}
/*
public class Rectangle{
    float length;
    float breadth;

    public float getlength(){
        return length;
    }
    public float setlength(float length){{
        this.length;
    }
    public float getbreadth(){
        return breadth;
    }
    public float setbreadth(float breadth){
        this.breadth;
    }
    }
}*/