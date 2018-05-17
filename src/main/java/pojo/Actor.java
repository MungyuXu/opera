package pojo;

import java.io.Serializable;
import java.util.List;

public class Actor implements Serializable {
private int id;
private int oid;
private String actorName;
private List<Opera> operas;
private  Opera opera;

    public void setOperas(List<Opera> operas) {
        this.operas = operas;
    }

    public Opera getOpera() {
        return opera;
    }

    public void setOpera(Opera opera) {
        this.opera = opera;
    }
    public List<Opera> getOperas() {
        return operas;
    }
    public Actor(int id, int oid, String actorName, List<Opera> operas) {
        this.id = id;
        this.oid = oid;
        this.actorName = actorName;
        this.operas = operas;
    }



    public Actor() {
    }

    public Actor(int id, int oid, String actorName) {
        this.id = id;
        this.oid = oid;
        this.actorName = actorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
}
