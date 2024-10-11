int n=arr.size();
        List<Integer>ans=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            ans.add(-1);
        }
        for(int i=0;i<n;i++){
            if(arr.get(i)>=0 && arr.get(i)<n){
                ans.set(arr.get(i),arr.get(i));
            }
        }
        return ans;
}
}
