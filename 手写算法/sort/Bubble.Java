class Bubble{
    public static  int[] bubbleSort(int a[]){
        int len=a.length;
        // 数组为0退出
        if(n<=0){
            return ;
        }
        // 冒泡
        for(int i=0;i<len;i++){
            // 提前退出标志符
            boolean flag=false;
            // 条件说明:通过j来对当前的数(原数组第i个数进行冒泡),每次冒泡都是在向前排序
            for(int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=tmp;
                    // 有交换之后将flag置为true,如果没有交换就说明排列OK
                    flag=true;
                }
            }
            if(!flag) break;
        }

    }

    public static void main(String[] args) {
        System.out.println(Bubble.bubbleSort({2,3,4,5,1,3}));
    }
}