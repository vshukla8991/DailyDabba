/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dailydibba.model;

import com.dailydibba.action.Action;
import com.dailydibba.bean.Administrator;
import com.dailydibba.bean.Area;
import com.dailydibba.bean.City;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kiran
 */
public class deleteArea implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        Administrator objAdministrator = new Administrator();
        int areaid = Integer.parseInt(req.getParameter("areaId"));
        objAdministrator.deleteArea(areaid);
        List<Area> areas=objAdministrator.getAllArea();
        req.setAttribute("areas", areas);
        return "area.jsp";
    }
    
    
    
}
