package com.riadsafowan.java.discord;
class jibJogot{
    boolean isPrani;
}
class poshu extends jibJogot{
    boolean isJanto;
}

class Aabir extends poshu {
    float height;

    public String introduceyourself() {
        return "Aabir{" +
                "isJanto=" + isJanto +
                ", height=" + height +
                '}';
    }
}

class Shap extends poshu{
    float length;
    public void sayFushhh(){
        if(this.isJanto){
            System.out.println("fushhhhh");
        }else {
            System.out.println("im not alive");
        }
    }
}

class kochu extends jibJogot{
    String color;

    @Override
    public String toString() {
        return "kochu{" +
                "isJib=" + isPrani +
                ", color='" + color + '\'' +
                '}';
    }
}



class test{
    public static void main(String[] args) {
        Aabir aabir = new Aabir();
        aabir.isPrani = true;
        aabir.isJanto = true;
        aabir.height = 23;
        System.out.println(aabir.introduceyourself());

        Shap shap = new Shap();
        shap.isPrani = true;
        shap.isJanto = true;
        shap.length =5;
        shap.sayFushhh();

        kochu kochu = new kochu();
        kochu.isPrani = false;
        kochu.color = "green";

        System.out.println(kochu.toString());
    }
}