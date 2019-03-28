import java.util.HashSet;
import java.util.logging.Handler;

public class MyInteger {
    Integer myNumber;

    public void setMyNumber(Integer myNumber) {
        this.myNumber = myNumber;
    }

    public Integer getMyNumber() {
        return myNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        MyInteger myInteger=(MyInteger)obj;
        return (myNumber==myInteger.getMyNumber());
    }

    @Override
    public int hashCode() {
        return this.myNumber;
    }

    public static void main(String[] args) {
        HashSet<MyInteger> set=new HashSet<MyInteger>();
        MyInteger a=new MyInteger();
        a.setMyNumber(1);
        MyInteger b=new MyInteger();
        b.setMyNumber(1);
        set.add(a);
        set.add(b);
        for(MyInteger integer:set){
            System.out.println(integer.getMyNumber());
        }

    }
}