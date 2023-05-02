package org.example.algo.greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class ActivitySelection {


    public static int activitySelection(ArrayList<Activity> activities) {
        ArrayList<Activity> al = new ArrayList<>();

        Comparator<Activity> comparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getEnd() - o2.getEnd();
            }
        };
        activities.sort(comparator);

        System.out.println("Sorted activities");
        System.out.println(activities);

        int v=0;
        al.add(activities.get(v));

        for (Activity activity: activities){
            if(activity.getStart()>=al.get(v).getEnd()) {
                al.add(activity);
                if(v!=activities.size())
                    v++;
            }
        }
        System.out.println("Activities we can do: ");
        System.out.println(al);
        return al.size();
    }


    public static void main(String[] args) {

        ArrayList<Activity> al = new ArrayList<>();
        al.add(new Activity("A1",0,6));
        al.add(new Activity("A2",3,4));
        al.add(new Activity("A3",1,2));
        al.add(new Activity("A4",5,8));
        al.add(new Activity("A5",5,7));
        al.add(new Activity("A6",8,9));

        int max = activitySelection(al);
        System.out.println(max);

    }

}
