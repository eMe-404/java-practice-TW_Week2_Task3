package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        HashMap<String, Integer> result = new HashMap<>();
        collection1.forEach(str -> countElement(str, result));

        return result;
    }

    private void countElement(String str, HashMap<String, Integer> result) {

        if (result.containsKey(str)) {
            int count = result.get(str) + 1;
            result.put(str, count);
        } else {
            result.put(str, 1);
        }
    }
}
