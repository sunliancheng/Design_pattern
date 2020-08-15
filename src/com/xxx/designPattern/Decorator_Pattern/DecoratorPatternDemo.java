package com.xxx.designPattern.Decorator_Pattern;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecrator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecrator(new Rectangle());

        circle.draw();

        redCircle.draw();

        redCircle.draw();
    }
}
