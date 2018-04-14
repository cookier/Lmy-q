package com.baidu.test.SJMS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lmy on 2016/9/11.
 * 访问者模式：两个对象之间相互通过吧对方对象的this作为参数通过方法通信
 */
interface Visitor {
    public void visit(GladiolusConcreteElement gladiolusConcreteElement);

    public void visit(ChrysanthemumConreteElement chrysanthemumConreteElement);
}

interface FlowerElement {
    public void accept(Visitor visitor);
}

class GladiolusConcreteElement implements FlowerElement {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class ChrysanthemumConreteElement implements FlowerElement {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class ChrysanthemumVisitor implements Visitor {
    public void visit(GladiolusConcreteElement gladiolusConcreteElement) {
        System.out.println(this.getClass().getSimpleName() + "access" + gladiolusConcreteElement.getClass().getSimpleName());
    }

    public void visit(ChrysanthemumConreteElement chrysanthemumConreteElement) {
        System.out.println(this.getClass().getSimpleName() + "access" + chrysanthemumConreteElement.getClass().getSimpleName());
    }
}

class GladiolusVisitor implements Visitor {
    public void visit(GladiolusConcreteElement gladiolusConcreteElement) {
        System.out.println(this.getClass().getSimpleName() + "access" + gladiolusConcreteElement.getClass().getSimpleName());
    }

    public void visit(ChrysanthemumConreteElement chrysanthemumConreteElement) {
        System.out.println(this.getClass().getSimpleName() + "access" + chrysanthemumConreteElement.getClass().getSimpleName());
    }
}

class ObjectStructure {
    private final List<FlowerElement> elements = new ArrayList<FlowerElement>();

    public void addElement(final FlowerElement element) {
        elements.add(element);
    }

    public void removeElement(final FlowerElement element) {
        elements.remove(element);
    }

    public void accept(final Visitor visitor) {
        for (final FlowerElement e : elements) {
            e.accept(visitor);
        }
    }

}

public class FangWenZhe {
    public static void main(String[] args) {
        final ObjectStructure os = new ObjectStructure();
        os.addElement(new GladiolusConcreteElement());
        os.addElement(new ChrysanthemumConreteElement());

        final GladiolusVisitor gladiolusVisitor = new GladiolusVisitor();
        final ChrysanthemumVisitor chrysanthemumVisitor = new ChrysanthemumVisitor();

        os.accept(gladiolusVisitor);
        os.accept(chrysanthemumVisitor);
    }
}
