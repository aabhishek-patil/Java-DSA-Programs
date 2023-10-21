class  InheritanceBox{
    double h;
    double w;
    double l;



    void Box(){
        this.h=1;
    }

    void Box1(double side){
        this.h=side;
//        System.out.println(side);
    }

    void InheritanceBox(){
        this.l=55;
        System.out.println(this.l);
    }

}
