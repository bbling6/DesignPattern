package indi.twc.design.template;

public abstract class AbstractTemplate {

    public void templateMethod(){
        abstractMethod();
        hookMethod();
    }

    protected abstract void abstractMethod();

    public final void hookMethod(){
        System.out.println("hookMethod()...");
    }
}