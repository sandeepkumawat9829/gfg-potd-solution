class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        int[][] meet=new int[n][2];
        for(int i=0;i<n;i++){
            meet[i][0]=start[i];
            meet[i][1]=end[i];
        }
        Arrays.sort(meet,(a,b)->Integer.compare(a[1], b[1]));
        int last=-1; 
        int count=0; 
        for(int[] meeting:meet){
            if(meeting[0]>last){
                count++; 
                last=meeting[1];
            }
        }
        return count; 
    }
}
