public interface Shape {
    float area;
}

public interface Solid {
    float volume;
}

public class Circle implements Shape{
    private int radius;
    private const float PI = 22/7 ;

    public int setRadius(int radius){
        this.radius = 
    }
    public float area(){
        return 2 * PI * radius;
    }
}

