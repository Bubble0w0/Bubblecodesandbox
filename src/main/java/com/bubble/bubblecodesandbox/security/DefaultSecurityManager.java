package com.bubble.bubblecodesandbox.security;

import java.io.File;
import java.security.AccessControlContext;
import java.security.Permission;

/**
 * 禁用所有权限安全管理器
 */
public class DefaultSecurityManager extends SecurityManager{
    //检查所有权限
    @Override
    public void checkPermission(Permission perm) {
//        super.checkPermission(perm);
        throw new SecurityException("无权限"+perm.toString());
    }


    @Override
    public void checkExec(String cmd) {
        super.checkExec(cmd);
    }


    @Override
    public void checkRead(String file) {
        super.checkRead(file);
    }


    @Override
    public void checkWrite(String file) {
        super.checkWrite(file);
    }


    @Override
    public void checkDelete(String file) {
        super.checkDelete(file);
    }


    @Override
    public void checkConnect(String host, int port) {
        super.checkConnect(host, port);
    }


    @Override
    public void checkConnect(String host, int port, Object context) {
        super.checkConnect(host, port, context);
    }
}
