// 1) Write application that creates an array of double, to provide following functionality.
// ∙ display the length of the array and its elements.
// ∙ Display an array. (Use for each version of loop for display).
// ∙ compute the sume of the squares of these numbers.
// ∙ Determine Mean and Median of an array.
// ∙ Sort an array – Ascending and Descending. Use any two sorting algorithm. User can also select the sorting method. ∙ Search
// an element from the array, i.e. returns the location of the element of an array that matches an indicated value. ∙ Copy of an
// array.
// ∙ Reverse of an array.
class Array{
    double[] double_arr;
    int size;
        Array(int t_size){
            size=t_size;
            double_arr = new double[size];
        }
        void display_len(){
            System.out.println("Array lenghth is:"+size);  
            if(size==0){
                System.out.println("Array is emtry");
            }
            else{
                int i=0;
                while(i<=size-1){
                   System.out.println("Index:"+i+"value:"+double_arr[i]);
                   i++; 
                }
            }   
        }
        void display_foreach(){
            // double key=0.0;
            for(double key:double_arr){
                System.out.println("Value:"+key);
            }   
        }
        void sqrt(){
            double sum=0;
            for(double key:double_arr){
                sum = (sum + (key*key));
            }
            System.out.println("Sum of Square elements is:"+sum);
        }
        void mean_median(){
            double mean=0;
            double sum=0;
            for(double key:double_arr){
                sum = sum+key;
            }
            mean = sum/double_arr.length;
            System.out.println("Mean is:"+mean);

            double[] sort={};
        //   for(int i=0;i<=double_arr.length;i++){
        //     if(double_arr[i]<double_arr[i+1]){
        //         sort[i]=double_arr[i];
        //     }
        //     else
        //     {
        //         double temp = double_arr[i];
        //         double_arr[i] = double_arr[i+1];
        //         double_arr[i+1] = temp;
        //         sort[i] = double_arr[i];
        //     }
        //   }
        for(int i=0;i<double_arr.length;i++){
            for(int j=0;j<=i-1;j++){
                // if(double_arr[i]<double_arr[i+1]){
                //     double temp = double_arr[i];
                //     double_arr[i] = double_arr[i+1];
                //     double_arr[i+1] = temp;
                //     sort[i] = double_arr[i];
                // }
                System.out.println("j:"+j);
            }
            System.out.println("i:"+i);
        }



        }

    public  static void main(String[] argv){
        Array d1 = new Array(3);
        d1.double_arr[0]=10;
        d1.double_arr[1]=20;
        d1.double_arr[2]=30;
        // d1.double_arr[3]=40;
        // d1.display_len();
        // d1.sqrt();
        d1.mean_median();
        // d1.display_foreach();
    }
    }