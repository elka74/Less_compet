package Times;

public enum Days {

    Monday(40,"часов"), Tuesday(32, "часа"), Wednesday(24, "часа"), Thursday(16, "часов"), Friday(8, "часов"), Saturday (0,"ВЫХОДНОЙ ДЕНЬ"), Sunday(0,"ВЫХОДНОЙ ДЕНЬ");
    int time;
    String s;
    Days(int time, String s) {
        this.time = time;
        this.s = s;
    }

    public int getTime(){
        return time;
    }

    public String getS() {
        return s;
    }
}


