package service;

import pojo.Opera;

import java.util.List;

public interface OperaService {
    void addOpera(Opera opera);
    boolean findOperaByOperaName(Opera opera);
    void deleteOpera(Opera opera);
    boolean updateOpera(Opera opera);
    List<Opera> findAllOpera();
}
