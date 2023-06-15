class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        if(a.length == 1 && n==1){
            if(a[0] == 0) return true;
            else return false;
        }
        int value;
        for(int i=0;i<a.length;i++){
            value=a[i];
            if(n == 0){
                break;
            }
            else if(i == 0 && value == 0){
                if(a[i+1] == 0){
                   a[i]=1;
                   n--;
                }
            }
            else if(i == a.length-1 && value == 0 && n!=0){
                if(a[i-1] == 0) {
                    n--;
                    a[i]=1;
                }
            }
            else{
                if(value == 1) continue;

                else if(a[i-1] == 0 && a[i+1] == 0){
                     a[i]=1;
                     n--;
                }
            }
        }
        if(n == 0) return true;
        return false;
    }
}
