package com.Jianoffer.Stack_Queue;
import java.util.Stack;
/**
 * 使用两个栈实现队列
 */
public class offer9_QueueByTwoStack {
    public Stack<Object> stack1 = new Stack<Object>();
    public Stack<Object> stack2 = new Stack<Object>();
    //加入队列只加入到stack1
    public void append(Object item){
        stack1.push(item);
        System.out.println("压入元素："+item);
    }
    /*
     * 删除一个元素时，检查栈2是否为空，栈2不为空则弹出
     * 栈2为空，则把栈1中的元素全部弹出、压入到栈2中，然后从栈2栈顶弹出元素
     */
    public void Delete(){

        if(!stack2.empty())
            System.out.println("弹出元素："+stack2.pop());
        else {
            if(stack1.empty())
                throw new RuntimeException("队列为空");
            while(!stack1.empty()){
                Object item = stack1.pop();
                stack2.push(item);
            }
        }
    }
}
