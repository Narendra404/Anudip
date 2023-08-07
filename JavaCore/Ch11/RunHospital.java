package Ch11;

class Hospital {

    public void getInfo() {

        System.out.println("This class is for the hospital Staff.");
    }
}

class Doctor extends Hospital {
    
    @Override public void getInfo() {

        System.out.println("This class is for the doctors.");
    }
}

class Surgeon extends Doctor {
    
    @Override public void getInfo() {

        System.out.println("This class is for the surgeons.");
    }
}

class Nurse extends Hospital {
    
    @Override public void getInfo() {

        System.out.println("This class is for the nurses.");
    }
}

public class RunHospital {
    
    public static void main (String[] args) {
        
        System.out.println();
        System.out.println("When Hospital type reference refers to itself and its direct and indirect children : ");
        System.out.println();

        Hospital obj1 = new Hospital();
        obj1.getInfo();
        System.out.println();

        Hospital obj2 = new Doctor();
        obj2.getInfo();
        System.out.println();

        Hospital obj3 = new Surgeon();
        obj3.getInfo();
        System.out.println();

        Hospital obj4 = new Nurse();
        obj4.getInfo();
        System.out.println();

        System.out.println();
        System.out.println("When Doctor type reference refers to itself and its children : ");
        System.out.println();

        Doctor obj5 = new Doctor();
        obj5.getInfo();
        System.out.println();

        Doctor obj6 = new Surgeon();
        obj6.getInfo();
        System.out.println();
    }
}
