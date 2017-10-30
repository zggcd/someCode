package com.ccssoft.rsas.pwb.portal.control;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ccssoft.rsas.pwb.portal.bo.IPdwPortalLayoutBo;

@Controller
public class PortalLayoutControl {
    @Resource
    private IPdwPortalLayoutBo portal_pdwPortalLayout;

    /**
     * 
     * <p>布局展示。</p>
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/Layout/pdwPortalLayout.do")
    public ModelAndView getLayout(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String portalId = request.getParameter("portalId");
        Map<String, Object> results = portal_pdwPortalLayout.getLayout(portalId);
        request.setAttribute("results", results);
        /*
         * if (request.getAttribute("results") != null) { PdwPortalLayout pdwPortalLayout1 = (PdwPortalLayout)
         * results.get("pdwPortalLayout"); System.out.println("------------------" + pdwPortalLayout1.getLayoutName());
         * } ;
         */return new ModelAndView("pwb/portal/portallayout");

    }
}
