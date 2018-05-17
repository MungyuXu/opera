package service.serviceImp;

import mapper.OperaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Opera;
import service.OperaService;

import java.util.List;

@Service
public class OperaServiceImp implements OperaService {
@Autowired
    OperaMapper operaMapper;

    public void addOpera(Opera opera) {
        operaMapper.addOpera(opera);
    }

    public  boolean findOperaByOperaName(Opera opera){
        Opera opera1=operaMapper.findOperaByOperaName(opera);
        if (opera1 ==null){
            return false;
        }else
            return true;
    }

    public void deleteOpera(Opera opera){
        operaMapper.deleteOpera(opera);
    }

    public boolean updateOpera(Opera opera){
      Opera opera2=operaMapper.findOperaByOperaName(opera);
      if(opera2 ==null){
          return  false;
      }else {
          operaMapper.updateOpera(opera);
          return true;
      }
    }
    public List<Opera> findAllOpera(){
        return  operaMapper.findAllOpera();
    }
}
