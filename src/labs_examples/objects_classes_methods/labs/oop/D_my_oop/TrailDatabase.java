package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;

public class TrailDatabase {

    ArrayList<Trail> list = new ArrayList<>();
    ArrayList<Trail> easyTrails = new ArrayList<>();

    static Trail coldSpringPark = new Trail("Cold Spring Park",1.5, 27, 29, "easy", true, true);
    static Trail charlesRiver = new Trail("Charles River Walkway", 8.8, 2.37, 121, "easy", false, true);
    static Trail beaverBrookNorth = new Trail("Beaver Brook North Reservation", 2.5, 58, 269, "easy", true, true);
    static Trail pineHill = new Trail("Pine Hill", 0.9, 25, 150, "easy", false, false);
    static Trail prospectHill = new Trail("Prospect Hill Park",3.0, 1.22, 482, "moderate", true, false);
    static Trail borderlandState = new Trail("Borderland State Park", 8.5, 2.52, 439, "moderate", true, false);
    static Trail storerConservation = new Trail("Storer Conservation Land", 1.1, 22, 59, "moderate", true, false);
    static Trail rockCircuit = new Trail("Rock Circuit", 4.2, 1.45, 547, "moderate", true, false);
    static Trail buckHill = new Trail("Buck Hill", 2.9, 1.30, 643, "moderate", false, false);
    static Trail skylineTrail = new Trail("Blue Hills Skyline", 15.2, 8.4, 3523, "hard", false, false);
    static Trail landMine = new Trail("Land Mine Challenge", 24.3, 9.10, 1305, "hard", true, false);
    static Trail monadnock = new Trail("Mount Monadnock", 3.8, 2.58, 1774, "hard", true, false);
    static Trail midstate = new Trail("Midstate Trail", 14.1, 6.25, 2283, "hard", false, false);

    public void addList() {

        list.add(coldSpringPark);
        list.add(charlesRiver);
        list.add(beaverBrookNorth);
        list.add(pineHill);
        list.add(prospectHill);
        list.add(borderlandState);
        list.add(storerConservation);
        list.add(rockCircuit);
        list.add(buckHill);
        list.add(skylineTrail);
        list.add(landMine);
        list.add(monadnock);
        list.add(midstate);

    }

    public ArrayList<Trail> printList() {
        for(Trail t : list) {
            System.out.println(t.getName());
        }
        return list;
    }

    public void addEasyTrails(){
        for(Trail t : list) {
            if (t.difficulty.equals("easy")) {
                easyTrails.add(t);
            }
        }
    }

    public ArrayList<Trail> printEasyTrails(){
        for(Trail t : easyTrails) {
            System.out.println(t.getName());
        }
        return easyTrails;
    }


    public void setList(ArrayList list) {
        this.list = list;
    }

    //getter
    public ArrayList getList() {
        return list;
    }

}
