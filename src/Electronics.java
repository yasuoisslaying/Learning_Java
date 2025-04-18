public class Electronics extends Product {
    int warrantyPeriod;
    //This is an example of inheritance
    public Electronics(String name, double price, int warrantyPeriod){
        //calls the constractur in the main class
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void disiplayinfo(){
        super.disiplayinfo();
        System.out.println("warranty: "+warrantyPeriod);
    }
    
}
