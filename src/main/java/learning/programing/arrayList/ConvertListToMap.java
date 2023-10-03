package learning.programing.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();
        trees.add(new Tree(1, 12, "Sunil"));
        trees.add(new Tree(2, 1, "Veer"));
        trees.add(new Tree(3, 10, "Chaala"));

        Map<Integer, Tree> treeMap = trees.stream().collect(Collectors.toMap(Tree::age, tree -> tree));
        System.out.println("Map value" + treeMap);

    }
}

record Tree(int id, int age, String name) {
}

