package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> result = new HashMap<>();
        collection1.forEach(str -> countElements(str, result));

        return result;
    }

    private void countElements(String str, HashMap<String, Integer> result) {
        String[] split = str.split("-");

        String elemet = split[0];
        int count = split.length == 2 ? Integer.parseInt(split[1]) : 1;

        if (result.containsKey(split[0])) {
            int countAfterChange = result.get(str) + count;
            result.put(elemet, countAfterChange);
        } else {
            result.put(elemet, count);
        }
    }
}
