package jeestudy.calc;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jeestudy.domain.CalcBean;

@Path("calc")
@RequestScoped
public class CalcResource {
    @Inject
    private CalcBean calcBean;

    @POST
    //@Consumesは、リソースが受け付ける MIME タイプを表す.
    //以下の設定だとJsonの形式で受付可能
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String add(CalcDto input) {
        int result = calcBean.calc(input.getFirstNumber(),input.getSecondNumber());
        return input.getFirstNumber()+" + "+
                input.getSecondNumber()+" = " +
                result;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCount(){
        return Integer.toString(calcBean.count());
    }

}
