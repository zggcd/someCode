package com.ccssoft.rsas.nsg.control;

import com.ccssoft.rsas.nsg.dom.BOSSDom;
import com.ccssoft.rsas.nsg.util.ResultSet;

public class BossControl {
    
    BOSSDom bossDom = new BOSSDom();
    
    /**
     * <p>实时查询用户宽带信息接口</p>
     * @return
     */
    public ResultSet s1267QryL() {

        ResultSet resultSet = bossDom.s1267QryL();

        return resultSet;

    }
    
    /**
     * <p>实时查询宽带明细信息接口</p>
     * @return
     */
    public ResultSet sQryGdWindMsgL() {

        ResultSet resultSet = bossDom.sQryGdWindMsgL();

        return resultSet;

    }
    
}
