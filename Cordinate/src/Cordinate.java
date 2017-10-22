import java.util.Random;

public class Cordinate {
  private static int OWNNUM = 100;
  public static int Tops_ID = 0;
  public static int Bottoms_ID = 0;
  public static int Shoes_ID = 0;
  static Tops[] tops = new Tops[OWNNUM];
  static Bottoms[] bottoms = new Bottoms[OWNNUM];
  static Shoes[] shoes = new Shoes[OWNNUM];
  public static int categ;
  public static int today_tops = 9999;
  public static int today_bottoms = 9999;
  public static int today_shoes = 9999;

  public static void main(String args[]){
    Cordinate.dataset();
    Cordinate.cordinate();
  }

  static void dataset(){

    //UI部分からデータを持ってくる

    if(categ==0) {
      //tops initialize
      for (int ti = 0; ti < OWNNUM; ti++) {
        tops[ti] = new Tops();
      }
      Register.tops_register(tops, Tops_ID);
      Tops_ID++;
    }

    else if(categ==1) {
      //bottoms initialize
      for (int bi = 0; bi < OWNNUM; bi++) {
        bottoms[bi] = new Bottoms();
      }
      Register.bottoms_register(bottoms, Bottoms_ID);
      Bottoms_ID++;
    }

    else if(categ==2) {
      //shoes initialize
      for (int bi = 0; bi < OWNNUM; bi++) {
        shoes[bi] = new Shoes();
      }
      Register.shoes_register(shoes, Shoes_ID);
      Shoes_ID++;
    }

  }

  static void cordinate(){
    while(true) {
      //temperature
      

      //color judge
      Random rnd = new Random();
      int tnum = rnd.nextInt(Tops_ID);
      int bnum = rnd.nextInt(Bottoms_ID);
      int snum = rnd.nextInt(Shoes_ID);
      if(tops[tnum].strain.equals(bottoms[bnum].strain)) {
        if (tops[tnum].color.equals("black") || bottoms[bnum].color.equals("black")) {
          if (tops[tnum].color.equals("yellow") || bottoms[bnum].color.equals("yellow")) {
          } else {
              today_tops = tnum;
              today_bottoms = bnum;
              today_shoes = snum;
              break;
            }
          }
      }
      else if(tops[tnum].color.equals("white") || bottoms[bnum].color.equals("white")){
        if(tops[tnum].color.equals(bottoms[bnum].color)){ }
            else{
              today_tops = tnum;
              today_bottoms = bnum;
              today_shoes = snum;
              break;
            }
        }
      else if(tops[tnum].color.equals("gray") || bottoms[bnum].color.equals("gray")){
        if(tops[tnum].color.equals(bottoms[bnum].color)){ }
        else{
            today_tops = tnum;
            today_bottoms = bnum;
            today_shoes = snum;
            break;
        }
      }
      else if(tops[tnum].color.equals("brown")){
        if(bottoms[bnum].color.equals("beige") || bottoms[bnum].color.equals("green")){
          today_tops = tnum;
          today_bottoms = bnum;
          today_shoes = snum;
          break;
        }
      }
      else if(tops[tnum].color.equals("beige")){
        if(bottoms[bnum].color.equals("beige") || bottoms[bnum].color.equals("purple") || bottoms[bnum].color.equals("yellow")){ }
        else{
          today_tops = tnum;
          today_bottoms = bnum;
          today_shoes = snum;
          break;
        }
      }
      else if(tops[tnum].color.equals("green")){
          if(bottoms[bnum].color.equals("brown") || bottoms[bnum].color.equals("blue") || bottoms[bnum].color.equals("beigue")){
            today_tops = tnum;
            today_bottoms = bnum;
            today_shoes = snum;
            break;
          }
      }
      else if(tops[tnum].color.equals("blue")){
        if(bottoms[bnum].color.equals("green") || bottoms[bnum].color.equals("purple")){
          today_tops = tnum;
          today_bottoms = bnum;
          today_shoes = snum;
          break;
        }
      }
      else if(tops[tnum].color.equals("purple")){
        if(bottoms[bnum].color.equals("purple") || bottoms[bnum].color.equals("red") || bottoms[bnum].color.equals("orange") || bottoms[bnum].color.equals("green") || bottoms[bnum].color.equals("beige") || bottoms[bnum].color.equals("yellow")){ }
          else{
            today_tops = tnum;
            today_bottoms = bnum;
            today_shoes = snum;
            break;
          }
        }
        else if(tops[tnum].color.equals("yellow")){
          if(bottoms[bnum].color.equals("black") || bottoms[bnum].color.equals("white") || bottoms[bnum].color.equals("gray")){
            today_tops = tnum;
            today_bottoms = bnum;
            today_shoes = snum;
            break;
          }
        }
        else if(tops[tnum].color.equals("pink")){
        if(bottoms[bnum].color.equals("black") || bottoms[bnum].color.equals("white") || bottoms[bnum].color.equals("gray")){
          today_tops = tnum;
          today_bottoms = bnum;
          today_shoes = snum;
          break;
          }
        }
        else if(tops[tnum].color.equals("red")){
        if(bottoms[bnum].color.equals("black") || bottoms[bnum].color.equals("white") || bottoms[bnum].color.equals("gray")){
          today_tops = tnum;
          today_bottoms = bnum;
          today_shoes = snum;
          break;
        }
          else if(tops[tnum].color.equals("orange")){
            if(bottoms[bnum].color.equals("black") || bottoms[bnum].color.equals("white") || bottoms[bnum].color.equals("gray")){
              today_tops = tnum;
              today_bottoms = bnum;
              today_shoes = snum;
              break;
            }
          }

        }

      }
    }
  }
