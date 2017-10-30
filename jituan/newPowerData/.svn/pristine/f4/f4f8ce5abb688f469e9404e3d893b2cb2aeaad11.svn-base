package com.ccssoft.rsas.pwb.user.control;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.ccssoft.mybatis.generater.plugin.Page;
import com.ccssoft.rsas.pwb.ditem.bo.DictionaryItemsBOImpl;
import com.ccssoft.rsas.pwb.ditem.model.BafSysDictionaryItem;
import com.ccssoft.rsas.pwb.user.bo.IUserBO;
import com.ccssoft.rsas.pwb.user.model.BafOrgUser;
import com.regaltec.baf.external.rig.right.bi.IOperateRightBI;
import com.regaltec.baf.external.rig.right.bi.OperateRightBIImpl;
import com.regaltec.baf.module.common.valueobj.ElementVO;
import com.regaltec.baf.org.user.common.valueobj.UserVO;
import com.regaltec.baf.org.user.ui.control.UserLoginBean;

@Controller
public class UserControl {

    @Resource
    private IUserBO pwb_userBOImpl;

    @Resource
    DictionaryItemsBOImpl pwb_DictionaryItemsBOImpl;

    @RequestMapping("/userAction.do")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String loginName = request.getParameter("loginName");
        BafOrgUser user = new BafOrgUser();
        user.setLoginname(loginName);
        pwb_userBOImpl.addUser(user);
        return new ModelAndView("pwb/bi/demo");
    }

    @RequestMapping("/listUser.do")
    public ModelAndView listUser(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 从session中获取当前用户对象
        UserLoginBean loginBean = (UserLoginBean) request.getSession().getAttribute("userLoginBean");
        if (loginBean != null) {
            UserVO userVo = (UserVO) loginBean.getCurrentUser();
            request.setAttribute("currentUser", userVo);

            // 操作权限查询
            IOperateRightBI operateRightBI = new OperateRightBIImpl();
            // userId 用户ID
            // moduleCode 模块编码 (支持多个,#号分开)
            // elementCode 元素编码 （可以为空，如果为空则是查询该模块下所有已授权元素权限项,支持多个,#号分开）
            if (null != userVo && StringUtils.equals("Y", userVo.getIsAdmin())) {
                List<ElementVO> list = operateRightBI.selectRightByUserId2(userVo.getUserId(), "IDM_ORG_MANAGE", "IDE_UNLOCK_USER");
            }

        }
        return new ModelAndView("pwb/bi/demo");
    }

    // 下载当前类演示
    @RequestMapping("/DownloadDemo.do")
    public void bulletinDownload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        try {
            String classPath = this.getClass().getName();
            String path = classPath.replaceAll("\\.", "\\/");
            InputStream in = this.getClass().getResourceAsStream("/" + path + ".class");
            byte[] fileContent = new byte[8192];
            int post = classPath.lastIndexOf(".");
            String fileName = classPath.substring(post + 1);
            response.setContentType("application/octet-stream");
            response.setHeader("Location", fileName + ".class");
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ".class");
            int len = 0;
            OutputStream outputStream = response.getOutputStream();
            while ((len = in.read(fileContent)) > 0) {
                outputStream.write(fileContent, 0, len);
            }
            in.close();
            outputStream.flush();
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 上传文件演示
    @RequestMapping("/fileUploadDemo.do")
    public void importProData(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        // response.setContentType("text/xml");
        PrintWriter out = null;
        out = response.getWriter();
        HashMap<String, Object> returnMap = new HashMap<String, Object>();
        StringBuffer responseText = new StringBuffer();
        try {
            String btid = request.getParameter("btid");
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            MultipartFile upFile = multipartRequest.getFile("piFileName");
            if (null != upFile && !upFile.isEmpty()) {
                upFile.getBytes(); // 获取文件子节流
            }
        } catch (Exception e) {

        }
    }

    // 生成json对象返回给jqueryuiW
    @RequestMapping("/jsonDemo.do")
    public void josnDemo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setCharacterEncoding("UTF-8");
        try {
            String classPath = this.getClass().getName();
            String path = classPath.replaceAll("\\.", "\\/");
            InputStream in = this.getClass().getResourceAsStream("/" + path + ".class");
            byte[] fileContent = new byte[8192];
            int post = classPath.lastIndexOf(".");
            String fileName = classPath.substring(post + 1);
            response.setContentType("application/octet-stream");
            response.setHeader("Location", fileName + ".class");
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ".class");
            int len = 0;
            OutputStream outputStream = response.getOutputStream();
            while ((len = in.read(fileContent)) > 0) {
                outputStream.write(fileContent, 0, len);
            }
            in.close();
            outputStream.flush();
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/queryItems.do")
    @ResponseBody
    public Map queryItems(HttpServletRequest request, HttpServletResponse response) throws Exception {

        int length = 20;
        int begin = 1;
        int pageNo = 1;
        String slength = request.getParameter("rows"); // 取easyUI 表格翻页组提交的每页显示行数参数
        String spage = request.getParameter("page"); // 取easyUI 表格翻页组提交的 第N页 参数
        try {
            if (StringUtils.isNotBlank(spage)) {
                pageNo = Integer.parseInt(spage);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            if (StringUtils.isNotBlank(slength)) {
                length = Integer.parseInt(slength);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        Page page = new Page(begin, length);
        page.setPageNo(pageNo);
        List<BafSysDictionaryItem> list = pwb_DictionaryItemsBOImpl.queryList(page);
        // ObjectMapper objMap = new ObjectMapper();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pageNo", page.getPageNo());
        map.put("pageSize", page.getLength());
        map.put("total", page.getTotalRecords()); // 总共记录数，交给前页面表格分页组件显示//
        map.put("pageCount", page.getPageCount());
        map.put("rows", list);
        return map;
        // objMap.writeValue(response.getWriter(), map);
    }

    @RequestMapping("/demo/submit.do")
    @ResponseBody
    public Map submitDemo(HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map<String, Object> map = new HashMap<String, Object>();
        try {
            String name = request.getParameter("name"); // 获取提交参数
            String email = request.getParameter("email"); // 获取提交参数
            System.out.println("------------------------------------" + name);
            Properties p = new Properties();
            UUID uuid = UUID.randomUUID();
            p.put("id", uuid.toString());
            p.put("name", name);
            p.put("email", email);
            map.put("data", p); // 返回数据对象
            map.put("sucess", true); // 操作成功标志
        } catch (Exception e) {
            map.put("sucess", false); // 操作失败标志
            map.put("errorInfo", e.getMessage()); // 操作失败信息
        }

        return map;
    }
}
