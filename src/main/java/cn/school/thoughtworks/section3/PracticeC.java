package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。

        PracticeA section2_PracticeA = new PracticeA();
        PracticeB section3_PracticeB = new PracticeB();
        Map<String, Integer> collectionC = section2_PracticeA.countSameElements(collectionA);

        return section3_PracticeB.createUpdatedCollection(collectionC, object);
    }
}
