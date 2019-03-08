package collection_İnjection;
import java.util.List;

public class CollectionInjection {

    private List<String> nameList;

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    @Override
    public String toString() {
        return "CollectionInjection{" +
                "nameList=" + nameList +
                '}';
    }
}
