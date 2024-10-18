package com.bubble.bubblecodesandbox;


import com.bubble.bubblecodesandbox.model.ExecuteCodeRequest;
import com.bubble.bubblecodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     *
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
