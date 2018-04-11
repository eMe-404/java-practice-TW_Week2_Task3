package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。

        collectionA.forEach((key, count) -> subtractCount(key, count, object, collectionA));
        return collectionA;
    }


    private void subtractCount(String key, Integer count, Map<String, List<String>> object, Map<String, Integer> collectionA) {
        if (object.get("value").contains(key)) {
            count--;
            collectionA.put(key, count);
        }

    }
}
