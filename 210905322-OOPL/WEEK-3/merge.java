import java.util.Scanner;
class Mixer{

    int arr[];
    
    void dis(){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array ");
        int len=sc.nextInt();

        System.out.println("enter the elements of the array ");
        this.arr=new int[len];
        

        for(int i =0;i<len;i++){

            arr[i]=sc.nextInt();

            if(i>0&&(arr[i]<=arr[i-1])){
                System.out.println("please enter elements in assending order and are not equal");
                this.accept();
            }
        }

    }
    Mixer merge(Mixer m1){

        Mixer mix=new Mixer();
        mix.arr=new int[this.arr.length+m1.arr.length];
        int flag=0;
        for(int i=0;i<this.arr.length;i++){
            mix.arr[flag]=this.arr[i];
            flag+=1;
        }
        for(int i=0;i<m1.arr.length;i++){
            mix.arr[flag]=m1.arr[i];
            flag+=1;
        }

        return mix;

    }
    
    

}

    





public class merge {
    
    
    
    public static void main(String[] args) {
        

        Mixer t1=new Mixer();
        Mixer t2=new Mixer();
        Mixer t3=new Mixer();
        t1.accept();
        t1.dis();
        t2.accept();
        t2.dis();
        t3 =t1.merge(t2);
        t3.dis();
        
    }
    
}