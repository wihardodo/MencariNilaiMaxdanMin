package arrayfungsi;
public class ArrayFungsi {

    public static void main(String[] args) {
    public class ArrayFungsi {
    public static int max,min;
    public static void carimaksmin(int b1,int a[]){
        max=a[0];
        min=a[0];
        for(int i=1;i<b1;i++)
            if (max<a[i]){
                max=a[i];
            }
            else if (min>a[i]){
                min=a[i];
            }
    }
    public static void main(String[] args){
        carimaksmin x = new carimaksmin();
     
        String b;
        System.out.println("Banyaknya data = ");
        b=x.nextFloat();
       
        int b1=Integer.parseInt(b);
        int a[]=new int[b1];
       
        
        int jml=0;
        for(int i=0;i<b1;i++){
            
            System.out.println("A["+i+"] = ");
            a[i]=Integer.parseInt(x.nextFloat());
            
            jml+=a[i];
        }
        System.out.println("Jumlah data = "+jml);
       
        carimaksmin(b1,a);
        System.out.println("Nilai maksimum = "+max);
        System.out.println("Nilai minimum = "+min);
    }
}
}
