package repository;

import model.Lend;

import java.util.ArrayList;
import java.util.List;

public class ListLend {
    private static final List<Lend> lendList = new ArrayList<>();

    public static void setLendList(Lend lend){
        lendList.add(lend);
    }

    public static List<Lend> getLendList(){
        return lendList;
    }

}
