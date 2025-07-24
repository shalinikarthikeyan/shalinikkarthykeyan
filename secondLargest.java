// class Solution {
//     public int getSecondLargest(int[] arr) {
//         // code here
//         int firstLarge=Integer.MIN_VALUE;
//         int secondLarge=Integer.MIN_VALUE;
//         for(int num:arr)
//         {
//             if(num>firstLarge)
//             {
//                 secondLarge=firstLarge;
//                 firstLarge=num;
//             }
//             else if(num>secondLarge && num!=firstLarge)
//             {
//                 secondLarge=num;
//             }
            
//         }
//         return (secondLarge == Integer.MIN_VALUE) ? -1 : secondLarge;
//     }
// }
