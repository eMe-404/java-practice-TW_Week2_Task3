package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeB section3_practiceB = new PracticeB();
        cn.school.thoughtworks.section2.PracticeB section2_practiceB = new cn.school.thoughtworks.section2.PracticeB();

        Map<String, Integer> collectionC = section2_practiceB.countSameElements(collectionA);
        return section3_practiceB.createUpdatedCollection(collectionC, object);

    }
}
