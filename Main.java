class S{
    private String n;
    public String getn(){
        return n;
    }
    public void setn(String name){
        this.n=name;
    }
}
class Main{
    public static void main(String[] args) {
        S s= new S();
        s.setn("X");
        System.out.println(s.getn());
    }
}