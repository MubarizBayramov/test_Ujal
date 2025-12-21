package Metodd;



public class Books implements Comparable <Books> {
    private String name;
    private int count;

    public Books(String name, int count){
        this.name = name;
        this.count = count;

    }


    public static void main(String[] args){
        System.out.println();
    }

        @Override
        public int compareTo(Books o) {
            return Integer.compare(this.count, o.count);
        }
    }


