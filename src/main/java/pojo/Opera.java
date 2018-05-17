package pojo;

import java.util.List;

public class Opera {
    private  int oid;
    private  int userId;
    private  String operaName;
    private  String operaInfo;
    private String operaImg;
private List<Actor> actors;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Opera() {
    }

    public Opera(int oid, int userId,String operaName, String operaInfo, String operaImg) {
        this.oid = oid;
        this.userId = userId;
        this.operaName = operaName;
        this.operaInfo = operaInfo;
        this.operaImg = operaImg;
    }

    public int getId() {
        return oid;
    }

    public void setId(int id) {
        this.oid = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOperaName() {
        return operaName;
    }

    public void setOperaName(String operaName) {
        this.operaName = operaName;
    }

    public String getOperaInfo() {
        return operaInfo;
    }

    public void setOperaInfo(String operaInfo) {
        this.operaInfo = operaInfo;
    }

    public String getOperaImg() {
        return operaImg;
    }

    public void setOperaImg(String operaImg) {
        this.operaImg = operaImg;
    }
}
