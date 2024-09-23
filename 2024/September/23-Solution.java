class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
       int []a=new int[2];
       Set<Integer>set=new TreeSet<>();
        a[1]=1;
        for(int i:arr){
            if(set.add(i)==false){
                a[0]=i;
            }
        }
        for(int num:set){
            if(num==a[1]){
                a[1]++;
            }
            else{
                break;
            }
        }
        return a;
    }
}