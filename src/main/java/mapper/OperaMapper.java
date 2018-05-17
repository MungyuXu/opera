package mapper;

import pojo.Opera;

import java.util.List;

public interface OperaMapper {
    void addOpera(Opera opera);
    Opera findOperaByOperaName(Opera opera);
    void deleteOpera(Opera opera);
    void updateOpera(Opera opera);
    List<Opera> findAllOpera();
    //找演员
    List<Opera> findActorByOname() throws Exception;
}
