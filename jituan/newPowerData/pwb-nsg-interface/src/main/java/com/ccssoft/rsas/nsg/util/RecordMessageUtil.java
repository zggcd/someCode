package com.ccssoft.rsas.nsg.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

public class RecordMessageUtil {
    
    /**
     *  获取真实IP的方法
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
            String ip = request.getHeader("x-forwarded-for");
            if (!checkIP(ip)) {
                    ip = request.getHeader("Proxy-Client-IP");
            }
            if (!checkIP(ip)) {
                    ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if (!checkIP(ip)) {
                    ip = request.getRemoteAddr();
            }
            return ip;
    }
    
    public static  boolean checkIP(String ip) {
            if (StringUtils.isBlank(ip) || "unknown".equalsIgnoreCase(ip) || ip.split(".").length != 4) {
                return false;
            }
        return true;
   }
}
