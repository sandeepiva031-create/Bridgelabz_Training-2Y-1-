package Arrays.Sliding_Window_Tech;
import java.util.Scanner;
public class DistinctSubArray {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int count=0;
        int freq[]=new int[100001];

        for(int i=0;i<k;i++) {
            freq[nums[i]]++;
            if (freq[nums[i]] == 1) {
                count++;
            }
        }

            for(int i=k;i<nums.length;i++){
                freq[nums[i-k]]--;
                if(freq[nums[i-k]]==0){
                    count--;
                }
                freq[nums[i]]++;
                if(freq[nums[i]]==1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

