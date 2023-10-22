public class access {
   public String name;
   private int num;
   int []arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public access(String name, int num, int arr){
       this.name=name;
       this.num=num;
       this.arr=new int[num];
   }

}