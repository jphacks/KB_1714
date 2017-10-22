//import android.widget.ImageView;

public class Clothes {
    //private static ImageView image;
    public static String color;
    public static String strain;
    public static String season;
    public static String material;
    public static String name;
    public static String brand;

    void set_init(String col, String str, String seas, String mate, String nam, String brd){
        //this.image = img;
        this.color = col;
        this.strain = str;
        this.season = seas;
        this.material = mate;
        this.name = nam;
        this.brand = brd;
    }

    static String get_color(){
        return color;
    }

    String get_strain(){
        return strain;
    }

    String get_season(){
        return season;
    }

    String get_material(){
        return material;
    }

    String get_name(){
        return name;
    }

    String get_brand(){
        return brand;
    }

}
