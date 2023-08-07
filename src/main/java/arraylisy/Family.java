package arraylisy;

import java.util.ArrayList;

public class Family {
    private String address;
    private ArrayList<Member> members;

    public Family(String address, ArrayList<Member> members) {
        this.address = address;
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
