package org.itstack.demo.jvm.instructions.loads.xaload;

import org.itstack.demo.jvm.instructions.base.InstructionNoOperands;
import org.itstack.demo.jvm.rtda.Frame;
import org.itstack.demo.jvm.rtda.OperandStack;
import org.itstack.demo.jvm.rtda.heap.methodarea.Object;

/**
 * http://www.itstack.org
 * create by fuzhengwei on 2019/4/29
 */
public class FALOAD extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.operandStack();
        int idx = stack.popInt();
        Object arrRef = stack.popRef();

        checkNotNull(arrRef);
        float[] floats = arrRef.floats();
        checkIndex(floats.length, idx);
        stack.pushFloat(floats[idx]);
    }

}