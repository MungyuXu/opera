package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Opera;
import service.OperaService;

import java.util.List;

@Controller
@RequestMapping(value = "Opera")
public class OperaController {
    @Autowired
    OperaService operaService;

    @RequestMapping(value = "add")
    @ResponseBody
    public int addOpera(Opera opera){
        if (operaService.findOperaByOperaName(opera)){
            return 0;
        }else{
            operaService.addOpera(opera);
            return 1;
        }
    }
@RequestMapping(value = "delete")
@ResponseBody
    public int deleteOpera(Opera opera){
        operaService.deleteOpera(opera);
        return 1;
}
@ResponseBody
    @RequestMapping(value = "update")
    public  int updateOpera(Opera opera){
        boolean a=operaService.updateOpera(opera);
        if(a){
            return 1;
        }return 0;
}
@ResponseBody
    @RequestMapping(value = "findAll")
    public List<Opera> findAllOpera(){
        List<Opera> operas=operaService.findAllOpera();
        return operas;
}

//@RequestMapping(value = "findByOperaName")
//    @ResponseBody
//    public List<Opera> findByOperaName(){
//    List<Opera> operas=operaService.findAllOpera();
//    return operas;
//}

}
