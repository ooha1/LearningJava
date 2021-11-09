public class EmpBean {
    private int eid;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String EName) {
        this.name = EName;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public static void main(String[] args) {
        EmpBean eb1 = new EmpBean();
        eb1.setEid(1);
        eb1.setName("ooha");
        System.out.println(eb1.getEid());
        System.out.println(eb1.getName());
        eb1.setEid(2);
        eb1.setName("shiva");
        System.out.println(eb1.getEid());
        System.out.println(eb1.getName());

    }
}
