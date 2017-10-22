public class Register {
    //static void tops_register(Tops tops[], int T_ID, String col, String str, String seas, String mate, String nam, String brd){
    static void tops_register(Tops tops[], int T_ID){
        tops[T_ID].set_init("black", "mode", "summer", "cotton", "aaa", "uncv");
    }

    static void bottoms_register(Bottoms bottoms[], int B_ID){
        bottoms[B_ID].set_init("black", "mode", "summer", "cotton", "aaa", "uncv");
    }

    static void shoes_register(Shoes shoes[], int S_ID){
        shoes[S_ID].set_init("black", "mode", "summer", "cotton", "aaa", "uncv");
    }

}
