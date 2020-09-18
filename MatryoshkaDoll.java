public class MatryoshkaDoll{

    MatryoshkaDoll doll;

    MatryoshkaDoll(){
    }

    MatryoshkaDoll(MatryoshkaDoll doll){
        this.doll=doll;
    }

    boolean isMassive() {
        if(doll==null) {
            return true;
        }else {
            return false;
        }
    }

    void add(MatryoshkaDoll doll) {
        this.doll=doll;
    }

    MatryoshkaDoll remove() {
        if (isMassive() == true) {
            return this.doll;
        } else {
            return doll.remove();
        }
    }

    void removeMassive(MatryoshkaDoll puppet) {
        this.doll=null;
    }

    int count() {
        if(isMassive()) {
            return 1;
        }else {
            return 1+(doll.count());
        }
    }

    public static void main(String[] args) {
        MatryoshkaDoll pupe= new MatryoshkaDoll(new MatryoshkaDoll(new MatryoshkaDoll(new MatryoshkaDoll())));
        int count = pupe.count();
        System.out.print(count);
    }

}
