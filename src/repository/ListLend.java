package repository;

import model.Lend;

import java.util.ArrayList;
import java.util.List;

public class ListLend {
    private final List<Lend> lendList = new ArrayList<>();

    public void setLendList(Lend lend){
        lendList.add(lend);
    }

    public List<Lend> getLendList(){
        return lendList;
    }

}
