package neibulei;

public class Reception {
    Filter f;

    public void setF(Filter f) {
        this.f = f;
    }

    public Filter getF(){
        return f;

    }

    public void recept(User u){
        if (u.getType()!=null){
            return;
        }
        if (f != null){
            f.filterUser(u);
            return;
        }
        else {
            u.setType("A");

        }

    }


}
