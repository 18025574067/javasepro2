package com.itheima.d6_innerclass;

public class Test2 {
    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}


class People{
    private int hearbeat = 150;
    public class Heart{
        private int hearbeat = 110;
        public void show(){
            int hearbeat = 78;
            System.out.println(hearbeat); // 78
            System.out.println(this.hearbeat); // 110
            System.out.println(People.this.hearbeat); // 150
        }
    }
}