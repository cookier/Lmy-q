package com.baidu.test.SJMS;

/**
 * Created by Administrator on 2016/9/8.
 * 桥接：实现多维度的变换，只用接口，实现类的变化，只能实现一种维度变化，通过构造方法new的时候传参可以实现多维的变幻
 */
interface CpuAbility {
    String abilityCpu();
}

class AmdCpu implements CpuAbility {
    @Override
    public String abilityCpu() {
        return "系能一般";
    }
}

class IntelCpu implements CpuAbility {

    @Override
    public String abilityCpu() {
        return "系能比较牛";
    }
}

abstract class AbstractComputer {
    CpuAbility cpuAbility;

    public AbstractComputer(CpuAbility cpuAbility) {
        this.cpuAbility = cpuAbility;

    }

    public abstract void checkPcAbility();
}

class LenevoComputer extends AbstractComputer {

    public LenevoComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.println("华硕笔记本cpu性能" + super.cpuAbility.abilityCpu());
    }
}

class IswComputer extends AbstractComputer {
    public IswComputer(CpuAbility cpuAbility) {
        super(cpuAbility);
    }

    @Override
    public void checkPcAbility() {
        System.out.println("ibm笔记本cpu性能" + super.cpuAbility.abilityCpu());
    }
}

public class QiaoJie {
    public static void main(String[] args) {
        CpuAbility ability = new IntelCpu();
        AbstractComputer computer = new LenevoComputer(ability);
        computer.checkPcAbility();
        ability = new AmdCpu();
        computer = new IswComputer(ability);
        computer.checkPcAbility();
    }
}
