package org.koushik.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    private Point pointA, pointB, pointC;

    private ApplicationContext context;

    // Getters
    public Point getPointA() {
        return pointA;
    }
    public Point getPointB() {
        return pointB;
    }
    public Point getPointC() {
        return pointC;
    }

    // Setters
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;

    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is: " + beanName);
    }
}
