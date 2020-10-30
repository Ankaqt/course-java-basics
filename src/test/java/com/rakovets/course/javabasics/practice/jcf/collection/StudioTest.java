package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.practice.jcf.Actor;
import com.rakovets.course.javabasics.practice.jcf.Studio;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudioTest {
    @Test
    void studioTest() {
        ArrayList<Actor> studio = new ArrayList<>();
        studio.add(new Actor("Qwe","Rty", 15, 32));
        studio.add(new Actor("Asd","Fgh", 11, 26));
        studio.add(new Actor("Zxc","Vbn", 28, 45));
        studio.add(new Actor("Jkl","Oiy", 8, 19));
        studio.add(new Actor("Plm","Ghj", 25, 54));
        Studio studio1 = new Studio(studio);
        studio.sort(new Studio.ActorAgeComparator());




    }
}
