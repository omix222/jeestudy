package jeestudy.calc;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("calc")
public class CalcResource {

    @POST
    //@Consumesは、リソースが受け付ける MIME タイプを表す.
    //以下の設定だとJsonの形式で受付可能
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String add(CalcDto input) {
        // TODO ぬるぽ
        int result = Integer.getInteger(input.getFirstNumber()) +
                Integer.getInteger(input.getSecondNumber());
        return input.getFirstNumber()+" + "+
                input.getSecondNumber()+" = " +
                result;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CalcDto get(){
        CalcDto result = new CalcDto();
        result.setFirstNumber("111");
        result.setSecondNumber("222");
        return result;
    }

}
