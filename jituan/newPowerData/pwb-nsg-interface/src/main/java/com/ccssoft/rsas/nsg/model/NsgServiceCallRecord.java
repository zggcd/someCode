/*
 * <p>标题: 中国电信网络分析系统第2版</p>
 * <p>描述: ...</p>
 * <p>版权: Copyright (c) 2016</p>
 * <p>公司: 中通服软件科技有限公司</p>
 * <p>网址:http://www.ccssoft.com.cn/
 */
package com.ccssoft.rsas.nsg.model;

import java.io.Serializable;
import java.util.Date;

public class NsgServiceCallRecord implements Serializable {
    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RECORD_ID, JDBC Type: 12, Nullable: false, Length: 36, Scale: 0, Identity: false
     */
    private String recordId;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERIAL_NO, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false
     */
    private String serialNo;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_METHOD, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false
     */
    private String execMethod;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_METHOD_NAME, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false
     */
    private String execMethodName;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_PARAM, JDBC Type: 12, Nullable: true, Length: 2000, Scale: 0, Identity: false
     */
    private String execParam;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_ERRCODE, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false
     */
    private String execErrcode;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_ERRCODE_DESC, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false
     */
    private String execErrcodeDesc;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_RESULT, JDBC Type: 12, Nullable: true, Length: 3500, Scale: 0, Identity: false
     */
    private String execResult;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: START_TIME, JDBC Type: 93, Nullable: false, Length: 7, Scale: 0, Identity: false
     */
    private Date startTime;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: END_TIME, JDBC Type: 93, Nullable: true, Length: 7, Scale: 0, Identity: false
     */
    private Date endTime;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: CLIENT_IP, JDBC Type: 12, Nullable: false, Length: 20, Scale: 0, Identity: false
     */
    private String clientIp;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERVER_IP, JDBC Type: 12, Nullable: false, Length: 20, Scale: 0, Identity: false
     */
    private String serverIp;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: CLIENT_PORT, JDBC Type: 12, Nullable: true, Length: 5, Scale: 0, Identity: false
     */
    private String clientPort;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERVER_PORT, JDBC Type: 12, Nullable: true, Length: 5, Scale: 0, Identity: false
     */
    private String serverPort;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false
     */
    private String remark;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE1, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false
     */
    private String reserve1;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE2, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false
     */
    private String reserve2;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE3, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false
     */
    private String reserve3;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE4, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false
     */
    private String reserve4;

    /**
     * org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE5, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false
     */
    private String reserve5;

    private static final long serialVersionUID = 1L;

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RECORD_ID, JDBC Type: 12, Nullable: false, Length: 36, Scale: 0, Identity: false的值
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * @param recordId org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RECORD_ID, JDBC Type: 12, Nullable: false, Length: 36, Scale: 0, Identity: false的值
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERIAL_NO, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERIAL_NO, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_METHOD, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public String getExecMethod() {
        return execMethod;
    }

    /**
     * @param execMethod org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_METHOD, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public void setExecMethod(String execMethod) {
        this.execMethod = execMethod;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_METHOD_NAME, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public String getExecMethodName() {
        return execMethodName;
    }

    /**
     * @param execMethodName org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_METHOD_NAME, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public void setExecMethodName(String execMethodName) {
        this.execMethodName = execMethodName;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_PARAM, JDBC Type: 12, Nullable: true, Length: 2000, Scale: 0, Identity: false的值
     */
    public String getExecParam() {
        return execParam;
    }

    /**
     * @param execParam org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_PARAM, JDBC Type: 12, Nullable: true, Length: 2000, Scale: 0, Identity: false的值
     */
    public void setExecParam(String execParam) {
        this.execParam = execParam;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_ERRCODE, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public String getExecErrcode() {
        return execErrcode;
    }

    /**
     * @param execErrcode org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_ERRCODE, JDBC Type: 12, Nullable: true, Length: 64, Scale: 0, Identity: false的值
     */
    public void setExecErrcode(String execErrcode) {
        this.execErrcode = execErrcode;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_ERRCODE_DESC, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false的值
     */
    public String getExecErrcodeDesc() {
        return execErrcodeDesc;
    }

    /**
     * @param execErrcodeDesc org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_ERRCODE_DESC, JDBC Type: 12, Nullable: true, Length: 128, Scale: 0, Identity: false的值
     */
    public void setExecErrcodeDesc(String execErrcodeDesc) {
        this.execErrcodeDesc = execErrcodeDesc;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_RESULT, JDBC Type: 12, Nullable: true, Length: 3500, Scale: 0, Identity: false的值
     */
    public String getExecResult() {
        return execResult;
    }

    /**
     * @param execResult org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: EXEC_RESULT, JDBC Type: 12, Nullable: true, Length: 3500, Scale: 0, Identity: false的值
     */
    public void setExecResult(String execResult) {
        this.execResult = execResult;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: START_TIME, JDBC Type: 93, Nullable: false, Length: 7, Scale: 0, Identity: false的值
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: START_TIME, JDBC Type: 93, Nullable: false, Length: 7, Scale: 0, Identity: false的值
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: END_TIME, JDBC Type: 93, Nullable: true, Length: 7, Scale: 0, Identity: false的值
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: END_TIME, JDBC Type: 93, Nullable: true, Length: 7, Scale: 0, Identity: false的值
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: CLIENT_IP, JDBC Type: 12, Nullable: false, Length: 20, Scale: 0, Identity: false的值
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * @param clientIp org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: CLIENT_IP, JDBC Type: 12, Nullable: false, Length: 20, Scale: 0, Identity: false的值
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERVER_IP, JDBC Type: 12, Nullable: false, Length: 20, Scale: 0, Identity: false的值
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * @param serverIp org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERVER_IP, JDBC Type: 12, Nullable: false, Length: 20, Scale: 0, Identity: false的值
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: CLIENT_PORT, JDBC Type: 12, Nullable: true, Length: 5, Scale: 0, Identity: false的值
     */
    public String getClientPort() {
        return clientPort;
    }

    /**
     * @param clientPort org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: CLIENT_PORT, JDBC Type: 12, Nullable: true, Length: 5, Scale: 0, Identity: false的值
     */
    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERVER_PORT, JDBC Type: 12, Nullable: true, Length: 5, Scale: 0, Identity: false的值
     */
    public String getServerPort() {
        return serverPort;
    }

    /**
     * @param serverPort org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: SERVER_PORT, JDBC Type: 12, Nullable: true, Length: 5, Scale: 0, Identity: false的值
     */
    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: REMARK, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE1, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public String getReserve1() {
        return reserve1;
    }

    /**
     * @param reserve1 org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE1, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE2, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public String getReserve2() {
        return reserve2;
    }

    /**
     * @param reserve2 org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE2, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE3, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public String getReserve3() {
        return reserve3;
    }

    /**
     * @param reserve3 org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE3, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE4, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public String getReserve4() {
        return reserve4;
    }

    /**
     * @param reserve4 org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE4, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public void setReserve4(String reserve4) {
        this.reserve4 = reserve4;
    }

    /**
     * @return org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE5, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public String getReserve5() {
        return reserve5;
    }

    /**
     * @param reserve5 org.mybatis.generator.codegen.mybatis3.IntrospectedTableMyBatis3Impl@149b2e5e.Actual Column Name: RESERVE5, JDBC Type: 12, Nullable: true, Length: 100, Scale: 0, Identity: false的值
     */
    public void setReserve5(String reserve5) {
        this.reserve5 = reserve5;
    }
}