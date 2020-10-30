package com.rakovets.course.javabasics.practice.jcf;


import java.util.ArrayList;
import java.util.Comparator;

public class Studio {
    private ArrayList<Actor> studio;

    public Studio(ArrayList<Actor> studio) {
        this.studio = studio;
    }

    public ArrayList<Actor> getStudio() {
        return studio;
    }

    public void setStudio(ArrayList<Actor> studio) {
        this.studio = studio;
    }

    public void fire(ArrayList studio) {
        studio.sort(new ActorFeeComparator());
        studio.remove(0);
    }

    public static class ActorFeeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return Double.compare(o1.getFee(), o2.getFee());
        }
    }

    public class ActorLastNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class ActorAgeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    public class ActorLastNameAndAgeComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            var result = o1.getLastName().compareTo(o2.getLastName());
            if (result == 0) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return result;
            }
        }
    }

    public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
        @Override
        public int compare(Actor o1, Actor o2) {
            var result = Double.compare(o1.getFee(), o2.getFee());
            if (result == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return result;
            }
        }
    }

    public String getFees() {
        String result = "";
        for (Actor actor : studio) {
            result += actor.getFee() + " ";
        }
        return result.trim();
    }

    public String getAges() {
        String result = "";
        for (Actor actor : studio) {
            result += actor.getAge() + " ";
        }
        return result.trim();
    }
}