package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> result = new HashMap<>();
        collection1.forEach(str -> countElements(str, result));

        return result;
    }

    private void countElements(String str, HashMap<String, Integer> result) {
        String[] split = str.split("\\W");
        String element = split[0];
        int count = split.length == 1 ? 1 : Integer.parseInt(split[1]);

        if (result.containsKey(element)) {
            int countAfterChange = result.get(element) + count;
            result.put(element, countAfterChange);
        } else {
            result.put(element, count);
        }
    }

}
