package exam3;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> apples = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            apples.add(1, i);
        ArrayList<Integer> balls = new ArrayList<>();
        for (int j = 0; j < 50; j++) {
            balls.add(1, j);
            ArrayList<ThirdBackpack> apples1=new ArrayList<>();
for(int k=0;k<10;k++);
for(int m=0;m<3;m++);
            System.out.println(apples);
        }
    }

    class FirstBackpack {
        String book;
        String coke;

        public String getBook() {
            return book;
        }

        public void setBook(String book) {
            this.book = book;
        }

        public String getCoke() {
            return coke;
        }

        public void setCoke(String coke) {
            this.coke = coke;
        }

        public FirstBackpack(String book, String coke) {
            this.book = book;
            this.coke = coke;
        }

        @Override
        public String toString() {
            return "FirstBackpack{" +
                    "book='" + book + '\'' +
                    ", coke='" + coke + '\'' +
                    '}';
        }
    }

    class SecondBackpack extends FirstBackpack {
        public SecondBackpack(String book, String coke, String pack, String bottleOfWater) {
            super(book, coke);
            this.pack = pack;
            this.bottleOfWater = bottleOfWater;
        }

        String pack;
        String bottleOfWater;

    }

    class ThirdBackpack extends FirstBackpack {
        public ThirdBackpack(String book, String coke, String pack, String coke1) {
            super(book, coke);
            this.pack = pack;
            this.coke = coke1;
        }

        String pack;
        String coke;
    }
}